import cn.edu.bupt.ipoc.onps.dao.ProjectDAO;
import cn.edu.bupt.ipoc.onps.dao.UserDAO;
import cn.edu.bupt.ipoc.onps.model.po.ProjectPO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DaoTest {
    private ApplicationContext applicationContext;
    @Test
    public void UserTest(){
        String configLocation = "classpath:spring/applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        UserDAO userDAO = (UserDAO) applicationContext.getBean("userDAO");
        List<String> permission = userDAO.selectPermissionByUserId("e25ba760c93f11e9b2a7025041000001");
        List<String> role = userDAO.selectRoleByUserId("e25ba760c93f11e9b2a7025041000001");
        return;
    }
    @Test
    public void ProjectTest(){
        String configLocation = "classpath:spring/applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        ProjectDAO projectDAO = (ProjectDAO)applicationContext.getBean("projectDAO");
        ProjectPO projectPO = new ProjectPO();
        projectPO.setName("test");
        projectPO.setYear(2019);
        //projectPO.setText("teat");
        projectPO.setUserId("e25ba760c93f11e9b2a7025041000001");
        projectDAO.insertProject(projectPO);
        return;
    }
}
