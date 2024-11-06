// src/main/java/za/co/protogen/Main.java
package za.co.protogen;

import za.co.protogen.core.CarService;
import za.co.protogen.core.impl.CarServiceImpl;
import za.co.protogen.domain.Car;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarServiceImpl();

        // Display all cars
        carService.getAllCars().forEach(System.out::println);

        // Add a new car
        Car newCar = new Car();
        newCar.setMake("Ford");
        newCar.setModel("Focus");
        newCar.setYear(2022);
        newCar.setColor("Blue");
        newCar.setPrice(27000);
        carService.addCar(newCar);

        // Display updated list of cars
        carService.getAllCars().forEach(System.out::println);
    }
}
