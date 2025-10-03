package animales;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Gato> gatos = new ArrayList();
		ArrayList<Perro> perros = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		
		int option;
		
		System.out.println("¿Qué quieres hacer?:\n1.Añadir animal\n2.Mostrar datos de los animales\n0.Salir");
		
		option = sc.nextInt();
		
		while(option != 0) {
			
			if(option == 1){
				System.out.print("Nombre: ");
				sc.nextLine();
				
				String nombre = sc.nextLine();
				
				System.out.print("Edad: ");
				
				int edad = sc.nextInt();
				
				System.out.println("¿Perro o gato?:\n1.Perro\n2.Gato");
				int option2 = sc.nextInt();
				if(option2 == 1) {
					
					System.out.print("¿Qué raza es?: ");
					sc.nextLine();
					String raza = sc.nextLine();
					
					Perro perro = new Perro(nombre, edad, raza);
					
					perros.add(perro);
					
				}else {
					
					System.out.print("¿Cuánto miden sus bigotes?: ");
					int longitudBigotes = sc.nextInt();
					
					Gato gato = new Gato(nombre, edad, longitudBigotes);
					gatos.add(gato);
					
				}
			}else if(option == 2){
				
				System.out.println("Listado de perros: ");
				for (Perro perro: perros) {
					int i = 1;
		            System.out.println("Perro número "+i+"\nNombre: "+perro.nombre+"\nEdad: "+perro.edad+"\nRaza: "+perro.raza);
		            perro.ladrar();
		            System.out.println();
		            i++;
		        }
				
				System.out.println("Listado de gatos: ");
				
				for (Gato gato: gatos) {
					int i = 1;
		            System.out.println("Gato número "+i+"\nNombre: "+gato.nombre+"\nEdad: "+gato.edad+"\nLongitud bigotes: "+gato.longitudBigotes+"mm");
		            gato.maullar();
		            System.out.println();
		            i++;
		        }
				
				
			}else {
				System.out.println("Esa opción no es válida, por favor elija otra.");
			}
			
			System.out.println("¿Qué quieres hacer?:\n1.Añadir animal\n2.Mostrar datos de los animales\n0.Salir");
			
			option = sc.nextInt();
			
			
		}
		
		System.out.println("FIN DEL PROGRAMA");
		
		

	}

}
