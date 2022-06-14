package com.matrix.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;


@Component(immediate = true, service = Servlet.class, property= {
		"sling.servlet.paths=/bin/matrix/enquiry",
		"sling.servlet.methods=GET"
})
public class EnquiryFormServlet  extends SlingSafeMethodsServlet{

	private static final long serialVersionUID = 3771590860873844160L;
	
	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String country = request.getParameter("country");
		StringBuilder sb = new StringBuilder();
		sb.append("<h4>Thanks for submitting the form. <br>");
		sb.append("The form has been submitted with following values :<br>");
		sb.append("First Name : "+fname+"<br>");
		sb.append("Last Name : "+lname+"<br>");
		sb.append("Country Name : "+country+"<br>");
		sb.append("We will reach you shortly with a customized plan</h4>");
		response.setContentType("text/html");
		response.getWriter().write(sb.toString());
	}
	
	

}
