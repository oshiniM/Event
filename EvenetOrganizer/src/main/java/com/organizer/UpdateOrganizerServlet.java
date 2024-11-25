package com.organizer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateOrganizerServlet")
public class UpdateOrganizerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("orgid");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String contact_no = request.getParameter("contact_no");
		String email = request.getParameter("email");
		String experience_year = request.getParameter("experience_year");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		boolean isTrue;
		
		isTrue = OrganizerDBUtil.updateorganizer(id, name, age, contact_no, email, experience_year, username, password);
		
		if(isTrue == true) {
			
			List<Organizer> orgDetails = OrganizerDBUtil.getOrganizerDetails();
			request.setAttribute("orgDetails", orgDetails); 
			
			RequestDispatcher dis = request.getRequestDispatcher("organizeraccount.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<Organizer> orgDetails = OrganizerDBUtil.getOrganizerDetails();
			request.setAttribute("orgDetails", orgDetails); 
			
			RequestDispatcher dis = request.getRequestDispatcher("organizeraccount.jsp");
			dis.forward(request, response);
			
		}
		
	}
	
}
