package com.coderscampus.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.coderscampus.domain.User;
import com.coderscampus.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}