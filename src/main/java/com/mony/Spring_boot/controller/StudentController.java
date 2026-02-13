package com.mony.Spring_boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController<StudentRepository, Student> {

    private final StudentRepository repo;

    public StudentController(StudentRepository repo) {
        this.repo = repo;
    }

    // CREATE
    @PostMapping
    public Student create(@RequestBody Student student) {
        return ((Object) repo).save(student);
    }

    // READ ALL
    @GetMapping
    public List<Student> getAll() {
        return ((Object) repo).findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return ((Object) repo).findById(id).orElse(null);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student s) {
        Student student = repo.findById(id).orElse(null);
        if (student != null) {
            student.setName(s.getName());
            student.setAge(s.getAge());
            return repo.save(student);
        }
        return null;
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        repo.deleteById(id);
        return "Deleted!";
    }
}
