package lab07_excepciones;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG — Sistema con Manejo de Excepciones ===");

        Druida druida = new Druida("Sylva", 10, 300, 50, 120, "Oso");
        Nigromante nigromante = new Nigromante("Malachar", 8, 250, 40, 10);
        Arquero arquero = new Arquero("Legolas", 6, 150, "Arco Largo", 0, 95);

        MotorCombate motor = new MotorCombate();

        // Escenario 1 — Turno normal
        motor.ejecutarTurno(druida, nigromante);

        // Escenario 2 — Personaje derrotado intenta atacar
        try {
            druida.recibirDanio(9999); // derrota al druida
        } catch (AccionInvalidaException e) {
            System.out.println("⚠ " + e.getMessage());
        }
        motor.ejecutarTurno(druida, nigromante);

        // Escenario 3 — Arquero sin flechas
        motor.ejecutarTurno(arquero, nigromante);

        // Escenario 4 — Curar aliado derrotado
        Druida druida2 = new Druida("Aelar", 9, 280, 60, 100, "Águila");
        try {
            druida2.curarAliado(druida); // intenta curar al druida derrotado
        } catch (RpgException e) {
            System.out.println("-- Intento de curar aliado derrotado --");
            System.out.println("No se pudo curar: " + e.getMessage());
        }

        // Escenario 5 — Daño negativo con finally
        try {
            nigromante.recibirDanio(-50);
        } catch (AccionInvalidaException e) {
            System.out.println("-- Bloque manual try-catch-finally --");
            System.out.println("Capturado: " + e.getMessage());
        } finally {
            System.out.println("El bloque finally siempre se ejecuta.");
        }

        // Escenario 6 — Mostrar bitácora completa
        motor.mostrarBitacora();
    }
}