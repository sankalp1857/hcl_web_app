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
public class stationary_book extends HttpServlet 
{  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException 
{  
response.setContentType("text/html");  
try
{  
PrintWriter out = response.getWriter(); 
String someName = (String)request.getParameter("attributeName");
    String n=request.getParameter("EID"); 
    String p=request.getParameter("ENAME");
    String p1=request.getParameter("CONTACT");
    String p2=request.getParameter("email");
    String a=request.getParameter("DATE");
    out.print(n);
    Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hcl","root","root");
        PreparedStatement ps=con.prepareStatement(
                "insert into stationary values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                 ps.setString(1,n);
                ps.setString(2,p);
                ps.setString(3,p1);
                ps.setString(4,p2);
                ps.setString(5,a);
                 ps.setString(6,a);
                  ps.setString(7,a);
                   out.print(n);
                   ps.setString(8,a);
                    ps.setString(9,a);
                     ps.setString(10,a);
                      ps.setString(11,a);
                      out.print(n);
                       ps.setString(12,a);
                        ps.setString(13,a);
                         ps.setString(14,a);
                         out.print(n);
                  ps.executeUpdate();
                   out.print(n);
                  out.print("USER SUCESSFULLY UPDATED");
    out.print("<html><head>");
    out.print("<meta http-equiv=\"refresh\" content=\"5;URL=stationary_book_1.jsp\">");
out.print("</headl></html>");
     }catch (ClassNotFoundException | SQLException e2) {System.out.println(e2);}  
}  
}  


