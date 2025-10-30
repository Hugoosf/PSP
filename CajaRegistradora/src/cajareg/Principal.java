package cajareg;

public class Principal {
    public static void main(String[] args) {
        System.out.println("🧾 Iniciando simulación de caja registradora...\n");

        Caja cajaCompartida = new Caja();

        
        Thread ana = new Thread(new Empleado("Ana", cajaCompartida));
        Thread luis = new Thread(new Empleado("Luis", cajaCompartida));
        Thread maria = new Thread(new Empleado("María", cajaCompartida));

       
        ana.start();
        luis.start();
        maria.start();

      
        try {
            ana.join();
            luis.join();
            maria.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("TOTAL FINAL EN CAJA: %.2f €%n", cajaCompartida.getTotal());
    }
}

