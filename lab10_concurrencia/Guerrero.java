package lab10_concurrencia;

public class Guerrero extends Personaje {
    private String arma;
    private int fuerza;

    public Guerrero(String nombre, int nivel, int puntosVida, String arma, int fuerza) {
        super(nombre, nivel, puntosVida);
        this.arma = arma;
        this.fuerza = fuerza;
    }

    @Override
    public void atacar() {
        System.out.println("[" + nombre + "] ataca con su " + arma + " causando " + fuerza + " de daño.");
    }

    @Override
    public int calcularDanio() {
        return fuerza + nivel * 10;
    }

    @Override
    public String toString() {
        return super.toString() + " | Arma: " + arma + " | Fuerza: " + fuerza;
    }
}
