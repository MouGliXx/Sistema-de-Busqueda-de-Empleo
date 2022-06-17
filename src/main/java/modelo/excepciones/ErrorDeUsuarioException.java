package modelo.excepciones;

/**
 * Se lanza cuando el usuario no esta registrado en el sistema o cuando el nombre de usuario ya existe en el sistema a la hora de loguear un usuario.
 */
public class ErrorDeUsuarioException extends Exception{

    public ErrorDeUsuarioException(String message) {
        super(message);
    }
}
