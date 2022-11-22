import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class Search extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html><body>");
        pw.println("Welcome to chat website!! ");
        //Retrive from data base
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/examplecards?useSSL=false", "root", "pass");
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM comments");
            if (!rs.isBeforeFirst()) {
                pw.println("No comments yet!!");
            }
            else{

                while (rs.next()) {
                    pw.println("<br>");
                    pw.print(rs.getString(1)+":");
                    pw.print(rs.getString(2));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        pw.println("<br>");
        pw.println(
                "<HTML>\n" +

                        "<form id=\"form\" name=\"form\" method=\"get\" action=\"search\">" +

                        "<button type=\"submit\">ADD YOUR COMMENTS</button> " +

                        "</HTML>");

        pw.println("</body></html>");
    }
}

