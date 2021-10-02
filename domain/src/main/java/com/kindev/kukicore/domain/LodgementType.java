package com.kindev.kukicore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "lodgementTypes")
@NoArgsConstructor
@AllArgsConstructor
public class LodgementType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lodgementTypeId;
    private String name;

    @OneToMany(mappedBy = "lodgementType")
    private List<Lodgement> lodgements;

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

    public List<Lodgement> getLodgements() {
        return lodgements;
    }

    public void setLodgements(List<Lodgement> lodgements) {
        this.lodgements = lodgements;
    }
}
