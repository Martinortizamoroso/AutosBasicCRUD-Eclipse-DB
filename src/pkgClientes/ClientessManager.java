package pkgClientes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pkgDBConexiones.DBConexion;

public class ClientessManager {
	Connection cn = null;
	Statement stm = null;
	ResultSet rs = null;

	public List<Cliente> getClientes() {
		List<Cliente> clientes = new ArrayList<>(); // Creamos la lista que vamos a devolver

		try {
			cn = DBConexion.connectarDB();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM CLIENTES");

			while (rs.next()) {
				int idCliente = rs.getInt(1);
				String nombreCliente = rs.getString(2);
				String apellidoCliente = rs.getString(3);
				String telefonoCliente = rs.getString(4);
				String emailCliente = rs.getString(5);
				String direccionCliente = rs.getString(6);
				Boolean estadoCliente = rs.getBoolean(7);
				String notasCliente = rs.getString(8);

				// Creamos el objeto Cliente y lo agregamos a la lista
				Cliente c = new Cliente(idCliente, nombreCliente, apellidoCliente, telefonoCliente, emailCliente,
						direccionCliente, estadoCliente, notasCliente);
				clientes.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace(); // Mejor que dejar el catch vacío
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return clientes; // Devolvemos la lista completa
	}
}
