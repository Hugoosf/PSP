// Hecho por Hugo Suárez Fuella 2ºDAM
package carrera;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Liebre extends Animal {
	
	private boolean enTunel = false;
	public Liebre(int velocidad, String nombre, int distancia) {
        super(velocidad, nombre, distancia);
    }

	public Liebre() {
        this(5, "liebre", 0); 
	}
	
    @Override
    public void correrr() {
    	Random random = new Random();
    	
    	while(this.distancia <300) { 
 	            
 	            if (this.distancia >= 50 && this.distancia < 150 && !enTunel) {
 	            	try {
 	                   System.out.println("La "+this.nombre + " llegó al túnel y está esperando para entrar");
 	                   tunel.acquire();
 	                   enTunel = true;
 	                   System.out.println("La "+this.nombre + " ha entrado al túnel");
 	               } catch (InterruptedException e) {
 	                   e.printStackTrace();
 	               }

 	            }

 	            
 	            if (this.distancia >= 150 && enTunel) {
 	            	tunel.release();
 	               enTunel = false;
 	               System.out.println("La "+this.nombre+ " ha salido del túnel");
 	               
 	            }
 	        
    		for(int i=1; i<=4; i++) {
    			
    			if(this.distancia%10 == 0) {
    				int numeroAleatorio = random.nextInt(2);
    		        
    		        if(numeroAleatorio == 0) {
    		        	for(int j=1; j<=5; j++) {
    		        	System.out.println("La liebre se ha resbalado con un charco ("+j+" segundos)");
    		        	try {
    	    				Thread.sleep(1000);
    	    			}catch(InterruptedException e) {
    	    	            e.printStackTrace();
    	    	        }
    		        	}
    		        	
    		        }
    		        
    				
    			}
    			this.distancia += this.velocidad;
    			System.out.println("La "+this.nombre+" ha recorrido "+this.distancia+"m");
    			try {
    				Thread.sleep(1000);
    			}catch(InterruptedException e) {
    	            e.printStackTrace();
    	        }
    			
    			
    		}
    		for(int i=1; i<=10; i++) {
    			System.out.println("La "+this.nombre+" está durmiendo "+"(turno "+i+")");
    			int numeroAleatorio = random.nextInt(2);
    			if(numeroAleatorio == 0) {
    				System.out.println("La liebre se ha despertado con el viento");
    				break;
    			}
    			try {
    				Thread.sleep(1000);
    			}catch(InterruptedException e) {
    	            e.printStackTrace();
    	        }
    			
    			
    		}
		}
    }
    }
