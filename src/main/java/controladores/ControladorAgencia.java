package controladores;

import modelo.usuarios.Agencia;
import vista.VentanaAgencia;

import java.awt.event.*;

public class ControladorAgencia implements ActionListener, KeyListener {
    private VentanaAgencia vista;
    private Agencia modelo;

    public ControladorAgencia(VentanaAgencia vista,Agencia modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.setActionListener(this);
        vista.setKeyListener(this);
        vista.getTextoBienvenido().setText("Bienvenido, " + modelo.getNombreUsuario());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {

            case "Ronda de Encuentros Laborales":
                break;
            case "Ronda de Contrataciones":
                break;
            case "Agregar Datos":

                break;
            case "boxDatosCargados":
                switch (vista.getBoxDatosCargados().getSelectedIndex()) {
                    case 0:

                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;

                }
                break;
            case "":
                System.out.println("NADA");
                break;
            case "Empleadores":
                System.out.println("EMPLEADORES");
                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (vista.getTextoTiposDeTrabajo().getText().isEmpty() && vista.getTextoRangoLaboral().getText().isEmpty() && vista.getTextoTiposDePuestos().getText().isEmpty())
            vista.getBotonAgregarDatos().setEnabled(false);
        else
            vista.getBotonAgregarDatos().setEnabled(true);
    }

    //METODOS NO USADOS
    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }


}
