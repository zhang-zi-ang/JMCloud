package ii_3.entity.equipment;

import java.sql.Timestamp;

/**
 * @Author: zhang-zi-ang
 * @Date: Created in 2020/4/21 16:59
 * @Description: 设备的单锭数据信息，只做保留
 * 实际上已经不用，但是留下实体类，仅作为参考
 * @Modified By:
 */
public class EquipmentShiftInfo {
    private int equipmentId;                // 设备ID
    private Timestamp modifiedTime;         // 收到报文信息时的时间戳

    private int shiftTimeMin;				/*!< 101		开始分钟	0~23 */
    private int shiftTimeHour;				/*!< 102		开始小时	*/
    private int shiftUserId;				/*!< 103		班次用户号	 */
    private int shiftFlag;					/*!< 104		班次开启标志, 0: 关闭, other: 开启 */
    private int shiftRunTime;				/*!< 105~106	运行时间, 单位: S */
    private int shiftTwistRpm;				/*!< 107		锭速(设定) 1(范围: 0~12000) */
    private int shiftTwist;					/*!< 108		捻度	*/
    private int shiftYarnSize;				/*!< 109		纱线支数< 单位: 0.1公制数  m/g> <0~999> */
    private int shiftProductAll;			/*!< 110~111	总产量	0.1kg */
    /*!< 112 ~ 157  保留 */
    private int shiftYear;					/*!< 158		当前班次 年	*/
    private int shiftMon;					/*!< 159		当前班次 月	*/
    private int shiftDay;					/*!< 160		当前班次 日	*/
    private int shiftBrkNumL;				/*!< 161		断纱次数--左	次数 */
    private int shiftBrkTimL;				/*!< 162~163	断纱时间--左	S */
    private int shiftEffciencyL;			/*!< 164		效率--左	xx.x% */
    private int shiftProductL;				/*!< 165~166	产量--左	0.1kg */
    /*!< 167~180    保留 */
    private int shiftBrkNumR;				/*!< 181		断纱次数--左	次数 */
    private int shiftBrkTimR;				/*!< 182~183	断纱时间--左	S */
    private int shiftEffciencyR;			/*!< 184		效率--左	xx.x% */
    private int shiftProductR;				/*!< 185~186	产量--左	0.1kg */
    /*!< 187~200    保留 */
}
