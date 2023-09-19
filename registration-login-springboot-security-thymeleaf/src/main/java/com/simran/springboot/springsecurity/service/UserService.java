package com.simran.springboot.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.simran.springboot.springsecurity.model.User;
import com.simran.springboot.springsecurity.web.dto.*;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}