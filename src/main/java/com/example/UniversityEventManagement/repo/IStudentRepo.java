package com.example.UniversityEventManagement.repo;

import com.example.UniversityEventManagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student, Integer> {
}
