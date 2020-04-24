package ii_3.entity.equipment;

import java.sql.Timestamp;

/**
 * @Author: zhang-zi-ang
 * @Date: Created in 2020/4/21 16:43
 * @Description: 设备基本信息，用于新建设备和查看数据基本状态时使用
 * @Modified By:
 */
public class EquipmentBasicInfo {
    private int equipmentId;               // 设备ID
    private String equipmentName;          // 设备名称（用户自定的名称）
    private String equipmentType;          // 设备类型（String）
    private String ipAddress;              // IP地址
    private int port;                      // 端口号
    private int unitIdentifier;            // 身份识别？我也不知道，暂时保留
    private String workshop;               // 车间名称（String）
    private String isActived;              // 设备是否激活（已废弃）
    private Timestamp createdTime;         // 设备创建时间戳
    private Timestamp modifiedTime;        // 设备修改时间戳

    //无参构造函数
    public EquipmentBasicInfo() {
    }

    //有参构造函数
    public EquipmentBasicInfo(int equipmentId, String equipmentName, String equipmentType, String ipAddress, int port, int unitIdentifier, String workshop, String status, String isActived, Timestamp createdTime, Timestamp modifiedTime) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.equipmentType = equipmentType;
        this.ipAddress = ipAddress;
        this.port = port;
        this.unitIdentifier = unitIdentifier;
        this.workshop = workshop;
        this.isActived = isActived;
        this.createdTime = createdTime;
        this.modifiedTime = modifiedTime;
    }

    //get和set方法
    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getUnitIdentifier() {
        return unitIdentifier;
    }

    public void setUnitIdentifier(int unitIdentifier) {
        this.unitIdentifier = unitIdentifier;
    }

    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop;
    }


    public String getIsActived() {
        return isActived;
    }

    public void setIsActived(String isActived) {
        this.isActived = isActived;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
