package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.model.Limit;

import java.util.*;

public class System implements Limit {
    private String id;//系统的ID
    private String name;//系统名称
    private List<BasicLink> links = new ArrayList<>();//在同一个系统中的链路,有序排列
    private Set<BasicLink> linkSet = new HashSet<>();
    private Set<CommonNode> nodes = new HashSet<>();//在系统中的节点

    public System(String id, String name){
        this.id = id;
        this.name = name;
    }

    public System(String name){
        id = UUID.randomUUID().toString().replace("-","");
        this.name = name;
    }

    public System(){
        id = UUID.randomUUID().toString().replace("-","");
    }

    public System add(BasicLink link){
        links.add(link);
        linkSet.add(link);
        nodes.add(link.getFromNode());
        nodes.add(link.getToNode());
        return this;
    }

    public System add(List<BasicLink> links){
        this.links.addAll(links);
        for(BasicLink link: links){
            linkSet.add(link);
            nodes.add(link.getFromNode());
            nodes.add(link.getToNode());
        }
        return this;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<BasicLink> getLinks() {
        return links;
    }

    public boolean inSystem(BasicLink link){
        return linkSet.contains(link);
    }
    public boolean inSystem(CommonNode node){
        return nodes.contains(node);
    }
    public boolean inTheSomeSystem(CommonNode node1, CommonNode node2){
        return (nodes.contains(node1) && nodes.contains(node2));
    }
}
