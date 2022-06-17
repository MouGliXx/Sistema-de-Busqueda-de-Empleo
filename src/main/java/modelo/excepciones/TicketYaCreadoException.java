package modelo.excepciones;

/**
 * Se lanza cuando el empleado pretenso ya posee un ticket activo o suspendido como atributo.
 */
public class TicketYaCreadoException extends Exception{

    public TicketYaCreadoException(String message) {
        super(message);
    }
}
