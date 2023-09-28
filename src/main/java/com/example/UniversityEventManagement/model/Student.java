package com.example.UniversityEventManagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student {

    @Id
    private Integer studentId;

    @NotBlank
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$", message = "First name  start  should be  capital latter ")
    private String firstName;
    private String lastName;

    @Min(value = 18, message = "Age should be greater than or equal to 18")
    @Max(value = 25, message = "Age should be less than or equal to 25")
    private Integer age;

    @Enumerated(EnumType.STRING)
    private Department department;
}
