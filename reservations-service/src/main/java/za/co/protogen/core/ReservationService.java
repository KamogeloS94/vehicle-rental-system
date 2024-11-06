package za.co.protogen.core;

import za.co.protogen.domain.Reservation;
import java.util.List;

public interface ReservationService {
    void addReservation(Reservation reservation);
    void removeReservation(Long id);
    Reservation getReservationById(Long id);
    List<Reservation> getAllReservations();
    void updateReservation(Reservation reservation);
    List<Reservation> searchReservations(String criteria);
}
