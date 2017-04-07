import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class stationary_save extends HttpServlet 
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
        PreparedStatement pstmt =null; 
         String sql;
    sql = "UPDATE stationary"
            + " SET eid=? , ename=? ,contact=?,email=?,date=?"
            + " WHERE eid =?";
         pstmt = con.prepareStatement(sql); // create a statement 
         pstmt.setString(1, n1); 
          pstmt.setString(2, n2); 
           pstmt.setString(3, n3); 
            pstmt.setString(4,n4); 
             pstmt.setString(5, n5); 
              pstmt.setString(6, n); 
              request.setAttribute("EID",n);

// set input parameter 1 
pstmt.executeUpdate(); 

    out.print("USER SUCESSFULLY UPDATED");
    out.print("<html><head>");
    out.print("<meta http-equiv=\"refresh\" content=\"5;URL=stationary.jsp\">");
out.print("</headl></html>");
RequestDispatcher rd = request.getRequestDispatcher("/modify_stationary_1");
rd.forward(request,response);
             


    }catch (ClassNotFoundException | SQLException e2) {System.out.println(e2);}  
}
}


