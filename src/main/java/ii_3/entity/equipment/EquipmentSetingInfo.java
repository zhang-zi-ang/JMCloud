package ii_3.entity.equipment;

import java.sql.Timestamp;
import java.util.Calendar;

/**
 * @Author: zhang-zi-ang
 * @Date: Created in 2020/4/21 16:54
 * @Description: 设备的配置信息，对应旧版EquipmentBasicInfo
 * @Modified By:
 */

/* 设备的报文信息,20个数据, 25个半字
	U16 deviceType;						!< 1, 设备类型, 1: 倍捻机 ..
	U16 opt1;							!< 2, Option 1
	U16 opt2;							!< 3, Option 2
	U16 spindleNum;						!< 4, 整机锭数 <1~600>
	U16 spindleType;					!< 5, 单锭类型 0：无单锭数据, 1：无锭速，有断纱, 2：有锭速，有断纱
	U16 deviceStatus;			        !< 6, 机器状态 10:通讯故障
	U16 faultID;			            !< 7, 故障代码
	U32 taskTime;				    	!< 8~9, 任务总时间，单位:S
	U32 remTime;						!< 10~11, 任务剩余总时间, 单位:S
	U32 batchNumber;					!< 12~13, 纱线批号
	U16 yarnSize;						!< 14, 纱线支数< 单位: 0.1公制数  m/g> <0~999>
	U16 twistDir;				    	!< 15, 捻向设定 < 0:Z捻; 1:S捻 >
	U16 twistSet;				    	!< 16, 捻度(设定) 1(范围: 0~9999)
	U16 twist;							!< 17, 捻度(实测) 1(范围: 0~9999)
	U16 twistRpmSet;			    	!< 18, 锭速(设定) 1(范围: 0~12000)
	U16 twistRpm;			       	 	!< 19, 锭速(实测) < r/min > <RO>
	U16 windSpdSet;						!< 20, 卷绕速度(设定) < 0.01m/min > <RO>
	U16 windSpd;						!< 21, 卷绕转速(实测) < 0.01m/min > <RO>
	U32 yarnLenSet;						!< 22~23, 纱线定长, 单位: 1m
	U32 yarnLen;						!< 24~25, 纱线当前长度, 单位: 0.1m
	U16 m_res1[75];						!< 22~100, 保留
 */

public class EquipmentSetingInfo {
    private int equipmentId;                    // 设备ID
    private Timestamp modifiedTime;             // 收到配置信息时的时间戳

    private int deviceType;						/*!< 1, 设备类型, 1: 倍捻机 .. */
    private int opt1;							/*!< 2, Option 1 */
    private int opt2;							/*!< 3, Option 2 */
    private int spindleNum;						/*!< 4, 整机锭数 <1~600> */
    private int spindleType;					/*!< 5, 单锭类型 0：无单锭数据, 1：无锭速，有断纱, 2：有锭速，有断纱 */
    private int deviceStatus;			        /*!< 6, 机器状态 10:通讯故障 */
    private int faultID;			            /*!< 7, 故障代码 */
    private int taskTime;				    	/*!< 8~9, 任务总时间，单位:S */
    private int remTime;						/*!< 10~11, 任务剩余总时间, 单位:S */
    private int batchNumber;					/*!< 12~13, 纱线批号 */
    private int yarnSize;						/*!< 14, 纱线支数< 单位: 0.1公制数  m/g> <0~999> */
    private int twistDir;				    	/*!< 15, 捻向设定 < 0:Z捻; 1:S捻 > */
    private int twistSet;				    	/*!< 16, 捻度(设定) 1(范围: 0~9999) */
    private int twist;							/*!< 17, 捻度(实测) 1(范围: 0~9999) */
    private int twistRpmSet;			    	/*!< 18, 锭速(设定) 1(范围: 0~12000) */
    private int twistRpm;			        	/*!< 19, 锭速(实测) < r/min > <RO> */
    private int windSpdSet;						/*!< 20, 卷绕速度(设定) < 0.01m/min > <RO> */
    private int windSpd;						/*!< 21, 卷绕转速(实测) < 0.01m/min > <RO> */
    private int yarnLenSet;						/*!< 22~23, 纱线定长, 单位: 1m */
    private int yarnLen;						/*!< 24~25, 纱线当前长度, 单位: 0.1m */
    //private int m_res1[75];					/*!< 22~100, 保留 */


