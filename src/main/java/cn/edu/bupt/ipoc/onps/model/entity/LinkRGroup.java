package cn.edu.bupt.ipoc.onps.model.entity;

import java.util.List;

public class LinkRGroup {
    private int 				        id;		                 //风险链路组号
    private String				        name;                     //风险链路组名称
    private String   			        layer;                    //所属层
    private boolean			            nature = true;            //是否是自动生成的，默认是

    private List<FiberLink>             fiberLinkList = null;     //Fiber层链路的风险链路组
    private List<WDMLink> 		        WDMLinkList =  null;       //WDM层链路的风险链路组
    private List<OTNLink> 		        OTNLinkList =  null;       //OTN层链路的风险链路组
    private List<SDHLink> 		        SDHLinkList = null;       //SDH层链路的风险链路组
    private List<BasicLink>             BasicLinkList = null;   //本变量表示，该链路组所基于的Fiber链只对高层次有意义，对低层就是其本身，
}
