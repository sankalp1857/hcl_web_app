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
public class modify_stationary_1 extends HttpServlet 
{  
    public static String eid1;
    public static String contact;
    public static String email;
    public static  String ename;
    public static String eid;
    public static String date;
     public static String date1;
      public static String date2;
       public static String date3;
        public static String date4;
    @Override
@SuppressWarnings("empty-statement")
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException 
{  
    String e=(String)request.getAttribute("EID"); 
   
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
    sql = "SELECT eid,pen,marker,notepad,stickon,boardpin,tape,file,a4paper,other from  stationary WHERE eid = ? "; 
         pstmt = con.prepareStatement(sql); // create a statement 
        

 pstmt.setString(1,e); 
 
ResultSet rs = pstmt.executeQuery(); 
        while(rs.next())
        {
            eid1 = rs.getString("eid");
         eid = rs.getString("pen");
       contact = rs.getString("marker");
         email = rs.getString("notepad");
        ename = rs.getString("stickon");
         date = rs.getString("boardpin");
          date1 = rs.getString("tape");
           date2 = rs.getString("file");
            date3 = rs.getString("a4paper");
             date4 = rs.getString("other");
          
        request.setAttribute("eid11", eid1);
          request.setAttribute("ename1", ename);
         
          request.setAttribute("contact1", contact);
          request.setAttribute("email1", email);
          request.setAttribute("date1", date);
          request.setAttribute("eid1", eid);
          request.setAttribute("date11", date1);
          request.setAttribute("date12", date2);
          request.setAttribute("date13", date3);
          request.setAttribute("date14", date4);
          
        request.getRequestDispatcher("help_stationary_1.jsp").forward(request, response);
         
}
         //Display values


        
    }catch (SQLException e2) {System.out.println(e2);} catch (ClassNotFoundException ex) {  
          Logger.getLogger(update1.class.getName()).log(Level.SEVERE, null, ex);
      }  
}  
}


