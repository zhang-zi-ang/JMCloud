package ii_3.service.usersecurity;

import ii_3.entity.usersecurity.SysUserRole;
import ii_3.mapper.usersecurity.SysUserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserRoleService {
    @Autowired
    private SysUserRoleMapper userRoleMapper;

    public List<SysUserRole> listByUserId(Integer Sys_User_id) {
        System.out.println(Sys_User_id);
        return userRoleMapper.listByUserId(Sys_User_id);
    }
}