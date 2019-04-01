

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class URLRewriting2
 */
@WebServlet("/URLRewriting2")
public class URLRewriting2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public URLRewriting2() {
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
			HttpSession session = request.getSession();
			
			//getting value from the query string  
			String n=(String) session.getAttribute("uname");  
			out.print("<center>Hello "+n); 
			 out.print("<h5><center> Note - \""+n+"\" is accesssed from session tracking using URL Rewriting</h5>");
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
