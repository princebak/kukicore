package com.kindev.kukicore.service.implementation;

import com.kindev.kukicore.domain.Feature;
import com.kindev.kukicore.domain.Feature;
import com.kindev.kukicore.domain.Feature;
import com.kindev.kukicore.repository.FeatureRepository;
import com.kindev.kukicore.service.FeatureService;
import com.kindev.kukicore.service.util.ResponseModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class FeatureServiceImpl implements FeatureService {
    private FeatureRepository featureRepository;
    @Override
    public Feature getFeatureById(Long featureId) {
        log.info("Inside FeatureServiceImpl........");

        Optional<Feature> Feature = featureRepository.findById(featureId);
        return Feature.orElse(null);
    }

    @Override
    public ResponseModel<Feature> getAllFeatures() {
        return new ResponseModel<>(featureRepository.findAll());
    }

    @Override
    public Feature saveFeature(Feature feature) {
        if(feature != null){
            return featureRepository.save(feature);
        }
        return null;
    }

    @Override
    public Feature updateFeature(Feature feature) {
        if(feature != null){
            return featureRepository.save(feature);
        }
        return null;
    }

    @Override
    public boolean deleteFeature(Long id) {
        if(id != null){
            featureRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
