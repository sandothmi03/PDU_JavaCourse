import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver"); //jdbc is the project name
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/java"; //local host is the ip address and 3306 is the port
        Connection connection = DriverManager.getConnection(url, username, password);
        if(!connection.isClosed()) {
            System.out.println("Success" + connection.getMetaData().getDatabaseProductName());
        }else{
            System.out.println("Error in DB connection.");
        }

/*
        String sql = "insert into books (bookid, bookname, authorid) values (4, 'Welcome to ICT', 3)"; // we can put if we know the values for parameters. unless we just can use ? for them
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        int i = preparedStatement.executeUpdate();
        System.out.println(i + " rows inserted");
*/

        int bookid = 11;
        String bookname = "Java course";
        int authorid = 123;

        String sql = "insert into books (bookid, bookname, authorid) values (? , ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, bookid);
        preparedStatement.setString(2, bookname);
        preparedStatement.setInt(3, authorid);

        int i = preparedStatement.executeUpdate();
        System.out.println(i + " rows inserted");
    }
}