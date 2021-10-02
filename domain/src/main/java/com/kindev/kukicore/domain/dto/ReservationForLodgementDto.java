package com.kindev.kukicore.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class ReservationForLodgementDto {
    @JsonProperty("reservationId")
    private Long reservationId;
    @JsonProperty("customer")
    private CustomerForReservationDto customer;
    @JsonProperty("checkIn")
    private Date checkIn;
    @JsonProperty("checkOut")
    private Date checkOut;
    @JsonProperty("adults")
    private int adults;
    @JsonProperty("children")
    private int children;
    @JsonProperty("rooms")
    private int rooms;

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public CustomerForReservationDto getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerForReservationDto customer) {
        this.customer = customer;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
}
