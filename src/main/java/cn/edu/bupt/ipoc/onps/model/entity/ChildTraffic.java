package cn.edu.bupt.ipoc.onps.model.entity;

import java.util.List;
import java.util.Set;

public class ChildTraffic extends Traffic {

    private String id;			                          //业务ID
    private String name;		                          //业务名称
    private String layer;		                          //所在层
    private Traffic traffic; 		                      //所属业务
    private CommonNode fromNode;	                      //首节点
    private CommonNode toNode;		                      //末节点
    private double	rate;	                           	  //业务速率
    private String trafficRate;		                  //业务速率
    private int  num;                                  //业务数量
    private String  status;		                          //业务状态
    private TrafficGroup group=null;		                      //所属业务组
    private String level;		                          //业务保护等级
    private int	year;		                          //业务年份
    private int	effect;		                          //受影响次数，生存性使用
    private int	fall;		                          //恢复失败次数，生存性使用
    private boolean isAffectedWorkRoute;                   //故障模拟受影响的是否为工作路由
    private boolean	type;		                          //业务类型是否是预测,是为true
    private Route workRoute=new Route();                 //工作路由
    private Route protectRoute=new Route();              //保护路由
    private Route resumeRoute=null;                      //恢复路由
    private Route resumeRouteP=null;                     //保护路由的恢复路由
    private Set<CommonNode> workMustNode;         	//业务工作路由的必经节点
    private Set<CommonNode> workNeverNode ;            //业务工作路由排斥节点
    private Set<CommonNode> protectMustNode;          //业务保护路由的必经节点
    private Set<CommonNode> protectNeverNode;         //业务保护路由排斥节点
}
