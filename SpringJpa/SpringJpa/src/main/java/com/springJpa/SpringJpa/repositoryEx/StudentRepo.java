package com.springJpa.SpringJpa.repositoryEx;

import com.springJpa.SpringJpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
}
