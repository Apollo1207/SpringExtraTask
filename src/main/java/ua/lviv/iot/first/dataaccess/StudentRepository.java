package ua.lviv.iot.first.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.first.rest.model.Students;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Students, Integer> {
    List<Students> findAllByFirstName(String firstName);
}
