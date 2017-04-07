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
public class admin_entry extends HttpServlet 
{  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException 
{  
response.setContentType("text/html");  
try
{  
PrintWriter out = response.getWriter(); 
    String n=(String) request.getParameter("n1"); 
    String p1="admin";
    if(n==p1)
    {
        out.print("correct");
    }    
    else
    {
        out.print("not correct");
    }
        Class.forName("com.mysql.jdbc.Driver");
    
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hcl","root","root");
        PreparedStatement ps=con.prepareStatement(
                "insert into conference values(?,?,?,?,?,?,?,?,?,?)");
        
          ps.setString(1,n);
              
                  ps.executeUpdate();
                    out.print("USER SUCESSFULLY UPDATED");
    out.print("<html><head>");
    out.print("<meta http-equiv=\"refresh\" content=\"5;URL=conference.jsp\">");
out.print("</headl></html>");
                
    }catch (ClassNotFoundException | SQLException e2) {System.out.println(e2);}  
}  
}  


