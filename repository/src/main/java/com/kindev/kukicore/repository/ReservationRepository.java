package com.kindev.kukicore.repository;

import com.kindev.kukicore.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
