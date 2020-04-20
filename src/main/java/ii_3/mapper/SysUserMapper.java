package ii_3.mapper;

import ii_3.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhang-zi-ang
 * @Description:用户数据库操作类
 * @Date: Created in 2020/4/14 10:30
 * @Modified By:
 */
@Repository
@Mapper
public interface SysUserMapper {
    @Select("SELECT * FROM sys_user WHERE id = #{id}")
    SysUser selectById(Integer id);

    @Select("SELECT * FROM sys_user WHERE name = #{name}")
    SysUser selectByName(String name);
}

