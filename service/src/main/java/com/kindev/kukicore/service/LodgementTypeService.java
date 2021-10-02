package com.kindev.kukicore.service;

import com.kindev.kukicore.domain.LodgementType;
import com.kindev.kukicore.service.util.ResponseModel;

public interface LodgementTypeService {
    LodgementType getLodgementTypeById(Long lodgementTypeId);
    ResponseModel<LodgementType> getAllLodgementTypes();
    LodgementType saveLodgementType(LodgementType lodgementType);
    LodgementType updateLodgementType(LodgementType lodgementType);
    boolean deleteLodgementType(Long id);
}
