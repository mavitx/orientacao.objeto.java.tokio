package br.com.fiap.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection conectar() {

		try {
			return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "tm19", "01042007");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

}
