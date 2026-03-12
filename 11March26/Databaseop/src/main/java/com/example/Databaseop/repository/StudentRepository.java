package com.example.Databaseop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Databaseop.entity.Student;
public interface StudentRepository  extends JpaRepository<Student,Long>{

    
}
