package bean;

/**
 * @author Jan
 * @Date 2020/4/2 14:23
 */
public class Car {
    private String carName;
    private String color;
    private Integer price;

    @Override
    public String toString() {
        return "Cart{" +
                "carName='" + carName + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Car() {
    }

    public Car(String carName, String color, Integer price) {
        this.carName = carName;
        this.color = color;
        this.price = price;
    }
}
