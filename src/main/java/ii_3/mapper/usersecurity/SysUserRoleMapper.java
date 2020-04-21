package ii_3.mapper.usersecurity;

import ii_3.entity.usersecurity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: zhang-zi-ang
 * @Description:权限-用户数据库操作类
 * @Date: Created in 2020/4/14 10:30
 * @Modified By:
 */
@Repository
@Mapper
public interface SysUserRoleMapper {
    @Select("SELECT * FROM sys_user_role WHERE user_id = #{userId}")
    List<SysUserRole> listByUserId(Integer userId);
}

