package com.spring.security.service;

import java.util.List;

import com.spring.security.dto.UserDto;
import com.spring.security.entity.User;

public interface UserService {

	void saveUser(UserDto userdto);
	
	User findUserByEmail(String email);
	
	List<UserDto> findAllUsers();
}
