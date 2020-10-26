import com.kuang.config.KuangConfig;
import com.kuang.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(KuangConfig.class);
        User user = annotationConfigApplicationContext.getBean("getUser", User.class);
        System.out.println(user.getName());
    }
}
