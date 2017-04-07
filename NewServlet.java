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

public class NewServlet extends HttpServlet 
{  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException 
{  
response.setContentType("text/html");  
try{  
PrintWriter out = response.getWriter(); 
    String n=request.getParameter("name"); 
    String p=request.getParameter("gender");
    String p1=request.getParameter("n0");
    String p2=request.getParameter("email");
    String e=request.getParameter("n1");
    String a=request.getParameter("n2");
    String b=request.getParameter("n3"); 
    String c1=request.getParameter("n4"); 
    String d=request.getParameter("n5"); 
    
    
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hcl","root","root");
        PreparedStatement ps=con.prepareStatement(
                "insert into entry values(?,?,?,?,?,?,?,?,?)");
                ps.setString(1,n);
                ps.setString(2,p1);
                ps.setString(3,p2);
                ps.setString(4,p);
                ps.setString(5,e);
                ps.setString(6,a);       
                ps.setString(8,c1);
                 ps.setString(7,b);
                  ps.setString(9,d);
            
        int i;
        i=ps.executeUpdate();
    if(i>0) 
    {
      out.print("                                    You are successfully registerd......Welcome to H.C.L.");
    
    out.print("<html><head>");
    out.print("<meta http-equiv=\"refresh\" content=\"5;URL=newhtml2.html\">");
out.print("</headl></html>");
    }
    else
      out.print("                                    You are not  successfully registerd....Try Again");  
    
    }catch (ClassNotFoundException | SQLException e2) {System.out.println(e2);}  
}  
}  


