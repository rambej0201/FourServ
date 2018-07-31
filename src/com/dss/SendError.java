package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendError
 */
public class SendError extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendError() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//general settings
		response.setContentType("text/html");
		PrintWriter e = response.getWriter();
		
		String u = request.getParameter("un");
		String p = request.getParameter("up");
		
		//business logic
		if (u.equals("raghu") && p.equals("ram")) {
			e.println("Servlet for SendError, Redirection");
			e.println("<br>");
			//e.println("<a href='https://www.youtube.com/watch?v=AfjdRiDOmMw'></a>");
			response.sendRedirect("https://www.youtube.com/watch?v=AfjdRiDOmMw");
		} else {
			response.sendError(850, "first send error program");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
