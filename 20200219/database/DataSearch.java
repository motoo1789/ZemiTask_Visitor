package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import AddVisitor.VisitorTable;

public class DataSearch {
	private static DataSearch singleton = new DataSearch();
	private static VisitorTable table;
	private static String[] columnNames = {"タスク名","期限","カテゴリー","重要度"};

	private static DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

	public static void Search(ArrayList<String> where) throws Exception {
		Connection connection = null;
		String SQL = "SELECT * FROM task3";
		String url = "jdbc:postgresql://localhost:5432/Task";
		String user = "postgres";
		String password = "purotofasma1789";

		try {
			if(0 < where.size()) {
				SQL += " WHERE ";
				for(int i = 0; i < where.size(); i++)
				{
					SQL += where.get(i);

					if(i+1 < where.size())	SQL += " AND ";
					else					SQL += ";";
				}
			}

			connection = DriverManager.getConnection(url, user, password);
			connection.setAutoCommit(false);
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			
			System.out.println("プラチナ1");
			Removetable();
			System.out.println(SQL);
			
			while(rs.next()) {
				Vector<String> result = new Vector();
				result.add(rs.getString("text"));
				result.add(rs.getString("combo_date"));
				result.add(rs.getString("combo_cate"));
				result.add(rs.getString("important"));

				System.out.println(rs.getString("text") + rs.getString("combo_date") + rs.getString("combo_cate") + rs.getString("important"));
				System.out.println("プラチナ2");
				Addtable(result);
			}
			rs.close();
			stmt.close();

		}catch (SQLException e){
			System.out.println("SQLException:" + e.getMessage());
		}catch (Exception e){
			System.out.println("Exception:" + e.getMessage());
			System.out.println("プラチナ3");

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

	public static void setVisitorTable(VisitorTable tmp) {
		table = tmp;
	}

	public static void Removetable() {
		//DataSearc.addtable = new JTable(tableModel);

		int tableNum = table.addtable.getRowCount();
		
//		for(int i = 0; i < tableNum; i++) {
//			System.out.println("プラチナ1.5 " + i + "<" + tableNum);
//			//table.tableModel.removeRow(i);
//			table.addtable.remove(i);
//		}
		table.addtable.removeAll();
		
		table.addtable.repaint();
		table.sp.repaint();

	}
	public static void Addtable(Vector<String> result) {
		table.tableModel.addRow(result);
	}
}
