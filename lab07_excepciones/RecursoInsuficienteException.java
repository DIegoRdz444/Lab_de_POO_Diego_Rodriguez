package lab07_excepciones;

public class RecursoInsuficienteException extends RpgException {
    public RecursoInsuficienteException(String recurso, int disponible) {
        super("Recurso insuficiente: " + recurso + ". Disponible: " + disponible);
    }
}
