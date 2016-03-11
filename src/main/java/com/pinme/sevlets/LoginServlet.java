package com.pinme.sevlets;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pinme.controllers.Test;
import com.pinme.controllers.UserController;
import com.pinme.model.User;
import com.pinme.util.JSonMapperSingleTon;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.getRequestDispatcher("index.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		
		String username = request.getParameter("userEmail");
		String password = request.getParameter("Password");

		response.setContentType("application/json");



		if (UserController.getInstance().authenticate(username, password)) {
			User us = UserController.getInstance().getUser(username, password);
			HttpSession session=request.getSession(true); 
			System.out.println("---------------------");
			System.out.println(session);
			System.out.println("---------------**-----");
			System.out.println(us);
			session.setAttribute("userid",us.getId()); 
		    session.setAttribute("first_name",us.getFirstName());
		    session.setAttribute("email", us.getEmail());
		          
		       
			response.setContentType("text/html");
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}else{
			response.setContentType("text/html");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

	}
}
