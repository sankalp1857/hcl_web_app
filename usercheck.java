import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class usercheck extends HttpServlet 
{ 
     public static String name;
     public static String gender;
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException 
{  
response.setContentType("text/html");  
try
{  
PrintWriter out = response.getWriter(); 
    String p=(String) request.getParameter("n0");
    String p1=(String) request.getParameter("n1");
    
    Class.forName("com.mysql.jdbc.Driver");
    
     
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hcl","root","root");
        PreparedStatement pstmt = null; 
         String sql;
    sql = "SELECT eid,password from  user WHERE eid = ? "; 
   
         pstmt = con.prepareStatement(sql); // create a statement 
        
 pstmt.setString(1,p); 
ResultSet rs = pstmt.executeQuery(); 
        while(rs.next())
        {
         name = rs.getString("eid");
        gender = rs.getString("password");
          out.print(name);
      
}
        if((gender.equals(p1))&&(name.equals(p)))
        {
            out.print("welcome");
             out.print("<html><head>");
    out.print("<meta http-equiv=\"refresh\" content=\"5;URL=intro.jsp\">");
out.print("</headl></html>");
        }
        else
        {
            out.print("wrong password");
             out.print("<html><head>");
    out.print("<meta http-equiv=\"refresh\" content=\"5;URL=user.jsp\">");
out.print("</headl></html>");
        }
   
                
    }catch (ClassNotFoundException | SQLException e2) {System.out.println(e2);}  
}  
}  


