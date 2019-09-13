package cn.edu.bupt.ipoc.onps.service.serviceimpl;

import cn.edu.bupt.ipoc.onps.model.entity.*;
import cn.edu.bupt.ipoc.onps.service.ResManagementService;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION ,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ResManagementServiceImpl implements ResManagementService {
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
}
