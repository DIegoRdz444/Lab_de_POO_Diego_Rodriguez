package lab10_concurrencia;

public class Druida extends Personaje {
    private int mana;

    public Druida(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    @Override
    public void atacar() throws RpgException {
        if (mana >= 10) {
            mana -= 10;
            System.out.println("[" + nombre + "] invoca fuerzas de la naturaleza.");
        } else {
            throw new RecursoInsuficienteException("mana", mana);
        }
    }

    @Override
    public int calcularDanio() {
        return nivel * 30 + mana;
    }

    @Override
    public String toString() {
        return super.toString() + " | Maná: " + mana;
    }
}
