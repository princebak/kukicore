package com.kindev.kukicore.service.implementation;

import com.kindev.kukicore.domain.LodgementType;
import com.kindev.kukicore.repository.LodgementTypeRepository;
import com.kindev.kukicore.service.LodgementTypeService;
import com.kindev.kukicore.service.util.ResponseModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class LodgementTypeServiceImpl implements LodgementTypeService {
    private LodgementTypeRepository lodgementTypeRepository;
    @Override
    public LodgementType getLodgementTypeById(Long lodgementTypeId) {
        log.info("Inside LodgementTypeTypeServiceImpl........");

        Optional<LodgementType> LodgementType = lodgementTypeRepository.findById(lodgementTypeId);
        return LodgementType.orElse(null);
    }

    @Override
    public ResponseModel<LodgementType> getAllLodgementTypes() {
        return new ResponseModel<>(lodgementTypeRepository.findAll());
    }

    @Override
    public LodgementType saveLodgementType(LodgementType lodgementType) {
        if(lodgementType != null){
            return lodgementTypeRepository.save(lodgementType);
        }
        return null;
    }

    @Override
    public LodgementType updateLodgementType(LodgementType lodgementType) {
        if(lodgementType != null){
            return lodgementTypeRepository.save(lodgementType);
        }
        return null;
    }

    @Override
    public boolean deleteLodgementType(Long id) {
        if(id != null){
            lodgementTypeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
