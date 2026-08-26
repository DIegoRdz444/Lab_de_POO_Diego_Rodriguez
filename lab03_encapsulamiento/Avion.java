package lab03_encapsulamiento;

public class Avion extends Vehiculo {
    private int numMotores;
    private double altitudMaxima;

    public Avion(String marca, String modelo, int anio, double velocidadMax, int numMotores, double altitudMaxima) {
        super(marca, modelo, anio, velocidadMax);
        this.numMotores = numMotores;
        setAltitudMaxima(altitudMaxima);
    }

    public int getNumMotores() {
        return numMotores;
    }

    public double getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(double altitudMaxima) {
        if (altitudMaxima > 0) {
            this.altitudMaxima = altitudMaxima;
        } else {
            System.out.println("Error: altitud máxima no válida.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nMotores: " + numMotores + " | Altitud Máx: " + altitudMaxima + " m";
    }
}
