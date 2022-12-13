import com.jason.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        Person person = context.getBean("person",Person.class);

        person.getDog().bark();

        person.getCat().shout();
    }
}
