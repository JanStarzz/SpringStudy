import bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jan
 * @Date 2020/4/9 12:42
 */
public class iocTest3 {
    private ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc2.xml");
    @Test
    public void test(){
        Person person = ioc.getBean("person02",Person.class);
        System.out.println(person);
    }

}
