package dataBaseApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import dataBaseApp.SqlQuery;
import dataBaseApp.SqlStatement;

public class DemoDataBase {
	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:derby:myDatabase;create=true");
				Statement statement = connection.createStatement();) {


			//statement.execute(SqlStatement.createTablePlayers);
			//statement.execute(SqlStatement.fillTablePlayers);

			statement.execute(SqlStatement.dropTableTeams);
			statement.execute(SqlStatement.createTableTeams);
			statement.execute(SqlStatement.fillTableTeams);

			printResult(statement.executeQuery(SqlQuery.getAllPlayers));
			System.out.println();
			printResult(statement.executeQuery(SqlQuery.getAllTeams));

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

	@SuppressWarnings("unused")
	private static void printResult(ResultSet results) throws SQLException {
		ResultSetMetaData metaData = results.getMetaData();
		int columnCount = metaData.getColumnCount();

		for (int i = 1; i <= columnCount; i++) {
			System.out.printf("%s  ", metaData.getColumnLabel(i));
		}
		System.out.println();
		System.out.println("----------------------------------------");

		while (results.next()) {
			for (int i = 1; i <= columnCount; i++) {
				System.out.printf("%-" + metaData.getColumnLabel(i).length() + "s  ", results.getObject(i));
			}
			System.out.println();
		}
	}
}
