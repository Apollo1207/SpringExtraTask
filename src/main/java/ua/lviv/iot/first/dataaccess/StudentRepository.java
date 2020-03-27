package ua.lviv.iot.first.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.first.rest.model.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Integer> {
}
