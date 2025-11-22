package pkgDBConexiones;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConexion {
	private static final String URL = "jdbc:mysql://192.168.1.90:3306/ContactosDB";
	private static final String USER = "externaluser";
	private static final String PASSWORD = "Test1234";

	public static Connection connectarDB() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexion creda correctamente...");
		} catch (Exception e) {
			System.out.println("No se ha podido conectar con la base de datos...");
			e.printStackTrace();
		}
		return con;
	}
}
