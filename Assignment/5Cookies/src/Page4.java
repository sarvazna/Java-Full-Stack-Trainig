

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
		PrintWriter out=response.getWriter();
		
		String Phone=request.getParameter("phone");
		String Email=request.getParameter("email");
		/*String Firstname=(String) session.getAttribute("firstname");
		String Lastname=(String) session.getAttribute("lastname");
		String State = (String) session.getAttribute("state");	
		String City=(String) session.getAttribute("city");*/
		Cookie ck=new Cookie("phone",Phone);//creating cookie object  
	    response.addCookie(ck);//adding cookie in the response  
	    Cookie ck1=new Cookie("email",Email);//creating cookie object  
	    response.addCookie(ck1);//adding cookie in the response
	    Cookie ck2[]=request.getCookies();
		
		out.println("<html><body><h2>");
		out.println("Fname     : " +ck2[0].getValue() + "<br>");
		out.println("Lname     : " +ck2[1].getValue() + "<br>");
		out.println("State	   : " +ck2[2].getValue() + "<br>");
		out.println("City	   : " +ck2[3].getValue() + "<br>");
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
