package ii_3.service.equipment;

import ii_3.entity.equipment.Equipment;
import ii_3.entity.equipment.EquipmentBasicInfo;
import ii_3.entity.equipment.EquipmentSetingInfo;
import ii_3.mapper.equipment.EquipmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhang-zi-ang
 * @Date: Created in 2020/4/23 16:21
 * @Description: 设备相关的服务
 * @Modified By:
 */

@Service
public class EquipmentService {
    @Autowired
    private EquipmentMapper equipmentMapper;

    public List<EquipmentBasicInfo> getAllEquipBasicInfo() {
        System.out.println(equipmentMapper.getAllEquipBasicInfo());
        return equipmentMapper.getAllEquipBasicInfo();
    }

    public List<EquipmentSetingInfo> getAllEquipmentSetingInfo() {
        System.out.println(equipmentMapper.getAllEquipBasicInfo());
        return equipmentMapper.getAllEquipmentSetingInfo();
    }
}
