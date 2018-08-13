package com.ravi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class BloodDorServices extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
		//Set Response Content type , in our case text/html		
		response.setContentType("text/html");
		
		String userName=request.getParameter("userName");
		
		PrintWriter printWriter=response.getWriter();
		printWriter.print("<html><body>");
		printWriter.print("<h1>"+userName+" is a dude!</h1>");
		printWriter.print("</body>");
		printWriter.print("</html>");
		
		printWriter.println();		
	}

}
