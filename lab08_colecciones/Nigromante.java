package lab08_colecciones;

public class Nigromante extends Personaje {
    private int mana;
    private int almasAbsorbidas;

    public Nigromante(String nombre, int nivel, int puntosVida, int mana, int almasAbsorbidas) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
        this.almasAbsorbidas = almasAbsorbidas;
    }

    @Override
    public void atacar() {
        System.out.println("[" + nombre + "] drena la esencia vital con magia oscura.");
    }

    @Override
    public int calcularDanio() {
        return nivel * 40 + almasAbsorbidas * 10 + mana / 2;
    }

    public void lanzarHechizo() {
        System.out.println(nombre + " lanza: ¡Maldición de decadencia! (maná: " + mana + ")");
    }

    @Override
    public String toString() {
        return super.toString() + " | Maná: " + mana +
               " | Almas absorbidas: " + almasAbsorbidas;
    }
}
