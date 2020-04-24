package ii_3.controller;

import ii_3.entity.dictionary.EquipmentStatus;
import ii_3.entity.dictionary.EquipmentType;
import ii_3.entity.equipment.Equipment;
import ii_3.entity.equipment.EquipmentSetingInfo;
import ii_3.service.dictionary.EquipmentDicService;
import ii_3.service.equipment.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhang-zi-ang
 * @Date: Created in 2020/4/20 17:48
 * @Description: 设备状态控制器
 * @Modified By:
 */

@RestController
public class StatusController {
    @Autowired
    private EquipmentService equipmentService;

    @Autowired
    private EquipmentDicService equipmentDicService;

    //状态信息表，可以作为全局缓存
    List<EquipmentSetingInfo> list = new ArrayList<EquipmentSetingInfo>();

    @RequestMapping(value = "/getEquipStatus", method = RequestMethod.GET)
    public List<Equipment> getEquipmentStaus(){
            //清空状态信息表
            if(list != null || list.size() > 0){
                list.clear();
            }

            //存放Equipment数据的列表，作输出用
            List<Equipment> listEquipment= new ArrayList<Equipment>();

            list = equipmentService.getAllEquipmentSetingInfo();

            //将所有EquipmentSetingInfo的数据都放入listEquipment
            for (EquipmentSetingInfo equipmentSetingInfo : list) {
                //获取设备状态信息
                EquipmentStatus equipmentStatus = equipmentDicService.
                        findStatusById(equipmentSetingInfo.getDeviceStatus());
                //获取设备类型信息
                EquipmentType equipmentType = equipmentDicService.
                        findTypeById(equipmentSetingInfo.getDeviceType());

                Equipment equipment = new Equipment(equipmentSetingInfo);

                if (equipmentStatus == null){
                    //如果获取不到状态信息，存储字符串"unknown status"
                    equipment.setEquipmentStatus("unknown status");
                }else{
                    equipment.setEquipmentStatus(equipmentStatus.getStatusCN());
                }

                if (equipmentType == null){
                    //如果获取不到状态信息，存储字符串"unknown type"
                    equipment.setEquipmentType("unknown type");
                }else{
                    equipment.setEquipmentType(equipmentType.getTypeCN());
                }

                //添加到列表中
                listEquipment.add(equipment);
            }
            return listEquipment;
        }
    }
