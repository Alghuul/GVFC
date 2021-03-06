package com.fr.uha.ensisa.java.restapi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User implements Serializable {

private static final long serialVersionUID = -1798070786993154676L;
	
	@Id
	@Column(name = "user_id" , unique =  true)
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	
	

	@Column(name = "email", unique = true, nullable = false)
	private String email;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "lastname", nullable = false)
	private String lastname;
	
	@Column(name = "firstname", nullable = false)
	private String firstname;
	
	
	public User(String email, String password, String lastname, String firstname) {

		this.email = email;
		this.password = password;
		this.lastname = lastname;
		this.firstname = firstname;
	}

	public User() {
		
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
		this.password = password;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
}
