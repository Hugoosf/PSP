package carrera;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Pajaro extends Animal{
	
	private boolean enTunel = false;
	public Pajaro(int velocidad, String nombre, int distancia) {
        super(velocidad, nombre, distancia);
    }

	public Pajaro() {
        this(3, "pájaro", 0); 
	}
	
    @Override
    public void correrr() {
    	Random random = new Random();
    	int charco = 10;
    	boolean charcoo = false;
    	while(this.distancia <300) { 
    		 if (this.distancia >= 50 && this.distancia < 150 && !enTunel) {
	            	try {
	                   System.out.println("El "+this.nombre + " llegó al túnel y está esperando para entrar");
	                   tunel.acquire();
	                   enTunel = true;
	                   System.out.println("El "+this.nombre + " ha entrado al túnel");
	               } catch (InterruptedException e) {
	                   e.printStackTrace();
	               }

	            }

	            
	            if (this.distancia >= 150 && enTunel) {
	            	tunel.release();
	               enTunel = false;
	               System.out.println("El "+this.nombre+ " ha salido del túnel");
	               
	            }
    		int numeroAleatorio = random.nextInt(2);
    		if(this.distancia >= charco) {
    			charco+=10;
    			charcoo = true;
    			
    		}
    			
    		
    		if(numeroAleatorio == 0) {
    			this.velocidad = 3;
    			if(charcoo == false) {
    			this.distancia += this.velocidad;
    			System.out.println("El "+this.nombre+" está caminando, lleva recorridos "+this.distancia+"m");
    			}else {
    				
    				for(int j=1; j<=5; j++) {
    					System.out.println("El "+this.nombre+" ha pisado un charco y va a perder 5 segundos (segundo "+j+")");
    		        	try {
    	    				Thread.sleep(1000);
    	    			}catch(InterruptedException e) {
    	    	            e.printStackTrace();
    	    	        }
    		        	}
    				charcoo = false;
    			}
    		}else {
    			numeroAleatorio = random.nextInt(2);
    			if(numeroAleatorio == 0) {
    				numeroAleatorio = random.nextInt(2);
    				if(numeroAleatorio == 0) {
    					this.distancia += 10;
    					System.out.println("El pájaro ha volado positivamente, lleva "+this.distancia+"m");
    				}else {
    					this.distancia -= 10;
    					System.out.println("El pájaro ha volado negativamente, lleva "+this.distancia+"m");
    				}
    				
    			}else {
    				numeroAleatorio = random.nextInt(2);
    				if(numeroAleatorio == 0) {
    					this.distancia += 5;
    					System.out.println("El pájaro estaba volando y le ha afectado el viento positivamente, lleva "+this.distancia+"m");
    				}else {
    					
    					this.distancia -= 5;
    					System.out.println("El pájaro estaba volando y le ha afectado el viento negativamente, lleva "+this.distancia+"m");
    				}
    				
    			}
    			charcoo = false;
    			
    		}
    			
    			try {
    				Thread.sleep(1000);
    			}catch(InterruptedException e) {
    	            e.printStackTrace();
    	        }
    			
    	}
    		}
    		
		}
