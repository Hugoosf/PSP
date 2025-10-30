package cajareg;

public class Caja {
    private double total;

    public Caja() {
        this.total = 0.0;
    }

    public synchronized void cobrar(double cantidad) {
        total += cantidad;
    }

    public synchronized double getTotal() {
        return total;
    }
}

