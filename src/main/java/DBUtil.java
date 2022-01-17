import java.sql.*;

public class DBUtil {
    public static Connection connection() {
        Connection connection = null;
        try {
            //1加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weather?useSSL=true&characterEncoding=utf-8&user=root&password=26668215913.   ");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet) {
        //7关闭资源
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}