package ru.skypro.homework_4_1_sql_2.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skypro.homework_4_1_sql_2.model.Faculty;
import ru.skypro.homework_4_1_sql_2.model.Student;
import ru.skypro.homework_4_1_sql_2.services.StudentService;

import java.util.Collection;

@RestController
@RequestMapping("student")
@Tag(name = "Api: Для работы со студентами")
public class StudentController {

}
