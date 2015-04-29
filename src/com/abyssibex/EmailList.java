package com.abyssibex;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmailList
 */
public class EmailList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		// get parameters from request
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String emailAddress = request.getParameter("emailAddress");

		//get relative file name
		ServletContext sc = getServletContext();
		String path = sc.getRealPath("/WEB_INF/EmailList.txt");

		// using regular java class
		User user = new User(firstName,lastName,emailAddress);
		UserIO.add(user, path);
		// send response to the browser
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!doctype html>\n"+   "<html>"+ "<head>"+"<body>\n"+
		"<title> Servlet Example</title>\n"+ "<h1>Thank your for joining</h1>\n"+
		"<table cellspacing=\"5\" cellpadding=\"5\" border = \"1\"\n>"+
				"<tr><td align=\"right\">First Name</td>\n"+"<td>"+firstName+"</td>\n"+
		"</tr>\n"+
		"<tr><td align=\"right\">Last Name</td>\n"+"<td>"+lastName+"</td>\n"+
		"</tr>\n"+
		"<tr><td align=\"right\">Email Address</td>\n"+"<td>"+emailAddress+"</td>\n"+
		"</tr>\n"+"</table>\n"+
		"</body>\n"+"</html>\n");

				

				
				
				
		
		
		
		
		
		
		
		
	}

}
