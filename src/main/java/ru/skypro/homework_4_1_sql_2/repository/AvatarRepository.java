package ru.skypro.homework_4_1_sql_2.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.skypro.homework_4_1_sql_2.model.Avatar;

import java.util.List;
import java.util.Optional;

public interface AvatarRepository extends PagingAndSortingRepository<Avatar, Long> {



}
