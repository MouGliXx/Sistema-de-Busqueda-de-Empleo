package modelo.usuarios;

import modelo.excepciones.DatosMalIngresadosException;
import modelo.excepciones.ErrorDeUsuarioException;
import modelo.Sistema;
import modelo.usuarios.empleadores.PersonaFisica;
import modelo.usuarios.empleadores.PersonaJuridica;

public class UsuarioFactory {

    public void creaUsuario(String nombreUsuario, String contrasena, String tipo) throws DatosMalIngresadosException, ErrorDeUsuarioException {
        if (tipo.equalsIgnoreCase("AGENCIA"))
            if (Sistema.getInstance().getAgencia() == null)
                Sistema.getInstance().setAgencia(new Agencia(nombreUsuario,contrasena));
            else
                throw new DatosMalIngresadosException("Tipo Usuario (ya existe un administrador)");
        else
<<<<<<< Updated upstream
        if (tipo.equalsIgnoreCase("EMPLEADO PRETENSO"))
=======
        if (tipo.equalsIgnoreCase("Empleado Pretenso"))
>>>>>>> Stashed changes
            Sistema.getInstance().registrarUsuario(new Empleado_Pretenso(nombreUsuario, contrasena));
        else
        if (tipo.equalsIgnoreCase("PERSONA FISICA"))
            Sistema.getInstance().registrarUsuario(new PersonaFisica(nombreUsuario, contrasena));
        else
        if (tipo.equalsIgnoreCase("PERSONA JURIDICA"))
            Sistema.getInstance().registrarUsuario(new PersonaJuridica(nombreUsuario, contrasena));
        else
            throw new DatosMalIngresadosException("Tipo Usuario");
    }
}
