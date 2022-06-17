package modelo.excepciones;

/**
 * Se lanza cuando la contrasena es incorrecta al nombre de usuario ingresado.
 */
public class ErrorDeContrasenaException extends Exception{

    public ErrorDeContrasenaException(String message) {
        super(message);
    }
}
