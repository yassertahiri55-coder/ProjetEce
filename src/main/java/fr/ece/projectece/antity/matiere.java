package fr.ece.projectece.antity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AccessLevel;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
public class matiere {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;
    private String label;
    @ManyToMany(mappedBy = "matieres")
    private List<teacher> teachers;
    @ManyToMany(mappedBy = "matieres")
    private List<groupe> groupes;


}
