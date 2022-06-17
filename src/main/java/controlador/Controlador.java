package controlador;

import vista.IVista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private IVista vista;

    public Controlador(IVista vista) {
        this.vista = vista;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
