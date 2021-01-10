package test.demo.test.demoapp.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.demo.test.demoapp.login.model.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
