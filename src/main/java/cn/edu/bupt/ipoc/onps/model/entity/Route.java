package cn.edu.bupt.ipoc.onps.model.entity;

import java.util.List;

public class Route {
    private CommonNode                     fromNode;                       //路由首节点
    private CommonNode                     toNode;                         //路由末节点
    private String                         rate;                       //路由速率
    private String  				       id;                         //路由ID
    private String                         layer;                      //路由所属层
    private Traffic  				       traffic;                    //所归属的业务
    private int  				           hop;                        //跳数
    private int  				           length;                     //长度
    private int  			               value;                      //代价
    private boolean                        success = false;            //是否成功，true为成功，否则为false
    private float          	               reliability;                //可靠性
    private List<FiberLink>                fiberLinkList = null;         //记录业务路由（业务属于FIBER层）
    private List<CommonNode> 	           fiberNodeList = null;         //记录业务路由（业务属于FIBER层）
    private List<WDMLink> 		           WDMLinkList = null;           //记录业务路由（业务属于WDM层）
    private List<CommonNode> 		       WDMNodeList = null;           //记录业务路由（业务属于WDM层）
    private List<OTNLink> 		           OTNLinkList = null;           //记录业务路由（业务属于OTN层）
    private List<CommonNode> 		       OTNNodeList = null;           //记录业务路由（业务属于OTN层）
    private List<SDHLink> 		           SDHLinkList = null;           //记录业务路由（业务属于SDH层）
    private List<CommonNode> 		       SDHNodeList = null;           //记录业务路由（业务属于SDH层）
    private List<CommonNode> 		       nodeList = null;          //记录业务路由
    private List<BasicLink> 		       linkList = null;          //记录业务路由
    private List<String>                   sourceID=null;             //用于记录链路中占用的波道 或者 时序号
    private List<String>                   portSourceID=null;         //用于记录端口中占用的端口  包括两个业务端口  及相应2倍跳的线路端口


}
