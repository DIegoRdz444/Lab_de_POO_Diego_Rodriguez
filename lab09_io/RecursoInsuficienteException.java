package lab09_io;

public class RecursoInsuficienteException extends RpgException {
    public RecursoInsuficienteException(String recurso, int disponible) {
        super("Recurso insuficiente: " + recurso + ". Disponible: " + disponible);
    }
}
