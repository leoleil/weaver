package cn.edu.bupt.ipoc.onps.model.entity;

import java.util.List;

public class SDHRing {
    private	String			              id;				                                //SDH环编号
    private	String		              name;			                                    //SDH环名称
    private	boolean	                  bidirectional;	                                    //是否为双向环
    private String			  protectType;            //环保护类型 通道或复用段
    private List<SDHLink> SDHLinkList;           //存储环所包含的链路
}
