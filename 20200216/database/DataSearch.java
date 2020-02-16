package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataSearch {
	public void Search(String str) throws Exception {
		Connection connection = null;
		final String SQL = "SELECT * FROM task3" + str;
		String url = "jdbc:postgresql://localhost:5432/Task";
		String user = "postgres";
		String password = "purotofasma1789";

		try {
			connection = DriverManager.getConnection(url, user, password);

			connection.setAutoCommit(false);
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);


			while(rs.next()) {
				String result = "";
				result += rs.getString("text") + " ";
				result += rs.getDate("combo_date") + " ";
				result += rs.getString("combo_cate") + " ";
				result += rs.getString("important");
				System.out.println(result);
			}
			rs.close();
			stmt.close();


		}catch (SQLException e){
			System.out.println("SQLException:" + e.getMessage());
		}catch (Exception e){
			System.out.println("Exception:" + e.getMessage());
		}finally{
			try{
				if (connection != null){
					connection.close();
				}
			}catch (SQLException e){
				System.out.println("SQLException:" + e.getMessage());
			}
		}
	}
}
