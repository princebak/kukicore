package com.kindev.kukicore.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kindev.kukicore.domain.LodgementType;

import java.util.List;


public class LodgementDto {
    @JsonProperty("lodgementId")
    private Long lodgementId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("country")
    private String country;
    @JsonProperty("town")
    private String town;
    @JsonProperty("firstLineAddress")
    private String firstLineAddress;
    @JsonProperty("secondLineAddress")
    private String secondLineAddress;
    @JsonProperty("lodgementType")
    private LodgementType lodgementType;
    @JsonProperty("owner")
    private OwnerSlimDto owner;
    @JsonProperty("lodgementFeatures")
    private List<LodgementFeatureDto> lodgementFeatures;
    @JsonProperty("reservations")
    private List<ReservationForLodgementDto> reservations;

    public Long getLodgementId() {
        return lodgementId;
    }

    public void setLodgementId(Long lodgementId) {
        this.lodgementId = lodgementId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getFirstLineAddress() {
        return firstLineAddress;
    }

    public void setFirstLineAddress(String firstLineAddress) {
        this.firstLineAddress = firstLineAddress;
    }

    public String getSecondLineAddress() {
        return secondLineAddress;
    }

    public void setSecondLineAddress(String secondLineAddress) {
        this.secondLineAddress = secondLineAddress;
    }

    public LodgementType getLodgementType() {
        return lodgementType;
    }

    public void setLodgementType(LodgementType lodgementType) {
        this.lodgementType = lodgementType;
    }

    public OwnerSlimDto getOwner() {
        return owner;
    }

    public void setOwner(OwnerSlimDto owner) {
        this.owner = owner;
    }

    public List<LodgementFeatureDto> getLodgementFeatures() {
        return lodgementFeatures;
    }

    public void setLodgementFeatures(List<LodgementFeatureDto> lodgementFeatures) {
        this.lodgementFeatures = lodgementFeatures;
    }

    public List<ReservationForLodgementDto> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationForLodgementDto> reservations) {
        this.reservations = reservations;
    }
}
