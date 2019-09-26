package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.ProjectPO;

import java.util.List;

public interface ProjectDAO {
    int insertProject(ProjectPO projectPO);
    ProjectPO selectProjectById(String id);
    List<ProjectPO> selectProjectListByUserId(String id);
    int deleteProjectById(String id);
    int updateProject(ProjectPO projectPO);
}
