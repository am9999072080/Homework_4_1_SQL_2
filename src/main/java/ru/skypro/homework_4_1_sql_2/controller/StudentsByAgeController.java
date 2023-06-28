package ru.skypro.homework_4_1_sql_2.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.homework_4_1_sql_2.repository.StudentsByAge;
import ru.skypro.homework_4_1_sql_2.repository.StudentsByCategory;
import ru.skypro.homework_4_1_sql_2.services.StudentService;

import java.util.List;

@RestController
@Tag(name = "Api: Использование аннотации @Query для вызова SQL")
public class StudentsByAgeController {
    private final StudentService service;

    public StudentsByAgeController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/количество студентов")
    public Integer getStudentSize() {
        return service.amountOfStudents();

    }

    @GetMapping("/средний возраст студентов")
    public List<StudentsByAge> getAverageStudentAge() {
        return service.getAverageStudentAge();

    }

    @GetMapping("/получение 5 последных студентов по списку")
    public List<StudentsByCategory> gettingListOfStudents() {
        return service.gettingListOfStudents();
    }
}
