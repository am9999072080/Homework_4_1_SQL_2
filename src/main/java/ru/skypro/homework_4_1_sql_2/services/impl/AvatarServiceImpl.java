package ru.skypro.homework_4_1_sql_2.services.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework_4_1_sql_2.model.Avatar;
import ru.skypro.homework_4_1_sql_2.model.Student;
import ru.skypro.homework_4_1_sql_2.repository.AvatarRepository;
import ru.skypro.homework_4_1_sql_2.services.AvatarService;
import ru.skypro.homework_4_1_sql_2.services.StudentService;

import javax.persistence.EntityNotFoundException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.nio.file.StandardOpenOption.CREATE_NEW;

@Service
public class AvatarServiceImpl  {

}
