package ithanh.ntu65133236.qlbh.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ithanh.ntu65133236.qlbh.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(String name);
}
