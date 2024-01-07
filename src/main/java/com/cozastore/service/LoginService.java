package com.cozastore.service;

import com.cozastore.entity.RoleEntity;
import com.cozastore.entity.UserEntity;
import com.cozastore.payload.request.SignUpRequest;
import com.cozastore.repository.UserRepository;
import com.cozastore.service.Imp.LoginServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements LoginServiceImp {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public boolean insertUser(SignUpRequest signUpRequest) {

        boolean isSuccess = false;

        UserEntity user = new UserEntity();

        user.setEmail(signUpRequest.getEmail());
        user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));
        user.setUsername(signUpRequest.getUserName());

        RoleEntity userRole = new RoleEntity();
        userRole.setId(1);
        user.setRole(userRole);
        try {
            userRepository.save(user);
            isSuccess = true;
        } catch (Exception e) {
            System.out.println("Them that bai " + e.getLocalizedMessage());

            isSuccess = false;
        }

        return isSuccess;
    }

    @Override
    public int getUserIdByEmail(String email) {
        UserEntity userEntity = userRepository.findByEmail(email);
        return userEntity != null ? userEntity.getId() : -1; // Trả về -1 nếu không tìm thấy người dùng
    }
}