package de.thm.mni;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Project {

    @Id
    private Integer id;

    private String projectName;

    private Double budget;

    private LocalDate kickoffDate;

    @ManyToMany
    private List<Employee> employees;

}
