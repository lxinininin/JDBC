import java.sql.*;

public class Demojdbc {
    public static void main(String[] args) throws Exception {

        /*
            import package
            load and register
            create connection
            create statement
            execute statement
            process the results
            close
         */



        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String username = "postgres";
        String password = "0000";
        Connection con = DriverManager.getConnection(url, username, password);

        System.out.println("Connected to PostgreSQL database");

        Statement stmt = con.createStatement();

//        String sql = "select * from student";
//        ResultSet rs = stmt.executeQuery(sql);
//
////        rs.next();
////        String name = rs.getString("sname"); // get the specific column
////        System.out.println("Name of a student is " + name);
//
//        while (rs.next()) {
//            System.out.println(rs.getInt(1) + " - "
//                    + rs.getString(2) + " - "
//                    + rs.getString(3));
//        }

        // insert operation
//        String sql = "insert into student values(5, 'John', 48)";
//        boolean status = stmt.execute(sql);
//        System.out.println(status); // the operation is done, but the status is false

        // update operation
//        String sql = "update student set sname='Max' where sid=5";
//        stmt.executeUpdate(sql);

        // delete operation
        String sql = "delete from student where sid=5";
        stmt.executeUpdate(sql);

        con.close();

        System.out.println("Connection closed");
    }
}
