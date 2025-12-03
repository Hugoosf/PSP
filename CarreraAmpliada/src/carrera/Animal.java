// Hecho por Hugo Suárez Fuella 2ºDAM
package carrera;

import java.util.concurrent.Semaphore;

public abstract class Animal implements Runnable{
	
	public static Semaphore tunel = new Semaphore(1);
	public static Semaphore liana1 = new Semaphore(1);
	public static Semaphore liana2 = new Semaphore(1);
	public static Semaphore liana3 = new Semaphore(1);
	public static Semaphore liana4 = new Semaphore(1);
	public int velocidad;
	public String nombre;
	public int distancia;
	
	public abstract void correrr();
	
	
	@Override
	public void run() {
		while(this.distancia <300) {
			this.correrr();
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
	            e.printStackTrace();
	        }
		}
		
		System.out.println("El/La "+this.nombre+" ha terminado la carrera");
		
	}
	

	public Animal(int velocidad, String nombre, int distancia) {
		this.velocidad = velocidad;
		this.nombre = nombre;
		this.distancia = distancia;
		
            
	}
	
	
	

}
