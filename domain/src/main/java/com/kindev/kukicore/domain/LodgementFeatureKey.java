package com.kindev.kukicore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class LodgementFeatureKey implements Serializable {
    @Column(name = "lodgementId")
    private Long lodgementId;

    @Column(name = "featureId")
    private Long featureId;

    public Long getLodgementId() {
        return lodgementId;
    }

    public void setLodgementId(Long lodgementId) {
        this.lodgementId = lodgementId;
    }

    public Long getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Long featureId) {
        this.featureId = featureId;
    }
}
