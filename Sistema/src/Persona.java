
public abstract class Persona {
	private String persona;
	private int DNI;
	private int edad;
	boolean mayor = false;
	
	public Persona(String persona, int dNI, int edad) {
		this.persona = persona;
		DNI = dNI;
		this.edad = edad;
	}
	public Persona() {
		persona = "diego";
		DNI = 70318982;
		edad = 25;
	}

	public String getPersona() {
		return persona;
	}
	public void setPersona(String persona) {
		this.persona = persona;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public abstract void imprimir();
}












