import java.sql.*;

public class Dbms_Connectivity {
    public static void main(String[] args) {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // creating a connection
            String url = "jdbc:mysql://localhost:3306/java_connection";
            String username = "root";
            String password = "Sonu@3377";
            Connection connection = DriverManager.getConnection(url, username, password);

            // checking the connection is on or not
            if (connection.isClosed()) {
                System.out.println("connection is off");
            } else
                System.out.println("connection is on");

            // execute quary
            String query = "create table student(student_id int(20) primary key auto_increment, sName varchar(20), sCity varchar(20))";
            Statement stmt = connection.createStatement();

            stmt.executeUpdate(query);
            System.out.println("query is succesfully executed");
            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
