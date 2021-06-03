package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public static List<Car> getSomeCar(int count) {
        List<Car> lst = Car.getList();
        if (count > 5) {
            count = 5;
        }
        List<Car> newLst = lst.subList(0,count);

        return newLst;
    }
}
