package cn.edu.bupt.ipoc.onps.model.entity;

import java.util.*;

public class Weaver {
    private List<FiberLink> fiberLinks = new ArrayList<>();
    private List<WDMLink> wdmLinks = new ArrayList<>();
    private List<OTNLink> otnLinks = new ArrayList<>();
    private List<SDHLink> sdhLinks = new ArrayList<>();
    private List<CommonNode> commonNodes = new ArrayList<>();

    private Set<CommonNode> commonNodeSet = new HashSet<>();
    private Set<BasicLink> linkSet = new HashSet<>();
    public Weaver(){

    }
    public Weaver(List<CommonNode> commonNodes){
        this.commonNodes = commonNodes;
        for (CommonNode node: commonNodes
             ) {
            commonNodeSet.add(node);
        }
    }
    //通过id搜索节点 不存返回空
    public CommonNode searchNodeById(String id){
        for (CommonNode node:commonNodes
             ) {
            if(node.getId().equals(id)){
                return node;
            }
        }
        return null;
    }
    //通过id搜索链路 不存在返回空
    public BasicLink searchLinkById(String id){
        for (FiberLink link: fiberLinks
        ) {
            if(link.getId().equals(id)){
                return link;
            }
        }
        for (WDMLink link: wdmLinks
        ) {
            if(link.getId().equals(id)){
                return link;
            }
        }
        for (OTNLink link: otnLinks
        ) {
            if(link.getId().equals(id)){
                return link;
            }
        }
        for (SDHLink link: sdhLinks
        ) {
            if(link.getId().equals(id)){
                return link;
            }
        }
        return null;
    }
    //添加节点 失败返回false
    public boolean addNode(CommonNode node){
        if(commonNodeSet.add(node)){
            commonNodes.add(node);
            return true;
        }
        return false;
    }
    //添加链路 失败返回false
    public boolean addLink(BasicLink link){
        if(linkSet.add(link)){
            if(link instanceof FiberLink){
                fiberLinks.add((FiberLink) link);
                return true;
            }else if(link instanceof WDMLink){
                wdmLinks.add((WDMLink)link);
                return true;
            }else if(link instanceof OTNLink){
                otnLinks.add((OTNLink)link);
                return true;
            }else if(link instanceof SDHLink){
                sdhLinks.add((SDHLink)link);
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

    //open API 拓扑数据
    public Map<String, Object> topoOpenAPI(){
        Map<String,Object> map = new HashMap<>();
        map.put("node",getCommonNodes());
        map.put("fiberLink",getFiberLinks());
        map.put("wdmLink",getWdmLinks());
        map.put("otnLink",getOtnLinks());
        map.put("sdhLink",getSdhLinks());
        return map;
    }


    // getter and setter
    public List<FiberLink> getFiberLinks() {
        return fiberLinks;
    }

    public void setFiberLinks(List<FiberLink> fiberLinks) {
        this.fiberLinks = fiberLinks;
        for (BasicLink link: fiberLinks
             ) {
            linkSet.add(link);
        }
    }

    public List<WDMLink> getWdmLinks() {
        return wdmLinks;
    }

    public void setWdmLinks(List<WDMLink> wdmLinks) {
        this.wdmLinks = wdmLinks;
        for (BasicLink link: wdmLinks
        ) {
            linkSet.add(link);
        }
    }

    public List<OTNLink> getOtnLinks() {
        return otnLinks;
    }

    public void setOtnLinks(List<OTNLink> otnLinks) {
        this.otnLinks = otnLinks;
        for (BasicLink link: otnLinks
        ) {
            linkSet.add(link);
        }
    }

    public List<SDHLink> getSdhLinks() {
        return sdhLinks;
    }

    public void setSdhLinks(List<SDHLink> sdhLinks) {
        this.sdhLinks = sdhLinks;
        for (BasicLink link: otnLinks
        ) {
            linkSet.add(link);
        }
    }

    public List<CommonNode> getCommonNodes() {
        return commonNodes;
    }

    public void setCommonNodes(List<CommonNode> commonNodes) {
        this.commonNodes = commonNodes;
        for (CommonNode node: commonNodes
        ) {
            commonNodeSet.add(node);
        }
    }

}
