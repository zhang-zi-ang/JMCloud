var statusApp = angular.module('statusApp', []);

statusApp.controller('statusController', ['$interval','$http', function($interval, $http) {
    var self = this;

    self.status = [];

    /**
     * @Author: zhang-zi-ang
     * @Date: Created in 2020/4/20 17:21
     * @Param: null
     * @Return:
     * @Description:  询问设备状态，60秒一次，获得设备状态后把值传递给self.status
     *                页面通过获取self.status来展示总的状态。
     * @Modified By:
     */
    $interval(function(){$http.get('/getEquipStatus').then(function(response){
        self.equipments = response.data;
        console.log("+______++++");
        console.log(response.data);
        self.status = getEquipmentStatus(self.equipments);
    }, function(errResponse) {
        console.error('Error while fetching equipments');
    })},6000);



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
    for(i = 0; i < equipmentAllInfo.length; i++){
        {
            switch(equipmentAllInfo[i].equipmentStatus){
                case 3://设备状态码为3时，设定为运行状态
                    running = running+1;
                    break;
                case 4://设备状态码为4时，设定为停机状态
                    stopped = stopped+1;
                    break;
                case 7://设备状态码为7时，设定为故障状态
                    fault = fault+1;
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
