

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fibonacci
 */
@WebServlet("/Fibonacci")
public class Fibonacci extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
int number = Integer.parseInt(request.getParameter("number"));
		
		
		int a = 0;
		int b = 0;
		int c = 1;
		String ans="Fibonacci Numbers :";
		
        for(int i = 1; i <= number; i++)
        {
            a = b;
            b = c;
            c = a + b;

            ans +="\n"+a;
            System.out.print(a+" ");

        }
		
		request.getSession().setAttribute("series", ans);
		
		RequestDispatcher rd = request.getRequestDispatcher("fibonacci.jsp");
		rd.include(request, response);
		
	}

	

}
