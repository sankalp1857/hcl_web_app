import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class user_entry extends HttpServlet 
{  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException 
{  
response.setContentType("text/html");  
try
{  
PrintWriter out = response.getWriter(); 
    String n=(String) request.getParameter("name"); 
    String p=(String) request.getParameter("n0");
    String p1=(String) request.getParameter("n1");
    
    Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hcl","root","root");
        PreparedStatement ps=con.prepareStatement(
                "insert into user values(?,?,?)");
        
          ps.setString(1,n);
                ps.setString(2,p);
                ps.setString(3,p1);
               
                  ps.executeUpdate();
                    out.print("EMPLOYEE SUCESSFULLY ADDED");
    out.print("<html><head>");
    out.print("<meta http-equiv=\"refresh\" content=\"5;URL=home.jsp\">");
out.print("</headl></html>");
                
    }catch (ClassNotFoundException | SQLException e2) {System.out.println(e2);}  
}  
}  


