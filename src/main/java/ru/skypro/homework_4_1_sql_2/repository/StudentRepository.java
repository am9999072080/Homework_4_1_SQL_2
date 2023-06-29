package ru.skypro.homework_4_1_sql_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.skypro.homework_4_1_sql_2.model.Student;
import ru.skypro.homework_4_1_sql_2.services.StudentService;

import java.util.Collection;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Collection<Student> findStudentsByAgeBetween(Integer startAge, Integer endAge);

    @Query(value = "select count(*) from students", nativeQuery = true)
    Integer getCount();

    @Query(value = "select avg(age) from students", nativeQuery = true)
    Float getAverageAge();

    @Query(value = "select * from students order by id desc limit 5", nativeQuery = true)
    List<Student> getLastFive();
}