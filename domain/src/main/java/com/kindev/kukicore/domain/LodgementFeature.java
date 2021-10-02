package com.kindev.kukicore.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "lodgementFeatures")
@NoArgsConstructor
@AllArgsConstructor
public class LodgementFeature {
    @EmbeddedId
    private LodgementFeatureKey lodgementFeatureId;

    @ManyToOne
    @MapsId("lodgementId")
    @JoinColumn(name = "lodgementId")
    private Lodgement lodgement;

    @ManyToOne
    @MapsId("featureId")
    @JoinColumn(name = "featureId")
    private Feature feature;

    private String value;

    public LodgementFeatureKey getLodgementFeatureId() {
        return lodgementFeatureId;
    }

    public void setLodgementFeatureId(LodgementFeatureKey lodgementFeatureId) {
        this.lodgementFeatureId = lodgementFeatureId;
    }

    public Lodgement getLodgement() {
        return lodgement;
    }

    public void setLodgement(Lodgement lodgement) {
        this.lodgement = lodgement;
    }

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
