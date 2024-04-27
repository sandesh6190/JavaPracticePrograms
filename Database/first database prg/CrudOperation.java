import java.sql.*;

class CrudOperation {
    public Connection con;

    public Statement stEmpty;

    public static void main(String[] args) {

        CrudOperation obj = new CrudOperation();

        obj.connect();
        obj.read();
        // try {
        // // Register a Driver Class
        // Class.forName("com.mysql.cj.jdbc.Driver");

        // // connection
        // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306",
        // "root", "");

        // Statement st = con.createStatement();

        // String q1 = "create table if not exists student(id int primary key
        // auto_increment, age int not null, name varchar(30) not null)";
        // st.executeUpdate(q1);
        // System.out.println("Table Creation Successful");

        // String q2 = "insert into student(age,name) values(10,'Tanuja')";
        // st.executeUpdate(q2);
        // System.out.println("Data inserted Successfully");

        // String q3 = "delete from student where id = 1";
        // st.executeUpdate(q3);
        // System.out.println("Successfully Deleted");

        // String q4 = "update student set name = 'Tarjan' where id=3";
        // st.executeUpdate(q4);
        // System.out.println("Updated Successfully");

        // String q5 = "select * from student";
        // ResultSet rs = st.executeQuery(q5);
        // while (rs.next()) {
        // int s_id = rs.getInt("id");
        // int s_age = rs.getInt("age");
        // String s_name = rs.getString("name");

        // System.out.println("Id:" + s_id + " Age: " + s_age + "Name: " + s_name);

        // }

        // } catch (Exception e) {
        // System.out.println(e.getMessage());

        // }
    }

    public void connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/school";
            String un = "root";
            String pw = "";

            // load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            // connection
            con = DriverManager.getConnection(url, un, pw);
            if (con != null) {
                System.out.println("Successfully Connected");
            }
        }

        catch (Exception e) {
            System.out.println("Error:" + e.getMessage());

        }

    }

    public void read() {
        try {
            String query = "select * from student where id=1";
            stEmpty = con.createStatement();
            ResultSet rs = stEmpty.executeQuery(query);

            while (rs.next()) {
                System.out.println(
                        "Id: " + rs.getInt("id") + "Age: " + rs.getInt("age") + "Name: " + rs.getString("name");
            }
        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}