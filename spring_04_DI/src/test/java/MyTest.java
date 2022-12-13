import com.jason.pojo.Student;
import com.jason.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = context.getBean("user2", User.class);
        User user1 = context.getBean("user2", User.class);
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());// because scope is prototype
        System.out.println(user);
    }
}

