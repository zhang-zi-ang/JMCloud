package ii_3.entity.equipment;

/**
 * @Author: zhang-zi-ang
 * @Date: Created in 2020/4/21 17:27
 * @Description: 设备的总信息，等于EquipmentBasicInfo+EquipmentSetingInfo
 *               这里仅作为一个信息汇总的入口
 * @Modified By:
 */
public class Equipment {

    private int equipmentId;                            // 设备ID
    private String equipmentName;                       // 设备名称
    private String equipmentType;                       // 设备类型
    private String equipmentStatus;                     // 设备状态

    private EquipmentBasicInfo equipmentBasicInfo;      // 设备基本信息
    private EquipmentSetingInfo equipmentSetingInfo;    // 设备的配置信息

    //构造方法：设备ID
    public Equipment(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    //构造方法：设备基本信息
    public Equipment(EquipmentBasicInfo equipmentBasicInfo) {
        this.equipmentBasicInfo = equipmentBasicInfo;
        this.equipmentId = equipmentBasicInfo.getEquipmentId();
    }

    //构造方法：设备配置信息
    public Equipment(EquipmentSetingInfo equipmentSetingInfo) {
        this.equipmentSetingInfo = equipmentSetingInfo;
        this.equipmentId = equipmentSetingInfo.getEquipmentId();
    }


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

    public String getEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipmentStatus(String equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

    public EquipmentBasicInfo getEquipmentBasicInfo() {
        return equipmentBasicInfo;
    }

    public void setEquipmentBasicInfo(EquipmentBasicInfo equipmentBasicInfo) {
        this.equipmentBasicInfo = equipmentBasicInfo;
    }

    public EquipmentSetingInfo getEquipmentSetingInfo() {
        return equipmentSetingInfo;
    }

    public void setEquipmentSetingInfo(EquipmentSetingInfo equipmentSetingInfo) {
        this.equipmentSetingInfo = equipmentSetingInfo;
    }
}
