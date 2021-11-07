import java.sql.*;

class Dbms_image {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_connection", "root",
                    "Sonu@3377");

            if (con.isClosed()) {
                System.out.println("off");
            } else
                System.out.println("on");

            /*
             * adding image to database String query =
             * "insert into student_image(pic) values(?)"; PreparedStatement pstmt =
             * con.prepareStatement(query);
             * 
             * // inserting blob path FileInputStream fileinput = new
             * FileInputStream("E:\\Hackerrank-Solution\\Database\\pic.jpg");
             * pstmt.setBinaryStream(1, fileinput, fileinput.available()); //
             * pstmt.setBlob(1, fileinput); // execute query pstmt.executeUpdate();
             * System.out.println("executed");
             */
        } catch (Exception e) {
            System.out.println("Error!");
        }

    }
}