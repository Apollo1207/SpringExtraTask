package ua.lviv.iot.first.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.first.business.SubjectService;
import ua.lviv.iot.first.rest.model.Subject;

import java.util.List;

@RequestMapping("/subject")
@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subject> findAllSubjects() {
        return subjectService.findAll();
    }
}
