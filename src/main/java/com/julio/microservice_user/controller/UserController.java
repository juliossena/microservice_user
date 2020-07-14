package com.julio.microservice_user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.julio.microservice_user.external.dto.request.CredenciaisDTO;
import com.julio.microservice_user.external.entity.User;
import com.julio.microservice_user.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<User> login(@RequestBody final CredenciaisDTO credenciais) {
        return ResponseEntity.ok(service.login(credenciais));
    }



}
