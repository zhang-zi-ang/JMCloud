package ii_3.entity.dictionary;

/**
 * @Author: zhang-zi-ang
 * @Date: Created in 2020/4/23 16:35
 * @Description: 设备状态实体类
 * @Modified By:
 */
public class EquipmentStatus {
    private int statusId;
    private String statusName;
    private String statusCN;
    private String statusEN;

    public EquipmentStatus() {
        super();
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusCN() {
        return statusCN;
    }

    public void setStatusCN(String statusCN) {
        this.statusCN = statusCN;
    }

    public String getStatusEN() {
        return statusEN;
    }

    public void setStatusEN(String statusEN) {
        this.statusEN = statusEN;
    }
}
