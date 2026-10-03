package lab09_io;

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
        if (mana >= 10) {
            mana -= 10;
            System.out.println("[" + nombre + "] invoca fuerzas de la naturaleza en forma de " + formaNatural + ".");
        } else {
            System.out.println("[" + nombre + "] no tiene suficiente maná para atacar.");
        }
    }

    @Override
    public int calcularDanio() {
        return nivel * 30 + mana;
    }

    public void curarAliado(Personaje aliado) {
        if (aliado != null && aliado.isEstaVivo()) {
            aliado.puntosVida += poderCuracion;
            System.out.println(nombre + " cura a " + aliado.getNombre() +
                               " +" + poderCuracion + ". Vida: " + aliado.getPuntosVida());
        } else {
            System.out.println(nombre + " no puede curar a un aliado inválido.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Maná: " + mana +
               " | Poder de curación: " + poderCuracion +
               " | Forma natural: " + formaNatural;
    }
}
