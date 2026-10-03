package lab07_excepciones;

public class RpgException extends Exception {
    public RpgException(String mensaje) {
        super(mensaje);
    }

    public RpgException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
