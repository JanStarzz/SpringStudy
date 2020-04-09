package bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author Jan
 * @Date 2020/4/2 0:09
 */
public class Person {
    private String name;
    private Integer age;
    private String sex;
    private Car car;
    private List<Book> books;
    private Map<String,Object> maps;
    private Properties properties;

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", cart=" + car +
                ", books=" + books +
                ", maps=" + maps +
                ", properties=" + properties +
                '}';
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Person(String name, Integer age, String sex, Car car, List<Book> books, Map<String, Object> maps, Properties properties) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.car = car;
        this.books = books;
        this.maps = maps;
        this.properties = properties;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public Person() {
        System.out.println("无参");
    }

    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("有参");
    }
}
