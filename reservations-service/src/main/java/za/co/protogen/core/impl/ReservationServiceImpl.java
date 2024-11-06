package za.co.protogen.core.impl;

import za.co.protogen.core.ReservationService;
import za.co.protogen.domain.Reservation;
import za.co.protogen.utility.Constant;

import java.util.ArrayList;
import java.util.List;

public class ReservationServiceImpl implements ReservationService {

    @Override
    public void addReservation(Reservation reservation) {
        Constant.reservations.add(reservation);
    }

    @Override
    public void removeReservation(Long id) {
        Constant.reservations.removeIf(reservation -> reservation.getId().equals(id));
    }

    @Override
    public Reservation getReservationById(Long id) {
        return Constant.reservations.stream()
                .filter(reservation -> reservation.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return new ArrayList<>(Constant.reservations);
    }

    @Override
    public void updateReservation(Reservation reservation) {
        int index = Constant.reservations.indexOf(getReservationById(reservation.getId()));
        if (index >= 0) {
            Constant.reservations.set(index, reservation);
        }
    }

    @Override
    public List<Reservation> searchReservations(String criteria) {
        // Implement search logic based on criteria
        return new ArrayList<>();
    }
}
