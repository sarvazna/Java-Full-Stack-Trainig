

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		PrintWriter out=response.getWriter();
		String State=request.getParameter("state");
		String City=request.getParameter("city");
		
		String Firstname=(String) session.getAttribute("firstname");
		String Lastname=(String) session.getAttribute("lastname");
		session.setAttribute("state", State);	
		session.setAttribute("city", City);		
		
		out.println("<html><body><h2>");
		out.println("<form action=\"Page4\" method=\"POST\">");
		out.println("Fname     : " +Firstname + "<br>");
		out.println("Lname     : " +Lastname + "<br>");
		out.println("State     : " +State + "<br>");
		out.println("City      : " +City + "<br>");
		out.println("Phone     : <input name=\"phone\" type=\"text\"><br>");
	    out.println("Email     : <input name=\"email\" type=\"text\"><br>");
		out.println("<input type=\"Submit\" value=\"Submit\">");
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
