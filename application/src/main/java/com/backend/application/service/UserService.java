package com.backend.application.service;

import org.springframework.stereotype.Repository;

import com.backend.application.model.Response;

@Repository
public interface UserService {

	public Response loginValidation(String username, String password);
	
	
}
