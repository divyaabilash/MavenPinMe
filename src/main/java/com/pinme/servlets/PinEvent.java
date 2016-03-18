package com.pinme.servlets;

import com.pinme.controllers.EventController;
import com.pinme.model.*;
import com.pinme.util.EventUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Prathyusha CH
 */
@WebServlet("/PinEvent")
public class PinEvent extends HttpServlet {

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("UserId"));
        List<com.pinme.model.Event> userEvents = EventController.getInstance().getPinnedEvents(userId);
        response.setContentType("text/json");
        response.getWriter().write(EventUtil.populateJsonFromEvents(userEvents));
    }

    /**
     * @see HttpServlet#doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("UserId"));
        int eventId = Integer.parseInt(request.getParameter("EventId"));
        int result = EventController.getInstance().pinEvent(userId, eventId);
        response.setContentType("text/json");
        if(result > 0){
            response.getWriter().write("[{'Status':'Success'}]");
        } else{
            response.getWriter().write("[{'Status':'Fail'}]");
        }
    }

}