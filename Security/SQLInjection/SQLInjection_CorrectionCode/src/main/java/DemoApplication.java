import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.*;
import java.util.*;
import java.util.logging.Logger;
public class DemoApplication extends HttpServlet{
    private static final Logger log;

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "[%4$-7s] %5$s %n");
        log =Logger.getLogger(DemoApplication.class.getName());
    }
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {res.setContentType("text/html");//setting the content type
        PrintWriter pw=res.getWriter();
        String id = req.getParameter("uid");
        Pattern p = Pattern.compile("^\\d{0,9}$");
        if(!p.matcher(id).find())pw.println("Enter Valid input!!");
        else {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            } catch (Exception e) {
                e.printStackTrace();
            }
            Properties properties = new Properties();
            properties.load(DemoApplication.class.getClassLoader().getResourceAsStream("application.properties"));
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(properties.getProperty("url"), properties);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            Scanner scanner = new Scanner(DemoApplication.class.getClassLoader().getResourceAsStream("schema.sql"));
           Statement statement = null;

            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            while (scanner.hasNextLine()) {
                try {
                    statement.execute(scanner.nextLine());
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
           /* Statement st = null;
            try {
                st = connection.createStatement();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            ResultSet rs = null;
            try {
                rs = st.executeQuery(" SELECT CreditCard FROM Customers WHERE PersonID =" + id);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            while (true) {
                try {
                    if (!rs.next()) break;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    pw.println("Credit Card Number:" + rs.getString("CreditCard"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }*/
            try {
                PreparedStatement stmt=connection.prepareStatement("SELECT CreditCard FROM Customers WHERE PersonID =?");
                stmt.setString(1,id);
                ResultSet rs=stmt.executeQuery();
                while(true){
                    try {
                        if (!rs.next()) break;
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    pw.println("Credit Card Number:" + rs.getString("CreditCard"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            pw.close();//closing the stream
        }
    }
}