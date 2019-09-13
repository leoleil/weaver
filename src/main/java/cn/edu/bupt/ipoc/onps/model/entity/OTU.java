package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.utils.LinkStatusString;

import java.util.UUID;

public class OTU {
    private	String id;//ONU编号
    private	String status =  LinkStatusString.FREE;//波道使用状态 空闲,工作,保护,恢复
    private	String type;//ONU类型：原有，扩容，新建
    private	int	year;//该ONU规划年份
    private int gran;//复用等级
    private Traffic traffic;//承载业务
    private BasicLink carryLink;//承载的Link

    public OTU(String id){
        this.id = id;
    }


    public OTU(){
        id = UUID.randomUUID().toString().replace("-","");
    }

    /**
     * 添加承载链路
     * 一个波道承载一个SDH
     * @param link
     * @return
     */
    public boolean addCarryLink(BasicLink link){
        if(status.equals(LinkStatusString.FREE)) {
            carryLink = link;
            status = LinkStatusString.MAINTENANCE;
            return true;
        }
        return false;
    }

    /**
     * 添加承载业务的保护ONU，一个ONU承载一个业务
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
     * 添加承载业务的工作ONU，一个ONU承载一个业务
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

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public int getGran() {
        return gran;
    }

    public Traffic getTraffic() {
        return traffic;
    }

    public BasicLink getCarryLink() {
        return carryLink;
    }
}
