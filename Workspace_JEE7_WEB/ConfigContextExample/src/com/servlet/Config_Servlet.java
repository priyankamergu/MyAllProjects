package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Config_Servlet
 */
@WebServlet(
		urlPatterns = { "/Config_Servlet" }, 
		initParams = { 
				@WebInitParam(name = "db.driver", value = "com.mysql.cj.jdbc.Driver"), 
				@WebInitParam(name = "db.url", value = "/Config_Servlet"), 
				@WebInitParam(name = "db.username", value = "root"), 
				@WebInitParam(name = "db.password", value = "root")
		})
public class Config_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Config_Servlet() {
        super();
    }

    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	super.init(config);
    	
    	
    	String driver1=config.getInitParameter("db.driver");
    	
    	String url1=config.getInitParameter("db.url");
    	String username1=config.getInitParameter("db.username");
    	String password1=config.getInitParameter("db.password");
    	
    	
    Properties prop=new Properties();
    prop.put("db.driver", driver1);
    prop.put("db.url", url1);
    prop.put("db.username", username1);
    prop.put("db.password", password1);
    prop.list(System.out);
    
    
    	ServletContext con=getServletContext();
    	con.setAttribute("dbprop", prop);
    	
    	
    	
    	
    	
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Servlet_Config=>doGet..");
		request.getRequestDispatcher("Context_Servlet").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
