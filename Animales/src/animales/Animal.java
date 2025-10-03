package animales;

public class Animal {
	
	public String nombre;
	public int edad;
	
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		
		
            
	}
	
	
	public void mostrarDatos() {
		System.out.println("El animal se llama "+this.nombre+" y tiene "+this.edad+" años.");
	}
	

}
