package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private Long id;
    private String model;
    private String color;

    public Car(){}

    public Car(Long id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static List<Car> getList() {
        List<Car> list = new ArrayList<>();
        list.add(new Car(1L,"kia","black"));
        list.add(new Car(2L,"hundai","white"));
        list.add(new Car(3L,"jeep","gray"));
        list.add(new Car(4L,"suzuki","yellow"));
        list.add(new Car(5L,"mercedes","gold"));
        return list;
    }
}
