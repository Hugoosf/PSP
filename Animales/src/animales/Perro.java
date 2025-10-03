package animales;

public class Perro extends Animal {
	
	public String raza;
	
	
	public Perro(String nombre, int edad, String raza) {
		super(nombre, edad);
		
		this.raza = raza;
	}
	
	
	public void ladrar() {
		System.out.println("Guau guau");
		
	}
}
