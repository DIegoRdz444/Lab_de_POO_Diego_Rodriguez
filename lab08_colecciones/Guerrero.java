package lab08_colecciones;

public class Guerrero extends Personaje {
    private int fuerza;
    private String arma;

    public Guerrero(String nombre, int nivel, int puntosVida, int fuerza, String arma) {
        super(nombre, nivel, puntosVida);
        this.fuerza = fuerza;
        this.arma = arma;
    }

    @Override
    public void atacar() {
        System.out.println("[" + nombre + "] ataca con su " + arma + " causando " + fuerza + " de daño.");
    }

    @Override
    public int calcularDanio() {
        return fuerza + nivel * 10;
    }
}