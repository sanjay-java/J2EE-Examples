package com.example.test.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Object userName = request.getParameter("username");
		Object password = request.getParameter("password");
		
		
		RequestDispatcher requestDispatcher;
		
		if(userName.equals("Sanjay") && password.equals("Sanjay")) {
			request.setAttribute("username", userName);
			requestDispatcher = getServletContext().getRequestDispatcher("/LoginSuccess.jsp");
			
		}else {
			requestDispatcher = getServletContext().getRequestDispatcher("/LoginFailure.jsp");
			
		}
		requestDispatcher.include(request, response);
		// forward - does not include original request and response
		// include - it inludes orginal request and response
	}

}
