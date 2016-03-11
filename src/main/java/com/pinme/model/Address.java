package com.pinme.model;

public class Address {


		private int id;
		private String houseNumber;
		private String street;
		private String city;
		private String state;
		private String zipcode;
		private String country;
		private String latitude;
		private String longitude;
		
		

	
	/**
		 * 
		 */
		public Address() {
			
		}





	/**
	 * @param houseNumber
	 * @param street
	 * @param city
	 * @param state
	 * @param zipcode
	 * @param country
	 * @param latitude
	 * @param longitude
	 */
	public Address(String houseNumber, String street, String city, String state, String zipcode, String country,
			String latitude, String longitude) {
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.latitude = latitude;
		this.longitude = longitude;
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
	 * @return the houseNumber
	 */
	public String getHouseNumber() {
		return houseNumber;
	}





	/**
	 * @param houseNumber the houseNumber to set
	 */
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}





	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}





	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}





	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}





	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}





	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}





	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}





	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}





	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}





	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}





	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}





	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}





	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}





	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}





	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
