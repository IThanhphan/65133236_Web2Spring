package ithanh.ntu65133236.qlbh.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ithanh.ntu65133236.qlbh.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
}