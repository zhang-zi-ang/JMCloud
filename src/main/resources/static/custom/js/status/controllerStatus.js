var statusApp = angular.module('statusApp', []);

statusApp.controller('statusController', ['$interval','$http', function($interval, $http) {
    var self = this;
    this.status = [];
    this.timer = 60000;//定时器，单位：毫秒

    //进入页面时先获取一次状态
    getEquipStatusInfo();

    //1分钟更新一次
    $interval(function(){
        getEquipStatusInfo();
    },this.timer);

    /**
     * @Author: zhang-zi-ang
     * @Date: Created in 2020/4/20 17:21
     * @Param: null
     * @Return:
     * @Description:  获得设备状态后把值传递给self.status
     *                页面通过获取self.status来展示总的状态。
     * @Modified By:
     */
    function getEquipStatusInfo(){
        return $http.get('/getEquipStatus').then(function(response){
            self.equipments = response.data;
            console.log(response.data);
            self.status = getEquipmentStatus(self.equipments);
        }, function(errResponse) {
            console.error('Error while fetching equipments');
        });
    }
}]);



/**
 * @Author: zhang-zi-ang
 * @Date: Created in 2020/4/20 17:28
 * @Param: null
 * @Return: status
 * @Description: 从equipmentAllInfo中获取全部设备信息，然后获取其中的设备状态码。
 * @Modified By:
 */
function getEquipmentStatus(equipmentAllInfo){
    var running = 0;//运行
    var stopped = 0;//停机
    var fault = 0;//故障
    var unknown = 0;//其他
    var i;
    var status = [];
    for(var i = 0; i < equipmentAllInfo.length; i++){
        {
            switch(equipmentAllInfo[i].equipmentSetingInfo.deviceStatus){
                case -1://设备状态码为-1时，设定为故障状态(无法连接网关)
                    fault++;
                    break;
                case 0://设备状态码为0时，设定为停机状态(上电停机)
                    stopped++;
                    break;
                case 1://设备状态码为1时，设定为运行状态(设备启动中)
                    running++;
                    break;
                case 2://设备状态码为2时，设定为运行状态(设备运行)
                    running++;
                    break;
                case 3://设备状态码为3时，设定为运行状态（设备停机中，这里有疑问）
                    running++;
                    break;
                case 4://设备状态码为4时，设定为停机状态(设备停机)
                    stopped++;
                    break;
                case 5://设备状态码为5时，设定为其他状态(设备待机)
                    unknown++;
                    break;
                case 6://设备状态码为6时，设定为其他状态(设备离线)
                    unknown++;
                    break;
                case 7://设备状态码为7时，设定为故障状态（未定义）
                    fault++;
                    break;
                default://设备状态码为其他情况时，设定为其他状态
                    unknown = unknown+1;
                    break;
            }
        }

    }
    status = {"running":running,
        "stopped":stopped,
        "unknown":unknown,
        "fault":fault
    }
    return status;
}
