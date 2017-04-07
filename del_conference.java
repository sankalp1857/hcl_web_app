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

public class del_conference extends HttpServlet 
{  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException 
{  
    String n=request.getParameter("EID"); 
   
    
response.setContentType("text/html");  
 try
 {
PrintWriter out = response.getWriter(); 
    
     Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hcl","root","root");
         out.print(n);
         String sql;
    sql = "DELETE from conference WHERE EID =?";
        PreparedStatement  pstmt = con.prepareStatement(sql); // create a statement 
         pstmt.setString(1,n); 
         
pstmt.executeUpdate(); 

    out.print("---CONFERENCE HALL CANCELLED FOR PARTICULAR USER");
    out.print("<html><head>");
    out.print("<meta http-equiv=\"refresh\" content=\"5;URL=conference.jsp\">");
out.print("</headl></html>");
    // Extract data from result set
    //Retrieve by column name
        
              
            
         

    }catch (ClassNotFoundException | SQLException e2) {System.out.println(e2);}  
}
}


