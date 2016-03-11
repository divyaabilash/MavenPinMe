  <%  if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
	  System.out.println(session.getAttribute("userid"));
	 response.sendRedirect("index.jsp");
	}  
%>