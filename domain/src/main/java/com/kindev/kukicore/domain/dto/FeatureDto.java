package com.kindev.kukicore.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FeatureDto {
    @JsonProperty("featureId")
    private Long featureId;
    @JsonProperty("name")
    private String name;

    public Long getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Long featureId) {
        this.featureId = featureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
