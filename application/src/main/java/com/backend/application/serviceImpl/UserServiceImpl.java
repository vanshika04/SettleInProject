package com.backend.application.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.backend.application.constants.AuditConstants;
import com.backend.application.dbutil.DBUtil;
import com.backend.application.model.Response;
import com.backend.application.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	Connection connection;
	Response response = new Response();
	public UserServiceImpl() throws SQLException {
		connection = DBUtil.getConnection();
	}
	@Override
	public Response loginValidation(String email, String password) {
		try {
			PreparedStatement statement = connection.prepareStatement("SELECT * from Users WHERE email = '"+email+"'");
			ResultSet rs = statement.executeQuery();
			while(rs.next())
			{
				if(rs.getString(3).equals(email) && rs.getString(6).equals(password)) {
					response.setStatus(AuditConstants.SUCCESS);
				}else if(rs.getString(3).equals(email)&& !rs.getString(6).equals(password)) {
					response.setStatus(AuditConstants.WRONG_PASSWORD);
				}
				else {
					response.setStatus(AuditConstants.FAILURE);
					System.out.println("Invalid username/password"+rs.getString(6));
				}
			}
		} catch (Exception e) {
			response.setStatus(AuditConstants.FAILURE);
			e.printStackTrace();
		}
		
		return response;
	}

	
}
