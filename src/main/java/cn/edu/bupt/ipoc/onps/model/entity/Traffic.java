package cn.edu.bupt.ipoc.onps.model.entity;

import java.util.List;

public class Traffic {
    private int	    				    id;			                          //业务ID
    private int                         size;
    private String						name;		                          //业务名称
    private String						layer;		                          //所在层
    private CommonNode					fromNode;	                          //首节点
    private CommonNode					toNode;		                          //末节点
    private double						rate;	                           	  //业务速率
    private String				        trafficRate;		                  //业务速率，枚举型
    private String				        status;		                          //业务状态
    private TrafficGroup			    group=null;		                      //所属业务组
    private String 				        level;		                          //业务保护等级
    private int						    year;		                          //业务年份
    private int						    effect;		                          //受影响次数，生存性使用
    private int						    fall;		                          //恢复失败次数，生存性使用
    private int                         cutoff;                               //中断次数，生存性用
    private boolean						type;		                          //业务类型是否是预测,是为true
    private Route						rorkRoute = new Route();              //工作路由
    private Route						protectRoute = new Route();           //保护路由
    private Route						resumeRoute = new Route();            //恢复路由
    private Route						resumeRouteP = new Route();           //保护路由的恢复路由
    private CommonNode		            workMustNode ;         	              //业务工作路由的必经节点
    private CommonNode		            workNeverNode ;                       //业务工作路由排斥节点
    private CommonNode		            protectMustNode ;                     //业务保护路由的必经节点
    private CommonNode		            protectNeverNode ;                    //业务保护路由排斥节点
    private BasicLink				    workMustLink ;                        //业务工作路由的必经链路
    private BasicLink				    workNeverLink ;                       //业务工作路由的排斥链路
    private BasicLink			        protectMustLink;                      //业务保护路由的必经链路
    private BasicLink				    protectNeverLink ;                    //业务保护路由的排斥链路
    private String				        faultAffected = null;                 //路由受故障影响程度    FaultAffected:降级/中断/保持
    private List<ChildTraffic>          childTrafficList;	                  //副本业务，业务分流造成
    private String                      faultType;                            //故障类型         1 工作 2 保护 3工作保护
}
