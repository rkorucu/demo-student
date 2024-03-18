package democom.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentServices {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "ali",
                        "ali@gmail.com",
                        LocalDate.of(2000, Month.OCTOBER,5),
                        21

                )
        );
    }
}
