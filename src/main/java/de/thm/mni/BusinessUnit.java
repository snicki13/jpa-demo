package de.thm.mni;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@SequenceGenerator(name = "bu_id_gen", sequenceName = "business_unit_seq")
public class BusinessUnit {

    @Id
    @GeneratedValue(generator = "bu_id_gen")
    private Integer id;

    private String name;

}
