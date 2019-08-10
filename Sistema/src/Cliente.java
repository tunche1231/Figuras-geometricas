
public class Cliente extends Persona {
	private int id_cliente;
	
	public Cliente(String persona, int dNI, int edad, int id_cliente) {
		super(persona, dNI, edad);
		this.id_cliente = id_cliente;
	}

	public Cliente() {
		id_cliente = 123;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	public void imprimir() {
		if(getEdad() >= 30) {
		System.out.println("Datos del Cliente");
		System.out.println("------------------");
		System.out.println("Cliente : "+getPersona());
		System.out.println("DNI     : "+getDNI());
		System.out.println("Edad    : "+getEdad());
		System.out.println("ID      : "+getId_cliente());
		System.out.println("------------------\n");
		}
	}
}
