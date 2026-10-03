package lab09_io;

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
        if (mana >= 15) {
            mana -= 15;
            System.out.println("[" + nombre + "] drena la esencia vital con magia oscura.");
        } else {
            System.out.println("[" + nombre + "] no tiene suficiente maná para atacar.");
        }
    }

    @Override
    public int calcularDanio() {
        return nivel * 40 + almasAbsorbidas * 10 + mana / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " | Maná: " + mana +
               " | Almas absorbidas: " + almasAbsorbidas;
    }
}
