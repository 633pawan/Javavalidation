package com.pakage.mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abyssibex.User;
import com.abyssibex.UserIO;

/**
 * Servlet implementation class ServletOne
 */
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// get parameters
		
	String firstName = request.getParameter("firstName");
	String lastName = request.getParameter("lastName");
	String emailAddress = request.getParameter("emailAddress");
	
	
	// get a real path
	ServletContext context  = getServletContext();
	String path = context.getRealPath("/WEB-INF/EmailList.txt");
	// using java object
	User user = new User(firstName,  lastName, emailAddress);
	UserIO.add(user, path);
	
	//Store the User Object in request object
	request.setAttribute("user", user);
	//forward request and response object to JSP page
	String url = "/display_email_entry.jsp";
	RequestDispatcher dispatcher =  getServletContext().getRequestDispatcher(url);
	dispatcher.forward(request, response);
	
	System.out.println("hello ");
	
	
	}

}
