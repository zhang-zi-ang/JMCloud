package ii_3.mapper;

import ii_3.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhang-zi-ang
 * @Description:权限数据库操作类
 * @Date: Created in 2020/4/14 10:30
 * @Modified By:
 */
@Repository
@Mapper
public interface SysRoleMapper {
    @Select("SELECT * FROM sys_role WHERE id = #{id}")
    SysRole selectById(Integer id);
}
