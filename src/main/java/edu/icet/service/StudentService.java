package edu.icet.service;

import edu.icet.dto.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudents();
    Student getByName(String name);
    void addStudent(Student student);
    void deleteStudentById(Integer id);
    void updateStudent(Student student);

    Student findById(Integer id);
}
