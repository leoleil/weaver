package cn.edu.bupt.ipoc.onps.service;

import org.springframework.web.multipart.MultipartFile;

public interface ExcelInputService {
    void inputTopogy(MultipartFile file) throws Exception;
    void inputTraffic(MultipartFile file) throws Exception;

}
