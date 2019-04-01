

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiddenFormField
 */
@WebServlet("/HiddenFormField")
public class HiddenFormField extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HiddenFormField() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try
		{  
			response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        String n=request.getParameter("userName");  
	        out.print("<h2><center>Welcome "+n+"</h2>");  
	          
	        //creating form that have invisible textfield  
	        out.print("<form action='HiddenFormField.jsp'>");  
	        //out.print("<input type='hidden' name='uname' value='"+n+"'>");  
	        out.print("<center><input type='submit' value='Go Back'>");  
	        out.print("<h5><center> Note - \""+n+"\" is accesssed from session tracking using Hidden Form field</h5>");
	        
	        out.print("</form>");  
	        out.close();  
		}
		catch(Exception e)
		{
			System.out.println(e);
		} 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
