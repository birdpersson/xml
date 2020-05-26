package bsep.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bsep.project.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
