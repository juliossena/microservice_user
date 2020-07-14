package com.julio.microservice_user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julio.microservice_user.exception.ObjectNotFoundException;
import com.julio.microservice_user.external.dto.request.CredenciaisDTO;
import com.julio.microservice_user.external.entity.User;
import com.julio.microservice_user.external.repository.UserRepository;
import com.julio.microservice_user.utils.PasswordUtils;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;
    
    public User login(final CredenciaisDTO credenciais) {
    	Optional<User> user = userRepository.findByEmailAndPassword(credenciais.getEmail(),
    			PasswordUtils.getSHA512(credenciais.getPassword()));
    	if (user.isPresent()) {
    		return user.get();
    	}
    	throw new ObjectNotFoundException("Sala não encontrada");
    }


}
