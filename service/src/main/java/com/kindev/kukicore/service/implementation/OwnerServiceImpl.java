package com.kindev.kukicore.service.implementation;

import com.kindev.kukicore.domain.Owner;
import com.kindev.kukicore.repository.OwnerRepository;
import com.kindev.kukicore.service.OwnerService;
import com.kindev.kukicore.service.util.ResponseModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class OwnerServiceImpl implements OwnerService {
    private OwnerRepository ownerRepository;
    @Override
    public Owner getOwnerById(Long ownerId) {
        log.info("Inside OwnerServiceImpl........");

        Optional<Owner> Owner = ownerRepository.findById(ownerId);
        return Owner.orElse(null);
    }

    @Override
    public ResponseModel<Owner> getAllOwners() {
        return new ResponseModel<>(ownerRepository.findAll());
    }

    @Override
    public Owner saveOwner(Owner owner) {
        if(owner != null){
            return ownerRepository.save(owner);
        }
        return null;
    }

    @Override
    public Owner updateOwner(Owner owner) {
        if(owner != null){
            return ownerRepository.save(owner);
        }
        return null;
    }

    @Override
    public boolean deleteOwner(Long id) {
        if(id != null){
            ownerRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

