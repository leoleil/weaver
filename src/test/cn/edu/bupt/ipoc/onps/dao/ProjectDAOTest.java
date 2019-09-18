package cn.edu.bupt.ipoc.onps.dao;

import cn.edu.bupt.ipoc.onps.model.po.ProjectPO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProjectDAOTest {
    private ApplicationContext applicationContext;
    @Test
    public void ProjectTest(){
        String configLocation = "classpath:spring/applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        ProjectDAO projectDAO = (ProjectDAO)applicationContext.getBean("projectDAO");
//        ProjectPO projectPO = new ProjectPO();
//        projectPO.setName("test");
//        projectPO.setYear(2019);
//        //projectPO.setText("teat");
//        projectPO.setUserId("e25ba760c93f11e9b2a7025041000001");
//        projectDAO.insertProject(projectPO);
//        ProjectPO p = projectDAO.selectProjectById(projectPO.getProjectId());
        List<ProjectPO> projectPOList = projectDAO.selectProjectListByUserId("e25ba760c93f11e9b2a7025041000001");
        projectDAO.deleteProjectById(projectPOList.get(0).getProjectId());
        projectPOList = projectDAO.selectProjectListByUserId("e25ba760c93f11e9b2a7025041000001");
        return;
    }

}