package za.co.protogen;

import za.co.protogen.core.CarService;
import za.co.protogen.core.impl.CarServiceImpl;

public class Application {
    public static void main(String[] args) {
        CarService carService = new CarServiceImpl();

        System.out.println("All Cars: " + carService.getAllCars());
        System.out.println("Cheapest Car: " + carService.findCheapestCar());
        System.out.println("Most Expensive Car: " + carService.findMostExpensiveCar());
    }
}

