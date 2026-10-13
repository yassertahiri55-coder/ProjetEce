package fr.ece.projectece.userrepository;

import fr.ece.projectece.antity.groupe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface grouprepo extends JpaRepository<groupe,UUID> {
}
