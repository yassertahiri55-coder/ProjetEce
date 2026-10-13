package fr.ece.projectece.userrepository;

import fr.ece.projectece.antity.matiere;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface matiererepo extends JpaRepository<matiere, UUID> {
}