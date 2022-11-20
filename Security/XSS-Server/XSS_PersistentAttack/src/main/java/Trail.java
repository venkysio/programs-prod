import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class Trail extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html><body>");
        String uname = req.getParameter("uname");
        Cookie ckarr[] = req.getCookies();
        int flag = 0;
        if (ckarr != null) {
            for (Cookie ck : ckarr) {
                if (ck.getName().equals(uname)) {
                    pw.println("Welcome "+uname);
                    pw.println(
                            "<HTML>\n" +
                                    "<form id=\"form\" name=\"form\" method=\"get\" action=\"searching\">" +
                                    "<button type=\"submit\">GO TO CHAT WEBSITE</button> " +
                                    "</HTML>");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            pw.println(
                    "<HTML>\n" +

                            "<H1>" + "Login again" + "</H1>\n" +

                            "<form id=\"form\" name=\"form\" method=\"get\" action=\"givepassword\">" +
                            "Enter user name: <input type=\"text\" name=\"uname\"/>" +"<br>"+
                            "Enter Password: <input type=\"text\" name=\"pass\"/>" +
                            "<button type=\"submit\">Submit</button> " +

                            "</HTML>");
        }
    }
}

