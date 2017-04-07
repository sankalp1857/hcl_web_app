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

public class update_save extends HttpServlet 
{  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException 
{  
response.setContentType("text/html");  
 try
 {
PrintWriter out = response.getWriter(); 
    String n=request.getParameter("name"); 
    String p=request.getParameter("gender");
    String p1=request.getParameter("contact");
    String p2=request.getParameter("email");
    String e=request.getParameter("ename");
    String a=request.getParameter("eid");
    String b=request.getParameter("time"); 
    String c1=request.getParameter("purpose"); 
    String d=request.getParameter("laptop"); 
    String name1="neelam";
   
    
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hcl","root","root");
        PreparedStatement pstmt =null; 
         String sql;
    sql = "UPDATE ENTRY"
            + " SET gender =? , contact=? ,email=?,ename=?,eid=?,time=?,purpose=?,laptop=?"
            + " WHERE name =?";
         pstmt = con.prepareStatement(sql); // create a statement 
         pstmt.setString(1, p); 
          pstmt.setString(2, p1); 
           pstmt.setString(3, p2); 
            pstmt.setString(4,e); 
             pstmt.setString(5, a); 
              pstmt.setString(6, b); 
               pstmt.setString(7,c1); 
                       pstmt.setString(8,d); 
          pstmt.setString(9, n); 
// set input parameter 1 
pstmt.executeUpdate(); 

    out.print("USER SUCESSFULLY UPDATED");
    out.print("<html><head>");
    out.print("<meta http-equiv=\"refresh\" content=\"5;URL=newhtml2.html\">");
out.print("</headl></html>");
    
    // Extract data from result set
    //Retrieve by column name
        
              
            
         

    }catch (ClassNotFoundException | SQLException e2) {System.out.println(e2);}  
}
}


