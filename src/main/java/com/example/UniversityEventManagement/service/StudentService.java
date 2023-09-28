package com.example.UniversityEventManagement.service;

import com.example.UniversityEventManagement.model.Department;
import com.example.UniversityEventManagement.model.Student;
import com.example.UniversityEventManagement.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "student added";
    }

    public void updateStudentDept(Integer studentId, Department studentDept) {
        Student student = studentRepo.findById(studentId).get();
        student.setDepartment(studentDept);
        studentRepo.save(student);
    }

    public void deleteStudent(Integer studentId) {
        studentRepo.deleteById(studentId);
    }

    public List<Student> getAllStudents() {
       return studentRepo.findAll();
    }

    public Student getStudent(Integer id) {
        return studentRepo.findById(id).get();
    }
}
