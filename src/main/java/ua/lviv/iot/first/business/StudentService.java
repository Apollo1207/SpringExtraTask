package ua.lviv.iot.first.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.first.dataaccess.StudentRepository;
import ua.lviv.iot.first.rest.model.Students;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Students createStudent(Students student) {
        return studentRepository.save(student);
    }
    public Students updateStudent(Students students, String id){
        String query = "select * from students where id=:id";
        String finalQuery = query + id;
        return null;
    }
    public List<Students> findAll(){
        return studentRepository.findAll();
    }
}
