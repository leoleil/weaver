package cn.edu.bupt.ipoc.onps.service;

import cn.edu.bupt.ipoc.onps.model.entity.*;

import java.util.List;

public interface ResManagementService {
    List<BasicLink> getFiberLinks();

    void setFiberLinks(List<BasicLink> fiberLinks);

    public List<BasicLink> getWdmLinks();

    void setWdmLinks(List<BasicLink> wdmLinks);

    List<BasicLink> getOtnLinks();

    void setOtnLinks(List<BasicLink> otnLinks);

    List<BasicLink> getSdhLinks();

    void setSdhLinks(List<BasicLink> sdhLinks);

    List<CommonNode> getCommonNodes();

    void setCommonNodes(List<CommonNode> commonNodes);

    List<Traffic> getTraffices();

    void setTraffices(List<Traffic> traffices);
}
