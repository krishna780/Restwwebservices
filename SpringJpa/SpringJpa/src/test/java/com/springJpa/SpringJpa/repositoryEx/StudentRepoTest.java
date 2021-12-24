package com.springJpa.SpringJpa.repositoryEx;

import com.springJpa.SpringJpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepoTest {
   @Autowired
    private StudentRepo studentRepo;

    @Test
    public void saveStudent(){
        Student student=Student.builder()
                .firstName("krishna")
                .emailid("email")
                .gurdianEmail("sany")
                .gurdianPhone("anjsjd")
                .lastName("last00").gurdianName("gname")
                .build();
        studentRepo.save(student);
    }

}