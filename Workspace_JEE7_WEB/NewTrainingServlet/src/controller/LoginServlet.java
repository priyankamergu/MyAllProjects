package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.jdbc.Driver;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection con=null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/allianz?serverTimezone=UTC", "root","");
			String sql="select * from registration";
			String uname=request.getParameter("uname");
			String upwd=request.getParameter("upwd");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				String name=rs.getString(7);
				String pwd=rs.getString(8);
				if((name.equals(uname) && pwd.equals(upwd)))
				{
					System.out.println("Hellooooo");
					PrintWriter pw=response.getWriter();
					HttpSession sess=request.getSession();
					sess.setAttribute("id", rs.getInt(1));
					try
					{
						RequestDispatcher rd=request.getRequestDispatcher( "Home.jsp" );
						if(rd!=null)
							rd.forward(request, response);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
				}
				else
				{
					try
					{
						RequestDispatcher rd1=request.getRequestDispatcher( "Failure.jsp");
						if(rd1!=null)
							rd1.include(request, response);
						return;
					}
					catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
		}
		catch(ClassNotFoundException |SQLException s)
		{
			s.printStackTrace();
		} 
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
