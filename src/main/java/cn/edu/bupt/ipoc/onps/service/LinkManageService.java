package cn.edu.bupt.ipoc.onps.service;

import cn.edu.bupt.ipoc.onps.model.entity.FiberLink;

public interface LinkManageService {
    public FiberLink addFiberLink(String name, String fromNodeId, String toNodeId, double length, int size, int year)
}
