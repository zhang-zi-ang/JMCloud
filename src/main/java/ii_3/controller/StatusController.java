//package ii_3.controller;
//
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @Author: zhang-zi-ang
// * @Date: Created in 2020/4/20 17:48
// * @Description: 设备状态控制器
// * @Modified By:
// */
//
//@RestController
//public class StatusController {
//
//    List<Equipment> list = new ArrayList<Equipment>();
//
//    @RequestMapping(value = "/getEquipStatus", method = RequestMethod.GET)
//    public List<EquipmentView> equipmentsBetweenTime(@PathVariable int currentPage){
//        //System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        //当前页数  currentPage
//        if(currentPage -1 != 0){
//            int a = (currentPage-1)*20;
//            if(list != null || list.size() > 0){
//                list.clear();
//            }
//            PageBean pb = new PageBean();
//            List<EquipmentView> listEquipmentView = new ArrayList<EquipmentView>();
//            list = equipmentService.getAllSchedules(a, pb.getPageSize()+10);
//            //List listEquipmentView = equipmentService.getallpages(a, pageBean.getPageSize());
//            for (Equipment equipment : list) {
//                DeviceType deviceType = deviceTypeService.findById(equipment.getEquipmentBasicInfo().getDeviceType());
//                if (deviceType == null) {
//                    equipment.setEquipmentType("unknown type");
//                } else {
//                }
//                DeviceStatus deviceStatus = deviceStatusService
//                        .findById(equipment.getEquipmentBasicInfo().getDeviceStatus());
//                if (deviceStatus == null) {
//                    equipment.setStatus("unknown status");
//                } else {
//                    equipment.setStatus(deviceStatus.getStatusCN());
//                }
//                listEquipmentView.add(new EquipmentView(equipment));
//            }
//            return listEquipmentView;
//
//        }else{
//
//            if(list != null || list.size() > 0){
//                list.clear();
//            }
//            PageBean pb = new PageBean();
//            List<EquipmentView> listEquipmentView = new ArrayList<EquipmentView>();
//            list = equipmentService.getAllSchedules(currentPage-1, pb.getPageSize()+10);
//            //list = equipmentService.getallpages(currentPage-1, pageBean.getPageSize());
//            for (Equipment equipment : list) {
//                DeviceType deviceType = deviceTypeService.findById(equipment.getEquipmentBasicInfo().getDeviceType());
//                if (deviceType == null) {
//                    equipment.setEquipmentType("unknown type");
//                } else {
//                }
//                DeviceStatus deviceStatus = deviceStatusService
//                        .findById(equipment.getEquipmentBasicInfo().getDeviceStatus());
//                if (deviceStatus == null) {
//                    equipment.setStatus("unknown status");
//                } else {
//                    equipment.setStatus(deviceStatus.getStatusCN());
//                }
//                listEquipmentView.add(new EquipmentView(equipment));
//            }
//            return listEquipmentView;
//        }
//    }
//}
