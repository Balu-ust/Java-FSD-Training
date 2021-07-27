package com.ust.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestParam
 */
@WebServlet("/RequestParam")
public class RequestParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String firstName;
	public String lastName;
	

	public class HTMLFilter{
		public static String filter(String name) {
		
		return name;
		}
	}
       
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws IOException, ServletException
			    {
			        response.setContentType("text/html");
			        PrintWriter out = response.getWriter();
			        out.println("<html>");
			        out.println("<head>");
			        out.println("<title>Request Parameters Example</title>");
			        out.println("</head>");
			        out.println("<body>");
			        out.println("<h3>Request Parameters Example</h3>");
			        out.println("Parameters in this request:<br>");
			        if (firstName != null || lastName != null) {
			            out.println("First Name:");
			            out.println(" = " + HTMLFilter.filter(firstName) + "<br>");
			            out.println("Last Name:");
			            out.println(" = " + HTMLFilter.filter(lastName));
			        } else {
			            out.println("No Parameters, Please enter some");
			        }
			        out.println("<P>");
			        out.print("<form action=\"");
			        out.print("RequestParamExample\" ");
			        out.println("method=POST>");
			        out.println("First Name:");
			        out.println("<input type=text size=20 name=firstname>");
			        out.println("<br>");
			        out.println("Last Name:");
			        out.println("<input type=text size=20 name=lastname>");
			        out.println("<br>");
			        out.println("<input type=submit>");
			        out.println("</form>");
			        out.println("</body>");
			        out.println("</html>");
			    }

			    public void doPost(HttpServletRequest request, HttpServletResponse res)
			    throws IOException, ServletException
			    {
			        HttpServletResponse response = null;
					doGet(request, response);
			    }
			}