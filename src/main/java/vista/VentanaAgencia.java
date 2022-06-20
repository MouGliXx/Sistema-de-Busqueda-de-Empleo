package vista;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class VentanaAgencia extends JFrame implements IVistaAgencia{
    private JPanel panelPrincipal;
    private JTabbedPane panelVentanas;
    private JButton botonComisiones;
    private JButton botonVerDatos;
    private JButton botonIngresarDatos;
    private JButton botonPerfil;
    private JPanel panelMenu;
    private JButton botonDarDeBaja;
    private JButton botonRondaDeEncuentrosLaborales;
    private JButton botonRondaDeContrataciones;
    private JPanel panelRondas;
    private JPanel panelTitulo;
    private JTextField textoTiposDeTrabajo;
    private JList listaTiposDeTrabajo;
    private JList listaTiposDePuestos;
    private JList listaRangoLaboral;
    private JComboBox<String> boxDatosCargados;
    private JList<String> listaDatosCargados;
    private JPanel panelTiposDeTrabajo;
    private JPanel panelTiposDePuestos;
    private JPanel panelTextoprincipal;
    private JPanel panelAgregarDatos;
    private JButton calcularComisionesButton;
    private JList listaComisiones;
    private JPanel panelTextoPrincipal;
    private JPanel panelLista;
    private JLabel textoBienvenido;
    private JLabel textoAgencia;
    private JPanel panelRangoLaboral;
    private JButton botonAgregarDatos;
    private JTextField textoRangoLaboral;
    private JTextField textoTiposDePuestos;

    public JComboBox getBoxDatosCargados() {
        return boxDatosCargados;
    }

    public void setBoxDatosCargados(JComboBox boxDatosCargados) {
        this.boxDatosCargados = boxDatosCargados;
    }

    public JTextField getTextoTiposDeTrabajo() {
        return textoTiposDeTrabajo;
    }

    public void setTextoTiposDeTrabajo(JTextField textoTiposDeTrabajo) {
        this.textoTiposDeTrabajo = textoTiposDeTrabajo;
    }

    public JTextField getTextoRangoLaboral() {
        return textoRangoLaboral;
    }

    public void setTextoRangoLaboral(JTextField textoRangoLaboral) {
        this.textoRangoLaboral = textoRangoLaboral;
    }

    public JTextField getTextoTiposDePuestos() {
        return textoTiposDePuestos;
    }

    public void setTextoTiposDePuestos(JTextField textoTiposDePuestos) {
        this.textoTiposDePuestos = textoTiposDePuestos;
    }

    public JButton getBotonAgregarDatos() {
        return botonAgregarDatos;
    }

    public void setBotonAgregarDatos(JButton botonAgregarDatos) {
        this.botonAgregarDatos = botonAgregarDatos;
    }

    public JButton getBotonComisiones() {
        return botonComisiones;
    }

    public void setBotonComisiones(JButton botonComisiones) {
        this.botonComisiones = botonComisiones;
    }

    public JButton getBotonVerDatos() {
        return botonVerDatos;
    }

    public void setBotonVerDatos(JButton botonVerDatos) {
        this.botonVerDatos = botonVerDatos;
    }

    public JButton getBotonIngresarDatos() {
        return botonIngresarDatos;
    }

    public void setBotonIngresarDatos(JButton botonIngresarDatos) {
        this.botonIngresarDatos = botonIngresarDatos;
    }

    public JButton getBotonPerfil() {
        return botonPerfil;
    }

    public void setBotonPerfil(JButton botonPerfil) {
        this.botonPerfil = botonPerfil;
    }

    public JButton getBotonDarDeBaja() {
        return botonDarDeBaja;
    }

    public void setBotonDarDeBaja(JButton botonDarDeBaja) {
        this.botonDarDeBaja = botonDarDeBaja;
    }

    public JButton getBotonRondaDeEncuentrosLaborales() {
        return botonRondaDeEncuentrosLaborales;
    }

    public void setBotonRondaDeEncuentrosLaborales(JButton botonRondaDeEncuentrosLaborales) {
        this.botonRondaDeEncuentrosLaborales = botonRondaDeEncuentrosLaborales;
    }

    public JButton getBotonRondaDeContrataciones() {
        return botonRondaDeContrataciones;
    }

    public void setBotonRondaDeContrataciones(JButton botonRondaDeContrataciones) {
        this.botonRondaDeContrataciones = botonRondaDeContrataciones;
    }

    public JLabel getTextoBienvenido() {
        return textoBienvenido;
    }

    public void setTextoBienvenido(JLabel textoBienvenido) {
        this.textoBienvenido = textoBienvenido;
    }

    public JLabel getTextoAgencia() {
        return textoAgencia;
    }

    public void setTextoAgencia(JLabel textoAgencia) {
        this.textoAgencia = textoAgencia;
    }

    @Override
    public void setActionListener(ActionListener controlador) {
        botonPerfil.addActionListener(controlador);
        botonIngresarDatos.addActionListener(controlador);
        botonVerDatos.addActionListener(controlador);
        botonComisiones.addActionListener(controlador);
        botonDarDeBaja.addActionListener(controlador);
        botonRondaDeContrataciones.addActionListener(controlador);
        botonRondaDeEncuentrosLaborales.addActionListener(controlador);
        boxDatosCargados.addActionListener(controlador);
    }

    @Override
    public void setKeyListener(KeyListener controlador) {
        textoTiposDeTrabajo.addKeyListener(controlador);
        textoRangoLaboral.addKeyListener(controlador);
        textoTiposDePuestos.addKeyListener(controlador);
    }

    @Override
    public void ejecutar() {
        setTitle("My Linkedn - Grupo 5");
        pack(); //Coloca los componentes
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800,500); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setLocationRelativeTo(null);
        botonAgregarDatos.setEnabled(false);
    }

    @Override
    public void ocultar() {

    }

    @Override
    public void creaOtraVentana(String ventana) {

    }
}
