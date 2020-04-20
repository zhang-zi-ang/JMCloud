package ii_3.entity;

import java.io.Serializable;

/**
 * @Author: zhang-zi-ang
 * @Description: 用户-权限实体类
 * @Date: Created in 2020/4/14 10:30
 * @Modified By:
 */
public class SysUserRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer roleId;

    // getter和setter方法
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}