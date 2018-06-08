

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Page2
 */
public class Page2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		PrintWriter out=response.getWriter();
		String Firstname=request.getParameter("firstname");
		String Lastname=request.getParameter("lastname");
		session.setAttribute("firstname", Firstname);
		session.setAttribute("lastname", Lastname);
	
		out.println("<html><body><h2>");
		out.println("<form action=\"Page3\" method=\"POST\">");
		out.println("Fname     : " +Firstname + "<br>");
		out.println("Lname     : " +Lastname + "<br>");
		out.println("State     : <input name=\"state\" type=\"text\"><br>");
	    out.println("City      : <input name=\"city\" type=\"text\"><br>");
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
