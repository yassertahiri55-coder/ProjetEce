package fr.ece.projectece.userrepository;

import fr.ece.projectece.antity.teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface teacherrepo extends JpaRepository<teacher, UUID> {
}