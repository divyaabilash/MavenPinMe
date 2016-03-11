package com.pinme.controllers;

import java.security.MessageDigest;

import com.pinme.dao.UserDao;

import com.pinme.model.User;
import com.pinme.util.Encrypt;

/**
 * @author Shivanagesh Chandra Mar 7, 2016 11:06:59 PM
 * fileUserController.java
 */
public class UserController {

	private static UserController instance = null;
	private UserDao user;
	/**
	 * 
	 */
	public UserController() {
		// TODO Auto-generated constructor stub
		user =  new UserDao();
		
	}
	

	public static UserController getInstance() {
		if (instance == null) {
			instance = new UserController();
		}
		return instance;
	}
	
	public boolean authenticate(String email,String password){
		String passwordHash = Encrypt.getHash(password);
		if(user.getUserByEmail(email, passwordHash)	!= null){
			return true;
		}else{
			return false;
		}
	}
	
	public User getUser(String email,String password){
		String passwordHash = Encrypt.getHash(password);
		return user.getUserByEmail(email, passwordHash);
	}
	
	public int addUser(User newUser){
		newUser.setPassword(Encrypt.getHash(newUser.getPassword()));
		return user.addUser(newUser);
	}

}
