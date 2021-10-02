package com.kindev.kukicore.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "features")
@NoArgsConstructor
@AllArgsConstructor
public class Feature {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long featureId;
    private String name;

    @OneToMany(mappedBy = "feature")
    private List<LodgementFeature> lodgementFeatures;

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

    public List<LodgementFeature> getLodgementFeatures() {
        return lodgementFeatures;
    }

    public void setLodgementFeatures(List<LodgementFeature> lodgementFeatures) {
        this.lodgementFeatures = lodgementFeatures;
    }
}
