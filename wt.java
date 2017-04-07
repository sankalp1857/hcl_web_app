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
public class wt extends HttpServlet 
{  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException 
{  
response.setContentType("text/html");  
try
{  
PrintWriter out = response.getWriter(); 
    String n1=request.getParameter("EID");
    String n2=request.getParameter("ENAME");
    String n3=request.getParameter("CONTACT");
    String n4=request.getParameter("email");
    String n5=request.getParameter("DATE");
            String n=request.getParameter("EID");
    Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hcl","root","root");
        PreparedStatement ps=con.prepareStatement(
                "insert into stationary (eid,ename,contact,email,date) values(?,?,?,?,?)");
                ps.setString(1,n1);
                 ps.setString(2,n2);
                  ps.setString(3,n3);
                   ps.setString(4,n4);
                    ps.setString(5,n5);
              
                  int i=ps.executeUpdate();
              
                    out.print("USER SUCESSFULLY UPDATED");
                    request.setAttribute("name",n1);
request.getRequestDispatcher("stationary_book_1.jsp").forward(request, response);
    out.print("<html><head>");
    out.print("<meta http-equiv=\"refresh\" content=\"5;URL=stationary_book_1.jsp\">");
out.print("</headl></html>");
                
    }catch (ClassNotFoundException | SQLException e2) {System.out.println(e2);}  
}  
}  


