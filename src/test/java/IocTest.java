import bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jan
 * @Date 2020/4/2 0:13
 */
public class IocTest {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

    @Test
    public void test1(){
        Person person = (Person) ioc.getBean("person1");
        System.out.println(person);
    }

    /**
     * 按照类类型查找组件
     */
    @Test
    public void test2(){
        //如果存在多个同类型的会报错
        Person person = ioc.getBean(Person.class);
        System.out.println(person);
    }

    /**
     * 测试有参构造器
     */
    @Test
    public void test3(){
        Person person = ioc.getBean("person2",Person.class);
        System.out.println(person);
    }
    /**
     * 用p名词空间为属性赋值
     */
    @Test
    public void test4(){
        Person person = ioc.getBean("person3",Person.class);
        System.out.println(person);
    }
}
