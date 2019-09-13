package cn.edu.bupt.ipoc.onps.model.entity;

import java.util.List;

public class TrafficGroup {
    private	int			                 id;				    //业务组编号
    private String 			             name;                  //业务组名称
    private List<Traffic>                trafficList;           //存储环业务组包含的业务
    private boolean                      same;                  //要求路由一致true 相斥 false
}
