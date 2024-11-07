package za.co.protogen.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.protogen.domain.Car;
import za.co.protogen.persistence.repository.CarRepository;
import za.co.protogen.core.CarService;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);  
    }

    @Override
    public void removeCar(Long id) {
        carRepository.deleteById(id);  
    }

    @Override
    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);  
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();  
    }

    @Override
    public Car updateCar(Car car) {
        return carRepository.save(car); s
    }
}
