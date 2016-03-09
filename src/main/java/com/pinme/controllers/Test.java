package com.pinme.controllers;

import com.pinme.dao.UserDao;
import com.pinme.model.Address;
import com.pinme.model.Event;
import com.pinme.model.EventCategory;
import com.pinme.model.User;

/**
 * @author Shivanagesh Chandra Mar 8, 2016 1:29:57 PM
 * fileTest.java
 */
public class Test {

	public static void loadData(){
		EventCategory ec = new EventCategory();
		ec.setDescription("Food distribution");
		ec.setName("Food");
		
		EventCategory ec1 = new EventCategory();
		ec.setDescription("Clothes distribution");
		ec.setName("Clothes");
		
		EventCategory ec2 = new EventCategory();
		ec.setDescription("Entertainment");
		ec.setName("Entertainment");
		int categoryId = CategoryController.getInstance().addtEvent(ec);
		
		int catgoryID2 =CategoryController.getInstance().addtEvent(ec1);
		CategoryController.getInstance().addtEvent(ec2);
		
		User us = new User("Shivangesh", "Chandra", "123456", "ch.shivanagesh@gmail.com", "848-333-1895");
		User us1= new User("Divya", "Chandra", "123456", "divya@gmail.com", "848-333-1895");
		int userId = UserController.getInstance().addUser(us);
		
		
		Event ev = new Event("03-12-2016 11:15:00 AM", "03-12-2016 11:15:00 PM", "food distribution", -1, false, -1, "Free meal", userId, categoryId);
		Event ev1 = new Event("03-13-2016 11:15:00 AM", "03-13-2016 11:15:00 PM", "food distribution", 100, true, -1, "Free", userId, categoryId);
		Event ev2 = new Event("03-12-2016 11:15:00 AM", "03-12-2016 11:15:00 PM", "food distribution", -1, false, -1, "Cloths distribution", userId, categoryId);
		Address ad = new Address("455", "431 El camino real", "Santa Clara", "CA", "95050", "USA", " ", " ");
		
		int EventId = EventController.getInstance().createEvent(ad, categoryId, ev);
		EventController.getInstance().createEvent(ad, catgoryID2, ev1);
		EventController.getInstance().createEvent(ad, catgoryID2, ev2);

		System.out.println("*************");
		System.out.println(EventController.getInstance().getEvents());
		System.out.println("----------------------");
		EventController.getInstance().pinEvent(userId, EventId);
	}
	

}
