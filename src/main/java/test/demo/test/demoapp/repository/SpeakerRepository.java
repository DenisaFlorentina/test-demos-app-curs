package test.demo.test.demoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.demo.test.demoapp.model.Speaker;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
