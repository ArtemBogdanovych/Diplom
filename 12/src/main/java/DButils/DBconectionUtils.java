package DButils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconectionUtils {
	private static final String JDBC_MYSQL_HOST = "jdbc:mysql://localhost:3306/diplomwork?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String MYSQL_JDBC_DRIVER_NAME = "com.mysql.jdbc.Driver";
	//private static final String DB_NAME = "diplomwork";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "20051991artem";

	public static Connection getConnection() {
		try {
			Class.forName(MYSQL_JDBC_DRIVER_NAME);
			return DriverManager.getConnection(JDBC_MYSQL_HOST, USERNAME, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {

			throw new RuntimeException(e);
		}
	}
}