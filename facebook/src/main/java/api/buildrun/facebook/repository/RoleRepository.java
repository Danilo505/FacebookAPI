package api.buildrun.facebook.repository;

import api.buildrun.facebook.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
