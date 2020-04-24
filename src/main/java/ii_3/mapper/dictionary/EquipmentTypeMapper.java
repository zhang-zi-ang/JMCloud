package ii_3.mapper.dictionary;

import ii_3.entity.dictionary.EquipmentType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhang-zi-ang
 * @Date: Created in 2020/4/24 15:35
 * @Description: 设备类型的字典
 * @Modified By:
 */
@Repository
@Mapper
public interface EquipmentTypeMapper {
    @Select("SELECT * FROM dic_equiptype WHERE typeId = #{id}")
    EquipmentType selectByTypeId(Integer id);
}
