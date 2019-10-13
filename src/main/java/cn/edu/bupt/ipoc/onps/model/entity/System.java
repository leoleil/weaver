package cn.edu.bupt.ipoc.onps.model.entity;

import java.util.List;
import java.util.Set;

public class System {
    private String id;//系统的ID
    private String nane;//系统名称
    private List<BasicLink> links;//在同一个系统中的链路
    private Set<CommonNode> nodes;//在系统中的节点

}
