package com.ravi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WelcomeServlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//Will be called when servlet would be destroyed by servlet-container
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		//Will be called first time when a request comes first time on servlet container (tomcat)
		System.out.println("Init method called");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		System.out.println("Request :"+request);
		System.out.println("Response :"+response);
		
		/*Enumeration<String>  parameterNames=request.getParameterNames();
		while(parameterNames.hasMoreElements()) {
			String key=parameterNames.nextElement();
			System.out.println("key:"+key);
			System.out.println("value:"+request.getParameter(key));
		}*/
		
		String firstNameFromRequest=request.getParameter("firstName");
		String lastNameFromRequest=request.getParameter("lastName");
		
		PrintWriter printWriter=response.getWriter();
		printWriter.println("Welcome to "+firstNameFromRequest+" "+lastNameFromRequest);
		
		
	}

	
	
}
