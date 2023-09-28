package com.example.UniversityEventManagement.controller;

import com.example.UniversityEventManagement.model.Department;
import com.example.UniversityEventManagement.model.Student;
import com.example.UniversityEventManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PutMapping("/updateDept/id/{studentId}/department/{studentDepartment}")
    public  String updateDept(@PathVariable Integer studentId, @PathVariable Department studentDepartment){
        studentService.updateStudentDept(studentId, studentDepartment);
        return "student department updated";
    }

    @DeleteMapping("/deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable Integer studentId){
        studentService.deleteStudent(studentId);
        return "student deleted";
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudent/id/")
    public Student getStudent(@RequestParam Integer id){
        return studentService.getStudent(id);
    }
}
