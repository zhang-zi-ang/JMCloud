package ii_3.service.dictionary;

import ii_3.entity.dictionary.EquipmentStatus;
import ii_3.entity.dictionary.EquipmentType;
import ii_3.mapper.dictionary.EquipmentStatusMapper;
import ii_3.mapper.dictionary.EquipmentTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhang-zi-ang
 * @Date: Created in 2020/4/24 15:16
 * @Description: 设备相关字典查询服务
 * @Modified By:
 */
@Service
public class EquipmentDicService {
    @Autowired
    private EquipmentStatusMapper equipmentStatusMapper;

    @Autowired
    private EquipmentTypeMapper equipmentTypeMapper;

    public EquipmentStatus findStatusById(int statusId){
        EquipmentStatus equipmentStatus = equipmentStatusMapper.selectByStatusId(statusId);
        return equipmentStatus;
    }

    public EquipmentType findTypeById(int typeId){
        EquipmentType equipmentType = equipmentTypeMapper.selectByTypeId(typeId);
        return equipmentType;
    }
}
