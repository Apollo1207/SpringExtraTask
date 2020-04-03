package ua.lviv.iot.first.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.first.business.StudentService;
import ua.lviv.iot.first.rest.model.Students;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/students")
@RestController
public class StudentController {
    private Map<Integer, Students> students = new HashMap<>();
    private AtomicInteger idCounter = new AtomicInteger();

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Students> getStudents() {
        return studentService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Students getStudent(@PathVariable("id") Integer studentId) {
        return students.get(studentId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public Students createStudent(final @RequestBody Students student) {
        return studentService.createStudent(student);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Students> deleteStudents(@PathVariable("id") Integer studentId) {
        HttpStatus status = students.remove(studentId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "/{id}")
    public Students updateStudent(final @PathVariable("id") Integer studentId, final @RequestBody Students student) {
        student.setId(studentId);
        return students.put(studentId, student);
    }
}

