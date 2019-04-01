

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Arithmetic
 */
@WebServlet("/Arithmetic")
public class Arithmetic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    		int x=Integer.parseInt(request.getParameter("num1"));
			int y=Integer.parseInt(request.getParameter("num2"));
			int result;
			
			
			PrintWriter pr = response.getWriter();
			System.out.println("Math value ="+request.getParameter("math"));
			
			if(request.getParameter("math").equals("Addidtion"))
			{
				result = x+y;
				pr.println("<center><h2>Addistion is = "+result+"</h2>");
			}
			else if(request.getParameter("math").equals("Subtraction"))
			{
				result = x-y;
				pr.println("<center><h2>Subtraction is = "+result+"</h2>");
			}
			else if(request.getParameter("math").equals("Multiplication"))
			{
				result = x*y;
				pr.println("<center><h2>Multiplication is = "+result+"</h2>");
			}
			else
			{
				result = x/y;
				pr.println("<center><h2>Division is = "+result+"</h2>");
				
			}		
	}

}
