package cn.edu.bupt.ipoc.onps.model.po;

import java.util.Date;

public class ProjectPO {
    private String id;

    private String name;

    private Date time;

    private String userId;

    private String infomation;

    public ProjectPO(String id, String name, Date time, String userId, String infomation) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.userId = userId;
        this.infomation = infomation;
    }

    public ProjectPO() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getInfomation() {
        return infomation;
    }

    public void setInfomation(String infomation) {
        this.infomation = infomation == null ? null : infomation.trim();
    }
}