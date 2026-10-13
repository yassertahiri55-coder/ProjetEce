package fr.ece.projectece.controler;
import fr.ece.projectece.userrepository.teacherrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import fr.ece.projectece.antity.teacher;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("teacher")
public class teachercontroler {
    @Autowired
    private teacherrepo teacherrepo;
    @GetMapping
    public List<teacher> getteacher(){
        return teacherrepo.findAll();
    }
    @GetMapping("id")
    public Optional<teacher> getteacherid(@PathVariable UUID id){
        return teacherrepo.findById(id);
    }
    @PostMapping
    public teacher addteacher(@RequestBody teacher teacher){
        return teacherrepo.save(teacher);
    }
    @DeleteMapping
    public void deleteteacher(@RequestParam UUID id){
        teacherrepo.deleteById(id);
    }
    @PutMapping("id")
    public teacher updateteacher(@RequestBody teacher teacher,@RequestParam UUID id){

        teacher existingteacher = teacherrepo.findById(id).orElse(null);
        if(existingteacher == null){
            return null;
        }
        existingteacher.setUsername(teacher.getUsername());
        existingteacher.setPassword(teacher.getPassword());
        existingteacher.setEmail(teacher.getEmail());
        existingteacher.setFirstname(teacher.getFirstname());
        existingteacher.setLastname(teacher.getLastname());

        return teacherrepo.save(existingteacher);
    }
}
