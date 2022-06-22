package vista;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.WindowListener;

public interface IVista {

    void setActionListener(ActionListener controlador);

    void setWindowListener(WindowListener controlador);

    void ejecutar();

    void ocultar();

    void creaOtraVentana(String ventana);

    void lanzarVentanaEmergente(String mensaje);
}
