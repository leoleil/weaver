import cn.edu.bupt.ipoc.onps.dao.UserDAO;
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
}
