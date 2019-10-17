package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.model.Limit;

public class Strategy implements Limit {
    private boolean isAutoExpend = false;//自动扩容
    private double ResourceReservation;
}
