

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page3
 */
public class Page3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>");
		out.println("<form action=\"Page4\" method=\"post\" >");
		String fname =request.getParameter("firstname");
		 String lname =request.getParameter("lastname");
		 String state =request.getParameter("state");
		 String city =request.getParameter("city");
		 out.println("Fname <input name=\"firstname\" type=\"hidden\" value = "+fname+"><br>");
		 out.println("Lname <input name=\"lastname\" type=\"hidden\" value = "+lname+"><br>");
		 out.println("State <input name=\"state\" type=\"hidden\" value = "+state+"><br>");
		 out.println("City  <input name=\"city\" type=\"hidden\" value = "+city+"><br>");
		 out.println("Phone <input name=\"phone\" type=\"text\"><br>");
		 out.println("Email <input name=\"email\" type=\"text\"><br>");
		 out.println("<input type=\"submit\" name=\"Submit\" Value =\"Submit\">");
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
