package cn.edu.bupt.ipoc.onps.model.po;

import java.util.Date;
import java.util.UUID;

public class ProjectPO {
    private String projectId;
    private String name;
    private Integer year;
    private String information;
    private String userId;
    private Date time;

    public ProjectPO(String projectId, String name, Integer year, String information, String userId, Date time) {
        this.projectId = projectId;
        this.name = name;
        this.year = year;
        this.information = information;
        this.userId = userId;
        this.time = time;
    }

    public ProjectPO(){
        projectId = UUID.randomUUID().toString().replace("-","");
        time = new Date();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
