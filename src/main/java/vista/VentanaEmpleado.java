package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controladores.ControladorEmpleados;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class VentanaEmpleado extends JFrame {

	private JPanel contentPane;
	private JButton btnProfile;
	private JButton ticketsButton;
	private JButton eleccionesButton;
	private JTabbedPane pantallasTab ;
	private JPanel panel_1;
	private JSeparator separator;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel LabelEdad;
	private JLabel lblNewLabel_8;
	private JSeparator separator_1;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel nombreLabel;
	private JLabel apellidoLabel;
	private JLabel mailLabel;
	private JLabel edadLabel;
	private JLabel lblNewLabel_15;
	private JLabel telefonoLabel;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JSeparator separator_6;


	// Listeners a los botones.
	

	public void setControlador(ControladorEmpleados c) {
		System.out.println("Se ejecuto el comando");
		this.ticketsButton.addActionListener(c);
		this.btnProfile.addActionListener(c);
		this.eleccionesButton.addActionListener(c);
	}
	
	public void arranca(){
		setTitle("My Linkedn - Grupo 5");
		pack(); //Coloca los componentes
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(800,500); //Dimensiones del JFrame
		setResizable(false); //No redimensionable
		setLocationRelativeTo(null);
	}
	
	public void cambiarPagina(int i) {
		this.pantallasTab.setSelectedIndex(i);
	}

	public void llenarDatosEmpleado(String nombre, String apellido, String email, String telefono , int edad) {
		this.nombreLabel.setText(nombre);
		this.apellidoLabel.setText(apellido);
		this.mailLabel.setText(email);
		this.telefonoLabel.setText(telefono);
		this.edadLabel.setText(String.valueOf(edad));
	}

	public VentanaEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel.setBackground(new Color(65, 105, 225));
		panel.setBounds(0, 0, 200, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		ticketsButton = new JButton("Tickets");
		ticketsButton.setSelected(true);
		ticketsButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ticketsButton.setBackground(new Color(100, 149, 237));
		ticketsButton.setActionCommand("iniciarTICKETS");
		ticketsButton.setBorder(null);
		ticketsButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		ticketsButton.setBounds(0, 189, 200, 35);
		panel.add(ticketsButton);
		
		eleccionesButton = new JButton("Elecciones");
		eleccionesButton.setSelected(true);
		eleccionesButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		eleccionesButton.setBackground(new Color(100, 149, 237));
		eleccionesButton.setActionCommand("iniciarELECCIONES");
		eleccionesButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		eleccionesButton.setBorder(null);
		eleccionesButton.setBounds(0, 232, 200, 35);
		panel.add(eleccionesButton);
		
		btnProfile = new JButton("Perfil");
		btnProfile.setSelected(true);
		btnProfile.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		btnProfile.setBorder(null);
		btnProfile.setBackground(new Color(100, 149, 237));
		btnProfile.setActionCommand("iniciarPERFIL");
		btnProfile.setBounds(0, 146, 200, 35);
		panel.add(btnProfile);
		
		JLabel lblNewLabel_1 = new JLabel("My Linkedn");
		lblNewLabel_1.setForeground(new Color(240, 255, 240));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(-14, 56, 200, 49);
		panel.add(lblNewLabel_1);
		
		pantallasTab = new JTabbedPane(JTabbedPane.TOP);
		pantallasTab.setBounds(187, 0, 600, 500);
		contentPane.add(pantallasTab);
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 119, 181));
		pantallasTab.addTab("Perfil", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblEtiqueta = new JLabel("Empleado");
		lblEtiqueta.setForeground(new Color(253, 245, 230));
		lblEtiqueta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 39));
		lblEtiqueta.setBounds(27, 65, 238, 60);
		panel_1.add(lblEtiqueta);
		
		separator = new JSeparator();
		separator.setBackground(new Color(245, 245, 245));
		separator.setForeground(new Color(253, 245, 230));
		separator.setBounds(27, 123, 176, 2);
		panel_1.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("src/icons8-donald-trump-96.png"));
		lblNewLabel_2.setBounds(27, 102, 266, 183);
		panel_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Nombre");
		lblNewLabel_3.setForeground(new Color(245, 245, 245));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblNewLabel_3.setBounds(283, 65, 77, 36);
		panel_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Apellido");
		lblNewLabel_4.setForeground(new Color(253, 245, 230));
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblNewLabel_4.setBounds(464, 65, 77, 36);
		panel_1.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setForeground(new Color(253, 245, 230));
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblNewLabel_5.setBounds(283, 148, 77, 36);
		panel_1.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Telefono");
		lblNewLabel_6.setForeground(new Color(253, 245, 230));
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblNewLabel_6.setBounds(464, 148, 77, 36);
		panel_1.add(lblNewLabel_6);
		
		LabelEdad = new JLabel("Edad");
		LabelEdad.setForeground(new Color(253, 245, 230));
		LabelEdad.setFont(new Font("Segoe UI", Font.BOLD, 17));
		LabelEdad.setBounds(283, 234, 77, 36);
		panel_1.add(LabelEdad);
		
		lblNewLabel_8 = new JLabel("Cargo");
		lblNewLabel_8.setForeground(new Color(253, 245, 230));
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblNewLabel_8.setBounds(464, 234, 77, 36);
		panel_1.add(lblNewLabel_8);
		
		separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 139));
		separator_1.setBackground(new Color(0, 0, 139));
		separator_1.setBounds(280, 100, 69, 40);
		panel_1.add(separator_1);
		
		lblNewLabel_9 = new JLabel("Cantidad tickets: 1");
		lblNewLabel_9.setForeground(new Color(253, 245, 230));
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblNewLabel_9.setBounds(8, 303, 176, 36);
		panel_1.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Coincidencias laborales: 0");
		lblNewLabel_10.setForeground(new Color(253, 245, 230));
		lblNewLabel_10.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblNewLabel_10.setBounds(8, 347, 208, 36);
		panel_1.add(lblNewLabel_10);
		
		nombreLabel = new JLabel("Tomas");
		nombreLabel.setForeground(new Color(253, 245, 230));
		nombreLabel.setFont(new Font("Segoe UI", Font.BOLD, 17));
		nombreLabel.setBounds(283, 104, 120, 36);
		panel_1.add(nombreLabel);
		
		apellidoLabel = new JLabel("Matarazzo");
		apellidoLabel.setForeground(new Color(253, 245, 230));
		apellidoLabel.setFont(new Font("Segoe UI", Font.BOLD, 17));
		apellidoLabel.setBounds(464, 104, 120, 36);
		panel_1.add(apellidoLabel);
		
		mailLabel = new JLabel("tomasm208@hotmail.es");
		mailLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		mailLabel.setForeground(new Color(253, 245, 230));
		mailLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mailLabel.setBounds(283, 187, 176, 49);
		panel_1.add(mailLabel);
		
		edadLabel = new JLabel("24");
		edadLabel.setForeground(new Color(253, 245, 230));
		edadLabel.setFont(new Font("Segoe UI", Font.BOLD, 17));
		edadLabel.setBounds(283, 278, 120, 36);
		panel_1.add(edadLabel);
		
		lblNewLabel_15 = new JLabel("CO");
		lblNewLabel_15.setForeground(new Color(253, 245, 230));
		lblNewLabel_15.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblNewLabel_15.setBounds(464, 278, 120, 36);
		panel_1.add(lblNewLabel_15);
		
		telefonoLabel = new JLabel("2266473122");
		telefonoLabel.setForeground(new Color(253, 245, 230));
		telefonoLabel.setFont(new Font("Segoe UI", Font.BOLD, 17));
		telefonoLabel.setBounds(464, 192, 120, 36);
		panel_1.add(telefonoLabel);
		
		separator_2 = new JSeparator();
		separator_2.setForeground(new Color(0, 0, 139));
		separator_2.setBackground(new Color(0, 0, 139));
		separator_2.setBounds(283, 177, 51, 49);
		panel_1.add(separator_2);
		
		separator_3 = new JSeparator();
		separator_3.setForeground(new Color(0, 0, 139));
		separator_3.setBackground(new Color(0, 0, 139));
		separator_3.setBounds(464, 177, 69, 40);
		panel_1.add(separator_3);
		
		separator_4 = new JSeparator();
		separator_4.setForeground(new Color(0, 0, 139));
		separator_4.setBackground(new Color(0, 0, 139));
		separator_4.setBounds(464, 100, 69, 40);
		panel_1.add(separator_4);
		
		separator_5 = new JSeparator();
		separator_5.setForeground(new Color(0, 0, 139));
		separator_5.setBackground(new Color(0, 0, 139));
		separator_5.setBounds(464, 263, 51, 40);
		panel_1.add(separator_5);
		
		separator_6 = new JSeparator();
		separator_6.setForeground(new Color(0, 0, 139));
		separator_6.setBackground(new Color(0, 0, 139));
		separator_6.setBounds(283, 263, 69, 40);
		panel_1.add(separator_6);
		
		JPanel panel_2 = new JPanel();
		pantallasTab.addTab("Tickets", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblEtiqueta_1 = new JLabel("Etiqueta 2");
		lblEtiqueta_1.setFont(new Font("Tahoma", Font.PLAIN, 39));
		lblEtiqueta_1.setBounds(155, 191, 238, 36);
		panel_2.add(lblEtiqueta_1);
		
		JPanel panel_3 = new JPanel();
		pantallasTab.addTab("Elecciones", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Etiqueta 3");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 39));
		lblNewLabel.setBounds(184, 170, 238, 36);
		panel_3.add(lblNewLabel);
		
		pantallasTab.setSelectedIndex(2);
	}
}

