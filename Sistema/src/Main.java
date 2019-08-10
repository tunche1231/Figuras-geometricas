import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Persona> lista_clientes = new ArrayList<Persona>();
		
		Cliente cliente_1 = new Cliente ("Saul", 45814625, 23, 125);
		lista_clientes.add(cliente_1);
		
		Cliente cliente_2 = new Cliente ("Diego", 76184265, 25, 124);
		lista_clientes.add(cliente_2);
		
		Cliente cliente_3 = new Cliente ("Raul", 47154827, 32, 123);
		lista_clientes.add(cliente_3);
		
		Cliente cliente_4 = new Cliente ("Vanesa", 84652415, 16, 122);
		lista_clientes.add(cliente_4);
		
		Administrador admi_1 = new Administrador("JoseMaria", 71468514, 17, 150);
		lista_clientes.add(admi_1);
		
		Administrador admi_2 = new Administrador("Manu", 64781245, 16, 151);
		lista_clientes.add(admi_2);
		
		Administrador admi_3 = new Administrador("George", 24857414, 23, 152);
		lista_clientes.add(admi_3);
		
		Administrador admi_4 = new Administrador("Josefina", 76415785, 42, 153);
		lista_clientes.add(admi_4);
		
		
		for (Persona persona : lista_clientes) {
			persona.imprimir();
		}
	}
}














