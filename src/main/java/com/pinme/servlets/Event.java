package com.pinme.servlets;

import com.pinme.controllers.EventController;
import com.pinme.model.Address;
import com.pinme.model.*;
import com.pinme.util.EventUtil;
import com.pinme.util.MySqlUtil;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Event
 */
@WebServlet("/Event")
public class Event extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Event() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String eventIdStr = request.getParameter("event_id");
        if(eventIdStr != null){
            // Just edit the given event id
            int eventId = Integer.parseInt(eventIdStr);
            com.pinme.model.Event event = EventController.getInstance().getEventByEventId(eventId);
            if(event.getTokenLimit() > 0){
                event.setTokenized(true);
            }
            String uiDateStr = event.getFormattedDate();
            Address address = EventController.getInstance().getEventAddress(event);
            EventCategory eventCategory = EventController.getInstance().getEventCategoryById(event.getCategoryId());
            response.setContentType("text/html");
            request.setAttribute("event", event);
            request.setAttribute("address", address);
            request.setAttribute("eventCategory", eventCategory);
            request.getRequestDispatcher("editAd.jsp").forward(request, response);
        } else{
            // Fetch all events
            List<com.pinme.model.Event> userEvents = EventController.getInstance().getEvents();
            response.setContentType("text/json");
            response.getWriter().write(EventUtil.populateJsonFromEvents(EventUtil.filterNonExpiredEvents(userEvents)));
        }
    }



    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	
         
    	HttpSession userSesstion = request.getSession(true);
        int userId = (int)userSesstion.getAttribute("userid");
        String firstName = (String)userSesstion.getAttribute("first_name");
        String email = (String)userSesstion.getAttribute("email");

        String eventId = (String)request.getParameter("eventId");
        String addressId = (String)request.getParameter("addressId");
        String categoryId = (String)request.getParameter("categoryId");

        if(eventId != null && addressId != null){
            Address address = getEventAddress(request);
            address.setId(Integer.parseInt(addressId));
            com.pinme.model.Event event = getEvent(request, userId);
            event.setId(Integer.parseInt(eventId));
            event.setAddressId(address.getId());
            int result = EventController.getInstance().updateEvent(address, event.getCategoryId(), event);
            if(result < 0){
                userSesstion.setAttribute("event-update-error", "Internal Error: Unable to update event!");
                response.setContentType("text/html");
                request.getRequestDispatcher("home.jsp").forward(request, response);

            }  else{
                response.setContentType("text/html");
                request.getRequestDispatcher("MyEvents.jsp").forward(request, response);
            }

        } else{
            // Check if the user is logged in
            if(userId > 0 && firstName != null && email != null){
                Address address = getEventAddress(request);
                com.pinme.model.Event event = getEvent(request, userId);
                int result = EventController.getInstance().createEvent(address, event.getCategoryId(), event);
                if(result < 0){
                    userSesstion.setAttribute("event-create-error", "Internal Error: Unable to post event!");
                    response.setContentType("text/html");
                    request.getRequestDispatcher("postAd.jsp").forward(request, response);
                } else{
                    response.setContentType("text/html");
                    request.getRequestDispatcher("home.jsp").forward(request, response);
                }
            }
            request.getRequestDispatcher("home.jsp").forward(request, response);
        }
    	response.sendRedirect("/pinme/home.jsp");

        // TODO Auto-generated method stub
//                doGet(request, response);
    }

    private com.pinme.model.Event getEvent(HttpServletRequest request, int userId){
        String eventName = request.getParameter("event");
        String eventDate = request.getParameter("eventdate");
        String eventTime = request.getParameter("eventtime");


        String category = request.getParameter("Catergory");
        // Fetch event category id from the DB
        int eventCategoryId = EventController.getInstance().getEventCategoryByName(category).getId();
        String settingLimit = request.getParameter("settinglimit");
        System.out.println("settingLimit" + settingLimit);
//        if(settingLimit )
        String maxLimitValue = request.getParameter("limit");
        String description = request.getParameter("description");
        String eventDateTimeStr = MySqlUtil.getMySqlDateTimeStr(eventDate, eventTime, 0);
        // Randomly generating end time
        String eventEndTimeStr = MySqlUtil.getMySqlDateTimeStr(eventDate, eventTime, new Random().nextInt(10));

        com.pinme.model.Event event = new com.pinme.model.Event(eventDateTimeStr, eventEndTimeStr,
                description,
                maxLimitValue != null && maxLimitValue.length() > 0 ? Integer.parseInt(maxLimitValue) : 0,
                settingLimit.equals("yes") ? true:false, -1, eventName, userId, eventCategoryId);

        if(!event.isTokenized()){
            event.setTokenLimit(0);
        }

        return event;
    }

    private Address getEventAddress(HttpServletRequest request){
        // Location Details
        String addressLine = request.getParameter("address");
        String city = request.getParameter("city");
        String zipCode = request.getParameter("zipcode");
        String landMarks = request.getParameter("landmarks");

        String houseNumber = new Integer(new Random().nextInt(1000)).toString();
        Address address = new Address(houseNumber, addressLine, city, landMarks,
                zipCode, "USA", "37.354108", "-121.955236" );

        return address;
    }

}
