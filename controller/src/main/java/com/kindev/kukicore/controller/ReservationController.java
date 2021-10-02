package com.kindev.kukicore.controller;

import com.kindev.kukicore.domain.Reservation;
import com.kindev.kukicore.domain.dto.ReservationDto;
import com.kindev.kukicore.domain.mapstruct.MapStructMapper;
import com.kindev.kukicore.service.ReservationService;
import com.kindev.kukicore.service.util.ResponseModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/reservations")
public class ReservationController {


    private ReservationService reservationService;
    private MapStructMapper mapStructMapper;

    @GetMapping("/health")
    public String health() {
        return "ok";
    }

    @GetMapping("")
    public ResponseModel<ReservationDto> getAllReservations() {
        log.info("Call to Inside getAllReservations ReservationController........");
        ResponseModel<Reservation> reservations = reservationService.getAllReservations();
        ResponseModel<ReservationDto> reservationDtos = new ResponseModel<>();
        reservationDtos.setContent(
                reservations.getContent().parallelStream()
                        .map(reservation -> mapStructMapper.mapReservationToReservationDto(reservation))
                        .collect(Collectors.toList())
        );
        return reservationDtos;
    }

    @GetMapping("/reservation")
    public ReservationDto getReservation(@RequestHeader("id") Long id) {
        log.info("Call to Inside getReservationById Inside ReservationController........");
        Reservation reservation = reservationService.getReservationById(id);
        ReservationDto reservationDto = mapStructMapper.mapReservationToReservationDto(reservation);
        return reservationDto;
    }
    @PostMapping("")
    public ReservationDto createReservation(@RequestBody ReservationDto reservationDto) {
        log.info("Call to Inside createReservation Inside ReservationController........");
        return mapStructMapper.mapReservationToReservationDto(
                reservationService.saveReservation(mapStructMapper.mapReservationDtoToReservation(reservationDto))
        );
    }
    @PostMapping("/update")
    public ReservationDto updateReservation(@RequestBody ReservationDto reservationDto) {
        log.info("Call to Inside createReservation Inside ReservationController........");
        return mapStructMapper.mapReservationToReservationDto(
                reservationService.saveReservation(mapStructMapper.mapReservationDtoToReservation(reservationDto))
        );
    }
    @PostMapping("/delete")
    public boolean updateReservation(@RequestHeader("id") Long id) {
        log.info("Call to Inside createReservation Inside ReservationController........");
        return reservationService.deleteReservation(id);
    }
}
