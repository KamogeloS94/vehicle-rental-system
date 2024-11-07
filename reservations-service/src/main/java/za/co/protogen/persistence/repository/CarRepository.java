package za.co.protogen.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.protogen.domain.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
    
}
