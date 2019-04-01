

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FisrtAssignment
 */
@WebServlet("/FisrtAssignment")
public class FisrtAssignment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name="",address="",email="",mobileNo="";
	
		name = request.getParameter("name");
		address = request.getParameter("address");
		email = request.getParameter("email");
		
		mobileNo = request.getParameter("mobileNo");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("name", name);
		session.setAttribute("address", address);
		session.setAttribute("email", email);
		session.setAttribute("mobileNo", mobileNo);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("first.jsp");
		rd.include(request, response);
				
	}

}
