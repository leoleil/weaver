package cn.edu.bupt.ipoc.onps.service;

import cn.edu.bupt.ipoc.onps.model.Node;

public interface NodeManageService {
    public Node creatNode(double longitude,double latitude,String name,int year,String type);
    public boolean deleteNode(String id);
    public Node updateNode(String id,double longitude,double latitude,String name,int year,String type);
}
