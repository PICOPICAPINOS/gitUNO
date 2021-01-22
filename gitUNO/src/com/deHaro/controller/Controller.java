 package com.deHaro.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op=request.getParameter("op");
		String url="";
		switch(op) {
			case "temaA":
				request.getRequestDispatcher("TemaA").include(request, response);
				url="temaA.jsp";
				break;
				
			case "temaB":
				request.getRequestDispatcher("TemaB").include(request, response);
				url="temaB.jsp";
				break;
			
			default:
				url="menu.html";
		}
		
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
