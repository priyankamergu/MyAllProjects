import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayBlobExample")
@MultipartConfig
public class DisplayBlobExample extends HttpServlet{
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
  throws IOException,ServletException {
  Blob image = null;
  Connection con = null;
  Statement stmt = null;
  ResultSet rs = null;
  ServletOutputStream out = response.getOutputStream();
  try {
	  Class.forName("com.mysql.cj.jdbc.Driver"); //creating object of my sql driver
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fileupload?serverTimezone=UTC", "root", "");
  stmt = con.createStatement();
  rs = stmt.executeQuery("select * from filepdf");
  if (rs.next()) {
  image = rs.getBlob(1);
  } else {
  response.setContentType("text/html");
  out.println("<html><head><title>Display Blob Example</title></head>");
  out.println("<body><h4><font color='red'>image not found for given id</font></h4></body></html>");
  return;
  }
  response.setContentType("image/gif");
  InputStream in = image.getBinaryStream();
  int length = (int) image.length();
  int bufferSize = 1024;
  byte[] buffer = new byte[bufferSize];
  while ((length = in.read(buffer)) != -1) {
  out.write(buffer, 0, length);
  }
  in.close();
  out.flush();
  } catch (Exception e) {
  response.setContentType("text/html");
  out.println("<html><head><title>Unable To Display image</title></head>");
  out.println("<body><h4><font color='red'>Image Display Error=" + e.getMessage() +
   "</font></h4></body></html>");
  return;
  } finally {
  try {
  rs.close();
  stmt.close();
  con.close();
  } catch (SQLException e) {
  e.printStackTrace();
  }
  }
  }
} 