package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddSubject() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String subjectName = request.getParameter("subjectName");
		String className = request.getParameter("className");
		String teacherName = request.getParameter("teacherName");
		
		String sqlQuery = "insert into subject(subjectName,className,teacherName)values(?,?,?)";
		PrintWriter out =response.getWriter();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learneracademy","root","root");
			PreparedStatement stmt=con.prepareStatement(sqlQuery);
			
			stmt.setString(1, subjectName);
			stmt.setString(2, className);
			stmt.setString(3, teacherName);
			
			stmt.execute();
			stmt.close();con.close();
			
			out.println("Subject data added successfully");
			
			
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
		} 
		}
	

	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
