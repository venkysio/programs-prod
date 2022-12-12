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
        pw.println("You searched for "+req.getParameter("searchtext"));
        pw.println(
                "<HTML>\n" +

                        "<form id=\"form\" name=\"form\" method=\"get\" action=\"search\">" +

                        "<button type=\"submit\">GO TO SEARCH WEBSITE AGAIN</button> " +

                        "</HTML>");

        pw.println("</body></html>");
    }
}

