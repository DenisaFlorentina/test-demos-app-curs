package test.demo.test.demoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.demo.test.demoapp.model.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
}
