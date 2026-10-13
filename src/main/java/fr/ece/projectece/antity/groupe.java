package fr.ece.projectece.antity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Data
public class groupe {

    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue
    private UUID id;

    private String label;

    @ManyToMany
    private List<matiere> matieres;
    @OneToMany
    private List<student> students;
}