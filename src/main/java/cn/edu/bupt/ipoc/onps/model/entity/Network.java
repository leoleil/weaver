package cn.edu.bupt.ipoc.onps.model.entity;

import java.util.List;

public class Network {
    private int                 id;             //网络域号，对应于节点与链路中的子网号
    private String              name;           //网络名称
    private String              type;           //1表示核心网，2表示军区网，3表示军区内城域网
    private int                 level;          //1表示核心网，2表示军区网，3表示军区内城域网 网络层级
    private Network             upperNetwork;//所属上层网络，即城域属于哪个军区网络，军区网络属于核心网络,核心网为null
    private List<CommonNode>    inNetNodeList;  //网络节点
    private List<BasicLink>     inNetLinkList;  //网络内部链路
    private List<BasicLink>     gatewayLinkList;//与外部连接的链路，网络间链路,表示与上层网络的连接关系
    private List<FiberLink>     inNetFiberLinkList;//网内fiber链
    private List<FiberLink>     gatewayFiberLinkList;//与外部连接的fiber链路
    private List<WDMLink>       inNetWDMLinkList;
    private List<WDMLink>       gatewayWDMLinkList;
    private List<OTNLink>       inNetOTNLinkList;
    private List<OTNLink>       gatewayOTNLinkList;
    private List<SDHLink>       inNetSDHLinkList;
    private List<SDHLink>       gatewaySDHLinkList;
    private List< CommonNode>   gatewayNodeList;
}
