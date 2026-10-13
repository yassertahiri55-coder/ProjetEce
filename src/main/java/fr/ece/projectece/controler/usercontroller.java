package fr.ece.projectece.controler;
import java.util.List;
import fr.ece.projectece.antity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.ece.projectece.userrepository.repository;
import fr.ece.projectece.studentservice.usersservice;
@RestController
@RequestMapping("/user")
public class usercontroller {
    @Autowired
    private  repository repository;
    private  usersservice usersservice;

    @GetMapping("/users")
    public List<user> getusers() {
        return usersservice.getallusers();
    }

    @PostMapping("/users")
    public user addstudent(@RequestBody user user) {
        return repository.save(user);
    }
}