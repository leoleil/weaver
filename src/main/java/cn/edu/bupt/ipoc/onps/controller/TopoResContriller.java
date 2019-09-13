package cn.edu.bupt.ipoc.onps.controller;

import cn.edu.bupt.ipoc.onps.service.ExcelInputService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@Controller
@RequestMapping("/topo")
public class TopoResContriller {

    @Resource
    private ExcelInputService excelInputService;
    @RequestMapping("/excel")
    public void excelInput(@RequestParam("excelFile")MultipartFile file){
        try {
            excelInputService.inputTopogy(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
