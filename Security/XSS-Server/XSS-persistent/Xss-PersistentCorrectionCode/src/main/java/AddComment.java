import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.regex.Pattern;

public class AddComment extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html><body>");
        pw.println("Hello");
        String uname=req.getParameter("username");
        String comment=req.getParameter("comment");
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
        if(!p.matcher(comment).find())pw.println("Enter Valid input!!");
        else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/examplecards?useSSL=false", "root", "pass");
                PreparedStatement st = con.prepareStatement("insert into comments values(?,?)");
                st.setString(1, uname);
                st.setString(2, comment);
                st.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
            pw.println("Your comment was added!! ");
        }
        pw.println(
                "<HTML>\n" +
                        "<form id=\"form\" name=\"form\" method=\"get\" action=\"searching\">" +
                        "<button type=\"submit\">GO TO CHAT WEBSITE</button> " +
                        "</HTML>");
        pw.println("</body></html>");

    }
}
