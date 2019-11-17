package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.utils.LinkStatusString;

import java.util.List;
import java.util.UUID;

public class Timeslot {
    private	String id;//时隙编号
    private	String status = LinkStatusString.FREE;//时隙使用状态 空闲,工作,保护,恢复,可用
    private Traffic traffic;//承载业务链表

    public Timeslot(){
        id = UUID.randomUUID().toString().replace("-","");
    }

    public Timeslot(String id){
        this.id = id;
    }

    /**
     * 添加承载业务的保护时隙，一个时隙承载一个业务
     * @param traffic
     * @return
     */
    public boolean addTrafficWorkProtect(Traffic traffic){
        if(status.equals(LinkStatusString.FREE)) {
            this.traffic = traffic;
            status = LinkStatusString.PROTECT;
            return true;
        }
        return false;
    }

    /**
     * 添加承载业务的工作时隙，一个时隙承载一个业务
     * @param traffic
     * @return
     */
    public boolean addTrafficeWork(Traffic traffic){
        if(status.equals(LinkStatusString.FREE)) {
            this.traffic = traffic;
            status = LinkStatusString.WORK;
            return true;
        }
        return false;
    }
    public void release(){
        status = LinkStatusString.FREE;
    }
    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public Traffic getTraffic() {
        return traffic;
    }
}
