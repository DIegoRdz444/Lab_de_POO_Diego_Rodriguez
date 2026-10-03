package lab09_io;

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
            System.out.println("[" + nombre + "] dispara una flecha con su " + tipoArco +
                               " (precisión: " + precision + "%). Restantes: " + flechasDisponibles);
        } else {
            System.out.println("[" + nombre + "] no tiene flechas disponibles.");
        }
    }

    @Override
    public int calcularDanio() {
        return nivel * 15 + precision;
    }

    @Override
    public String toString() {
        return super.toString() + " | Arco: " + tipoArco +
               " | Flechas: " + flechasDisponibles +
               " | Precisión: " + precision;
    }
}

