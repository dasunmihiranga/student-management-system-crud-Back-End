package edu.icet.service.impl;

import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    final StudentRepository repository;

    @Override
    public List<Student> getStudents() {
        return repository.findAll();
    }

    @Override
    public Student getByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public void addStudent(Student student) {
        repository.save(student);
    }

    @Override
    public void deleteStudentById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateStudent(Student student) {
        repository.save(student);
    }

    @Override
    public Student findById(Integer id) {
        return repository.findByid(id);
    }
}
