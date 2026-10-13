package fr.ece.projectece.antity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@DiscriminatorValue("TEACHER")
public class teacher extends user{
    private String label;
 @ManyToMany
    private List<matiere> matieres ;
}
