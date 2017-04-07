import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class lkj extends HttpServlet 
{  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException 
{  
response.setContentType("text/html");  
 
PrintWriter out = response.getWriter(); 
    String n=request.getParameter("n1"); 
    String p1="admin";
    if(n.equals(p1))
    {
        out.print("                                                                       WELCOME ADMIN!!!");
        out.print("<html><head>");
    out.print("<meta http-equiv=\"refresh\" content=\"3;URL=admin.jsp\">");
out.print("</headl></html>"); 
    }    
    else
    {
        out.print("                                                                        TRY AGAIN...WRONG PASSWORD");
        out.print("<html><head>");
    out.print("<meta http-equiv=\"refresh\" content=\"3;URL=admin_validation.jsp\">");
out.print("</headl></html>"); 
    }
      
                    //out.print("USER SUCESSFULLY UPDATED");
    
}  
}  


