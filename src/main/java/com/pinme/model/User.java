package com.pinme.model;

public class User {

	private int id;
	
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	
	
	private String  phoneNumber;
	private String sinceInternal;
	
	/**
	 * 
	 */
	public User() {
		
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param password
	 * @param email
	 * 
	 */
	public User(String firstName, String lastName, String password, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param password
	 * @param email
	 * @param phoneNumber
	 */
	public User(String firstName, String lastName, String password, String email, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param username
	 * @param password
	 * @param email
	 * @param phoneNumber
	 * @param sinceInternal
	 */
	public User(String firstName, String lastName, String username, String password, String email, String phoneNumber,
			String sinceInternal) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.sinceInternal = sinceInternal;
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the sinceInternal
	 */
	public String getSinceInternal() {
		return sinceInternal;
	}
	/**
	 * @param sinceInternal the sinceInternal to set
	 */
	public void setSinceInternal(String sinceInternal) {
		this.sinceInternal = sinceInternal;
	}
		
}
