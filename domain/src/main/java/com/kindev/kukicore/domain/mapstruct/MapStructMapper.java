package com.kindev.kukicore.domain.mapstruct;

import com.kindev.kukicore.domain.*;
import com.kindev.kukicore.domain.dto.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructMapper {
    /**
     * map CustomerForReservationDto to Customer to save it [ThePrince-Doc]
     */
    Customer mapCustomerForReservationDtoToCustomer(CustomerForReservationDto customerForReservationDto);

    /**
     * map Customer to CustomerForReservationDto to set in the forwarding reservation [ThePrince-Doc]
     */
    CustomerForReservationDto mapCustomerToCustomerForReservationDto(Customer customer);

    /**
     * map Customer to CustomerDto to forward It [ThePrince-Doc]
     */
    CustomerDto mapCustomerToCustomerDto(Customer customer);
    /**
     * map CustomerDto to Customer to update It [ThePrince-Doc]
     */
    Customer mapCustomerDtoToCustomer(CustomerDto customerDto);

    /**
     * map Feature to FeatureDto to forward It [ThePrince-Doc]
     */
    FeatureDto mapFeatureToFeatureDto(Feature feature);

    /**
     *  map FeatureDto to Feature to save It [ThePrince-Doc]
     */
    Feature mapFeatureDtoToFeature(FeatureDto featureDto);

    /**
     *  map Lodgement to LodgementForReservationDto to set in the forwarding reservation [ThePrince-Doc]
     */
    LodgementForReservationDto mapLodgementToLodgementForReservationDto(Lodgement lodgement);
    /**
     *  map Lodgement to LodgementForOwnerDto to set in the forwarding Owner [ThePrince-Doc]
     */
    LodgementForOwnerDto mapLodgementToLodgementForOwnerDto(Lodgement lodgement);

    /**
     * map LodgementForReservationDto to Lodgement to save It [ThePrince-Doc]
     */
    Lodgement mapLodgementForReservationDtoToLodgement(LodgementForReservationDto lodgementForReservationDto);
    /**
     * map LodgementDto to Lodgement to update It [ThePrince-Doc]
     */
    Lodgement mapLodgementDtoToLodgement(LodgementDto lodgementDto);

    /**
     * map Lodgement to LodgementDto to forward It [ThePrince-Doc]
     */
    LodgementDto mapLodgementToLodgementDto(Lodgement lodgement);

    /**
     * map LodgementFeature to LodgementFeatureDto to set it in LodgementDto and LodgementForReservationDto [ThePrince-Doc]
     */
    LodgementFeatureDto mapLodgementFeatureToLodgementFeatureDto(LodgementFeature lodgementFeature);

    /**
     * map LodgementFeature to LodgementFeatureDto to set it in LodgementDto and LodgementForReservationDto [ThePrince-Doc]
     */
    LodgementFeature mapLodgementFeatureDtoToLodgementFeature(LodgementFeatureDto lodgementFeatureDto);

    /**
     * map LodgementTypeSlimDto To LodgementType to save It [ThePrince-Doc]
     */
    LodgementType mapLodgementTypeSlimDtoToLodgementType(LodgementTypeSlimDto lodgementTypeSlimDto);

    /**
     * map LodgementType To LodgementTypeSlimDto to forward It [ThePrince-Doc]
     */
    LodgementTypeSlimDto mapLodgementTypeToLodgementTypeSlimDto(LodgementType lodgementType);

    /**
     * map LodgementType To LodgementTypeDto to forward It [ThePrince-Doc]
     */
    LodgementTypeDto mapLodgementTypeToLodgementTypeDto(LodgementType lodgementType);

    /**
     * map OwnerForLodgementDto To Owner to save it [ThePrince-Doc]
     */
    Owner mapOwnerSlimDtoToOwner(OwnerSlimDto ownerSlimDto);

    /**
     * map OwnerDto To Owner to update it [ThePrince-Doc]
     */
    Owner mapOwnerDtoToOwner(OwnerDto ownerDto);

    /**
     * map Owner To OwnerDto to forward It [ThePrince-Doc]
     */
    OwnerDto mapOwnerToOwnerDto(Owner owner);

    /**
     * map ReservationDto to Reservation to save It [ThePrince-Doc]
     */
    Reservation mapReservationDtoToReservation(ReservationDto reservationDto);

    /**
     * map Reservation to ReservationDto to forward It [ThePrince-Doc]
     */
    ReservationDto mapReservationToReservationDto(Reservation reservation);
    /**
     * map Reservation to ReservationForCustomerDto to set it in the forwarding CustomerDto [ThePrince-Doc]
     */
    ReservationForCustomerDto mapReservationToReservationForCustomerDto(Reservation reservation);
    /**
     * map ReservationForCustomerDto to Reservation [ThePrince-Doc]
     */
    Reservation mapReservationToReservationForCustomerDto(ReservationForCustomerDto reservationForCustomerDto);

    /**
     * map Reservation to ReservationForLodgementDto to set it in the forwarding CustomerDto [ThePrince-Doc]
     */
    ReservationForLodgementDto mapReservationToReservationForLodgementDto(Reservation reservation);
    /**
     * map ReservationForLodgementDto To Reservation [ThePrince-Doc]
     */
    Reservation mapReservationForLodgementDtoToReservation(ReservationForLodgementDto reservationForLodgementDto);

}
