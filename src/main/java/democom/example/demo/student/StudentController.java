package democom.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
