package com.dulich.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/admin-home"})
public class HomeController extends HttpServlet{

	private static final long serialVersionUID = 1381094310777234011L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
	
}