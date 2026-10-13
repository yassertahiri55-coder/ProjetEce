package fr.ece.projectece.controler;
import fr.ece.projectece.userrepository.studentrepo;
import fr.ece.projectece.antity.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class studentcontroler {
   @Autowired
    private studentrepo studentrepo;
   @GetMapping("/{id}")
   public Optional<student> getstudent(@PathVariable UUID id){
       return studentrepo.findById(id);
   }
   @GetMapping
   public List<student> getstudents(){
       return studentrepo.findAll();
   }
   @PostMapping
    public student addstudent(@RequestBody student student){
       return studentrepo.save(student);
   }
}
