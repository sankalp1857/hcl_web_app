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
public class conference_entry extends HttpServlet 
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
    String n=(String) request.getParameter("EID"); 
    String p=(String) request.getParameter("ENAME");
    String p1=(String) request.getParameter("CONTACT");
    String p2=(String) request.getParameter("email");
    String e=(String) request.getParameter("PURPOSE");
    String a=(String) request.getParameter("date");
    String b=(String) request.getParameter("ENTRY"); 
    String c1=(String) request.getParameter("DURATION"); 
    String d=(String) request.getParameter("LOCATION");
     String d1=(String) request.getParameter("NUMBER");
    Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hcl","root","root");
        PreparedStatement ps=con.prepareStatement(
                "insert into conference values(?,?,?,?,?,?,?,?,?,?)");
        
          ps.setString(1,n);
                ps.setString(2,p);
                ps.setString(3,p1);
                ps.setString(4,p2);
                ps.setString(5,e);
                ps.setString(6,a);       
                ps.setString(7,b);
                 ps.setString(8,c1);
                  ps.setString(9,d);
                   ps.setString(10,d1);
                  ps.executeUpdate();
                    out.print("CONFERENCE HALL BOOKED FOR CURRENT DATE AND TIME");
    out.print("<html><head>");
    out.print("<meta http-equiv=\"refresh\" content=\"5;URL=conference.jsp\">");
out.print("</headl></html>");
                
    }catch (ClassNotFoundException | SQLException e2) {System.out.println(e2);}  
}  
}  


