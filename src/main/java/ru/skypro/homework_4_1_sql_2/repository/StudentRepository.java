package ru.skypro.homework_4_1_sql_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.skypro.homework_4_1_sql_2.model.Student;

import java.util.Collection;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Collection<Student> findStudentsByAgeBetween(Integer startAge, Integer endAge);


    @Query(value = "SELECT  COUNT(age) as age FROM students GROUP BY students", nativeQuery = true)
    List<StudentsByAge> getAmountOfStudents();


    @Query(value = "SELECT  AVG(age) as age FROM students", nativeQuery = true)
    List<StudentsByAge> getAverageStudentAge();

    @Query(value = "SELECT  id , name, age FROM students ORDER BY id OFFSET 5", nativeQuery = true)
    List<StudentsByCategory> getStudentsByCategory();

}