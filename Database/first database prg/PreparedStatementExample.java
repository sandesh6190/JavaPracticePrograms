
import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");

            String query = "insert into login values(?,?)"; // dynamic huncha, sql injection avoid garincha
            // Statement st = con.createStatement();
            PreparedStatement pr = con.prepareStatement(query);
            pr.setString(1, "Shyam");
            pr.setString(2, "123456");
            pr.executeUpdate(); // yaha chai bracket() bhitra query lai pass garnu parena

            // euta query multiple time use huna sakcha
            pr.setString(1, "Hari");
            pr.setString(2, "303030");
            pr.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
