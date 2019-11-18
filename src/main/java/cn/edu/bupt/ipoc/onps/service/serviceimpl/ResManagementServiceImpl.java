package cn.edu.bupt.ipoc.onps.service.serviceimpl;

import cn.edu.bupt.ipoc.onps.dao.*;
import cn.edu.bupt.ipoc.onps.model.entity.*;
import cn.edu.bupt.ipoc.onps.model.po.*;
import cn.edu.bupt.ipoc.onps.service.ResManagementService;
import cn.edu.bupt.ipoc.onps.utils.LayerString;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import java.util.*;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION ,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ResManagementServiceImpl implements ResManagementService {
    @Resource
    private NodePOMapper nodePOMapper;
    @Resource
    private PortPOMapper portPOMapper;
    @Resource
    private LinkPOMapper linkPOMapper;
    @Resource
    private FiberLinkPOMapper fiberLinkPOMapper;
    @Resource
    private FiberPOMapper fiberPOMapper;
    @Resource
    private LayerRouteDAO layerRouteDAO;
    @Resource
    private WDMLinkPOMapper wdmLinkPOMapper;
    @Resource
    private OTNLinkPOMapper otnLinkPOMapper;
    @Resource
    private SDHLinkPOMapper sdhLinkPOMapper;
    @Resource
    private WavelengthPOMapper wavelengthPOMapper;
    @Resource
    private OTUPOMapper otupoMapper;
    @Resource
    private TimeslotPOMapper timeslotPOMapper;

    private List<BasicLink> fiberLinks = new ArrayList<>();
    private List<BasicLink> wdmLinks = new ArrayList<>();
    private List<BasicLink> otnLinks = new ArrayList<>();
    private List<BasicLink> sdhLinks = new ArrayList<>();
    private List<CommonNode> commonNodes = new ArrayList<>();
    private List<Traffic> Traffices = new ArrayList<>();

    public List<BasicLink> getFiberLinks() {
        return fiberLinks;
    }

    public void setFiberLinks(List<BasicLink> fiberLinks) {
        this.fiberLinks = fiberLinks;
    }

    public List<BasicLink> getWdmLinks() {
        return wdmLinks;
    }

    public void setWdmLinks(List<BasicLink> wdmLinks) {
        this.wdmLinks = wdmLinks;
    }

    public List<BasicLink> getOtnLinks() {
        return otnLinks;
    }

    public void setOtnLinks(List<BasicLink> otnLinks) {
        this.otnLinks = otnLinks;
    }

    public List<BasicLink> getSdhLinks() {
        return sdhLinks;
    }

    public void setSdhLinks(List<BasicLink> sdhLinks) {
        this.sdhLinks = sdhLinks;
    }

    public List<CommonNode> getCommonNodes() {
        return commonNodes;
    }

    public void setCommonNodes(List<CommonNode> commonNodes) {
        this.commonNodes = commonNodes;
    }

    public List<Traffic> getTraffices() {
        return Traffices;
    }

    public void setTraffices(List<Traffic> traffices) {
        Traffices = traffices;
    }

    @Override
    public int openResByProjecId(String projectId,String userId) {
        //打开节点
        NodePOExample nodePOExample = new NodePOExample();
        nodePOExample.createCriteria().andProjectIdEqualTo(projectId);
        List<NodePO> nodePOList = nodePOMapper.selectByExample(nodePOExample);
        List<CommonNode> commonNodeList = new ArrayList<>();
        for(NodePO nodePO:nodePOList){
            CommonNode commonNode = new CommonNode.Builder(nodePO.getNodeId(),nodePO.getName(),nodePO.getLongitude(),nodePO.getLatitude())
                    .level(nodePO.getLevel())
                    .status(nodePO.getStatus())
                    .type(nodePO.getNodeType())
                    .year(nodePO.getYear())
                    .build();
            commonNodeList.add(commonNode);
        }
        this.commonNodes = commonNodeList;
        //打开Fiberlink
        List<BasicLink> fiberLinkList = new ArrayList<>();
        LinkPOExample linkPOExample = new LinkPOExample();
        linkPOExample.createCriteria().andProjectIdEqualTo(projectId).andLayerEqualTo(LayerString.FIBER);
        List<LinkPO> linkPOListOfFiber = linkPOMapper.selectByExample(linkPOExample);
        List<String> fiberLinkId = new ArrayList<>();

        return 0;
    }

    @Override
    public int saveResByProjectId(String projectId,String userId) {
        //保存节点
        for(CommonNode node:commonNodes){
            nodePOMapper.deleteByPrimaryKey(node.getId());//删除节点
            //新建节点
            NodePO nodePO = new NodePO(node.getId(),node.getName(),node.getLongitude(),node.getLatitude(),node.getYear(),node.getType(),node.getStatus(),null,null,projectId,null,null,null,null,null);
            nodePOMapper.insertSelective(nodePO);
            //保存端口
            List<Port> wdmPort = node.takeWDMPort();
            for(Port port:wdmPort){
                PortPO portPO = new PortPO(port.getId(),0.0, port.getLayer(),port.getType(),port.getRate(),port.getStatue(),node.getId(),port.getFree(),0);
                portPOMapper.insertSelective(portPO);
            }
            //保存端口
            List<Port> otnPort = node.takeOTNPort();
            for(Port port:otnPort){
                PortPO portPO = new PortPO(port.getId(),0.0, port.getLayer(),port.getType(),port.getRate(),port.getStatue(),node.getId(),port.getFree(),0);
                portPOMapper.insertSelective(portPO);
            }
            List<Port> sdhPort = node.takeSDHPort();
            for(Port port:sdhPort){
                PortPO portPO = new PortPO(port.getId(),0.0, port.getLayer(),port.getType(),port.getRate(),port.getStatue(),node.getId(),port.getFree(),0);
                portPOMapper.insertSelective(portPO);
            }
        }
        //保存链路
        //保存fiber链路
        int sequence = 0;
        for(BasicLink link: fiberLinks){
            if(link instanceof  FiberLink){
                FiberLink fiberLink = (FiberLink) link;
                //String fiberLinkId = UUID.randomUUID().toString().replace("-","");
                LinkPO linkPO = new LinkPO(link.getId(),link.getName(),link.getLayer(),link.getId(),link.getFromNode().getId(),
                        link.getToNode().getId(),link.getLength(),link.getRate(),link.getYear(),link.getCaption(),link.getCarried(),
                        link.getSize(),link.getUtilization(),link.getChildNetID(),link.getStatus(),"no",link.getError(),link.getDomain(),
                        link.getWeight(),link.getType(),link.getFree(),null,null,projectId,null,0);
                FiberLinkPO fiberLinkPO = new FiberLinkPO(fiberLink.getId(),sequence++,fiberLink.getFualtTime(),fiberLink.getCompletedYear(),fiberLink.getPerfunctoryWay(),null,null);
                linkPOMapper.insertSelective(linkPO);
                fiberLinkPOMapper.insertSelective(fiberLinkPO);
                //保存fiber
                List<Fiber> fibers = fiberLink.getFibers();
                for (Fiber fiber:fibers){
                    FiberPO fiberPO = null;
                    /*if(fiber.getCarryLink() != null && fiber.getCarryLink().getLayer().equals(LayerString.WDM)){
                        fiberPO = new FiberPO(fiber.getId(),sequence++,fiber.getStatus(),link.getId(),fiber.getCarryLink().getId(),null,null);
                    }
                    else if(fiber.getCarryLink() != null && fiber.getCarryLink().getLayer().equals(LayerString.OTN)){
                        fiberPO = new FiberPO(fiber.getId(),sequence++,fiber.getStatus(),link.getId(),null,fiber.getCarryLink().getId(),null);
                    }
                    else if(fiber.getCarryLink() != null && fiber.getCarryLink().getLayer().equals(LayerString.SDH)){
                        fiberPO = new FiberPO(fiber.getId(),sequence++,fiber.getStatus(),link.getId(),null,null,fiber.getCarryLink().getId());
                    }
                    else{
                        fiberPO = new FiberPO(fiber.getId(),sequence++,fiber.getStatus(),link.getId(),null,null,null);
                    }*/
                    fiberPOMapper.insertSelective(fiberPO);
                }
            }
        }
        //保存WDM链路
        /*for(BasicLink link: wdmLinks){
            if(link instanceof WDMLink){
                WDMLink wdmLink = (WDMLink)link;
                LinkPO linkPO = new LinkPO(link.getId(),link.getName(),link.getLayer(),link.getId(),link.getFromNode().getId(),
                        link.getToNode().getId(),link.getLength(),link.getRate(),link.getYear(),link.getCaption(),link.getCarried(),
                        link.getSize(),link.getUtilization(),link.getChildNetID(),link.getStatus(),"no",link.getError(),link.getDomain(),
                        link.getWeight(),link.getType(),link.getFree(),wdmLink.takeFromPortId(),wdmLink.takeToPortId(),projectId,null,0);
                WDMLinkPO wdmLinkPO = new WDMLinkPO(wdmLink.getId(),sequence++,wdmLink.getFacilityType());
                linkPOMapper.insertSelective(linkPO);
                wdmLinkPOMapper.insertSelective(wdmLinkPO);
                //保存波道
                for(Wavelength wavelength:wdmLink.getWavelengthList()){
                    WavelengthPO wavelengthPO = new WavelengthPO(wavelength.getId(),sequence++,wavelength.getStatus(),wavelength.getType(),wavelength.getYear(),0,0,wavelength.getGran(),wdmLink.getId(),link.getId(),null,null);
                    if(wavelength.getCarryLink() != null)
                        wavelengthPO.setCarryLinkId(wavelength.getCarryLink().getId());
                    wavelengthPOMapper.insertSelective(wavelengthPO);
                }
                //层间路由
                List<BasicLink> layerRouteLinkList = wdmLink.takeLayerRouteLinkList();
                List<LayerRoutePO> layerRoutePOList = new ArrayList<>();
                int count = 0;
                for(BasicLink layerRouteLink:layerRouteLinkList){
                    String cellId = "";
                    if(layerRouteLink instanceof FiberLink)
                    {
                        FiberLink fiberLink = (FiberLink) layerRouteLink;
                        for(Fiber fiber:fiberLink.getFibers()){
                            if(fiber.getCarryLink() != null && fiber.getCarryLink().equals(link)){
                                cellId = fiber.getId();
                                break;
                            }
                        }

                    }
                    LayerRoutePO layerRoutePO = new LayerRoutePO(link.getId(),layerRouteLink.getId(),count,LayerString.FIBER,cellId);
                    layerRoutePOList.add(layerRoutePO);
                }
                if(layerRoutePOList.size() > 0)
                    layerRouteDAO.insertLayerRoute(layerRoutePOList);
            }
        }*/
        //保存OTN
        /*for(BasicLink link: otnLinks){
            if(link instanceof OTNLink){
                OTNLink otnLink = (OTNLink) link;
                LinkPO linkPO = new LinkPO(link.getId(),link.getName(),link.getLayer(),link.getId(),link.getFromNode().getId(),
                        link.getToNode().getId(),link.getLength(),link.getRate(),link.getYear(),link.getCaption(),link.getCarried(),
                        link.getSize(),link.getUtilization(),link.getChildNetID(),link.getStatus(),"no",link.getError(),link.getDomain(),
                        link.getWeight(),link.getType(),link.getFree(),otnLink.takeFromPortId(),otnLink.takeToPortId(),projectId,null,0);
                OTNLinkPO otnLinkPO = new OTNLinkPO(otnLink.getId(),sequence++,otnLink.getCarriedType());
                linkPOMapper.insertSelective(linkPO);
                otnLinkPOMapper.insertSelective(otnLinkPO);
                //OTU
                for(OTU otu: otnLink.getOTUList()){
                    OTUPO otupo = new OTUPO(otu.getId(),otu.getStatus(),otnLink.getId(),link.getId(),null,null,otu.getType(),otu.getGran());
                    if(otu.getCarryLink() != null)
                        otupo.setCarrayLinkId(otu.getCarryLink().getId());
                    otupoMapper.insertSelective(otupo);
                }
                //层间路由
                List<BasicLink> layerRouteLinkList = otnLink.takeLayerRouteLinkList();
                List<LayerRoutePO> layerRoutePOList = new ArrayList<>();
                int count = 0;
                if(otnLink.getCarriedType().equals(LayerString.FIBER)){
                    for(BasicLink layerRouteLink:layerRouteLinkList){
                        String cellId = "";
                        if(layerRouteLink instanceof FiberLink)
                        {
                            FiberLink fiberLink = (FiberLink) layerRouteLink;
                            for(Fiber fiber:fiberLink.getFibers()){
                                if(fiber.getCarryLink() != null && fiber.getCarryLink().equals(link)){
                                    cellId = fiber.getId();
                                    break;
                                }
                            }

                        }
                        LayerRoutePO layerRoutePO = new LayerRoutePO(link.getId(),layerRouteLink.getId(),count,LayerString.FIBER,cellId);
                        layerRoutePOList.add(layerRoutePO);
                    }
                    if(layerRoutePOList.size() > 0)
                        layerRouteDAO.insertLayerRoute(layerRoutePOList);
                }else if(otnLink.getCarriedType().equals(LayerString.WDM)){
                    for(BasicLink layerRouteLink:layerRouteLinkList){
                        String cellId = "";
                        if(layerRouteLink instanceof WDMLink)
                        {
                            WDMLink wdmLink = (WDMLink) layerRouteLink;
                            for(Wavelength wavelength:wdmLink.getWavelengthList()){
                                if(wavelength.getCarryLink() != null && wavelength.getCarryLink().equals(link)){
                                    cellId = wavelength.getId();
                                    break;
                                }
                            }

                        }
                        LayerRoutePO layerRoutePO = new LayerRoutePO(link.getId(),layerRouteLink.getId(),count,LayerString.WDM,cellId);
                        layerRoutePOList.add(layerRoutePO);
                    }
                    if(layerRoutePOList.size() > 0)
                        layerRouteDAO.insertLayerRoute(layerRoutePOList);
                }
                else{

                }
            }
        }*/
        //保存SDH
        for(BasicLink link: sdhLinks){
            if(link instanceof SDHLink){
                SDHLink sdhLink = (SDHLink) link;
                LinkPO linkPO = new LinkPO(link.getId(),link.getName(),link.getLayer(),link.getId(),link.getFromNode().getId(),
                        link.getToNode().getId(),link.getLength(),link.getRate(),link.getYear(),link.getCaption(),link.getCarried(),
                        link.getSize(),link.getUtilization(),link.getChildNetID(),link.getStatus(),"no",link.getError(),link.getDomain(),
                        link.getWeight(),link.getType(),link.getFree(),sdhLink.takeFromPortId(),sdhLink.takeToPortId(),projectId,null,0);
                SDHLinkPO sdhLinkPO = new SDHLinkPO(sdhLink.getId(),sequence++,null,sdhLink.getCarriedType());
                linkPOMapper.insertSelective(linkPO);
                sdhLinkPOMapper.insertSelective(sdhLinkPO);
                //保存时隙
                for(Timeslot timeslot: sdhLink.getTimeslotList()){
                    TimeslotPO timeslotPO = new TimeslotPO(timeslot.getId(),timeslot.getStatus(),0,link.getId(),0,sdhLink.getId(),null);

                    timeslotPOMapper.insertSelective(timeslotPO);
                }
                //层间路由
                List<BasicLink> layerRouteLinkList = sdhLink.takeLayerRouteLinkList();
                List<LayerRoutePO> layerRoutePOList = new ArrayList<>();
                int count = 0;
                if(sdhLink.getCarriedType().equals(LayerString.FIBER)){
                    for(BasicLink layerRouteLink:layerRouteLinkList){
                        String cellId = "";
                        if(layerRouteLink instanceof FiberLink)
                        {
                            FiberLink fiberLink = (FiberLink) layerRouteLink;
                            for(Fiber fiber:fiberLink.getFibers()){
                                if(fiber.getCarryLink() != null && fiber.getCarryLink().equals(link)){
                                    cellId = fiber.getId();
                                    break;
                                }
                            }

                        }
                        LayerRoutePO layerRoutePO = new LayerRoutePO(link.getId(),layerRouteLink.getId(),count,LayerString.FIBER,cellId);
                        layerRoutePOList.add(layerRoutePO);
                    }
                    if(layerRoutePOList.size() > 0)
                        layerRouteDAO.insertLayerRoute(layerRoutePOList);
                }else if(sdhLink.getCarriedType().equals(LayerString.WDM)){
                    for(BasicLink layerRouteLink:layerRouteLinkList){
                        String cellId = "";
                        if(layerRouteLink instanceof WDMLink)
                        {
                            WDMLink wdmLink = (WDMLink) layerRouteLink;
                            for(Wavelength wavelength:wdmLink.getWavelengthList()){
                                if(wavelength.getCarryLink() != null && wavelength.getCarryLink().equals(link)){
                                    cellId = wavelength.getId();
                                    break;
                                }
                            }

                        }
                        LayerRoutePO layerRoutePO = new LayerRoutePO(link.getId(),layerRouteLink.getId(),count,LayerString.WDM,cellId);
                        layerRoutePOList.add(layerRoutePO);
                    }
                    if(layerRoutePOList.size() > 0)
                        layerRouteDAO.insertLayerRoute(layerRoutePOList);
                }else if(sdhLink.getCarriedType().equals(LayerString.OTN)){
                    for(BasicLink layerRouteLink:layerRouteLinkList){
                        String cellId = "";
                        if(layerRouteLink instanceof OTNLink)
                        {
                            OTNLink otnLink = (OTNLink) layerRouteLink;
                            for(OTU otu:otnLink.getOTUList()){
                                if(otu.getCarryLink()!=null && otu.getCarryLink().equals(link)){
                                    cellId = otu.getId();
                                    break;
                                }
                            }

                        }
                        LayerRoutePO layerRoutePO = new LayerRoutePO(link.getId(),layerRouteLink.getId(),count,LayerString.OTN,cellId);
                        layerRoutePOList.add(layerRoutePO);
                    }
                    if(layerRoutePOList.size() > 0)
                        layerRouteDAO.insertLayerRoute(layerRoutePOList);
                }
                else{

                }
            }
        }
        return 0;
    }
}
