

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page1
 */
//@WebServlet("/Page1")
public class Page1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<html><body><h2>");
		out.println("<a href=\"http://10.102.50.21:8088/Page1/page1\">This is a link1</a>");
		
		//out.println("<form action=\"Page2\" method=\"POST\">");
		/*out.println("Fname <input name=\"firstname\" type=\"text\"><br>");
	    out.println("Lname <input name=\"lastname\" type=\"text\"><br>");*/
//	    ServletContext context=getServletContext();
		//out.println("<input type=\"Submit\" value=\"Submit\">");
		out.println("</h2></body></html>"); 
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		out.println("<html><body><h2>");
		
		out.println("<form action=\"Page2\" method=\"POST\">");
		out.println("Fname <input name=\"firstname\" type=\"text\"><br>");
	    out.println("Lname <input name=\"lastname\" type=\"text\"><br>");
	    out.println("<a href=\"http://localhost:8080/1.Default/Page1\">This is a link2</a>");
//	    ServletContext context=getServletContext();
		//out.println("<input type=\"Submit\" value=\"Submit\">");
		out.println("</form></h2></body></html>"); 
	}

}
