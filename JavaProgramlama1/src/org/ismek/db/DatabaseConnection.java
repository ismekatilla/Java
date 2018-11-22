package org.ismek.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	final static String URL = "jdbc:mysql://10.1.8.20/sakila";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (
				Connection connection = DriverManager.getConnection(URL,"ogrenci","1234"); 
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from sakila.actor");
				) {
			Class.forName("com.mysql.jdbc.Driver");
			while (resultSet.next()) {
				int actorId = resultSet.getInt("actor_id");
				System.out.println(actorId);
			}
			statement.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}