package cn.edu.bupt.ipoc.onps.service.serviceimpl;

import cn.edu.bupt.ipoc.onps.dao.ProjectDAO;
import cn.edu.bupt.ipoc.onps.model.po.ProjectPO;
import cn.edu.bupt.ipoc.onps.model.po.UserPO;
import cn.edu.bupt.ipoc.onps.service.ProjectManageService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class ProjectManageServiceImpl implements ProjectManageService {
    @Resource
    private ProjectDAO projectDAO;

    private ProjectPO projectPO;

    @Override
    public ProjectPO createProject(String name, Integer year, String information, String userId) {
        ProjectPO projectPO = new ProjectPO(UUID.randomUUID().toString().replace("-",""),name,year,information,userId, new Date());
        projectDAO.insertProject(projectPO);
        this.projectPO = projectPO;
        return projectPO;
    }

    @Override
    public List<ProjectPO> getProjectListByUserId(String userId) {
        return projectDAO.selectProjectListByUserId(userId);
    }

    @Override
    public int deleteProjectById(String id) {
        if(projectPO != null && projectPO.getProjectId().equals(id))
            projectPO = null;
        return projectDAO.deleteProjectById(id);
    }

    @Override
    public ProjectPO openProjectById(String id) {
        ProjectPO projectPO = projectDAO.selectProjectById(id);
        this.projectPO = projectPO;
        return projectPO;
    }

    @Override
    public int updateProjecById(String projectId, String name, Integer year, String information) {
        if(projectPO != null && projectId.equals(projectPO.getProjectId())){
            projectPO.setName(name);
            projectPO.setInformation(information);
            projectPO.setYear(year);
            projectDAO.updateProject(projectPO);
        }
        ProjectPO project = new ProjectPO(projectId,name,year,information,"11",new Date());
        return projectDAO.updateProject(project);
    }
}
