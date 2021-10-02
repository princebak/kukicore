package com.kindev.kukicore.service.implementation;

import com.kindev.kukicore.domain.Reservation;
import com.kindev.kukicore.repository.ReservationRepository;
import com.kindev.kukicore.service.ReservationService;
import com.kindev.kukicore.service.util.ResponseModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {
    private ReservationRepository reservationRepository;
    @Override
    public Reservation getReservationById(Long reservationId) {
        log.info("Inside ReservationServiceImpl........");

        Optional<Reservation> Reservation = reservationRepository.findById(reservationId);
        return Reservation.orElse(null);
    }

    @Override
    public ResponseModel<Reservation> getAllReservations() {
        return new ResponseModel<>(reservationRepository.findAll());
    }

    @Override
    public Reservation saveReservation(Reservation reservation) {
        if(reservation != null){
            return reservationRepository.save(reservation);
        }
        return null;
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        if(reservation != null){
            return reservationRepository.save(reservation);
        }
        return null;
    }

    @Override
    public boolean deleteReservation(Long id) {
        if(id != null){
            reservationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
