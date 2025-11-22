package pkgClientes;

import java.util.List;
import java.util.Scanner;

public class ClientesGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opt = 0;
		ClientessManager gestor = new ClientessManager();
		Scanner teclado = new Scanner(System.in);
		System.out.print("Hola :D bienvenido a tu agenda de clientes, que deseas hacer hoy?");
		System.out.println();
		System.out.print("1) Ver todos tus clientes");
		System.out.println();
		opt = teclado.nextInt();
		switch (opt) {
		case 1: {
			try {
				List<Cliente> listaClientes = gestor.getClientes();
				for (Cliente c : listaClientes) {
					System.out.println(c.getId() + " " + c.getNombre() + " " + c.getApellido() + " " + c.getTelefono()
							+ " " + c.getEmail() + " " + c.getDireccion() + " " + c.getEstado() + " " + c.getNotas());
				}
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}

		}
			teclado.close();
		}

		// Hola :D Soy un test de github

	}

}
