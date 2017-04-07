import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class conference_save extends HttpServlet 
{  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException 
{  
response.setContentType("text/html");  
 try
 {
PrintWriter out = response.getWriter(); 
    String n=request.getParameter("EID"); 
    String p=request.getParameter("ENAME");
    String p1=request.getParameter("CONTACT");
    String p2=request.getParameter("email");
    String e=request.getParameter("PURPOSE");
    String a=request.getParameter("date");
    String b=request.getParameter("ENTRY"); 
    String c1=request.getParameter("DURATION"); 
    String d=request.getParameter("LOCATION"); 
    String d1=request.getParameter("NUMBER");
    
   
    
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hcl","root","root");
        PreparedStatement pstmt =null; 
         String sql;
    sql = "UPDATE conference"
            + " SET EID =? , ENAME=? ,CONTACT=?,email=?,PURPOSE=?,DATE=?,TIME=?,DURATION=?,LOCATION=?,NUMBER=?"
            + " WHERE EID =?";
         pstmt = con.prepareStatement(sql); // create a statement 
         pstmt.setString(1, n); 
          pstmt.setString(2, p); 
           pstmt.setString(3, p1); 
            pstmt.setString(4,p2); 
             pstmt.setString(5, e); 
              pstmt.setString(6, a); 
               pstmt.setString(7,b); 
                       pstmt.setString(8,c1); 
          pstmt.setString(9,d); 
          pstmt.setString(10,d1);
           pstmt.setString(11,n);
// set input parameter 1 
pstmt.executeUpdate(); 

    out.print("CONFERENCE HALL INFORMATION SUCESSFULLY UPDATED");
    out.print("<html><head>");
    out.print("<meta http-equiv=\"refresh\" content=\"5;URL=conference.jsp\">");
out.print("</headl></html>");
    
    // Extract data from result set
    //Retrieve by column name
        
              
            
         

    }catch (ClassNotFoundException | SQLException e2) {System.out.println(e2);}  
}
}


