package lab07_excepciones;

public class Druida extends Personaje implements Hechicero, Sanador {
    private int mana;
    private int poderCuracion;
    private String formaNatural;

    public Druida(String nombre, int nivel, int puntosVida, int mana, int poderCuracion, String formaNatural) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
        this.poderCuracion = poderCuracion;
        this.formaNatural = formaNatural;
    }

    @Override
    public void atacar() throws RpgException {
        if (!isEstaVivo()) {
            throw new PersonajeDerrotadoException(getNombre());
        }
        if (mana < 10) {
            throw new RecursoInsuficienteException("mana", mana);
        }
        mana -= 10;
        System.out.println("[" + nombre + "] invoca fuerzas de la naturaleza en forma de " + formaNatural + ".");
    }

    @Override
    public int calcularDanio() {
        return nivel * 30 + mana;
    }

    @Override
    public void lanzarHechizo() throws RpgException {
        if (mana < 10) {
            throw new RecursoInsuficienteException("mana", mana);
        }
        mana -= 10;
        System.out.println(nombre + " lanza un hechizo de naturaleza con forma de " + formaNatural + ".");
    }

    @Override
    public int getMana() { return mana; }

    @Override
    public void curarAliado(Personaje aliado) throws RpgException {
        if (aliado == null) {
            throw new PersonajeNuloException("curarAliado");
        }
        if (!aliado.isEstaVivo()) {
            throw new AccionInvalidaException("curarAliado", "No se puede curar a un personaje derrotado");
        }
        aliado.puntosVida += poderCuracion;
        System.out.println(nombre + " cura a " + aliado.getNombre() + " +" + poderCuracion + ". Vida: " + aliado.getPuntosVida());
    }

    @Override
    public int getPoderCuracion() { return poderCuracion; }

    @Override
    public String toString() {
        return super.toString() + " | Maná: " + mana +
               " | Poder de curación: " + poderCuracion +
               " | Forma natural: " + formaNatural;
    }
}