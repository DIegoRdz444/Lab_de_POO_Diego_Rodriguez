package lab08_colecciones;

public class Arquero extends Personaje {
    private String tipoArco;
    private int flechasDisponibles;
    private int precision;

    public Arquero(String nombre, int nivel, int puntosVida, String tipoArco, int flechasDisponibles, int precision) {
        super(nombre, nivel, puntosVida);
        this.tipoArco = tipoArco;
        this.flechasDisponibles = flechasDisponibles;
        this.precision = precision;
    }

    @Override
    public void atacar() {
        if (flechasDisponibles > 0) {
            flechasDisponibles--;
            System.out.println("[" + nombre + "] dispara una flecha con precisión del " + precision + "% usando su " + tipoArco + ".");
        } else {
            System.out.println("[" + nombre + "] no tiene flechas disponibles.");
        }
    }

    @Override
    public int calcularDanio() {
        return nivel * 15 + precision;
    }
}
