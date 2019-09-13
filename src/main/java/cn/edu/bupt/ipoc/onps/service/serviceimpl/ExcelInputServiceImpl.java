package cn.edu.bupt.ipoc.onps.service.serviceimpl;

import cn.edu.bupt.ipoc.onps.base.algrithm.route.LayerRouteFinder;
import cn.edu.bupt.ipoc.onps.model.entity.*;
import cn.edu.bupt.ipoc.onps.service.ExcelInputService;
import cn.edu.bupt.ipoc.onps.service.ResManagementService;
import cn.edu.bupt.ipoc.onps.utils.LayerString;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;


import javax.annotation.Resource;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION ,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ExcelInputServiceImpl implements ExcelInputService {
    @Resource
    private ResManagementService resManagementService;

    @Override
    public void inputTopogy(MultipartFile file) throws Exception {
        if(file == null)
            throw new NullPointerException();
        InputStream inputStream = file.getInputStream();
        String fileName = file.getOriginalFilename();
        Workbook book = null;
        if(fileName.toLowerCase().endsWith("xls")) {
            System.out.println("兼容xls");
            book = new HSSFWorkbook(inputStream);

        }else if (fileName.toLowerCase().endsWith("xlsx")){
            System.out.println("兼容xlsx");
            book = new XSSFWorkbook(inputStream);
        }else {
            throw new Exception("老哥能不能上传excel");
        }
        //导入节点
        List<CommonNode> commonNodeList = new ArrayList<>();
        Sheet sheet = book.getSheet("节点");
        System.out.println(">>>>>>>>>>导入节点<<<<<<<<<<");
        for(int i = 1; i <= sheet.getLastRowNum();i++){
            Row row = sheet.getRow(i);
            if(row == null)continue;
            String name = row.getCell(1).getStringCellValue();
            double longitude = row.getCell(2).getNumericCellValue();
            double latitude = row.getCell(3).getNumericCellValue();
            String type = row.getCell(4).getStringCellValue();
            int year = (int) row.getCell(5).getNumericCellValue();
            CommonNode node = new CommonNode.Builder(name,longitude,latitude)
                    .type(type)
                    .year(year)
                    .build();
            commonNodeList.add(node);
        }
        //导入Fiber链路
        List<BasicLink> fiberLinkList = new ArrayList<>();
        sheet = book.getSheet("FIBER链路");
        System.out.println(">>>>>>>>>>导入Fiber链路<<<<<<<<<<");
        for(int i = 1; i<sheet.getLastRowNum();i++){
            Row row = sheet.getRow(i);
            if(row == null)continue;
            String name = row.getCell(1).getStringCellValue();
            String fromNodeName = row.getCell(2).getStringCellValue();
            String toNodeName = row.getCell(3).getStringCellValue();
            int length = (int) row.getCell(4).getNumericCellValue();
            int size = (int)row.getCell(5).getNumericCellValue();
            int year = (int)row.getCell(6).getNumericCellValue();
            String perfunctoryWay = row.getCell(7).getStringCellValue();
            int fualtTime = 0;
            if(row.getCell(8)!=null)
                fualtTime = (int)row.getCell(8).getNumericCellValue();
            double aveAttenua = 0;
            if(row.getCell(9)!=null)
                aveAttenua =  row.getCell(9).getNumericCellValue();
            String maintianDepartment = row.getCell(10).getStringCellValue();
            CommonNode from = null;
            CommonNode to = null;
            for(CommonNode node:commonNodeList){
                if(node.getName().equals(fromNodeName))
                    from = node;
                if(node.getName().equals(toNodeName))
                    to = node;
            }
            if(from == null){
                throw  new NullPointerException("FIBER链路导入："+i+"行起点节点不存在");

            }
            if(to == null){
                throw  new NullPointerException("FIBER链路导入："+i+"行终点节点不存在");
            }
            BasicLink link = new FiberLink.Builder(name,from,to,size)
                    .year(year)
                    .perfunctoryWay(perfunctoryWay)
                    .fualtTime(fualtTime)
                    .aveAttenua(aveAttenua)
                    .maintianDepartment(maintianDepartment)
                    .length(length)
                    .build();
            fiberLinkList.add(link);
        }
        //导入WDM链路
        List<BasicLink> wdmLinkList = new ArrayList<>();
        sheet = book.getSheet("WDM链路");
        System.out.println(">>>>>>>>>>导入WDM链路<<<<<<<<<<");
        for(int i = 1; i<sheet.getLastRowNum();i++){
            Row row = sheet.getRow(i);
            if(row == null)continue;
            String name = row.getCell(1).getStringCellValue();
            String fromNodeName = row.getCell(2).getStringCellValue();
            String toNodeName = row.getCell(3).getStringCellValue();
            int length = (int) row.getCell(4).getNumericCellValue();
            double rate = row.getCell(5).getNumericCellValue();
            int size = (int)row.getCell(6).getNumericCellValue();
            int year = (int)row.getCell(8).getNumericCellValue();
            CommonNode from = null;
            CommonNode to = null;
            for(CommonNode node:commonNodeList){
                if(node.getName().equals(fromNodeName))
                    from = node;
                if(node.getName().equals(toNodeName))
                    to = node;
            }
            List<BasicLink> layerRoute = LayerRouteFinder.getInstance().find(fiberLinkList,commonNodeList,from,to, LayerString.FIBER,rate);
            BasicLink link = new WDMLink.Builder(name,from,to)
                    .length(length)
                    .size(size)
                    .layerRoute(layerRoute)
                    .rate(rate)
                    .year(year)
                    .build();
            wdmLinkList.add(link);
        }
        //导入OTN链路
        List<BasicLink> otnLinkList = new ArrayList<>();
        sheet = book.getSheet("OTN链路");
        System.out.println(">>>>>>>>>>导入OTN链路<<<<<<<<<<");
        for(int i = 1; i<sheet.getLastRowNum();i++){
            Row row = sheet.getRow(i);
            if(row == null)continue;
            String name = row.getCell(1).getStringCellValue();
            String fromNodeName = row.getCell(2).getStringCellValue();
            String toNodeName = row.getCell(3).getStringCellValue();
            int length = (int) row.getCell(4).getNumericCellValue();
            double rate = row.getCell(5).getNumericCellValue();
            int size = (int)row.getCell(6).getNumericCellValue();
            String carryLayer = row.getCell(8).getStringCellValue();
            int year = (int)row.getCell(9).getNumericCellValue();

            CommonNode from = null;
            CommonNode to = null;
            for(CommonNode node:commonNodeList){
                if(node.getName().equals(fromNodeName))
                    from = node;
                if(node.getName().equals(toNodeName))
                    to = node;
            }
            List<BasicLink> links = null;
            if(carryLayer.equals(LayerString.FIBER))
                links = fiberLinkList;
            else if(carryLayer.equals(LayerString.WDM))
                links = wdmLinkList;
            else
                links = fiberLinkList;
            List<BasicLink> layerRoute = LayerRouteFinder.getInstance().find(links,commonNodeList,from,to, carryLayer,rate);
            BasicLink link = new OTNLink.Builder(name,from,to)
                    .size(size)
                    .length(length)
                    .rate(rate)
                    .carriedType(carryLayer)
                    .layerRoute(layerRoute)
                    .year(year)
                    .build();
            otnLinkList.add(link);
        }
        //导入SDH链路
        List<BasicLink> sdhLinkList = new ArrayList<>();
        sheet = book.getSheet("SDH链路");
        System.out.println(">>>>>>>>>>导入SDH链路<<<<<<<<<<");
        for(int i = 1; i<sheet.getLastRowNum();i++){
            Row row = sheet.getRow(i);
            String name = row.getCell(1).getStringCellValue();
            String fromNodeName = row.getCell(2).getStringCellValue();
            String toNodeName = row.getCell(3).getStringCellValue();
            int length = (int) row.getCell(4).getNumericCellValue();
            double rate = row.getCell(5).getNumericCellValue();
            int size = (int)row.getCell(6).getNumericCellValue();
            String carryLayer = row.getCell(8).getStringCellValue();
            int year = (int)row.getCell(9).getNumericCellValue();

            CommonNode from = null;
            CommonNode to = null;
            for(CommonNode node:commonNodeList){
                if(node.getName().equals(fromNodeName))
                    from = node;
                if(node.getName().equals(toNodeName))
                    to = node;
            }
            List<BasicLink> links = null;
            if(carryLayer.equals(LayerString.FIBER))
                links = fiberLinkList;
            else if(carryLayer.equals(LayerString.WDM))
                links = wdmLinkList;
            else if(carryLayer.equals(LayerString.OTN))
                links = otnLinkList;
            else
                links = fiberLinkList;
            List<BasicLink> layerRoute = LayerRouteFinder.getInstance().find(links,commonNodeList,from,to, carryLayer,rate);
            BasicLink link = new SDHLink.Builder(name,from,to)
                    .size(size)
                    .length(length)
                    .rate(rate)
                    .carriedType(carryLayer)
                    .layerRoute(layerRoute)
                    .year(year)
                    .build();
            sdhLinkList.add(link);
            resManagementService.setCommonNodes(commonNodeList);
            resManagementService.setFiberLinks(fiberLinkList);
            resManagementService.setWdmLinks(wdmLinkList);
            resManagementService.setOtnLinks(otnLinkList);
            resManagementService.setSdhLinks(sdhLinkList);

        }




    }

    @Override
    public void inputTraffic(MultipartFile file) throws Exception {
        if(file == null)
            throw new NullPointerException();

    }
}
