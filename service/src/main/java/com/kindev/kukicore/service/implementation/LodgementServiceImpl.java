package com.kindev.kukicore.service.implementation;

import com.kindev.kukicore.domain.Lodgement;
import com.kindev.kukicore.repository.LodgementRepository;
import com.kindev.kukicore.service.LodgementService;
import com.kindev.kukicore.service.util.ResponseModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class LodgementServiceImpl implements LodgementService {
    private LodgementRepository lodgementRepository;
    @Override
    public Lodgement getLodgementById(Long lodgementId) {
        log.info("Inside LodgementServiceImpl........");

        Optional<Lodgement> Lodgement = lodgementRepository.findById(lodgementId);
        return Lodgement.orElse(null);
    }

    @Override
    public ResponseModel<Lodgement> getAllLodgements() {
        return new ResponseModel<>(lodgementRepository.findAll());
    }

    @Override
    public Lodgement saveLodgement(Lodgement lodgement) {
        if(lodgement != null){
            return lodgementRepository.save(lodgement);
        }
        return null;
    }

    @Override
    public Lodgement updateLodgement(Lodgement lodgement) {
        if(lodgement != null){
            return lodgementRepository.save(lodgement);
        }
        return null;
    }

    @Override
    public boolean deleteLodgement(Long id) {
        if(id != null){
            lodgementRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
