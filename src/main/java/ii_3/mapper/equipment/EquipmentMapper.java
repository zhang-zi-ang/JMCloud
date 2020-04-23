package ii_3.mapper.equipment;

import ii_3.entity.equipment.Equipment;
import ii_3.entity.equipment.EquipmentBasicInfo;
import ii_3.entity.equipment.EquipmentSetingInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: zhang-zi-ang
 * @Date: Created in 2020/4/23 16:27
 * @Description: 设备的数据库mapper
 * @Modified By:
 */

@Repository
@Mapper
public interface EquipmentMapper {
    @Select("SELECT * FROM equipments")
    List<EquipmentBasicInfo> getAllEquipBasicInfo();

    @Select("SELECT * FROM equipments")
    List<EquipmentSetingInfo> getAllEquipmentSetingInfo();
}
