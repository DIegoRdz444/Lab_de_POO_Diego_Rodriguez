package lab08_colecciones;

public class Druida extends Personaje {
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
    public void atacar() {
        System.out.println("[" + nombre + "] invoca fuerzas de la naturaleza en forma de " + formaNatural + ".");
    }

    @Override
    public int calcularDanio() {
        return nivel * 30 + mana;
    }

    public void curarAliado(Personaje aliado) {
        aliado.puntosVida += poderCuracion;
        System.out.println(nombre + " cura a " + aliado.getNombre() +
                           " +" + poderCuracion + ". Vida: " + aliado.getPuntosVida());
    }

    @Override
    public String toString() {
        return super.toString() + " | Maná: " + mana +
               " | Poder de curación: " + poderCuracion +
               " | Forma natural: " + formaNatural;
    }
}
