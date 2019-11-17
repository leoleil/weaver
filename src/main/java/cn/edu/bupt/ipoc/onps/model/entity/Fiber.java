package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.utils.LinkStatusString;
import cn.edu.bupt.ipoc.onps.utils.TypeString;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Fiber {
    private String id;
    private String carryLink;//承载链路的Id
    private String status = LinkStatusString.FREE;
    private String type = TypeString.OLD;
    private int year;

    public Fiber(){
        id = UUID.randomUUID().toString().replace("-","");
    }

    public Fiber(String id){
        this.id = id;
    }

    public Fiber andType(String type){
        this.type = type;
        return this;
    }

    public Fiber andYear(int year){
        this.year = year;
        return this;
    }

    public boolean addCarryLink(BasicLink link){
        if(status.equals(LinkStatusString.FREE)) {
            carryLink = link.getId();
            status = LinkStatusString.MAINTENANCE;
            return true;
        }
        return false;
    }

    public void release(){
        status = LinkStatusString.FREE;
    }

    public String getCarryLink() {
        return carryLink;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }
}
