

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
 * Servlet implementation class ValidateForm
 */
public class ValidateForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateForm() {
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
		
		
		// Gets the form element
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String emailAddress = request.getParameter("emailAddress");
        
  
  // Stores the request paramaters in user object      
       User user = new User(firstName, lastName,emailAddress);
       
   //  validates the form element
       String message ="";
       String url = "";
       
       
     if(firstName.length()==0 || lastName.length()==0||emailAddress.length()
        ==0){
         message = "Please  fill out all the forms given";
         url ="/join_email_list.jsp";
         
     }  
     else{
         
        message ="";
       ServletContext  context = getServletContext();
        String path = context.getRealPath("/WEB-INF/display_email_list.jsp");
        UserIO.add(user, path);
        url="/display_email_entry.jsp";
        
        
        
        
     
     } 
    // getting the user object and message string and storing in request object
    request.setAttribute("user", user);
    request.setAttribute("message", message);
    
    
  // forward the request
    
    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
 dispatcher.forward(request,response);
    
    
    
    
		
		
		
		
	}

}
