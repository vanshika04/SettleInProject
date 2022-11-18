package com.backend.application.model;

public class Users {
	String name;
	String password;
	String username;
	Integer contact;
	Integer id;
	String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getContact() {
		return contact;
	}
	public void setContact(Integer contact) {
		this.contact = contact;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Users(String name, String password, String username, Integer contact, Integer id, String email) {
		super();
		this.name = name;
		this.password = password;
		this.username = username;
		this.contact = contact;
		this.id = id;
		this.email = email;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Users [name=" + name + ", password=" + password + ", username=" + username + ", contact=" + contact
				+ ", id=" + id + ", email=" + email + "]";
	}
	
	

}
