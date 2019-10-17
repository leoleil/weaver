package cn.edu.bupt.ipoc.onps.model.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Traffic {
    private String id;			                          //业务ID
    private int size;
    private String name;		                          //业务名称
    private String layer;		                          //所在层
    private CommonNode fromNode;	                          //首节点
    private CommonNode toNode;		                          //末节点
    private double rate;	                           	  //业务速率
    private String trafficRate;		                  //业务速率
    private String status;		                          //业务状态
    private TrafficGroup  group=null;		                      //所属业务组
    private String   level;		                          //业务保护等级
    private int  year;		                          //业务年份
    private int	 effect;		                          //受影响次数，生存性使用
    private int fall;		                          //恢复失败次数，生存性使用
    private int cutoff;                               //中断次数，生存性用
    private boolean	type;		                          //业务类型是否是预测,是为true
    private Route workRoute = new Route();              //工作路由
    private Route protectRoute = new Route();           //保护路由
    private Route resumeRoute = new Route();            //恢复路由
    private Route resumeRouteP = new Route();           //保护路由的恢复路由
    private Set<CommonNode> workMustNode = new HashSet<>();         	              //业务工作路由的必经节点
    private Set<CommonNode>	workNeverNode = new HashSet<>() ;                       //业务工作路由排斥节点
    private Set<CommonNode>	protectMustNode = new HashSet<>() ;                     //业务保护路由的必经节点
    private Set<CommonNode>	protectNeverNode = new HashSet<>() ;                    //业务保护路由排斥节点
    private String faultAffected = null;                 //路由受故障影响程度    FaultAffected:降级/中断/保持
    private List<ChildTraffic> childTrafficList;	     //副本业务，业务分流造成
    private String faultType;                            //故障类型         1 工作 2 保护 3工作保护

    public Traffic(String id){
        this.id = id;
    }
    public Traffic(){
        this.id = UUID.randomUUID().toString().replace("-","");
    }

    public void addRoute(List<BasicLink> links,String type){

    }

    public boolean block(){
        return true;
    }

}
