import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

class Dbms_dynamicquery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_connection", "root",
                    "Sonu@3377");

            if (con.isClosed()) {
                System.out.println("connection is off");

            } else
                System.out.println("connection is on");

            // adding dynamic query
            String query = "insert into student(sName,sCity) values(?,?)";

            // get the prepared Statment object
            PreparedStatement pstmt = con.prepareStatement(query);

            System.out.println("Enter the student name : ");
            String name = sc.nextLine();
            System.out.println("Enter the city name : ");
            String city = sc.nextLine();
            // set valye to query
            pstmt.setString(1, name);
            pstmt.setString(2, city);

            pstmt.executeUpdate();
            System.out.println("executed query");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();

    }
}
