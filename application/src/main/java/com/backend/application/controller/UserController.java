package com.backend.application.controller;

import java.net.http.HttpRequest;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.application.model.Response;
import com.backend.application.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping(value = "/healthCheck")
	public String healthCheck() {
		return "Success";
	}
	
	@PostMapping(
			 consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
		     produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Response UserLogin(@RequestBody HashMap data) {
		Response res = userservice.loginValidation((String)data.get("email"), (String)data.get("password"));
		return res;
	}

}
