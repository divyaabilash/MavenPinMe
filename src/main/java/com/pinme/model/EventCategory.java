package com.pinme.model;

/**
 * @author Shivanagesh Chandra Mar 8, 2016 12:53:56 AM
 * fileEventCategory.java
 */
public class EventCategory {

	private int id;
	private String description;
	private String name;
	
	
	
	/**
	 * 
	 */
	public EventCategory() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param description
	 * @param name
	 */
	public EventCategory(String description, String name) {
		this.description = description;
		this.name = name;
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

}
