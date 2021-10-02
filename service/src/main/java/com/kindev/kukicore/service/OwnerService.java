package com.kindev.kukicore.service;

import com.kindev.kukicore.domain.Owner;
import com.kindev.kukicore.service.util.ResponseModel;

public interface OwnerService {
    Owner getOwnerById(Long ownerId);
    ResponseModel<Owner> getAllOwners();
    Owner saveOwner(Owner owner);
    Owner updateOwner(Owner owner);
    boolean deleteOwner(Long id);
}
