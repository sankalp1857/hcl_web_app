import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class modify_stationary extends HttpServlet 
{  
    public static String contact;
    public static String email;
    public static  String ename;
    public static String eid;
    public static String date;
    @Override
@SuppressWarnings("empty-statement")
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException 
{  
    String e=request.getParameter("EID"); 
   
response.setContentType("text/html"); 
try
{
     PrintWriter out = response.getWriter();
      out.print(e);
     Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hcl","root","root");
        PreparedStatement pstmt = null; 
         String sql;
    sql = "SELECT eid,ename,contact,email,date from  stationary WHERE eid = ? "; 
         pstmt = con.prepareStatement(sql); // create a statement 
        

 pstmt.setString(1,e); 
 
ResultSet rs = pstmt.executeQuery(); 
        while(rs.next())
        {
         eid = rs.getString("eid");
       contact = rs.getString("contact");
         email = rs.getString("email");
        ename = rs.getString("ename");
         date = rs.getString("date");
        
          request.setAttribute("ename1", ename);
         
          request.setAttribute("contact1", contact);
          request.setAttribute("email1", email);
          request.setAttribute("date1", date);
          request.setAttribute("eid1", eid);
          
        request.getRequestDispatcher("help_stationary.jsp").forward(request, response);
         
}
         //Display values


        
    }catch (SQLException e2) {System.out.println(e2);} catch (ClassNotFoundException ex) {  
          Logger.getLogger(update1.class.getName()).log(Level.SEVERE, null, ex);
      }  
}  
}