    //无参构造
    public EquipmentSetingInfo() {
    }

    //使用设备ID和获得数据进行构造
    public EquipmentSetingInfo( int equipmentId, int[] regVal) {
        if (regVal.length >=25 ) {
            int addr = 0;

            this.equipmentId = equipmentId;
            this.modifiedTime = new Timestamp(Calendar.getInstance().getTime().getTime());

            this.deviceType = regVal[addr];
            this.opt1 = regVal[addr+1];
            this.opt2 = regVal[addr+2];
            this.spindleNum = regVal[addr+3];
            this.spindleType = regVal[addr+4];
            this.deviceStatus = regVal[addr+5];
            this.faultID = regVal[addr+6];
            this.taskTime = (regVal[addr+8]&0xFFFF)*65536+(regVal[addr+7]&0xFFFF);
            this.remTime = (regVal[addr+10]&0xFFFF)*65536+(regVal[addr+9]&0xFFFF);
            this.batchNumber = (regVal[addr+12]&0xFFFF)*65536+(regVal[addr+11]&0xFFFF);
            this.yarnSize = regVal[addr+13];
            this.twistDir = regVal[addr+14];
            this.twistSet = regVal[addr+15];
            this.twist = regVal[addr+16];
            this.twistRpmSet = regVal[addr+17];
            this.twistRpm = regVal[addr+18];
            this.windSpdSet = regVal[addr+19];
            this.windSpd = regVal[addr+20];
            this.yarnLenSet = (regVal[addr+22]&0xFFFF)*65536+(regVal[addr+21]&0xFFFF);
            this.yarnLen = (regVal[addr+24]&0xFFFF)*65536+(regVal[addr+23]&0xFFFF);
        }
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    public int getOpt1() {
        return opt1;
    }

    public void setOpt1(int opt1) {
        this.opt1 = opt1;
    }

    public int getOpt2() {
        return opt2;
    }

    public void setOpt2(int opt2) {
        this.opt2 = opt2;
    }

    public int getSpindleNum() {
        return spindleNum;
    }

    public void setSpindleNum(int spindleNum) {
        this.spindleNum = spindleNum;
    }

    public int getSpindleType() {
        return spindleType;
    }

    public void setSpindleType(int spindleType) {
        this.spindleType = spindleType;
    }

    public int getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(int deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public int getFaultID() {
        return faultID;
    }

    public void setFaultID(int faultID) {
        this.faultID = faultID;
    }

    public int getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(int taskTime) {
        this.taskTime = taskTime;
    }

    public int getRemTime() {
        return remTime;
    }

    public void setRemTime(int remTime) {
        this.remTime = remTime;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    public int getYarnSize() {
        return yarnSize;
    }

    public void setYarnSize(int yarnSize) {
        this.yarnSize = yarnSize;
    }

    public int getTwistDir() {
        return twistDir;
    }

    public void setTwistDir(int twistDir) {
        this.twistDir = twistDir;
    }

    public int getTwistSet() {
        return twistSet;
    }

    public void setTwistSet(int twistSet) {
        this.twistSet = twistSet;
    }

    public int getTwist() {
        return twist;
    }

    public void setTwist(int twist) {
        this.twist = twist;
    }

    public int getTwistRpmSet() {
        return twistRpmSet;
    }

    public void setTwistRpmSet(int twistRpmSet) {
        this.twistRpmSet = twistRpmSet;
    }

    public int getTwistRpm() {
        return twistRpm;
    }

    public void setTwistRpm(int twistRpm) {
        this.twistRpm = twistRpm;
    }

    public int getWindSpdSet() {
        return windSpdSet;
    }

    public void setWindSpdSet(int windSpdSet) {
        this.windSpdSet = windSpdSet;
    }

    public int getWindSpd() {
        return windSpd;
    }

    public void setWindSpd(int windSpd) {
        this.windSpd = windSpd;
    }

    public int getYarnLenSet() {
        return yarnLenSet;
    }

    public void setYarnLenSet(int yarnLenSet) {
        this.yarnLenSet = yarnLenSet;
    }

    public int getYarnLen() {
        return yarnLen;
    }

    public void setYarnLen(int yarnLen) {
        this.yarnLen = yarnLen;
    }
}
