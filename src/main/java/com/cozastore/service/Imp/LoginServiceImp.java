package com.cozastore.service.Imp;

import com.cozastore.payload.request.SignUpRequest;

public interface LoginServiceImp {

    boolean insertUser(SignUpRequest signUpRequest);

    int getUserIdByEmail(String userEmail);
}