package vista;

<<<<<<< Updated upstream
=======
import controladores.ControladorAgencia;
import controladores.ControladorEmpleados;
import controladores.ControladorRegister;
import modelo.usuarios.Agencia;
import modelo.usuarios.Empleado_Pretenso;
import modelo.usuarios.Usuario;
import modelo.usuarios.UsuarioFactoryExtendida;
import modelo.usuarios.empleadores.Empleador;
>>>>>>> Stashed changes
import javax.swing.*;

public class VentanaLogin {
    private JPanel panelPrincipal;
<<<<<<< Updated upstream
=======
    private JPanel panelCentral;
    private JPanel panelInferior;
    private JPanel PanelDatos;
    private JTextField textoNombreUsuario;
    private JTextField textoContrasena;
    private JButton botonRegistrarse;
    private JButton botonLogin;
    private JPanel panelRegistrarse;
    private JPanel panelLogin;
    private Usuario observado;

    public JTextField getTextoNombreUsuario() {
        return textoNombreUsuario;
    }

    public void setTextoNombreUsuario(JTextField textoNombreUsuario) {
        this.textoNombreUsuario = textoNombreUsuario;
    }

    public JTextField getTextoContrasena() {
        return textoContrasena;
    }

    public void setTextoContrasena(JTextField textoContrasena) {
        this.textoContrasena = textoContrasena;
    }

    public JButton getBotonRegistrarse() {
        return botonRegistrarse;
    }

    public void setBotonRegistrarse(JButton botonRegistrarse) {
        this.botonRegistrarse = botonRegistrarse;
    }

    public JButton getBotonLogin() {
        return botonLogin;
    }

    public void setBotonLogin(JButton botonLogin) {
        this.botonLogin = botonLogin;
    }

    @Override
    public void setActionListener(ActionListener controlador) {
        this.botonLogin.addActionListener(controlador);
        this.botonRegistrarse.addActionListener(controlador);
    }

    @Override
    public void setKeyListener(KeyListener controlador) {
        this.textoNombreUsuario.addKeyListener(controlador);
        this.textoContrasena.addKeyListener(controlador);
    }

    @Override
    public void ejecutar() {
        setTitle("My Linkedn - Grupo 5");
        pack(); //Coloca los componentes
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,400); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setLocationRelativeTo(null);
        botonLogin.setEnabled(false);
    }

    @Override
    public void ocultar() {
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(false);
    }

    @Override
    public void creaOtraVentana(String ventana) {
        switch (ventana) {
            case "Register":
                UsuarioFactoryExtendida modelo = new UsuarioFactoryExtendida();
                VentanaRegister vista = new VentanaRegister();
                ControladorRegister controladorRegister = new ControladorRegister(vista,modelo);
                vista.ejecutar();
                break;
            case "Empleado Pretenso":
                Empleado_Pretenso empleado = (Empleado_Pretenso) observado;
                VentanaEmpleado ventanaEmpleado = new VentanaEmpleado();
                ControladorEmpleados controladorEmpleados = new ControladorEmpleados(ventanaEmpleado,empleado);
                ventanaEmpleado.arranca();
                break;
            case "Empleador":
                Empleador empleador = (Empleador) observado;

                System.out.println("Se abre la ventana de EMPLEADOR");
                break;
            case "Agencia":
                Agencia agencia = (Agencia) observado;
                VentanaAgencia ventanaAgencia = new VentanaAgencia();
                ControladorAgencia controladorAgencia = new ControladorAgencia(ventanaAgencia,agencia);
                ventanaAgencia.ejecutar();
                break;
        }
        this.ocultar();
    }

    public void setObservado(Usuario usuario) {
        this.observado = usuario;
        usuario.addObserver(this);
    }

    @Override
    public void update(Observable usuario, Object arg) {

        if (usuario != observado)
            throw new IllegalArgumentException();
        else {
            String tipoUsuario = (String) arg;
            creaOtraVentana(tipoUsuario);
        }
    }
>>>>>>> Stashed changes
}
