package clase12_Swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class metodo2_insert {
	private String servidor = "jdbc:mysql://localhost:3306/";
	private String DBnombre = "qatar2023";
	private String driver = "com.mysql.jdbc.Driver";
	private String username = "root";
	private String pasword = "Minimarket2";
	
	private Connection con;
	
	public void conexion() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(servidor + DBnombre, username, pasword);
			System.out.println("-------CONEXION EXITOSA--------" + "\n");
		}catch(ClassNotFoundException | SQLException e){
			System.out.println("Error");
	}
	
}
	
	public Connection getConnection() {
		conexion();
		return con;	
	}
}