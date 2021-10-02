package com.kindev.kukicore.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LodgementTypeDto {
    @JsonProperty("lodgementTypeId")
    private Long lodgementTypeId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("lodgements")
    private List<LodgementDto> lodgements;

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

    public List<LodgementDto> getLodgements() {
        return lodgements;
    }

    public void setLodgements(List<LodgementDto> lodgements) {
        this.lodgements = lodgements;
    }
}
