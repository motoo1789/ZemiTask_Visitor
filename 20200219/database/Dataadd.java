package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import CoR.SingletonAddData;

public class Dataadd {
	public void add() throws Exception {

		final SingletonAddData data = SingletonAddData.getInstance();
		ArrayList combo = data.getCombo();
		String strdate = combo.get(0) + "-" + combo.get(1) + "-" + combo.get(2);

		final String SQL = "insert into task3 (text, combo_date, combo_cate, important) values(?,?,?,?);";
		try (
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Task", // "jdbc:postgresql://<場所>:<ポート>/<データベース名>"
						"postgres", //user
						"purotofasma1789")){ //password;

			connection.setAutoCommit(false);

			try(PreparedStatement ps = connection.prepareStatement(SQL)){
				Date date = Date.valueOf(strdate); //Dateに変換

				ps.setString(1, data.getText());
				ps.setDate(2, date);
				ps.setString(3, (String)combo.get(3));
				if(data.getCheckBox())	ps.setString(4, "true");
				else 					ps.setString(4, "false");

				ps.executeUpdate();
				connection.commit();
			}
			catch(Exception e) {
				connection.rollback();
				System.out.println("rollback");
				throw e;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("処理が完了しました");
		}
	}
}
