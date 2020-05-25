package bsep.project.service;

import java.util.List;

import bsep.project.model.Authority;


public interface AuthorityService {
	List<Authority> findById(Long id);
	List<Authority> findByname(String name);
}
