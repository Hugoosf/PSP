package cajareg;

import java.util.Random;

public class Empleado implements Runnable {
    private String nombre;
    private Caja caja;
    private Random random;

    public Empleado(String nombre, Caja caja) {
        this.nombre = nombre;
        this.caja = caja;
        this.random = new Random();
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
               
                double importe = 5 + (100 - 5) * random.nextDouble();

               
                caja.cobrar(importe);

              
                System.out.printf("Empleado %s cobró %.2f €. Total en caja: %.2f €%n",
                        nombre, importe, caja.getTotal());

              
                Thread.sleep(500 + random.nextInt(1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

