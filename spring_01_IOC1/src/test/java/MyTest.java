//import com.self.dao.UserDaoMysqlImpl;
//import com.self.dao.UserDaoOracleImpl;
//import com.self.dao.UserDaoSqlserverImpl;
//import com.self.service.UserService;
//import com.self.service.UserServiceImpl;

import com.self.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl)userService).setUserDao(new UserDaoSqlserverImpl());
//        userService.getUser();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
