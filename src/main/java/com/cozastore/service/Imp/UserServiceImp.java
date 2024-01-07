package com.cozastore.service.Imp;

import com.cozastore.entity.UserEntity;
import com.cozastore.payload.request.SignUpRequest;

public interface UserServiceImp {

	 UserEntity findByEmail(String email);
	 
	 void saveUser(SignUpRequest signUpRequest);
	 
	 boolean checkPasswordUser(String email, String password);
	 
	 boolean checkUserByEmail(String email);
	 
}
