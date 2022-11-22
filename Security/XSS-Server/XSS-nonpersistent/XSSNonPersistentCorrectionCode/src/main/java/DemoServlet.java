import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class DemoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html><body>");
        String uname = req.getParameter("uname");
        String password = req.getParameter("pass");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/examplecards?useSSL=false", "root", "pass");
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM data WHERE user=?");
            stmt.setString(1, uname);
            ResultSet rs = stmt.executeQuery();
            if (!rs.isBeforeFirst()) {
                PreparedStatement st = con.prepareStatement("insert into data values(?,?)");
                st.setString(1, uname);
                st.setString(2, password);
                Cookie ck=new Cookie(uname,uname+password);
                res.addCookie(ck);
                st.executeUpdate();
                pw.println("New User created");
                pw.println("Welcome"+uname);
                pw.println(
                        "<HTML>\n" +

                                "<form id=\"form\" name=\"form\" method=\"get\" action=\"search\">" +

                                "<button type=\"submit\">GO TO SEARCH WEBSITE</button> " +

                                "</HTML>");
            } else {
                String validpass = "";
                while(rs.next()){
                    validpass=  rs.getString("password");
                }
                if (password.equals(validpass)) {
                    Cookie ck=new Cookie(uname,uname+password);
                    res.addCookie(ck);
                    pw.println("Credentials validated");
                    pw.println("Welcome"+uname);
                    pw.println(
                            "<HTML>\n" +
                                    "<form id=\"form\" name=\"form\" method=\"get\" action=\"search\">" +
                                    "<button type=\"submit\"> GO TO SEARCH WEBSITE</button> " +
                                    "</HTML>");

                }
                else {
                    pw.println("Wrong credentials");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        pw.println("</body></html>");
    }

}