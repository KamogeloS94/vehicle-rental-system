package za.co.protogen;

import za.co.protogen.core.ReservationService;
import za.co.protogen.core.impl.ReservationServiceImpl;
import za.co.protogen.domain.Reservation;

public class Application {
    public static void main(String[] args) {
        ReservationService reservationService = new ReservationServiceImpl();

        Reservation newReservation = new Reservation();
        newReservation.setId(3L);
        newReservation.setUserId(3L);
        newReservation.setCarId(3L);
        newReservation.setFromDate(java.time.LocalDate.of(2023, 7, 1));
        newReservation.setToDate(java.time.LocalDate.of(2023, 7, 7));
        newReservation.setPickUpLocation("Tokyo");
        newReservation.setDropoffLocation("Osaka");

        reservationService.addReservation(newReservation);
        System.out.println("All Reservations: " + reservationService.getAllReservations());
    }
}
