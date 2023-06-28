package ru.skypro.homework_4_1_sql_2.services.impl;


import org.springframework.stereotype.Service;
import ru.skypro.homework_4_1_sql_2.model.Student;
import ru.skypro.homework_4_1_sql_2.repository.StudentRepository;
import ru.skypro.homework_4_1_sql_2.repository.StudentsByAge;
import ru.skypro.homework_4_1_sql_2.repository.StudentsByCategory;
import ru.skypro.homework_4_1_sql_2.services.StudentService;
import ru.skypro.homework_4_1_sql_2.exceptions.EntityNotFoundException;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {

        this.repository = repository;
    }


    @Override
    public Student add(Student student) {

        return repository.save(student);
    }

    @Override
    public Student remove(Long id) {
        Student student = get(id);
        repository.deleteById(id);
        return student;
    }

    @Override
    public Student update(Student student) {
        Student existedStudent = get(student.getId());
        return repository.save(student);
    }

    @Override
    public Student get(Long id) {
        Optional<Student> student = repository.findById(id);

        if (student.isPresent()) {
            return student.get();
        } else {
            throw new EntityNotFoundException();
        }
    }

    @Override
    public Collection<Student> getByAge(Integer startAge, Integer endAge) {
        checkAge(startAge);
        checkAge(endAge);
        return repository.findStudentsByAgeBetween(startAge, endAge);
    }

    private void checkAge(Integer age) {
        if (age <= 10 || age >= 80) {
            throw new IllegalArgumentException("INCORRECT STUDENT AGE");
        }
    }

    @Override
    public Collection<Student> getAll() {

        return repository.findAll();
    }

    @Override
    public Integer amountOfStudents() {
        return repository.getAmountOfStudents().size();
    }


    @Override
    public List<StudentsByAge> getAverageStudentAge() {
        return repository.getAverageStudentAge();


    }

    @Override
    public List<StudentsByCategory> gettingListOfStudents() {
        return repository.getStudentsByCategory();
    }
}