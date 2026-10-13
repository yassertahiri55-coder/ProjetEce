package fr.ece.projectece.userrepository;

import fr.ece.projectece.antity.student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface studentrepo extends JpaRepository<student, UUID> {
}
