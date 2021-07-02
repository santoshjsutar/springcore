import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springcore.User;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "config.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
