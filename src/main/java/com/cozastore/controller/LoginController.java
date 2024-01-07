package com.cozastore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cozastore.entity.UserEntity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/signin")
    public String showLoginPage() {
        return "login"; // Trả về trang đăng nhập (login.html)
    }

    @PostMapping("/signin")
    public String login(@ModelAttribute(name="loginForm") UserEntity userEntity, Model m) {
     String uname = userEntity.getUsername();
     String pass = userEntity.getPassword();
     if(uname.equals("dienchau45@gmail.com") && pass.equals("123456")) {
      m.addAttribute("uname", uname);
      m.addAttribute("pass", pass);
      return "adminPage";
     }
     m.addAttribute("error", "Incorrect Username & Password");
     return "login";
     
    }

    @GetMapping("/index")
    public String showIndexPage() {
        return "index"; // Trả về trang chính (index.html) sau khi đăng nhập thành công
    }
}

