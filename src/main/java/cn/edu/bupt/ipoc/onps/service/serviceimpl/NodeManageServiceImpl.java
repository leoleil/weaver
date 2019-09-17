package cn.edu.bupt.ipoc.onps.service.serviceimpl;

import cn.edu.bupt.ipoc.onps.model.Node;
import cn.edu.bupt.ipoc.onps.model.entity.BasicLink;
import cn.edu.bupt.ipoc.onps.model.entity.CommonNode;
import cn.edu.bupt.ipoc.onps.service.LinkManageService;
import cn.edu.bupt.ipoc.onps.service.NodeManageService;
import cn.edu.bupt.ipoc.onps.service.ResManagementService;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION ,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class NodeManageServiceImpl implements NodeManageService {
    @Resource
    private ResManagementService resManagementService;
    @Resource
    private LinkManageService linkManageService;

    @Override
    public Node creatNode(double longitude, double latitude, String name, int year, String type) {
        CommonNode node = new CommonNode.Builder(name,longitude,latitude)
                .year(year)
                .type(type)
                .build();
        resManagementService.getCommonNodes().add(node);
        return node;
    }

    @Override
    public boolean deleteNode(String id) throws Exception {
        //需要遍历改节点有关的链路的情况
        //先删除链路，后删除节点
        List<BasicLink> sdhLink = resManagementService.getSdhLinks();
        List<BasicLink> wdmLink = resManagementService.getWdmLinks();
        List<BasicLink> otnLink = resManagementService.getOtnLinks();
        List<BasicLink> fiberLink = resManagementService.getFiberLinks();
        List<CommonNode> commonNode = resManagementService.getCommonNodes();
        //使用迭代器遍历
        Iterator<BasicLink> iterator = sdhLink.iterator();
        while(iterator.hasNext()){
            BasicLink link = iterator.next();
            if(link.getFromNode().getId().equals(id)){
                //iterator.remove();
                linkManageService.deleteSDHLink(link.getId());
                continue;
            }
            if(link.getToNode().getId().equals(id)){
                //iterator.remove();
                linkManageService.deleteSDHLink(link.getId());
                continue;
            }
        }
        //使用迭代器遍历
        iterator = otnLink.iterator();
        while(iterator.hasNext()){
            BasicLink link = iterator.next();
            if(link.getFromNode().getId().equals(id)){
                //iterator.remove();
                linkManageService.deleteOTNLink(link.getId());
                continue;
            }
            if(link.getToNode().getId().equals(id)){
                //iterator.remove();
                linkManageService.deleteOTNLink(link.getId());
                continue;
            }
        }
        //使用迭代器遍历
        iterator = wdmLink.iterator();
        while(iterator.hasNext()){
            BasicLink link = iterator.next();
            if(link.getFromNode().getId().equals(id)){
                //iterator.remove();
                linkManageService.deleteWDMLink(link.getId());
                continue;
            }
            if(link.getToNode().getId().equals(id)){
                //iterator.remove();
                linkManageService.deleteWDMLink(link.getId());
                continue;
            }
        }
        //使用迭代器遍历
        iterator = fiberLink.iterator();
        while(iterator.hasNext()){
            BasicLink link = iterator.next();
            if(link.getFromNode().getId().equals(id)){
                //iterator.remove();
                linkManageService.deleteFiberLink(link.getId());
                continue;
            }
            if(link.getToNode().getId().equals(id)){
                //iterator.remove();
                linkManageService.deleteFiberLink(link.getId());
                continue;
            }
        }
        Iterator<CommonNode> commonNodeIterator = commonNode.iterator();
        while(commonNodeIterator.hasNext()){
            CommonNode node = commonNodeIterator.next();
            if(node.getId().equals(id)){
                commonNodeIterator.remove();
                return true;
            }

        }
        return false;
    }

    @Override
    public Node updateNode(String id, double longitude, double latitude, String name, int year, String type) throws Exception{
        List<CommonNode> commonNode = resManagementService.getCommonNodes();
        Iterator<CommonNode> commonNodeIterator = commonNode.iterator();
        while(commonNodeIterator.hasNext()){
            CommonNode node = commonNodeIterator.next();
            if(node.getId().equals(id)){
                node.setLatitude(latitude);
                node.setLongitude(longitude);
                node.setName(name);
                node.setYear(year);
                node.setType(type);
                return node;
            }

        }
        throw new NullPointerException("修改节点不存在");
    }
}
