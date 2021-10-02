package com.kindev.kukicore.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kindev.kukicore.domain.Feature;

public class LodgementFeatureDto {
    @JsonProperty("feature")
    private Feature feature;
    @JsonProperty("value")
    private String value;

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
