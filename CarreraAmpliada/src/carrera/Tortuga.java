// Hecho por Hugo Suárez Fuella 2ºDAM
package carrera;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Tortuga extends Animal{
	
	private boolean enTunel = false;
	public Tortuga(int velocidad, String nombre, int distancia) {
        super(velocidad, nombre, distancia);
    }

	public Tortuga() {
        this(2, "tortuga", 0); 
	}
	
    @Override
    public void correrr() {
    	Random random = new Random();
    	int charco = 10;
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
    		
    			
    			if(this.distancia >= charco) {
    				int numeroAleatorio = random.nextInt(2);
    		        
    		        if(numeroAleatorio == 0) {
    		        	this.distancia += (this.velocidad+3);
    		        	System.out.println("La "+this.nombre+" ha pisado un charco y ha recorrido "+this.distancia+"m");
    		        	charco += 10;
    		        	
    		        }else {
    		        	this.distancia += this.velocidad;
    		        	System.out.println("La "+this.nombre+" ha esquivado un charco y ha recorrido "+this.distancia+"m");
    		        	charco += 10;
    		        }
    		        
    				
    			}else {
    				this.distancia += this.velocidad;
        			System.out.println("La "+this.nombre+" ha recorrido "+this.distancia+"m");
    			}
    			
    			try {
    				Thread.sleep(1000);
    			}catch(InterruptedException e) {
    	            e.printStackTrace();
    	        }
    			
    			
    		}
    }
		}
       
    
