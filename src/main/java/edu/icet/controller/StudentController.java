package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    final StudentService service;

    @GetMapping
    public List<Student> getStudents() {
        return service.getStudents();}
    @GetMapping("/{id}")
    public Student searchStudent(@PathVariable Integer id) {
        return service.findById(id);
    }


    @PostMapping
    public void addStudent(@RequestPart("image") MultipartFile file, @RequestPart("student") Student student) throws IOException {
        student.setImage(file.getBytes());
        service.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Integer id){
        service.deleteStudentById(id);
    }

    @PutMapping
    public void updateStudent(@RequestBody Student student){
        //student.setImage(student.getImage()); //-------->>>>>>>>>>>>>>>>>>  </html>  <<<<<<<<<<<<<<<<<<<<<<<<<<--------
        service.updateStudent(student);
    }

    @PutMapping("/image")
    private void updateStudent(@RequestPart("image") MultipartFile file,@RequestPart("student") Student student) throws IOException {
        student.setImage(file.getBytes());
        service.updateStudent(student);
    }


}
