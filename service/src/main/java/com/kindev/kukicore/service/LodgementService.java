package com.kindev.kukicore.service;

import com.kindev.kukicore.domain.Lodgement;
import com.kindev.kukicore.service.util.ResponseModel;

public interface LodgementService {
    Lodgement getLodgementById(Long lodgementId);
    ResponseModel<Lodgement> getAllLodgements();
    Lodgement saveLodgement(Lodgement lodgement);
    Lodgement updateLodgement(Lodgement lodgement);
    boolean deleteLodgement(Long id);
}
