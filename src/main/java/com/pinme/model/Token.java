package com.pinme.model;


public class Token {

	private int tokenId;
	private int eventId;
	private int userID;
	private String dateAndTime;
	
	

	/**
	 * 
	 */
	public Token() {
		
	}

	/**
	 * @return the tokenId
	 */
	public int getTokenId() {
		return tokenId;
	}

	/**
	 * @param tokenId the tokenId to set
	 */
	public void setTokenId(int tokenId) {
		this.tokenId = tokenId;
	}

	/**
	 * @return the eventId
	 */
	public int getEventId() {
		return eventId;
	}

	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}

	/**
	 * @return the dateAndTime
	 */
	public String getDateAndTime() {
		return dateAndTime;
	}

	/**
	 * @param dateAndTime the dateAndTime to set
	 */
	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	/**
	 * @param eventId
	 * @param userID
	 * @param dateAndTime
	 */
	public Token(int eventId, int userID, String dateAndTime) {
		this.eventId = eventId;
		this.userID = userID;
		this.dateAndTime = dateAndTime;
	}
			

}
