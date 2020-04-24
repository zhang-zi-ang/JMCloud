package ii_3.entity.dictionary;

/**
 * @Author: zhang-zi-ang
 * @Date: Created in 2020/4/24 15:27
 * @Description: 设备种类实体类
 * @Modified By:
 */
public class EquipmentType {
    private int typeId;         // 类型码
    private String typeName;    // 类型标识码
    private String typeCN;      // 类型中文名
    private String typeEN;      // 类型英文名

    public EquipmentType() {
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeCN() {
        return typeCN;
    }

    public void setTypeCN(String typeCN) {
        this.typeCN = typeCN;
    }

    public String getTypeEN() {
        return typeEN;
    }

    public void setTypeEN(String typeEN) {
        this.typeEN = typeEN;
    }
}
