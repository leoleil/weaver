package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.utils.LinkStatusString;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Fiber {
    private String id;
    private BasicLink carryLink;
    private String status = LinkStatusString.FREE;

    public Fiber(){
        id = UUID.randomUUID().toString().replace("-","");
    }

    public Fiber(String id){
        this.id = id;
    }

    public boolean addCarryLink(BasicLink link){
        if(status.equals(LinkStatusString.FREE)) {
            carryLink = link;
            status = LinkStatusString.MAINTENANCE;
            return true;
        }

        return false;
    }

    public BasicLink getCarryLink() {
        return carryLink;
    }



    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}
