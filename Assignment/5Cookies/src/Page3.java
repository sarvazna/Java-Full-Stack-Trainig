

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page3
 */
@WebServlet("/Page3")
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
		PrintWriter out=response.getWriter();
		String State=request.getParameter("state");
		String City=request.getParameter("city");
		//ServletContext context=getServletContext();
		/*String Firstname=(String) context.getAttribute("firstname");
		String Lastname=(String) context.getAttribute("lastname");
		context.setAttribute("state", State);	
		context.setAttribute("city", City);	*/
		Cookie ck=new Cookie("state",State);//creating cookie object  
	    response.addCookie(ck);//adding cookie in the response  
	    Cookie ck1=new Cookie("city",City);//creating cookie object  
	    response.addCookie(ck1);//adding cookie in the response
	    Cookie ck2[]=request.getCookies();
		out.println("<html><body><h2>");
		out.println("<form action=\"Page4\" method=\"POST\">");
		out.println("Fname     : " +ck2[0].getValue() + "<br>");
		out.println("Lname     : " +ck2[1].getValue() + "<br>");
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
