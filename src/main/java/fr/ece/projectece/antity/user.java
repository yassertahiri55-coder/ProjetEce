package fr.ece.projectece.antity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.UUID;

@Data
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type")
public class user {
    //@Getter
    @GeneratedValue
    @Id
    @Setter(AccessLevel.NONE)
    private UUID id;

    //@Setter
    private String username;
    private String password;
    private String email;
    private String firstname;
    private String lastname;
}
