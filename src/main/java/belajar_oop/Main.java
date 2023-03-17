package belajar_oop;

import belajar_oop.model.Car;
import belajar_oop.model.Diesel;
import belajar_oop.model.Listrik;

public class Main {
    public static void main(String[] args) {

        // listrik
        Listrik listrik = new Listrik();
        Car car = new Car();
        car.setName("honda");
        car.setBrand("brio");
        car.setEngine(listrik);
        System.out.print(car.getName() + " " + car.getBrand() + " mechine engine is ");
        car.startEngine();

        // diesel
        Diesel diesel = new Diesel();
        Car car1 = new Car();
        car1.setName("truk");
        car1.setBrand("truk name");
        car1.setEngine(diesel);
        System.out.print(car1.getName() + " " + car1.getBrand() + " mechine engine is ");
        car1.startEngine();

    }
}
