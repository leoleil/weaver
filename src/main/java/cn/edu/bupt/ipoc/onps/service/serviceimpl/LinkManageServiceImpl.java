package cn.edu.bupt.ipoc.onps.service.serviceimpl;

import cn.edu.bupt.ipoc.onps.base.algrithm.route.LayerRouteFinder;
import cn.edu.bupt.ipoc.onps.base.exception.InsufficientResourceException;
import cn.edu.bupt.ipoc.onps.model.entity.*;
import cn.edu.bupt.ipoc.onps.service.LinkManageService;
import cn.edu.bupt.ipoc.onps.service.ResManagementService;
import cn.edu.bupt.ipoc.onps.utils.LayerString;
import cn.edu.bupt.ipoc.onps.utils.LinkStatusString;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import javax.swing.plaf.basic.BasicIconFactory;
import java.util.Iterator;
import java.util.List;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION ,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class LinkManageServiceImpl implements LinkManageService {
    @Resource
    private ResManagementService resManagementService;


    /**
     * 新建链路
     *
     * @param name       链路名字
     * @param fromNodeId 起点ID
     * @param toNodeId   终点ID
     * @param length     链路长度
     * @param size       链路资源数
     * @param year       链路年份
     * @return 返回创建的链路
     * @throws Exception 如果节点不存在抛出空指针异常
     */
    @Override
    public FiberLink addFiberLink(String name, String fromNodeId, String toNodeId, double length, int size, int year) throws Exception {
        List<CommonNode> nodes = resManagementService.getCommonNodes();
        CommonNode fromNode = null;
        CommonNode toNode = null;
        for(CommonNode node:nodes){
            if(node.getId().equals(fromNodeId))
                fromNode = node;
            if(node.getId().equals(toNodeId))
                toNode = node;
        }
        if(fromNode == null)
            throw new NullPointerException("不存在起点");
        if(toNode == null)
            throw new NullPointerException("不存在终点");
        if(fromNode.equals(toNode))
            throw new NullPointerException("终点和起点重合");
        BasicLink fiberLink = new FiberLink.Builder(name,fromNode,toNode,size)
                .year(year)
                .length(length)
                .size(size)
                .build();
        resManagementService.getFiberLinks().add(fiberLink);
        return (FiberLink)fiberLink;
    }

    /**
     * 更新链路
     *
     * @param id      用于定位的ID
     * @param name    更改的名字
     * @param length  更改的长度
     * @param addSize 扩容大小
     * @param year    更改的年份
     * @return 返回创建的链路
     */
    @Override
    public FiberLink updateFiberLink(String id, String name, double length, int addSize, int year) throws Exception{
        FiberLink fiberLink = null;
        for(BasicLink link: resManagementService.getFiberLinks()){
            if(link.getId().equals(id)) {
                fiberLink = (FiberLink) link;
                break;
            }
        }
        if(fiberLink == null)
            throw new NullPointerException("更新链路不存在");
        fiberLink.setName(name);
        fiberLink.setLength(length);
        fiberLink.setYear(year);
        fiberLink.addSize(addSize);
        return fiberLink;
    }

    /**
     * 删除链路
     *
     * @param id 用于定位的ID
     * @return 成功返回true, 如果此链路本来就不存在则返回false
     */
    @Override
    public boolean deleteFiberLink(String id) throws Exception {
        Iterator<BasicLink> fiberLinkIteratior = resManagementService.getFiberLinks().iterator();
        while (fiberLinkIteratior.hasNext()){
            FiberLink fiberLink = (FiberLink) fiberLinkIteratior.next();
            if(fiberLink.getId().equals(id)){
                for(Fiber fiber:fiberLink.getFibers()){
                    if(fiber.getStatus().equals(LinkStatusString.MAINTENANCE)){
                        String layer = fiber.getCarryLink().getLayer();
                        switch (layer){
                            case LayerString.WDM:
                                deleteWDMLink(fiber.getCarryLink().getId());
                                break;
                            case LayerString.OTN:
                                deleteOTNLink(fiber.getCarryLink().getId());
                                break;
                            case LayerString.SDH:
                                deleteSDHLink(fiber.getCarryLink().getId());
                            default:
                                throw new NullPointerException("fiber承载了不确定的链路");
                        }

                    }
                }
                fiberLinkIteratior.remove();
                return true;
            }

        }
        return false;
    }

    @Override
    public WDMLink addWDMLink(String name, String fromNodeId, String toNodeId, double length, double rate, int size, int year) throws Exception {
        List<CommonNode> nodes = resManagementService.getCommonNodes();
        CommonNode fromNode = null;
        CommonNode toNode = null;
        for(CommonNode node:nodes){
            if(node.getId().equals(fromNodeId))
                fromNode = node;
            if(node.getId().equals(toNodeId))
                toNode = node;
        }
        if(fromNode == null)
            throw new NullPointerException("不存在起点");
        if(toNode == null)
            throw new NullPointerException("不存在终点");
        if(fromNode.equals(toNode))
            throw new NullPointerException("终点和起点重合");
        //层间路由
        List<BasicLink> route = LayerRouteFinder.getInstance()
                .find(resManagementService.getFiberLinks(),resManagementService.getCommonNodes(),fromNode,toNode,LayerString.FIBER,rate);
        if(route  == null || route.size() == 0)
            throw new InsufficientResourceException("fiber层资源不足，层间路由分配失败");
        BasicLink link = new WDMLink.Builder(name,fromNode,toNode)
                .year(year)
                .rate(rate)
                .size(size)
                .length(length)
                .layerRoute(route)
                .build();
        resManagementService.getWdmLinks().add(link);
        return (WDMLink) link;
    }

    @Override
    public WDMLink updateWDMLink(String id, String name, double length, int addSize, int year) throws Exception {
        WDMLink wdmLink = null;
        for(BasicLink link: resManagementService.getWdmLinks()){
            if(link.getId().equals(id)){
                wdmLink = (WDMLink) link;
                break;
            }

        }
        if(wdmLink == null)
            throw new NullPointerException("更新链路不存在");
        wdmLink.setName(name);
        wdmLink.setLength(length);
        wdmLink.addSize(addSize);
        wdmLink.getYear();
        return wdmLink;
    }

    @Override
    public boolean deleteWDMLink(String id) throws Exception{
        Iterator<BasicLink> wdmLinkIterator = resManagementService.getWdmLinks().iterator();
        while (wdmLinkIterator.hasNext()){
            WDMLink link = (WDMLink) wdmLinkIterator.next();
            if(link.getId().equals(id)){
                for(Wavelength wavelength:link.getWavelengthList()){
                    if(wavelength.getStatus().equals(LinkStatusString.MAINTENANCE)){
                        String layer = wavelength.getCarryLink().getLayer();
                        switch (layer){
                            case LayerString.OTN:
                                deleteOTNLink(wavelength.getCarryLink().getId());
                                break;
                            case LayerString.SDH:
                                deleteSDHLink(wavelength.getCarryLink().getId());
                                break;
                            default:
                                throw new NullPointerException("wdm承载了不确定的链路");
                        }
                    }
                }
                wdmLinkIterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public OTNLink addOTNLink(String name, String fromNodeId, String toNodeId, double length, double rate, int size, int year, String layer) throws Exception {
        List<CommonNode> nodes = resManagementService.getCommonNodes();
        CommonNode fromNode = null;
        CommonNode toNode = null;
        for(CommonNode node:nodes){
            if(node.getId().equals(fromNodeId))
                fromNode = node;
            if(node.getId().equals(toNodeId))
                toNode = node;
        }
        if(fromNode == null)
            throw new NullPointerException("不存在起点");
        if(toNode == null)
            throw new NullPointerException("不存在终点");
        if(fromNode.equals(toNode))
            throw new NullPointerException("终点和起点重合");
        //层间路由
        List<BasicLink> route = null;
        if(layer.equals(LayerString.FIBER)){
            route = LayerRouteFinder.getInstance()
                    .find(resManagementService.getFiberLinks(),resManagementService.getCommonNodes(),fromNode,toNode,layer,rate);
        }else if(layer.equals(LayerString.WDM)){
            route = LayerRouteFinder.getInstance()
                    .find(resManagementService.getWdmLinks(),resManagementService.getCommonNodes(),fromNode,toNode,layer,rate);
        }else{
            throw new NullPointerException("新建otn承载层次未知");
        }
        if(route == null || route.size()==0)
            throw new InsufficientResourceException("层间资源不足，层间路由分配失败");
        BasicLink link = new OTNLink.Builder(name,fromNode,toNode)
                .year(year)
                .length(length)
                .size(size)
                .rate(rate)
                .carriedType(layer)
                .layerRoute(route)
                .build();
        resManagementService.getOtnLinks().add(link);
        return (OTNLink) link;
    }

    @Override
    public OTNLink updateOTNLink(String id, String name, double length, int addSize, int year) throws Exception {
        OTNLink otnLink = null;
        for(BasicLink link:resManagementService.getOtnLinks()){
            if(link.getId().equals(id)){
                otnLink = (OTNLink) link;
                break;
            }
        }
        if(otnLink == null)
            throw new NullPointerException("更新链路不存在");
        otnLink.setName(name);
        otnLink.setLength(length);
        otnLink.setYear(year);
        otnLink.addSize(addSize);
        return otnLink;
    }

    @Override
    public boolean deleteOTNLink(String id) throws Exception{
        Iterator<BasicLink> otnLinkIterator = resManagementService.getOtnLinks().iterator();
        while (otnLinkIterator.hasNext()){
            OTNLink link = (OTNLink) otnLinkIterator.next();
            if(link.getId().equals(id)){
                for(OTU otu:link.getOTUList()){
                    if(otu.getStatus().equals(LinkStatusString.MAINTENANCE)){
                        String layer = otu.getCarryLink().getLayer();
                        switch (layer){
                            case LayerString.SDH:
                                deleteSDHLink(otu.getCarryLink().getId());
                                break;
                            default:
                                throw new NullPointerException("otn承载了不确定的链路");
                        }
                    }
                }
                otnLinkIterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public SDHLink addSDHLink(String name, String fromNodeId, String toNodeId, double length, double rate, int size, int year, String layer) throws Exception {
        List<CommonNode> nodes = resManagementService.getCommonNodes();
        CommonNode fromNode = null;
        CommonNode toNode = null;
        for(CommonNode node:nodes){
            if(node.getId().equals(fromNodeId))
                fromNode = node;
            if(node.getId().equals(toNodeId))
                toNode = node;
        }
        if(fromNode == null)
            throw new NullPointerException("不存在起点");
        if(toNode == null)
            throw new NullPointerException("不存在终点");
        if(fromNode.equals(toNode))
            throw new NullPointerException("终点和起点重合");
        //层间路由
        List<BasicLink> route = null;
        if(layer.equals(LayerString.FIBER)){
            route = LayerRouteFinder.getInstance()
                    .find(resManagementService.getFiberLinks(),resManagementService.getCommonNodes(),fromNode,toNode,layer,rate);
        }else if(layer.equals(LayerString.WDM)){
            route = LayerRouteFinder.getInstance()
                    .find(resManagementService.getWdmLinks(),resManagementService.getCommonNodes(),fromNode,toNode,layer,rate);
        }else if(layer.equals(LayerString.OTN)){
            route = LayerRouteFinder.getInstance()
                    .find(resManagementService.getOtnLinks(),resManagementService.getCommonNodes(),fromNode,toNode,layer,rate);
        }else{
            throw new NullPointerException("新建sdh承载层未知");
        }
        if(route == null || route.size()==0)
            throw new InsufficientResourceException("层间资源不足，层间路由分配失败");
        BasicLink link = new SDHLink.Builder(name,fromNode,toNode)
                .length(length)
                .size(size)
                .rate(rate)
                .layerRoute(route)
                .carriedType(layer)
                .build();
        resManagementService.getSdhLinks().add(link);
        return (SDHLink) link;
    }

    @Override
    public SDHLink updateSDHLink(String id, String name, double length, int addSize, int year) throws Exception {
        SDHLink sdhLink = null;
        for(BasicLink link: resManagementService.getSdhLinks()){
            if(link.getId().equals(id)){
                sdhLink = (SDHLink)link;
                break;
            }
        }
        if(sdhLink == null)
            throw new NullPointerException("更新链路不存在");
        sdhLink.setLength(length);
        sdhLink.setName(name);
        sdhLink.setYear(year);
        sdhLink.addSize(addSize);
        return sdhLink;
    }

    @Override
    public boolean deleteSDHLink(String id) throws Exception {
        Iterator<BasicLink> sdhIterator = resManagementService.getSdhLinks().iterator();
        while (sdhIterator.hasNext()){
            BasicLink link = sdhIterator.next();
            if(link.getId().equals(id)){
                sdhIterator.remove();
                return true;
            }
        }
        return false;
    }
}
