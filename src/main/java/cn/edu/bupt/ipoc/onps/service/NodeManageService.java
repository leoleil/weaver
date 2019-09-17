package cn.edu.bupt.ipoc.onps.service;

import cn.edu.bupt.ipoc.onps.model.Node;

public interface NodeManageService {
    Node creatNode(double longitude,double latitude,String name,int year,String type);
    boolean deleteNode(String id) throws Exception;
    Node updateNode(String id,double longitude,double latitude,String name,int year,String type) throws Exception;
}
