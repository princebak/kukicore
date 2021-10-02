package com.kindev.kukicore.domain.mapstruct;

import com.kindev.kukicore.domain.Customer;
import com.kindev.kukicore.domain.Feature;
import com.kindev.kukicore.domain.Lodgement;
import com.kindev.kukicore.domain.LodgementFeature;
import com.kindev.kukicore.domain.LodgementType;
import com.kindev.kukicore.domain.Owner;
import com.kindev.kukicore.domain.Reservation;
import com.kindev.kukicore.domain.dto.CustomerDto;
import com.kindev.kukicore.domain.dto.CustomerForReservationDto;
import com.kindev.kukicore.domain.dto.FeatureDto;
import com.kindev.kukicore.domain.dto.LodgementDto;
import com.kindev.kukicore.domain.dto.LodgementFeatureDto;
import com.kindev.kukicore.domain.dto.LodgementForOwnerDto;
import com.kindev.kukicore.domain.dto.LodgementForReservationDto;
import com.kindev.kukicore.domain.dto.LodgementTypeDto;
import com.kindev.kukicore.domain.dto.LodgementTypeSlimDto;
import com.kindev.kukicore.domain.dto.OwnerDto;
import com.kindev.kukicore.domain.dto.OwnerSlimDto;
import com.kindev.kukicore.domain.dto.ReservationDto;
import com.kindev.kukicore.domain.dto.ReservationForCustomerDto;
import com.kindev.kukicore.domain.dto.ReservationForLodgementDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class MapStructMapperImpl implements MapStructMapper {

    @Override
    public Customer mapCustomerForReservationDtoToCustomer(CustomerForReservationDto customerForReservationDto) {
        if ( customerForReservationDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setFirstName( customerForReservationDto.getFirstName() );
        customer.setLastName( customerForReservationDto.getLastName() );
        customer.setPhone( customerForReservationDto.getPhone() );
        customer.setCountry( customerForReservationDto.getCountry() );
        customer.setTown( customerForReservationDto.getTown() );
        customer.setFirstLineAddress( customerForReservationDto.getFirstLineAddress() );
        customer.setSecondLineAddress( customerForReservationDto.getSecondLineAddress() );

        return customer;
    }

    @Override
    public CustomerForReservationDto mapCustomerToCustomerForReservationDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerForReservationDto customerForReservationDto = new CustomerForReservationDto();

        customerForReservationDto.setFirstName( customer.getFirstName() );
        customerForReservationDto.setLastName( customer.getLastName() );
        customerForReservationDto.setPhone( customer.getPhone() );
        customerForReservationDto.setCountry( customer.getCountry() );
        customerForReservationDto.setTown( customer.getTown() );
        customerForReservationDto.setFirstLineAddress( customer.getFirstLineAddress() );
        customerForReservationDto.setSecondLineAddress( customer.getSecondLineAddress() );

        return customerForReservationDto;
    }

    @Override
    public CustomerDto mapCustomerToCustomerDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        customerDto.setCustomerId( customer.getCustomerId() );
        customerDto.setFirstName( customer.getFirstName() );
        customerDto.setLastName( customer.getLastName() );
        customerDto.setPhone( customer.getPhone() );
        customerDto.setCountry( customer.getCountry() );
        customerDto.setTown( customer.getTown() );
        customerDto.setFirstLineAddress( customer.getFirstLineAddress() );
        customerDto.setSecondLineAddress( customer.getSecondLineAddress() );
        customerDto.setReservations( reservationListToReservationForCustomerDtoList( customer.getReservations() ) );

        return customerDto;
    }

    @Override
    public Customer mapCustomerDtoToCustomer(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setCustomerId( customerDto.getCustomerId() );
        customer.setFirstName( customerDto.getFirstName() );
        customer.setLastName( customerDto.getLastName() );
        customer.setPhone( customerDto.getPhone() );
        customer.setCountry( customerDto.getCountry() );
        customer.setTown( customerDto.getTown() );
        customer.setFirstLineAddress( customerDto.getFirstLineAddress() );
        customer.setSecondLineAddress( customerDto.getSecondLineAddress() );
        customer.setReservations( reservationForCustomerDtoListToReservationList( customerDto.getReservations() ) );

        return customer;
    }

    @Override
    public FeatureDto mapFeatureToFeatureDto(Feature feature) {
        if ( feature == null ) {
            return null;
        }

        FeatureDto featureDto = new FeatureDto();

        featureDto.setFeatureId( feature.getFeatureId() );
        featureDto.setName( feature.getName() );

        return featureDto;
    }

    @Override
    public Feature mapFeatureDtoToFeature(FeatureDto featureDto) {
        if ( featureDto == null ) {
            return null;
        }

        Feature feature = new Feature();

        feature.setFeatureId( featureDto.getFeatureId() );
        feature.setName( featureDto.getName() );

        return feature;
    }

    @Override
    public LodgementForReservationDto mapLodgementToLodgementForReservationDto(Lodgement lodgement) {
        if ( lodgement == null ) {
            return null;
        }

        LodgementForReservationDto lodgementForReservationDto = new LodgementForReservationDto();

        lodgementForReservationDto.setLodgementId( lodgement.getLodgementId() );
        lodgementForReservationDto.setName( lodgement.getName() );
        lodgementForReservationDto.setCountry( lodgement.getCountry() );
        lodgementForReservationDto.setTown( lodgement.getTown() );
        lodgementForReservationDto.setFirstLineAddress( lodgement.getFirstLineAddress() );
        lodgementForReservationDto.setSecondLineAddress( lodgement.getSecondLineAddress() );
        lodgementForReservationDto.setLodgementType( lodgement.getLodgementType() );
        lodgementForReservationDto.setOwner( ownerToOwnerSlimDto( lodgement.getOwner() ) );
        lodgementForReservationDto.setLodgementFeatures( lodgementFeatureListToLodgementFeatureDtoList( lodgement.getLodgementFeatures() ) );

        return lodgementForReservationDto;
    }

    @Override
    public LodgementForOwnerDto mapLodgementToLodgementForOwnerDto(Lodgement lodgement) {
        if ( lodgement == null ) {
            return null;
        }

        LodgementForOwnerDto lodgementForOwnerDto = new LodgementForOwnerDto();

        lodgementForOwnerDto.setLodgementId( lodgement.getLodgementId() );
        lodgementForOwnerDto.setName( lodgement.getName() );
        lodgementForOwnerDto.setCountry( lodgement.getCountry() );
        lodgementForOwnerDto.setTown( lodgement.getTown() );
        lodgementForOwnerDto.setFirstLineAddress( lodgement.getFirstLineAddress() );
        lodgementForOwnerDto.setSecondLineAddress( lodgement.getSecondLineAddress() );
        lodgementForOwnerDto.setLodgementType( lodgement.getLodgementType() );
        lodgementForOwnerDto.setLodgementFeatures( lodgementFeatureListToLodgementFeatureDtoList( lodgement.getLodgementFeatures() ) );
        lodgementForOwnerDto.setReservations( reservationListToReservationForLodgementDtoList( lodgement.getReservations() ) );

        return lodgementForOwnerDto;
    }

    @Override
    public Lodgement mapLodgementForReservationDtoToLodgement(LodgementForReservationDto lodgementForReservationDto) {
        if ( lodgementForReservationDto == null ) {
            return null;
        }

        Lodgement lodgement = new Lodgement();

        lodgement.setLodgementId( lodgementForReservationDto.getLodgementId() );
        lodgement.setName( lodgementForReservationDto.getName() );
        lodgement.setCountry( lodgementForReservationDto.getCountry() );
        lodgement.setTown( lodgementForReservationDto.getTown() );
        lodgement.setFirstLineAddress( lodgementForReservationDto.getFirstLineAddress() );
        lodgement.setSecondLineAddress( lodgementForReservationDto.getSecondLineAddress() );
        lodgement.setLodgementType( lodgementForReservationDto.getLodgementType() );
        lodgement.setOwner( mapOwnerSlimDtoToOwner( lodgementForReservationDto.getOwner() ) );
        lodgement.setLodgementFeatures( lodgementFeatureDtoListToLodgementFeatureList( lodgementForReservationDto.getLodgementFeatures() ) );

        return lodgement;
    }

    @Override
    public Lodgement mapLodgementDtoToLodgement(LodgementDto lodgementDto) {
        if ( lodgementDto == null ) {
            return null;
        }

        Lodgement lodgement = new Lodgement();

        lodgement.setLodgementId( lodgementDto.getLodgementId() );
        lodgement.setName( lodgementDto.getName() );
        lodgement.setCountry( lodgementDto.getCountry() );
        lodgement.setTown( lodgementDto.getTown() );
        lodgement.setFirstLineAddress( lodgementDto.getFirstLineAddress() );
        lodgement.setSecondLineAddress( lodgementDto.getSecondLineAddress() );
        lodgement.setLodgementType( lodgementDto.getLodgementType() );
        lodgement.setOwner( mapOwnerSlimDtoToOwner( lodgementDto.getOwner() ) );
        lodgement.setLodgementFeatures( lodgementFeatureDtoListToLodgementFeatureList( lodgementDto.getLodgementFeatures() ) );
        lodgement.setReservations( reservationForLodgementDtoListToReservationList( lodgementDto.getReservations() ) );

        return lodgement;
    }

    @Override
    public LodgementDto mapLodgementToLodgementDto(Lodgement lodgement) {
        if ( lodgement == null ) {
            return null;
        }

        LodgementDto lodgementDto = new LodgementDto();

        lodgementDto.setLodgementId( lodgement.getLodgementId() );
        lodgementDto.setName( lodgement.getName() );
        lodgementDto.setCountry( lodgement.getCountry() );
        lodgementDto.setTown( lodgement.getTown() );
        lodgementDto.setFirstLineAddress( lodgement.getFirstLineAddress() );
        lodgementDto.setSecondLineAddress( lodgement.getSecondLineAddress() );
        lodgementDto.setLodgementType( lodgement.getLodgementType() );
        lodgementDto.setOwner( ownerToOwnerSlimDto( lodgement.getOwner() ) );
        lodgementDto.setLodgementFeatures( lodgementFeatureListToLodgementFeatureDtoList( lodgement.getLodgementFeatures() ) );
        lodgementDto.setReservations( reservationListToReservationForLodgementDtoList( lodgement.getReservations() ) );

        return lodgementDto;
    }

    @Override
    public LodgementFeatureDto mapLodgementFeatureToLodgementFeatureDto(LodgementFeature lodgementFeature) {
        if ( lodgementFeature == null ) {
            return null;
        }

        LodgementFeatureDto lodgementFeatureDto = new LodgementFeatureDto();

        lodgementFeatureDto.setFeature( lodgementFeature.getFeature() );
        lodgementFeatureDto.setValue( lodgementFeature.getValue() );

        return lodgementFeatureDto;
    }

    @Override
    public LodgementFeature mapLodgementFeatureDtoToLodgementFeature(LodgementFeatureDto lodgementFeatureDto) {
        if ( lodgementFeatureDto == null ) {
            return null;
        }

        LodgementFeature lodgementFeature = new LodgementFeature();

        lodgementFeature.setFeature( lodgementFeatureDto.getFeature() );
        lodgementFeature.setValue( lodgementFeatureDto.getValue() );

        return lodgementFeature;
    }

    @Override
    public LodgementType mapLodgementTypeSlimDtoToLodgementType(LodgementTypeSlimDto lodgementTypeSlimDto) {
        if ( lodgementTypeSlimDto == null ) {
            return null;
        }

        LodgementType lodgementType = new LodgementType();

        lodgementType.setLodgementTypeId( lodgementTypeSlimDto.getLodgementTypeId() );
        lodgementType.setName( lodgementTypeSlimDto.getName() );

        return lodgementType;
    }

    @Override
    public LodgementTypeSlimDto mapLodgementTypeToLodgementTypeSlimDto(LodgementType lodgementType) {
        if ( lodgementType == null ) {
            return null;
        }

        LodgementTypeSlimDto lodgementTypeSlimDto = new LodgementTypeSlimDto();

        lodgementTypeSlimDto.setLodgementTypeId( lodgementType.getLodgementTypeId() );
        lodgementTypeSlimDto.setName( lodgementType.getName() );

        return lodgementTypeSlimDto;
    }

    @Override
    public LodgementTypeDto mapLodgementTypeToLodgementTypeDto(LodgementType lodgementType) {
        if ( lodgementType == null ) {
            return null;
        }

        LodgementTypeDto lodgementTypeDto = new LodgementTypeDto();

        lodgementTypeDto.setLodgementTypeId( lodgementType.getLodgementTypeId() );
        lodgementTypeDto.setName( lodgementType.getName() );
        lodgementTypeDto.setLodgements( lodgementListToLodgementDtoList( lodgementType.getLodgements() ) );

        return lodgementTypeDto;
    }

    @Override
    public Owner mapOwnerSlimDtoToOwner(OwnerSlimDto ownerSlimDto) {
        if ( ownerSlimDto == null ) {
            return null;
        }

        Owner owner = new Owner();

        owner.setOwnerId( ownerSlimDto.getOwnerId() );
        owner.setFirstName( ownerSlimDto.getFirstName() );
        owner.setLastName( ownerSlimDto.getLastName() );
        owner.setPhone( ownerSlimDto.getPhone() );
        owner.setCountry( ownerSlimDto.getCountry() );
        owner.setTown( ownerSlimDto.getTown() );
        owner.setFirstLineAddress( ownerSlimDto.getFirstLineAddress() );
        owner.setSecondLineAddress( ownerSlimDto.getSecondLineAddress() );

        return owner;
    }

    @Override
    public Owner mapOwnerDtoToOwner(OwnerDto ownerDto) {
        if ( ownerDto == null ) {
            return null;
        }

        Owner owner = new Owner();

        owner.setOwnerId( ownerDto.getOwnerId() );
        owner.setFirstName( ownerDto.getFirstName() );
        owner.setLastName( ownerDto.getLastName() );
        owner.setPhone( ownerDto.getPhone() );
        owner.setCountry( ownerDto.getCountry() );
        owner.setTown( ownerDto.getTown() );
        owner.setFirstLineAddress( ownerDto.getFirstLineAddress() );
        owner.setSecondLineAddress( ownerDto.getSecondLineAddress() );
        owner.setLodgements( lodgementForOwnerDtoListToLodgementList( ownerDto.getLodgements() ) );

        return owner;
    }

    @Override
    public OwnerDto mapOwnerToOwnerDto(Owner owner) {
        if ( owner == null ) {
            return null;
        }

        OwnerDto ownerDto = new OwnerDto();

        ownerDto.setOwnerId( owner.getOwnerId() );
        ownerDto.setFirstName( owner.getFirstName() );
        ownerDto.setLastName( owner.getLastName() );
        ownerDto.setPhone( owner.getPhone() );
        ownerDto.setCountry( owner.getCountry() );
        ownerDto.setTown( owner.getTown() );
        ownerDto.setFirstLineAddress( owner.getFirstLineAddress() );
        ownerDto.setSecondLineAddress( owner.getSecondLineAddress() );
        ownerDto.setLodgements( lodgementListToLodgementForOwnerDtoList( owner.getLodgements() ) );

        return ownerDto;
    }

    @Override
    public Reservation mapReservationDtoToReservation(ReservationDto reservationDto) {
        if ( reservationDto == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setReservationId( reservationDto.getReservationId() );
        reservation.setLodgementReserved( mapLodgementForReservationDtoToLodgement( reservationDto.getLodgementReserved() ) );
        reservation.setCustomer( mapCustomerForReservationDtoToCustomer( reservationDto.getCustomer() ) );
        reservation.setCheckIn( reservationDto.getCheckIn() );
        reservation.setCheckOut( reservationDto.getCheckOut() );
        reservation.setAdults( reservationDto.getAdults() );
        reservation.setChildren( reservationDto.getChildren() );
        reservation.setRooms( reservationDto.getRooms() );

        return reservation;
    }

    @Override
    public ReservationDto mapReservationToReservationDto(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationDto reservationDto = new ReservationDto();

        reservationDto.setReservationId( reservation.getReservationId() );
        reservationDto.setLodgementReserved( mapLodgementToLodgementForReservationDto( reservation.getLodgementReserved() ) );
        reservationDto.setCustomer( mapCustomerToCustomerForReservationDto( reservation.getCustomer() ) );
        reservationDto.setCheckIn( reservation.getCheckIn() );
        reservationDto.setCheckOut( reservation.getCheckOut() );
        reservationDto.setAdults( reservation.getAdults() );
        reservationDto.setChildren( reservation.getChildren() );
        reservationDto.setRooms( reservation.getRooms() );

        return reservationDto;
    }

    @Override
    public ReservationForCustomerDto mapReservationToReservationForCustomerDto(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationForCustomerDto reservationForCustomerDto = new ReservationForCustomerDto();

        reservationForCustomerDto.setReservationId( reservation.getReservationId() );
        reservationForCustomerDto.setLodgementReserved( mapLodgementToLodgementForReservationDto( reservation.getLodgementReserved() ) );
        reservationForCustomerDto.setCheckIn( reservation.getCheckIn() );
        reservationForCustomerDto.setCheckOut( reservation.getCheckOut() );
        reservationForCustomerDto.setAdults( reservation.getAdults() );
        reservationForCustomerDto.setChildren( reservation.getChildren() );
        reservationForCustomerDto.setRooms( reservation.getRooms() );

        return reservationForCustomerDto;
    }

    @Override
    public Reservation mapReservationToReservationForCustomerDto(ReservationForCustomerDto reservationForCustomerDto) {
        if ( reservationForCustomerDto == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setReservationId( reservationForCustomerDto.getReservationId() );
        reservation.setLodgementReserved( mapLodgementForReservationDtoToLodgement( reservationForCustomerDto.getLodgementReserved() ) );
        reservation.setCheckIn( reservationForCustomerDto.getCheckIn() );
        reservation.setCheckOut( reservationForCustomerDto.getCheckOut() );
        reservation.setAdults( reservationForCustomerDto.getAdults() );
        reservation.setChildren( reservationForCustomerDto.getChildren() );
        reservation.setRooms( reservationForCustomerDto.getRooms() );

        return reservation;
    }

    @Override
    public ReservationForLodgementDto mapReservationToReservationForLodgementDto(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationForLodgementDto reservationForLodgementDto = new ReservationForLodgementDto();

        reservationForLodgementDto.setReservationId( reservation.getReservationId() );
        reservationForLodgementDto.setCustomer( mapCustomerToCustomerForReservationDto( reservation.getCustomer() ) );
        reservationForLodgementDto.setCheckIn( reservation.getCheckIn() );
        reservationForLodgementDto.setCheckOut( reservation.getCheckOut() );
        reservationForLodgementDto.setAdults( reservation.getAdults() );
        reservationForLodgementDto.setChildren( reservation.getChildren() );
        reservationForLodgementDto.setRooms( reservation.getRooms() );

        return reservationForLodgementDto;
    }

    @Override
    public Reservation mapReservationForLodgementDtoToReservation(ReservationForLodgementDto reservationForLodgementDto) {
        if ( reservationForLodgementDto == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setReservationId( reservationForLodgementDto.getReservationId() );
        reservation.setCustomer( mapCustomerForReservationDtoToCustomer( reservationForLodgementDto.getCustomer() ) );
        reservation.setCheckIn( reservationForLodgementDto.getCheckIn() );
        reservation.setCheckOut( reservationForLodgementDto.getCheckOut() );
        reservation.setAdults( reservationForLodgementDto.getAdults() );
        reservation.setChildren( reservationForLodgementDto.getChildren() );
        reservation.setRooms( reservationForLodgementDto.getRooms() );

        return reservation;
    }

    protected List<ReservationForCustomerDto> reservationListToReservationForCustomerDtoList(List<Reservation> list) {
        if ( list == null ) {
            return null;
        }

        List<ReservationForCustomerDto> list1 = new ArrayList<ReservationForCustomerDto>( list.size() );
        for ( Reservation reservation : list ) {
            list1.add( mapReservationToReservationForCustomerDto( reservation ) );
        }

        return list1;
    }

    protected List<Reservation> reservationForCustomerDtoListToReservationList(List<ReservationForCustomerDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Reservation> list1 = new ArrayList<Reservation>( list.size() );
        for ( ReservationForCustomerDto reservationForCustomerDto : list ) {
            list1.add( mapReservationToReservationForCustomerDto( reservationForCustomerDto ) );
        }

        return list1;
    }

    protected OwnerSlimDto ownerToOwnerSlimDto(Owner owner) {
        if ( owner == null ) {
            return null;
        }

        OwnerSlimDto ownerSlimDto = new OwnerSlimDto();

        ownerSlimDto.setOwnerId( owner.getOwnerId() );
        ownerSlimDto.setFirstName( owner.getFirstName() );
        ownerSlimDto.setLastName( owner.getLastName() );
        ownerSlimDto.setPhone( owner.getPhone() );
        ownerSlimDto.setCountry( owner.getCountry() );
        ownerSlimDto.setTown( owner.getTown() );
        ownerSlimDto.setFirstLineAddress( owner.getFirstLineAddress() );
        ownerSlimDto.setSecondLineAddress( owner.getSecondLineAddress() );

        return ownerSlimDto;
    }

    protected List<LodgementFeatureDto> lodgementFeatureListToLodgementFeatureDtoList(List<LodgementFeature> list) {
        if ( list == null ) {
            return null;
        }

        List<LodgementFeatureDto> list1 = new ArrayList<LodgementFeatureDto>( list.size() );
        for ( LodgementFeature lodgementFeature : list ) {
            list1.add( mapLodgementFeatureToLodgementFeatureDto( lodgementFeature ) );
        }

        return list1;
    }

    protected List<ReservationForLodgementDto> reservationListToReservationForLodgementDtoList(List<Reservation> list) {
        if ( list == null ) {
            return null;
        }

        List<ReservationForLodgementDto> list1 = new ArrayList<ReservationForLodgementDto>( list.size() );
        for ( Reservation reservation : list ) {
            list1.add( mapReservationToReservationForLodgementDto( reservation ) );
        }

        return list1;
    }

    protected List<LodgementFeature> lodgementFeatureDtoListToLodgementFeatureList(List<LodgementFeatureDto> list) {
        if ( list == null ) {
            return null;
        }

        List<LodgementFeature> list1 = new ArrayList<LodgementFeature>( list.size() );
        for ( LodgementFeatureDto lodgementFeatureDto : list ) {
            list1.add( mapLodgementFeatureDtoToLodgementFeature( lodgementFeatureDto ) );
        }

        return list1;
    }

    protected List<Reservation> reservationForLodgementDtoListToReservationList(List<ReservationForLodgementDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Reservation> list1 = new ArrayList<Reservation>( list.size() );
        for ( ReservationForLodgementDto reservationForLodgementDto : list ) {
            list1.add( mapReservationForLodgementDtoToReservation( reservationForLodgementDto ) );
        }

        return list1;
    }

    protected List<LodgementDto> lodgementListToLodgementDtoList(List<Lodgement> list) {
        if ( list == null ) {
            return null;
        }

        List<LodgementDto> list1 = new ArrayList<LodgementDto>( list.size() );
        for ( Lodgement lodgement : list ) {
            list1.add( mapLodgementToLodgementDto( lodgement ) );
        }

        return list1;
    }

    protected Lodgement lodgementForOwnerDtoToLodgement(LodgementForOwnerDto lodgementForOwnerDto) {
        if ( lodgementForOwnerDto == null ) {
            return null;
        }

        Lodgement lodgement = new Lodgement();

        lodgement.setLodgementId( lodgementForOwnerDto.getLodgementId() );
        lodgement.setName( lodgementForOwnerDto.getName() );
        lodgement.setCountry( lodgementForOwnerDto.getCountry() );
        lodgement.setTown( lodgementForOwnerDto.getTown() );
        lodgement.setFirstLineAddress( lodgementForOwnerDto.getFirstLineAddress() );
        lodgement.setSecondLineAddress( lodgementForOwnerDto.getSecondLineAddress() );
        lodgement.setLodgementType( lodgementForOwnerDto.getLodgementType() );
        lodgement.setLodgementFeatures( lodgementFeatureDtoListToLodgementFeatureList( lodgementForOwnerDto.getLodgementFeatures() ) );
        lodgement.setReservations( reservationForLodgementDtoListToReservationList( lodgementForOwnerDto.getReservations() ) );

        return lodgement;
    }

    protected List<Lodgement> lodgementForOwnerDtoListToLodgementList(List<LodgementForOwnerDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Lodgement> list1 = new ArrayList<Lodgement>( list.size() );
        for ( LodgementForOwnerDto lodgementForOwnerDto : list ) {
            list1.add( lodgementForOwnerDtoToLodgement( lodgementForOwnerDto ) );
        }

        return list1;
    }

    protected List<LodgementForOwnerDto> lodgementListToLodgementForOwnerDtoList(List<Lodgement> list) {
        if ( list == null ) {
            return null;
        }

        List<LodgementForOwnerDto> list1 = new ArrayList<LodgementForOwnerDto>( list.size() );
        for ( Lodgement lodgement : list ) {
            list1.add( mapLodgementToLodgementForOwnerDto( lodgement ) );
        }

        return list1;
    }
}
