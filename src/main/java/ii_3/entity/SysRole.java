package ii_3.entity;

import java.io.Serializable;

/**
 * @Author: zhang-zi-ang
 * @Description:权限实体类
 * @Date: Created in 2020/4/14 10:30
 * @Modified By:
 */
public class SysRole implements Serializable {

    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    // getter和setter方法
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name,int a) {

        this.name = name;
    }
}