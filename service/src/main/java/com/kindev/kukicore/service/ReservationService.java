package com.kindev.kukicore.service;

import com.kindev.kukicore.domain.Reservation;
import com.kindev.kukicore.service.util.ResponseModel;

public interface ReservationService {
    Reservation getReservationById(Long reservationId);
    ResponseModel<Reservation> getAllReservations();
    Reservation saveReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    boolean deleteReservation(Long id);
}
