import com.jason.config.JasonConfig;
import com.jason.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
       ApplicationContext context = new AnnotationConfigApplicationContext(JasonConfig.class);
        User user = context.getBean("someJasonUser", User.class);
        System.out.println(user.getName());
    }
}
