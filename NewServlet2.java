import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewServlet2 extends HttpServlet 
{  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException 
{  
response.setContentType("text/html");  
try{  
PrintWriter out = response.getWriter(); 
    
    
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hcl","root","root");
         Statement stmt = con.createStatement();
         String sql;
         sql = "SELECT name,gender,contact,email,ename,eid,time,purpose,laptop FROM entry";
         ResultSet rs = stmt.executeQuery(sql);

         // Extract data from result set
         out.print("<body style = \"background-color:grey;\">\n" +"<style>.button {\n" +
"  display: inline-block;\n" +
"  border-radius: 4px;\n" +
"  background-color: #A9A9A9;\n" +
"  border: none;\n" +
"  color: #000000;\n" +
"  text-align: center;\n" +
"  font-size: 14px;\n" +
"  padding: 20px;\n" +
"  border-radius:12px;\n" +
"  transition: all 0.5s;\n" +
"  cursor: pointer;\n" +
"  margin: 5px;\n" +
"}</style>"+
"<h1 style=\" font color :pink;\"><marquee><em>HCL NOIDA VISITOR DETAIL'S</em></marquee></h1>\n" +
"<table style = \"background-color: green;\">\n" +
"<table border = \"5"
                 + "\" width =\"100%\" style=\"background-color: RED\" cellpadding=\"10\" cellspacing=\"10\">");
           out.println("<table>");
           
         out.println("<tr>");
       
         out.println("<td style=\"font-size:150%\">NAME: &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>");
         out.println("<td style=\"font-size:150%\">GENDER:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>");
         out.println("<td style=\"font-size:150%\">CONTACT:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>");
         out.println("<td style=\"font-size:150%\">EMAIL:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>");
         out.println("<td style=\"font-size:150%\">E-NAME:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>");
         out.println("<td style=\"font-size:150%\">E-ID:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>");
         out.println("<td style=\"font-size:150%\">PURPOSE:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>");
         out.println("<td style=\"font-size:150%\">TIME:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>");
         out.println("<td style=\"font-size:150%\">LAPTOP:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>");
          out.println("</tr>");
         while(rs.next()){
            //Retrieve by column name
        
            String name = rs.getString("name");
            String gender = rs.getString("gender");
            String contact = rs.getString("contact");
             String email = rs.getString("email");
              
               String ename = rs.getString("ename");
                String eid = rs.getString("eid");
                 String time = rs.getString("purpose");
                  String purpose = rs.getString("time");
                String laptop = rs.getString("laptop");

            //Display values
            out.println("<tr>");   
            out.println("<td>" +name+" &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>" );
            out.println("<td>" +gender+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>" );
            out.println("<td>" +contact+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>" );
            out.println("<td>" +email+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>" );
            out.println("<td>" +ename+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>" );
            out.println("<td>" +eid+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>" );
            out.println("<td>" +purpose+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>" );
            out.println("<td>" +time+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>" );
            out.println("<td>" +laptop+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>" );
            out.println("<tr>");
         }
        
         out.println("</table>");
          out.print("<div style=\"text-align:center\">");
         out.print("<h2>");
        out.print("<a href=\"newhtml2.html\" <button class=\"button\" style=\"vertical-align:middle\">><span>HOME</span></button></a><br>"); 
        out.printf("</h2>");
         out.print("</div>");
         out.println("</body></html>");

         // Clean-up environment
         rs.close();
    }catch (ClassNotFoundException | SQLException e2) {System.out.println(e2);}  
}  
}  


