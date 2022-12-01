import java.sql.*;

public class InformationLeakageCorrectionCode {
   static final String DB_URL = " jdbc:mysql://localhost:3306/sakila";
   static final String USER = "root";
   static final String PASS = "viswa123";
   static final String QUERY = "SELECT id, first, last, age FROM actor";

   public static void main(String[] args) {
      // Open a connection
	  String status="";
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);) {
         // Extract data from result set
         while (rs.next()) {
            System.out.println("FirstName:" + rs.getString("first_name"));
            System.out.println("LastName" + rs.getString("last_name"));
         }
      } catch (SQLException se) {
status =" failed\r\n";
status += se;
String user = System.getProperty("user.name");
if (user.equals("admin")) {
System.out.println("Error" + status);
}
else {
System.out.println("An error occurred, please bug your admin");
}
}
}
}