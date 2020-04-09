import bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Jan
 * @Date 2020/4/7 10:28
 */
public class IocTest2 {
    private ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void test(){
        Person person = ioc.getBean("person01",Person.class);
        System.out.println(person);
    }

    @Test
    public void test02() throws SQLException {
        DataSource dataSource = ioc.getBean("dataSource",DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
