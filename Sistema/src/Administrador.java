
public class Administrador extends Persona {
	private int id_administrador;
	
	public Administrador(String persona, int dNI, int edad, int id_administrador) {
		super(persona, dNI, edad);
		this.id_administrador = id_administrador;
	}

	public Administrador() {
		id_administrador = 456;
	}
	
	public int getId_administrador() {
		return id_administrador;
	}

	public void setId_administrador(int id_administrador) {
		this.id_administrador = id_administrador;
	}
	
	public void imprimir() {
		if(getEdad() >= 18) {
		System.out.println("Datos del Administrador");
		System.out.println("------------------");
		System.out.println("Cliente : "+getPersona());
		System.out.println("DNI     : "+getDNI());
		System.out.println("Edad    : "+getEdad());
		System.out.println("ID      : "+getId_administrador());
		System.out.println("------------------\n");
		}
	}
}
