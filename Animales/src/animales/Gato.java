package animales;

public class Gato extends Animal {
	public int longitudBigotes;
	
	
	public Gato(String nombre, int edad, int longotudBigotes) {
		super(nombre, edad);
		
		this.longitudBigotes = longitudBigotes;
	}
	
	
	public void maullar() {
		System.out.println("Miau miamu");
		
	}

}
