package ua.lviv.iot.first.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.first.dataaccess.StudentRepository;
import ua.lviv.iot.first.rest.model.Students;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Students createStudent(Students student) {
        return studentRepository.save(student);
    }
}
