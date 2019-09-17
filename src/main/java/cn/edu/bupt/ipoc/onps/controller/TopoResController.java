package cn.edu.bupt.ipoc.onps.controller;

import cn.edu.bupt.ipoc.onps.model.Node;
import cn.edu.bupt.ipoc.onps.model.entity.CommonNode;
import cn.edu.bupt.ipoc.onps.model.entity.FiberLink;
import cn.edu.bupt.ipoc.onps.service.ExcelInputService;
import cn.edu.bupt.ipoc.onps.service.LinkManageService;
import cn.edu.bupt.ipoc.onps.service.NodeManageService;
import cn.edu.bupt.ipoc.onps.service.ResManagementService;
import cn.edu.bupt.ipoc.onps.utils.resultUtils.BaseResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import oracle.sql.OracleJdbc2SQLInput;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/topo")
public class TopoResController {

    @Resource
    private ExcelInputService excelInputService;
    @Resource
    private ResManagementService resManagementService;
    @Resource
    private LinkManageService linkManageService;
    @Resource
    private NodeManageService nodeManageService;

    @RequestMapping(value = "/excel",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object excelInput(@RequestParam("excelFile")MultipartFile file){
        try {
            excelInputService.inputTopogy(file);
            return getResList();
        } catch (Exception e) {
            //e.printStackTrace();
            return BaseResult.createFailResult(e.getMessage());
        }
    }
    @RequestMapping(value = "list",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object getResList(){
        Map<String,Object> map = new HashMap<>();
        map.put("node",resManagementService.getCommonNodes());
        map.put("fiberLink",resManagementService.getFiberLinks());
        map.put("wdmLink",resManagementService.getWdmLinks());
        map.put("otnLink",resManagementService.getOtnLinks());
        map.put("sdhLink",resManagementService.getSdhLinks());
        BaseResult result = BaseResult.createSuccessResult(map);
        return result;
    }
    @RequestMapping(value = "/node/create",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object creatNode(double longitude,double latitude,String name,int year,String type){
        return BaseResult.createSuccessResult(nodeManageService.creatNode(longitude,latitude,name,year,type));
    }
    @RequestMapping(value = "node/update",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object updateNode(String id,double longitude,double latitude,String name,int year,String type){
        try {
            Node node = nodeManageService.updateNode(id,longitude,latitude,name,year,type);
            return BaseResult.createSuccessResult(node);
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }
    }
    @RequestMapping(value = "/node/delete",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object deleteNode(String id){
        try {
            if(nodeManageService.deleteNode(id))
                return BaseResult.createSuccessResult(id);
            else
                return BaseResult.createFailResult("要删除的节点不存在");
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }
    }
    @RequestMapping(value = "/fiber/create",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object createFiberLink(String name, String fromNodeId, String toNodeId, double length, int size, int year){
        try {
            return BaseResult.createSuccessResult(linkManageService.addFiberLink(name,fromNodeId,toNodeId,length,size,year));
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }
    }
    @RequestMapping(value = "/fiber/update",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object updateFiberLink(String id, String name, double length, int addSize, int year){
        try {
            return BaseResult.createSuccessResult(linkManageService.updateFiberLink(id,name,length,addSize,year));
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }
    }
    @RequestMapping(value = "/fiber/delete",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object deleteFiberLink(String id){
        try {
            if(linkManageService.deleteFiberLink(id))
                return BaseResult.createSuccessResult(id);
            else
                return BaseResult.createFailResult("要删除的链路不存在");
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }
    }
    @RequestMapping(value = "/wdm/create",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object createWdmLink(String name, String fromNodeId, String toNodeId, double length, double rate, int size, int year){

        try {
            return BaseResult.createSuccessResult(linkManageService.addWDMLink(name,fromNodeId,toNodeId,length,rate,size,year));
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }
    }
    @RequestMapping(value = "/wdm/update",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object updateWdmLink(String id, String name, double length, int addSize, int year){
        try {
            return BaseResult.createSuccessResult(linkManageService.updateWDMLink(id,name,length,addSize,year));
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }
    }
    @RequestMapping(value = "/wdm/delete",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object deleteWdmLink(String id){
        try {
            if(linkManageService.deleteWDMLink(id))
                return BaseResult.createSuccessResult(id);
            else
                return BaseResult.createFailResult("要删除的链路不存在");
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }
    }
    @RequestMapping(value = "/otn/create",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object createOtnLink(String name, String fromNodeId, String toNodeId, double length, double rate, int size, int year, String layer){

        try {
            return BaseResult.createSuccessResult(linkManageService.addOTNLink(name,fromNodeId,toNodeId,length,rate,size,year,layer));
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }
    }
    @RequestMapping(value = "/otn/update",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object updateOtnLink(String id, String name, double length, int addSize, int year){
        try {
            return BaseResult.createSuccessResult(linkManageService.updateOTNLink(id,name,length,addSize,year));
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }
    }
    @RequestMapping(value = "/otn/delete",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object deleteOtnLink(String id){
        try {
            if(linkManageService.deleteOTNLink(id))
                return BaseResult.createSuccessResult(id);
            else
                return BaseResult.createFailResult("要删除的链路不存在");
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }

    }
    @RequestMapping(value = "/sdh/create",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object createSdhLink(String name, String fromNodeId, String toNodeId, double length, double rate, int size, int year, String layer){
        try {
            return BaseResult.createSuccessResult(linkManageService.addSDHLink(name,fromNodeId,toNodeId,length,rate,size,year,layer));
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }
    }
    @RequestMapping(value = "sdh/update",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object updateSdhLink(String id, String name, double length, int addSize, int year){
        try {
            return BaseResult.createSuccessResult(linkManageService.updateSDHLink(id,name,length,addSize,year));
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }
    }
    @RequestMapping(value = "/sdh/delete",produces = { "application/json;charset=UTF-8" })
    @ResponseBody
    public Object deleteSdhLink(String id){
        try {
            if(linkManageService.deleteSDHLink(id))
                return BaseResult.createSuccessResult(id);
            else
                return BaseResult.createFailResult("要删除的链路不存在");
        } catch (Exception e) {
            return BaseResult.createFailResult(e.getMessage());
        }
    }

}
