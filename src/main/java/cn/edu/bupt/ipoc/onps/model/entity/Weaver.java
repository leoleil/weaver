package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.utils.LayerString;
import cn.edu.bupt.ipoc.onps.utils.LinkStatusString;
import cn.edu.bupt.ipoc.onps.utils.TypeString;

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
    // 删除节点 只能删除新建节点 如果新建的节点与新建的链路存在关系，则链路也会删除
    // 通过节点id进行删 失败返回 false 失败的情况可能是节点不存在 或者 要删除节点不是新建的
    public boolean deleteNode(String id){
        // search node
        CommonNode searchNode = searchNodeById(id);
        boolean find = false;
        if(searchNode != null)find = true;
        if(find){
            // search will be delete link id
            List<String> linkIdList = new ArrayList<>();
            Iterator<SDHLink> sdhLinkIterator = sdhLinks.iterator();
            while (sdhLinkIterator.hasNext()){
                SDHLink link = sdhLinkIterator.next();
                if(link.getFromNode().equals(searchNode) || link.getToNode().equals(searchNode)){
                    linkIdList.add(link.getId());
                }
            }
            Iterator<OTNLink> otnLinkIterator = otnLinks.iterator();
            while (otnLinkIterator.hasNext()){
                OTNLink link = otnLinkIterator.next();
                if(link.getFromNode().equals(searchNode) || link.getToNode().equals(searchNode)){
                    linkIdList.add(link.getId());
                }
            }
            Iterator<WDMLink> wdmLinkIterator = wdmLinks.iterator();
            while (wdmLinkIterator.hasNext()){
                WDMLink link = wdmLinkIterator.next();
                if(link.getFromNode().equals(searchNode) || link.getToNode().equals(searchNode)){
                    linkIdList.add(link.getId());
                }
            }
            Iterator<FiberLink> fiberLinkIterator = fiberLinks.iterator();
            while (fiberLinkIterator.hasNext()){
                FiberLink link = fiberLinkIterator.next();
                if(link.getFromNode().equals(searchNode) || link.getToNode().equals(searchNode)){
                    linkIdList.add(link.getId());
                }
            }
            for (String linkId:linkIdList
            ) {
                if(!deleteLink(linkId))return false;
            }
        }
        Iterator<CommonNode> nodeIterator = commonNodes.iterator();
        while (nodeIterator.hasNext()){
            searchNode = nodeIterator.next();
            if(searchNode.getId().equals(id) && searchNode.getType().equals(TypeString.NEW)){
                nodeIterator.remove();
                commonNodeSet.remove(searchNode);
                return true;
            }
        }
        return false;
    }
    // 删除链路 是能删除新建链路 如果删除的链路上层有承载 则承载的链路将被删除
    // 通过链路id进行删 失败返回 false 失败的情况可能是节点不存在 或者 要删除节点不是新建的
    public boolean deleteLink(String id){
        BasicLink link = searchLinkById(id);
        if (link == null || !link.getType().equals(TypeString.NEW)) return false;
        if(link instanceof FiberLink){
            return deleteFiberLink(id);
        }else if(link instanceof WDMLink){
            return deleteWDMLink(id);
        }else if(link instanceof OTNLink){
            return deleteOTNLink(id);
        }else if(link instanceof SDHLink){
            return deleteSDHLink(id);
        }else {
            return false;
        }
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
    // 删除SDH链路
    private boolean deleteSDHLink(String id){
        Iterator<SDHLink> sdhIterator = sdhLinks.iterator();
        while (sdhIterator.hasNext()){
            SDHLink link = sdhIterator.next();
            if(link.getId().equals(id)){
                // 链类型是新建的才能删除
                if(!link.getType().equals(TypeString.NEW)){
                    return false;
                }
                sdhIterator.remove();// 从链路表中移除
                linkSet.remove(link);// 从链路集合中移除
                link.setStatus(LinkStatusString.USELESS);//标记链路为删除
                // 遍历层间路由释放资源
                for (BasicLink basicLink:link.takeLayerRouteLinkList()
                     ) {
                    // 判断链路类型
                    // 如果是FiberLink 释放 fiber
                    if(basicLink instanceof FiberLink){
                        FiberLink fiberLink = (FiberLink)basicLink;
                        // 遍历fiber
                        for (Fiber fiber:fiberLink.getFibers()
                             ) {
                            if(fiber.getCarryLink().equals(link.getId())){
                                fiber.release();//释放资源
                                break;
                            }
                        }
                    }else if(basicLink instanceof WDMLink){
                        WDMLink wdmLink = (WDMLink)basicLink;
                        // 遍历波段
                        for (Wavelength wavelength:wdmLink.getWavelengthList()
                             ) {
                            if(wavelength.getCarryLink().equals(link.getId())){
                                wavelength.release();
                                break;
                            }
                        }
                    }else if(basicLink instanceof OTNLink){
                        OTNLink otnLink = (OTNLink)basicLink;
                        // 遍历otu
                        for (OTU otu:otnLink.getOTUList()
                             ) {
                            if(otu.getCarryLink().equals(link.getId())){
                                otu.release();
                                break;
                            }
                        }
                    }else{
                        return false;
                    }
                 }
                return true;
            }
        }
        return false;
    }
    // 删除OTN链路
    private boolean deleteOTNLink(String id){
        Iterator<OTNLink> otnLinkIterator = otnLinks.iterator();
        while (otnLinkIterator.hasNext()){
            OTNLink link = otnLinkIterator.next();
            // 检查是否有上层 有上层则不能删除
            if(link.getId().equals(id)){
                for(OTU otu:link.getOTUList()){
                    if(!otu.getStatus().equals(LinkStatusString.FREE)){
                       return false;
                    }
                }
                otnLinkIterator.remove();
                linkSet.remove(link);
                link.setStatus(LinkStatusString.USELESS);//标记链路为删除
                // 释放底层资源
                for (BasicLink basicLink:link.takeLayerRouteLinkList()
                ) {
                    // 判断链路类型
                    // 如果是FiberLink 释放 fiber
                    if(basicLink instanceof FiberLink){
                        FiberLink fiberLink = (FiberLink)basicLink;
                        // 遍历fiber
                        for (Fiber fiber:fiberLink.getFibers()
                        ) {
                            if(fiber.getCarryLink().equals(link.getId())){
                                fiber.release();//释放资源
                                break;
                            }
                        }
                    }else if(basicLink instanceof WDMLink){
                        WDMLink wdmLink = (WDMLink)basicLink;
                        // 遍历波段
                        for (Wavelength wavelength:wdmLink.getWavelengthList()
                        ) {
                            if(wavelength.getCarryLink().equals(link.getId())){
                                wavelength.release();
                                break;
                            }
                        }
                    }else{
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
    // 删除WDM
    private boolean deleteWDMLink(String id){
        Iterator<WDMLink> wdmLinkIterator = wdmLinks.iterator();
        while (wdmLinkIterator.hasNext()){
            WDMLink link = (WDMLink) wdmLinkIterator.next();
            if(link.getId().equals(id)){
                for(Wavelength wavelength:link.getWavelengthList()){
                    if(!wavelength.getStatus().equals(LinkStatusString.FREE)){
                        return false;
                    }
                }
                wdmLinkIterator.remove();
                linkSet.remove(link);
                link.setStatus(LinkStatusString.USELESS);
                // 释放底层资源
                for (BasicLink basicLink:link.takeLayerRouteLinkList()
                ) {
                    // 判断链路类型
                    // 如果是FiberLink 释放 fiber
                    if(basicLink instanceof FiberLink){
                        FiberLink fiberLink = (FiberLink)basicLink;
                        // 遍历fiber
                        for (Fiber fiber:fiberLink.getFibers()
                        ) {
                            if(fiber.getCarryLink().equals(link.getId())){
                                fiber.release();//释放资源
                                break;
                            }
                        }
                    }else{
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
    // 删除FIBER
    private boolean deleteFiberLink(String id){
        Iterator<FiberLink> fiberLinkIteratior = fiberLinks.iterator();
        while (fiberLinkIteratior.hasNext()){
            FiberLink fiberLink = fiberLinkIteratior.next();
            if(fiberLink.getId().equals(id)){
                for(Fiber fiber:fiberLink.getFibers()){
                    if(!fiber.getStatus().equals(LinkStatusString.FREE)){
                        return false;
                    }
                }
                fiberLinkIteratior.remove();
                linkSet.remove(fiberLink);
                fiberLink.setStatus(LinkStatusString.USELESS);
                return true;
            }

        }
        return false;
    }
}
