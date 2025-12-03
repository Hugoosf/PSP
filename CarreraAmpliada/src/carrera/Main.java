// Hecho por Hugo Suárez Fuella 2ºDAM
package carrera;

public class Main {

	public static void main(String[] args) {
        Tortuga t = new Tortuga();
        Liebre l = new Liebre();
        Pajaro p = new Pajaro();
        Mono m1 = new Mono(4, "mono1", 0);
        Mono m2 = new Mono(4, "mono2", 0);
        Mono m3 = new Mono(4, "mono3", 0);

        new Thread(t).start();
        new Thread(l).start();
        new Thread(p).start();
        new Thread(m1).start();
        new Thread(m2).start();
        new Thread(m3).start();
    }

}
