package com.pinme.model;

public class Event {

	/**
	 * 
	 */
	private int id;
	private String startDateTime;
	private String endDateTime;
	private String description;
	private int tokenLimit;
	private boolean isTokenized;
	private int addressId;
	private String name;
	private int userId;
	private int categoryId;
	/**
	 * 
	 */
	public Event() {
		
	}
	/**
	 * @param startDateTime
	 * @param endDateTime
	 * @param description
	 * @param tokenLimit
	 * @param isTokenized
	 * @param addressId
	 * @param name
	 * @param userId
	 * @param categoryId
	 */
	public Event(String startDateTime, String endDateTime, String description, int tokenLimit, boolean isTokenized,
			int addressId, String name, int userId, int categoryId) {
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.description = description;
		this.tokenLimit = tokenLimit;
		this.isTokenized = isTokenized;
		this.addressId = addressId;
		this.name = name;
		this.userId = userId;
		this.categoryId = categoryId;
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
	 * @return the startDateTime
	 */
	public String getStartDateTime() {
		return startDateTime;
	}
	/**
	 * @param startDateTime the startDateTime to set
	 */
	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}
	/**
	 * @return the endDateTime
	 */
	public String getEndDateTime() {
		return endDateTime;
	}
	/**
	 * @param endDateTime the endDateTime to set
	 */
	public void setEndDateTime(String endDateTime) {
		this.endDateTime = endDateTime;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the tokenLimit
	 */
	public int getTokenLimit() {
		return tokenLimit;
	}
	/**
	 * @param tokenLimit the tokenLimit to set
	 */
	public void setTokenLimit(int tokenLimit) {
		this.tokenLimit = tokenLimit;
	}
	/**
	 * @return the isTokenized
	 */
	public boolean isTokenized() {
		return isTokenized;
	}
	/**
	 * @param isTokenized the isTokenized to set
	 */
	public void setTokenized(boolean isTokenized) {
		this.isTokenized = isTokenized;
	}
	/**
	 * @return the addressId
	 */
	public int getAddressId() {
		return addressId;
	}
	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
		
}
