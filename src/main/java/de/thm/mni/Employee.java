package de.thm.mni;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToOne
    private BusinessUnit businessUnit;

    private Double salary;

    @ManyToMany
    private List<Project> projects;

}
