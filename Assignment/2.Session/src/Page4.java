

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Page4
 */
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
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		PrintWriter out=response.getWriter();
		
		String Phone=request.getParameter("phone");
		String Email=request.getParameter("email");
		String Firstname=(String) session.getAttribute("firstname");
		String Lastname=(String) session.getAttribute("lastname");
		String State = (String) session.getAttribute("state");	
		String City=(String) session.getAttribute("city");	
		
		out.println("<html><body><h2>");
		out.println("Fname     : " +Firstname + "<br>");
		out.println("Lname     : " +Lastname + "<br>");
		out.println("State	   : " +State + "<br>");
		out.println("City	   : " +City + "<br>");
		out.println("Phone	   : " +Phone + "<br>");
		out.println("Email	   : " +Email + "<br>");
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
