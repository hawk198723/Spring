import com.self.dao.UserDaoMysqlImpl;
import com.self.dao.UserDaoOracleImpl;
import com.self.dao.UserDaoSqlserverImpl;
import com.self.service.UserService;
import com.self.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl)userService).setUserDao(new UserDaoSqlserverImpl());
        userService.getUser();
    }
}
