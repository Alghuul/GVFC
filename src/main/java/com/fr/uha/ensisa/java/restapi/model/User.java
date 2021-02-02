package com.fr.uha.ensisa.java.restapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "email" , unique =  true)
	private String email;
	@Column(name = "password" , nullable = false)
	private String password;
	@Column(name = "lastname" , nullable = false)
	private String lastname;
	@Column(name = "firstname" , nullable = false)
	private String firstname;
	
	public User() {
		
	}
	
	public User(String firstname,String lastname,String email, String password) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}
	
	public String getFirstName() {
		return this.firstname;
	}
	
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastName() {
		return this.lastname;
	}
	
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.firstname = firstname;
	}
	
}
