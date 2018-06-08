

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page4
 */
//@WebServlet("/Page4")
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
		PrintWriter out=response.getWriter();
		
		String Phone=request.getParameter("phone");
		String Email=request.getParameter("email");
		
		ServletContext context=getServletContext();
		String Firstname=(String) context.getAttribute("firstname");
		String Lastname=(String) context.getAttribute("lastname");
		
		String State = (String) context.getAttribute("state");	
		String City=(String) context.getAttribute("city");	
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
