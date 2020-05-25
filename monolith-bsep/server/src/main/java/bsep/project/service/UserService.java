package bsep.project.service;

import java.util.List;

import bsep.project.model.User;
import bsep.project.model.UserRequest;

public interface UserService {
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll ();
	User save(UserRequest userRequest);
}
