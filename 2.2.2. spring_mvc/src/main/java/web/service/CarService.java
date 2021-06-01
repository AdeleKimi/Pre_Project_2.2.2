package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public static List<Car> getSomeCar(int count) {
        List<Car> lst = Car.getList();
        List<Car> newLst = new ArrayList<>();
        if (count >= 5) {
            return lst;
        }
        for (int i = 0; i < count; i++) {
            newLst.add(lst.get(i));
        }
        return newLst;
    }
}
