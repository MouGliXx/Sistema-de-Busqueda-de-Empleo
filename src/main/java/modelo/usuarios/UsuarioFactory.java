package modelo.usuarios;

import excepciones.DatosMalIngresadosException;
import excepciones.ErrorDeUsuarioException;
import modelo.Sistema;
import modelo.usuarios.empleadores.PersonaFisica;
import modelo.usuarios.empleadores.PersonaJuridica;

public class UsuarioFactory {

    public void creaUsuario(String nombreUsuario, String contrasena, String tipo) throws DatosMalIngresadosException {
        try {
            if (tipo.equalsIgnoreCase("AGENCIA"))
                if (Sistema.getInstance().getAgencia() == null)
                    Sistema.getInstance().setAgencia(new Agencia(nombreUsuario,contrasena));
                else 
                    throw new DatosMalIngresadosException("Tipo Usuario (ya existe un administrador)");
            else
                if (tipo.equalsIgnoreCase("EMPLEADO PRETENSO"))
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
        catch (ErrorDeUsuarioException e1) {
            System.out.println(e1.getMessage());
        }
    }
}
