package ii_3.entity;

import java.io.Serializable;

/**
 * @Author: zhang-zi-ang
 * @Description:用户实体类
 * @Date: Created in 2020/4/14 10:30
 * @Modified By:
 */
public class SysUser implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    //name为登录账号
    private String name;

    private String password;

    //nickname为用户昵称，不是登录账号
    private String nickname;

    //getter和setter方法
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
