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

/**
 * Servlet implementation class AddStudent
 */
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddStudent() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sname=request.getParameter("stdName" );
		int srollno=Integer.parseInt(request.getParameter("rollNo" ));
		String sclass=request.getParameter("class" );
		
		String sql = "insert into student(Name,rollno,class)values(?,?,?)";
		PrintWriter out=response.getWriter();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learneracademy","root","root");
			PreparedStatement stmt=con.prepareStatement(sql);
			
			stmt.setString(1, sname);
			stmt.setInt(2, srollno);
			stmt.setString(3, sclass);
			
			stmt.execute();
			stmt.close();con.close();
			out.println("Data inserted successfully");
			
			
			
		}  catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
