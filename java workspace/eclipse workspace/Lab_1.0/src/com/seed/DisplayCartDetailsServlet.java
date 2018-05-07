package com.seed;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.catalina.connector.Request;

//	TODO:1 Make DisplayCartDetailsServlet as a HttpServlet

public class DisplayCartDetailsServlet extends HttpServlet{
//	TODO:2 	Provide call-back method (called by web container) for HTTP request made using HTTP GET method

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String[] names = request.getParameterValues("bookName");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<table>");
		out.println("<th>BookName</th>");
		
		
		//	TODO:3	This method should read products selected by web-client from bookCatelogue.html and 
//						display them in tabular format as html response to the web client.	
		for(int i=0;i<names.length;i++){
			out.println("<tr>");
			out.println("<td>"+names[i]+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body></html>");
		} 
}









