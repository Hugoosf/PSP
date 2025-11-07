package tortutunel;

import java.util.concurrent.Semaphore;

public class Tortugas implements Runnable {

    private static final Semaphore tunel = new Semaphore(1); 

    private String nombre;
    private int velocidad = 1;
    private int distancia = 0;
    

    public Tortugas(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while (distancia < 20) { 
            avanzar();
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("🐢 " + nombre + " ha terminado la carrera!");
    }

    private void avanzar() {
        distancia += velocidad;
        System.out.println("La tortuga " + nombre + " ha recorrido " + distancia + " metros");

        try {
            
            if (distancia == 5) {
                System.out.println("🚧 " + nombre + " llegó al túnel y está esperando para entrar...");
                tunel.acquire(); 
               
                System.out.println("✅ " + nombre + " ha entrado al túnel");
            }

            
            if (distancia == 15) {
                System.out.println("🚪 " + nombre + " ha salido del túnel");
                tunel.release(); 
               
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    
}

