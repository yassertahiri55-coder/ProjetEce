package fr.ece.projectece.userrepository;

import fr.ece.projectece.antity.user;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface repository extends JpaRepository<user, UUID> {
}