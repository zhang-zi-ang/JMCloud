package ii_3.service.dictionary;

import ii_3.entity.dictionary.EquipmentStatus;
import ii_3.mapper.dictionary.EquipmentStatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhang-zi-ang
 * @Date: Created in 2020/4/23 17:36
 * @Description: 设备状态服务（主要用于查询）
 * @Modified By:
 */

@Service
public class EquipmentStatusService {
    @Autowired
    private EquipmentStatusMapper equipmentStatusMapper;

    public EquipmentStatus findById(int statusId){
//        EquipmentStatus equipmentStatus = null;

        EquipmentStatus equipmentStatus = equipmentStatusMapper.selectByStatusId(statusId);

        return equipmentStatus;
    }
}
