package com.kindev.kukicore.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LodgementTypeSlimDto {
    @JsonProperty("lodgementTypeId")
    private Long lodgementTypeId;
    @JsonProperty("name")
    private String name;

    public Long getLodgementTypeId() {
        return lodgementTypeId;
    }

    public void setLodgementTypeId(Long lodgementTypeId) {
        this.lodgementTypeId = lodgementTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
