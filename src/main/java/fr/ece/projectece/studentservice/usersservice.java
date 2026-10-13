package fr.ece.projectece.studentservice;

import org.springframework.stereotype.Service;
import fr.ece.projectece.antity.user;
import fr.ece.projectece.userrepository.repository;
import java.util.List;
@Service
public class usersservice {
    private final repository repository;
    public usersservice(repository repository) {
        this.repository = repository;
    }
    public  List<user> getallusers(){
        return repository.findAll();
    }

}
