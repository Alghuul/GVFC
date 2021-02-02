package com.fr.uha.ensisa.java.restapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
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
	
}
