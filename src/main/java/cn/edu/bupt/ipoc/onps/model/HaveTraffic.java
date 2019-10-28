package cn.edu.bupt.ipoc.onps.model;

import cn.edu.bupt.ipoc.onps.model.entity.Traffic;

public interface HaveTraffic {
    boolean addTrafficWork(Traffic traffic);
    boolean addTrafficWork(Traffic traffic, String chooseResId);
    boolean addTrafficWorkProtect(Traffic traffic);
    boolean addTrafficWorkProtect(Traffic traffic, String chooseResId);
}
