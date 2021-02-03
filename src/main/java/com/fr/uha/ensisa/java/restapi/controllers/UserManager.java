package com.fr.uha.ensisa.java.restapi.controllers;

import java.util.List;

import com.fr.uha.ensisa.java.restapi.dao.DAOUser;
import com.fr.uha.ensisa.java.restapi.model.User;

public class UserManager {
	static DAOUser daoUser = new DAOUser();
	
	public static List<User> getUsers() {
		List<User> lv = daoUser.getAll();
		return lv;
	}

	public static User getUser(String login) {
		if (login == null)
			return null;

		User u = daoUser.findByid(login);
		return u;
	}

	public static User login(String login, String password) {
		User u = daoUser.findByid(login);
		if (u != null && u.getPassword().equals(password))
			return u;
		return null;
	}

	public static boolean createUser(User user) {
		User u = daoUser.findByid(user.getUser_id());
		if (u == null) {
			daoUser.add(user);
			return true;
		}
		return false;
	}

	public static boolean deleteUser(int userID) {
		User u = daoUser.findByid(userID);
		if (u == null) {
			daoUser.delete(userID);
			return true;
		}
		return false;
		
	}

}
