package lab06_abstractas_interfaces;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG — Expansión: Nuevas Clases ===\n");

        // Error esperado: no se puede instanciar una clase abstracta
        // Personaje p = new Personaje("X", 1, 100);

        Druida druida = new Druida("Sylva", 7, 200, 180, 120, "Forma de oso");
        Nigromante nigromante = new Nigromante("Malachar", 6, 350, 220, 15);
        Bardo bardo = new Bardo("Finnian", 5, 150, 60, "Laúd");

        System.out.println("-- Ataques y daño --");
        Personaje[] equipo = { druida, nigromante, bardo };
        for (Personaje p : equipo) {
            p.atacar();
            System.out.println("Daño: " + p.calcularDanio());
        }

        System.out.println("\n-- Solo los Hechiceros lanzan hechizos --");
        for (Personaje p : equipo) {
            if (p instanceof Hechicero h) {
                h.lanzarHechizo();
            }
        }

        System.out.println("\n-- Solo los Sanadores curan --");
        nigromante.recibirDanio(300);
        for (Personaje p : equipo) {
            if (p instanceof Sanador s) {
                s.curarAliado(nigromante);
            }
        }

        System.out.println("\n-- Estado final --");
        for (Personaje p : equipo) {
            System.out.println(p);
        }
    }
}
