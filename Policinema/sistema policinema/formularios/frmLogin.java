package formularios;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import clases.Datos;
public class frmLogin extends JFrame 
{
	private JLabel lblUsuario;
	private JLabel lblClave;
	private JLabel lblImagen;
	private JTextField txtUsuario;
	private JPasswordField txtClave;
	private JButton btnAceptar;
	private JButton btnCancelar;
	
	private Datos misDatos;
	public void setDatos(Datos datos)
	{
		misDatos = datos;
	}
	
	public  frmLogin()
	{
		setTitle("Ingreso al sistema");
		setLayout(null);
		setSize(390,180);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Icon icoAceptar = new ImageIcon(getClass().getResource("/imagenes/entrar.png"));
		Icon icoCancelar = new ImageIcon(getClass().getResource("/imagenes/cancelar.png"));
		Icon icoClave = new ImageIcon(getClass().getResource("/imagenes/clave.png"));
		lblUsuario=new JLabel ("Usuario:");
		txtUsuario=new JTextField(10);
		lblClave=new JLabel ("Contraseña:");
		txtClave=new JPasswordField(10);
		lblImagen=new JLabel(icoClave);
		btnAceptar=new JButton("Aceptar",icoAceptar);
		btnCancelar=new JButton("Cancelar",icoCancelar);
		add(lblUsuario);
		add(txtUsuario);
		add(lblClave);
		add(txtClave);
		add(btnAceptar);
		add(btnCancelar);
		add(lblImagen);
		btnAceptar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAceptar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnAceptar.setToolTipText("ingresa al sistema");
		
		btnCancelar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCancelar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCancelar.setToolTipText("cancelar operacion");
		
		lblUsuario.reshape(20,20,100,20);
		txtUsuario.reshape(120,20,100,20);
		lblImagen.reshape(240,20,128,128);
		lblClave.reshape(20,45,100,20);
		txtClave.reshape(120,45,100,20);
		btnAceptar.reshape(20,75,90,60);
		btnCancelar.reshape(120,75,90,60);
		btnAceptar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				btnAceptarActionPerformed(evt);
			}
		});
		btnCancelar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				btnCancelarActionPerformed(evt);
			}
		});
	}
	private void btnAceptarActionPerformed(ActionEvent evt)
	{
	   if(txtUsuario.getText().equals(""))
	   {
	   	JOptionPane.showMessageDialog(null,"Debe ingresar un usuario");
	   	txtUsuario.requestFocusInWindow();
	   	return;
	   }	
	 Datos x=new Datos();
	   if(!x.validarUsuario(txtUsuario.getText(),new String(txtClave.getPassword())))
	   {
	   	JOptionPane.showMessageDialog(null,"usuario o contraseña no acertada, vuelva a intentar");
	   	txtUsuario.setText("");
	   	txtClave.setText("");
	   	txtUsuario.requestFocusInWindow();
	   	return;
	   }
	   setVisible(false);
	   frmPrincipal y=new frmPrincipal();
	   y.setExtendedState(JFrame.MAXIMIZED_BOTH);
	   y.setDatos(misDatos);
	   y.setVisible(true);
	}
	private void btnCancelarActionPerformed(ActionEvent evt)
	{
		System.exit(0);
	}
}
