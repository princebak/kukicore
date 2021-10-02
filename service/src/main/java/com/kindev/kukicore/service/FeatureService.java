package com.kindev.kukicore.service;

import com.kindev.kukicore.domain.Feature;
import com.kindev.kukicore.service.util.ResponseModel;

public interface FeatureService {
    Feature getFeatureById(Long featureId);
    ResponseModel<Feature> getAllFeatures();
    Feature saveFeature(Feature feature);
    Feature updateFeature(Feature feature);
    boolean deleteFeature(Long id);
}
