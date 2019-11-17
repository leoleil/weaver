package cn.edu.bupt.ipoc.onps.model.entity;

import cn.edu.bupt.ipoc.onps.utils.LinkStatusString;
import cn.edu.bupt.ipoc.onps.utils.TypeString;

import java.util.List;
import java.util.UUID;

public class Wavelength {
    private	String id;//波道编号
    private	String status =  LinkStatusString.FREE;//波道使用状态 空闲,工作,保护,恢复
    private	String type = TypeString.OLD;//波道类型：原有，扩容，新建
    private	int	year;//该波道规划年份
    private int gran;//复用等级
    private Traffic traffic;//承载业务
    private String carryLink;//承载的Link

    public Wavelength(String id){
        this.id = id;
    }
    public Wavelength(){
        this.id = UUID.randomUUID().toString().replace("-","");
    }
    public Wavelength andYear(int year){
        this.year = year;
        return this;
    }
    public Wavelength andStatus(String status){
        this.status = status;
        return this;
    }
    public Wavelength andGran(int gran){
        this.gran = gran;
        return this;
    }

    /**
     * 添加承载链路
     * 一个波道承载一个ONT 或 SDH
     * @param link
     * @return
     */
    public boolean addCarryLink(BasicLink link){
        if(status.equals(LinkStatusString.FREE)) {
            carryLink = link.getId();
            status = LinkStatusString.MAINTENANCE;
            return true;
        }
        return false;
    }

    /**
     * 添加承载业务的保护波道，一个波道承载一个业务
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
     * 添加承载业务的工作波道，一个波道承载一个业务
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

    public String getCarryLink() {
        return carryLink;
    }

}
