package ii_3.mapper.dictionary;

import ii_3.entity.dictionary.EquipmentStatus;
import ii_3.entity.usersecurity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhang-zi-ang
 * @Date: Created in 2020/4/23 17:38
 * @Description: 设备状态字典的mapper
 * @Modified By:
 */
@Repository
@Mapper
public interface EquipmentStatusMapper {
    @Select("SELECT * FROM dic_equipstatus WHERE statusId = #{id}")
    EquipmentStatus selectByStatusId(Integer id);
}
