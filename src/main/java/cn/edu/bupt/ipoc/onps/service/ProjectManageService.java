package cn.edu.bupt.ipoc.onps.service;

import cn.edu.bupt.ipoc.onps.model.po.ProjectPO;

import java.util.Date;
import java.util.List;

public interface ProjectManageService {
    ProjectPO createProject(String name,Integer year, String information, String userId);
    List<ProjectPO> getProjectListByUserId(String userId);
    int deleteProjectById(String id);
    ProjectPO openProjectById(String id);
    int updateProjecById(String projectId,String name,Integer year, String information);
}
