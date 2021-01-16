package de.thm.mni.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@SequenceGenerator(name = "bu_id_gen", sequenceName = "business_unit_seq", allocationSize = 1)
public class BusinessUnit {

    @Id
    @GeneratedValue(generator = "bu_id_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String name;

    public BusinessUnit() {
        super();
    }

    public BusinessUnit(String name) {
        this.name = name;
    }

}
