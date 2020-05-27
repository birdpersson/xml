package bsep.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bsep.project.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
	Authority findByName(String name);
}
