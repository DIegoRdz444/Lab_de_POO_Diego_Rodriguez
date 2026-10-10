package lab10_concurrencia;

public class Nigromante extends Personaje {
    private int mana;

    public Nigromante(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    @Override
    public void atacar() throws RpgException {
        if (mana >= 15) {
            mana -= 15;
            System.out.println("[" + nombre + "] lanza un hechizo oscuro.");
        } else {
            throw new RecursoInsuficienteException("mana", mana);
        }
    }

    @Override
    public int calcularDanio() {
        return nivel * 40 + mana / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " | Maná: " + mana;
    }
}
