package com.cg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/page1")
public class page1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public page1() {
        super();
       
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
	    out.println("<form action=\"Secondpage\" method=\"post\" >");   
		out.println("Firstname:<input name=\"firstname\"type=\text\"><br>");
		out.println("Lastname:<input name=\"lastname\"type=\text\"><br>");
		
		
		
		out.println("<input type=\"submit\" value=\"Submit\">");
		
		out.println("</form>");
		out.println("</body></html>");
	}

	

}
