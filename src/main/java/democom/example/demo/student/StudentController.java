package democom.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.xml.xpath.XPath;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@RestController
@RequestMapping(path="api/v1/student")

public class StudentController {
    @Autowired
    public   StudentController (StudentServices studentServices){
        this. studentServices = studentServices;
    }
    private  StudentServices studentServices;

    @GetMapping
    public List<Student> getStudents() {
        return studentServices.getStudents();

    }
    @PostMapping
    public  void registerNewStudent(@RequestBody  Student student){
        studentServices.addNewStudent(student);
    }
    @DeleteMapping(path = "{studentId}")
    public  void deleteStudent(@PathVariable("studentId") Long studentId){
        studentServices.deleteStudent(studentId);
    }


    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId,
                            @RequestParam(required = false) String name,
                            @RequestParam(required = false) String email){
    studentServices.updateStudent(studentId,name,email);
    }
}
