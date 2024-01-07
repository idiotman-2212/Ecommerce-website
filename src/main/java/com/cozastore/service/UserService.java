package com.cozastore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cozastore.entity.RoleEntity;
import com.cozastore.entity.UserEntity;
import com.cozastore.payload.request.SignUpRequest;
import com.cozastore.repository.RoleRepository;
import com.cozastore.repository.UserRepository;
import com.cozastore.service.Imp.UserServiceImp;
import com.cozastore.util.TbConstants;

import java.util.Collections;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Service
public class UserService implements UserServiceImp {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserEntity findByEmail(String email) {
	    return userRepository.findByEmail(email);
	}

	

	@Override
	public boolean checkPasswordUser(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkUserByEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public void saveUser(SignUpRequest signUpRequest) {
		// TODO Auto-generated method stub
		
	}
	
}
