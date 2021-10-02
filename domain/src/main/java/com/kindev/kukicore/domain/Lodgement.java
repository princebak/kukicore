package com.kindev.kukicore.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "lodgements")
@NoArgsConstructor
@AllArgsConstructor
public class Lodgement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lodgementId;
    private String name;
    private String country;
    private String town;
    private String firstLineAddress;
    private String secondLineAddress;

    @ManyToOne
    @JoinColumn(name="lodgementTypeId")
    private LodgementType lodgementType;

    @ManyToOne
    @JoinColumn(name="ownerId")
    private Owner owner;

    @OneToMany(mappedBy = "lodgement")
    private List<LodgementFeature> lodgementFeatures;

    @OneToMany(mappedBy = "lodgementReserved")
    private List<Reservation> reservations;

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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<LodgementFeature> getLodgementFeatures() {
        return lodgementFeatures;
    }

    public void setLodgementFeatures(List<LodgementFeature> lodgementFeatures) {
        this.lodgementFeatures = lodgementFeatures;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
