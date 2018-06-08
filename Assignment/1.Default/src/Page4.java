

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page4
 */
@WebServlet("/Page4")
public class Page4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>");
		out.println("<form action=\"Page4\" method=\"post\" >");
		String fname =request.getParameter("firstname");
		 String lname =request.getParameter("lastname");
		 String state =request.getParameter("state");
		 String city =request.getParameter("city");
		 String phone =request.getParameter("phone");
		 String email =request.getParameter("email");
		 out.println("Fname     : " +fname + "<br>");
		 out.println("Lname     : " +lname + "<br>");
		 out.println("State     : " +state + "<br>");
		 out.println("City      : " +city + "<br>");
		 out.println("Phone     :" +phone + "<br>");
		 out.println("Email     :" +email + "<br>");
		 out.println("</form></h2></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
