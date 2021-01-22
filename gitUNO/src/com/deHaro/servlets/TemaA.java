package com.deHaro.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/TemaA")
public class TemaA extends HttpServlet {	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String saludo = "Est�s en el tema A";
		request.setAttribute("saludo", saludo);
	}

}
