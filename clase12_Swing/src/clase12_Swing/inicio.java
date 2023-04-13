package clase12_Swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String servidor = "jdbc:mysql://localhost:3306/";
		String DBnombre = "qatar2023";
		String driver = "com.mysql.jdbc.Driver";
		String username = "root";
		String pasword = "Minimarket2";
		
		Connection con;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(servidor + DBnombre, username, pasword);
			System.out.println("-------CONEXION EXITOSA--------" + "\n");
			
			String Selectquery = "select * from empleado";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(Selectquery);
			
			while(rs.next()) {
				System.out.println("...Registro n°: " + rs.getRow() + "..." + "\n");
				System.out.println("Nombre y Apellido: " + rs.getString("nombre")+ ", " + rs.getString("apellido") + "\n");
				System.out.println("DNI: " + rs.getString("DNI")+ ", " + "Depto: " + rs.getString("depto") + "\n");
				
				//cerramos la conexion
				


			}st.close();
			con.close();
		
		
		}catch(ClassNotFoundException | SQLException e){
			System.out.println("Error");
		} */
	
		public static void conexion2() {
			try {
				metodo2_insert conn = new metodo2_insert();
				Connection conexion = conn.getConnection();
				
				String insertquery = "INSERT INTO empleado(DNI,NOMBRE,APELLIDO,NACIONALIDAD,DEPTO)" + "VALUES" + "(?,?,?,?,?)";
				PreparedStatement ps = conexion.prepareStatement(insertquery);
				ps.setInt(1, 33214110);
				ps.setString(2, "Claudio");
				ps.setString(3, "Caniggia");
				ps.setString(4, "Argentina");
				ps.setString(5, "Ventas");
				
				ps.executeUpdate();
				System.out.println("REGISTRO EXISTOSO" + "\n");
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		
		}
		

}}