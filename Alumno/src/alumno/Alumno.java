package alumno;

public class Alumno implements Runnable {
    
    public String nombre;
    public int mensaje = 1;
    private volatile boolean seguir = true; 

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

 
    @Override
    public void run() {
        if (this.nombre.equals("Pepito")) {
            System.out.println("Mira que ser yo Pepito... pues me cierro");
        } else {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hola soy " + this.nombre + " y este es mi mensaje número " + i);
                try {
                    Thread.sleep(1000);  
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }

    
}

