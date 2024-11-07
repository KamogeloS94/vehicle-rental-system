package za.co.protogen.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long carId;
    private LocalDate fromDate;
    private LocalDate toDate;
    private String pickUpLocation;
    private String dropoffLocation;

}
