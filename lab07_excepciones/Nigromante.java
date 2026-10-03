package lab07_excepciones;

public class Nigromante extends Personaje implements Hechicero {
    private int mana;
    private int almasAbsorbidas;

    public Nigromante(String nombre, int nivel, int puntosVida, int mana, int almasAbsorbidas) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
        this.almasAbsorbidas = almasAbsorbidas;
    }

    @Override
    public void atacar() throws RpgException {
        if (!isEstaVivo()) {
            throw new PersonajeDerrotadoException(getNombre());
        }
        if (mana < 15) {
            throw new RecursoInsuficienteException("mana", mana);
        }
        mana -= 15;
        System.out.println("[" + nombre + "] drena la esencia vital con magia oscura.");
    }

    @Override
    public int calcularDanio() {
        return nivel * 40 + almasAbsorbidas * 10 + mana / 2;
    }

    @Override
    public void lanzarHechizo() throws RpgException {
        if (mana < 15) {
            throw new RecursoInsuficienteException("mana", mana);
        }
        mana -= 15;
        System.out.println(nombre + " lanza: ¡Maldición de decadencia!");
    }

    @Override
    public int getMana() { return mana; }
}
