package ru.skypro.homework_4_1_sql_2.services;

import ru.skypro.homework_4_1_sql_2.model.Student;
import ru.skypro.homework_4_1_sql_2.repository.StudentsByAge;
import ru.skypro.homework_4_1_sql_2.repository.StudentsByCategory;

import java.util.Collection;
import java.util.List;

public interface StudentService {
    Student add(Student student);

    Student remove(Long id);

    Student update(Student student);

    Student get(Long id);

    Collection<Student> getByAge(Integer startAge, Integer endAge);

    Collection<Student> getAll();


    Integer amountOfStudents();


    List<StudentsByAge> getAverageStudentAge();

    List<StudentsByCategory> gettingListOfStudents();
}

