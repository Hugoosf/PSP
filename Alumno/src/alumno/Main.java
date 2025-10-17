package alumno;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el nombre del alumno 1: ");
		String uno = sc.nextLine();
		System.out.print("Introduce el nombre del alumno 2: ");
		String dos = sc.nextLine();
		System.out.print("Introduce el nombre del alumno 3: ");
		String tres = sc.nextLine();
		
		Alumno a1 = new Alumno(uno);
		Alumno a2 = new Alumno(dos);
		Alumno a3 = new Alumno(tres);
		
		Thread b1 = new Thread(a1);
		Thread b2 = new Thread(a2);
		Thread b3 = new Thread(a3);
		
		b1.start();
		try {
		    b1.join();  
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}

		b2.start();
		try {
		    b2.join();  
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}

		b3.start();
		try {
		    b3.join();  
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}


	}

}
