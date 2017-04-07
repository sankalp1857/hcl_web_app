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
public class modify_conference1 extends HttpServlet 
{  
  public static String name;
   public static String gender;
    public static String contact;
    public static String email;
     public static String ename;
    public static String eid;
    public static String purpose;
    public static String time;
    public static String laptop;
     public static String laptop1;
     @Override
@SuppressWarnings("empty-statement")
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException 
{  
    String EID=request.getParameter("EID"); 
response.setContentType("text/html"); 
try
{
     PrintWriter out = response.getWriter();
     Class.forName("com.mysql.jdbc.Driver");
     
     
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hcl","root","root");
        PreparedStatement pstmt = null; 
         String sql;
    sql = "SELECT * from  conference WHERE EID = ? "; 
   
         pstmt = con.prepareStatement(sql); // create a statement 
        
 pstmt.setString(1,EID); 
ResultSet rs = pstmt.executeQuery(); 
        while(rs.next())
        {
         name = rs.getString("EID");
        gender = rs.getString("ENAME");
         contact = rs.getString("CONTACT");
         email = rs.getString("email");
        ename = rs.getString("PURPOSE");
         eid = rs.getString("DATE");
         time = rs.getString("TIME");
         purpose = rs.getString("DURATION");
         laptop = rs.getString("LOCATION");
         laptop1 = rs.getString("NUMBER");
          request.setAttribute("name", name);
          request.setAttribute("gender", gender);
          request.setAttribute("contact", contact);
          request.setAttribute("email", email);
          request.setAttribute("ename", ename);
          request.setAttribute("eid", eid);
          request.setAttribute("time", time);
          request.setAttribute("purpose", purpose);
          request.setAttribute("laptop", laptop);
          request.setAttribute("laptop1", laptop1);
        request.getRequestDispatcher("help_conference.jsp").forward(request, response);
         
}
         //Display values


        
    }catch (SQLException e2) {System.out.println(e2);} catch (ClassNotFoundException ex) {  
          Logger.getLogger(update1.class.getName()).log(Level.SEVERE, null, ex);
      }  
}  
}


