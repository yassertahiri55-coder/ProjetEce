package fr.ece.projectece.antity;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
@Entity
@DiscriminatorValue("STUDENT")
public class student extends user{
    @ManyToOne
    private groupe groupes;
}
