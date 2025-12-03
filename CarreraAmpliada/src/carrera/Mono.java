package carrera;

import java.util.Random;

public class Mono extends Animal{
	
	
	public Mono(int velocidad, String nombre, int distancia) {
        super(velocidad, nombre, distancia);
    }
	
	
	
	
	@Override
	public void correrr() {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(2);
		if(numeroAleatorio == 0) {
			this.velocidad = 4;
		}else {
			this.velocidad = 6;
		}
		int liana = 0;
		boolean lianita = true;
		while(this.distancia <300) {
			while(lianita == true) {
			if(this.distancia >= liana) {
				liana+=20;
				try {
					
					liana1.acquire();
					System.out.println("El "+this.nombre + " llegó a la liana 1");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				while(this.distancia <liana) {
					this.distancia += this.velocidad;
					
					System.out.println("El "+this.nombre+" ha recorrido "+this.distancia+"m");
					try {
	    				Thread.sleep(1000);
	    			}catch(InterruptedException e) {
	    	            e.printStackTrace();
	    	        }
				}
			}
			
			if(this.distancia >=liana){
				liana+=20;
				liana1.release();
				try {
					liana2.acquire();
					System.out.println("El "+this.nombre + " salió de la liana 1 y llegó a la liana 2");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				while(this.distancia <liana) {
					this.distancia += this.velocidad;
					
					System.out.println("El "+this.nombre+" ha recorrido "+this.distancia+"m");
					try {
	    				Thread.sleep(1000);
	    			}catch(InterruptedException e) {
	    	            e.printStackTrace();
	    	        }
				}
			}
			
			if(this.distancia >=liana){
				liana+=20;
				liana2.release();
				try {
					liana3.acquire();
					System.out.println("El "+this.nombre + " salió de la liana 2 y llegó a la liana 3");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				while(this.distancia <liana) {
					this.distancia += this.velocidad;
					
					System.out.println("El "+this.nombre+" ha recorrido "+this.distancia+"m");
					try {
	    				Thread.sleep(1000);
	    			}catch(InterruptedException e) {
	    	            e.printStackTrace();
	    	        }
				}
			}
			
			if(this.distancia >=liana){
				liana+=20;
				liana3.release();
				try {
					liana4.acquire();
					System.out.println("El "+this.nombre + " salió de la liana 3 y llegó a la liana 4");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				while(this.distancia <liana) {
					this.distancia += this.velocidad;
					
					System.out.println("El "+this.nombre+" ha recorrido "+this.distancia+"m");
					try {
	    				Thread.sleep(1000);
	    			}catch(InterruptedException e) {
	    	            e.printStackTrace();
	    	        }
				}
			}
			
			liana4.release();
			System.out.println("El "+this.nombre + " salió de la liana 4");
			lianita = false;
			}
			
			this.distancia += this.velocidad;
			
			System.out.println("El "+this.nombre+" ha recorrido "+this.distancia+"m");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
	            e.printStackTrace();
	        }
			
			
			
		}
		
	}
	

}
