package ii_3.controller;

import ii_3.entity.dictionary.EquipmentStatus;
import ii_3.entity.equipment.Equipment;
import ii_3.entity.equipment.EquipmentBasicInfo;
import ii_3.entity.equipment.EquipmentSetingInfo;
import ii_3.service.dictionary.EquipmentStatusService;
import ii_3.service.equipment.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
    private EquipmentStatusService equipmentStatusService;

    //状态信息表
    List<EquipmentSetingInfo> list = new ArrayList<EquipmentSetingInfo>();

    @RequestMapping(value = "/getEquipStatus", method = RequestMethod.GET)
    public List<Equipment> getEquipmentStaus(){

            //清空状态信息表
            if(list != null || list.size() > 0){
                list.clear();
            }

            List<Equipment> listEquipment= new ArrayList<Equipment>();
            list = equipmentService.getAllEquipmentSetingInfo();

            for (EquipmentSetingInfo equipmentSetingInfo : list) {
                EquipmentStatus equipmentStatus = equipmentStatusService.
                        findById(equipmentSetingInfo.getDeviceStatus());

                System.out.println(equipmentStatus.getStatusCN());
//                DeviceStatus deviceStatus = deviceStatusService
//                        .findById(equipment.getEquipmentBasicInfo().getDeviceStatus());
                Equipment equipment = new Equipment(equipmentSetingInfo);
                if (equipmentStatus == null){
                    equipment.setEquipmentStatus("unknown status");
                }else {
                    equipment.setEquipmentStatus(equipmentStatus.getStatusCN());
                }
                listEquipment.add(equipment);
//                if (deviceStatus == null) {
//                    equipment.setStatus("unknown status");
//                } else {
//                    equipment.setStatus(deviceStatus.getStatusCN());
//                }
//                listEquipmentView.add(new EquipmentView(equipment));
            }
            return listEquipment;
        }
    }
