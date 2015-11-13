package formularios;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import clases.Datos;
import clases.Usuario;
import clases.Contraseña;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JInternalFrame;

public class frmContraseña extends JInternalFrame
{
	private JLabel lblIDUsuario;
	private JLabel lblClave;
	private JLabel lblConfirmacion;
	private JLabel lblMensaje;
	private JTextField txtIDUsuario;
	private JPasswordField txtClave;
	private JPasswordField txtConfirmacion;
	private JTextField txtMensaje;
	private JButton btnPrimero;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnUltimo;
	private JButton btnModificar;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private JButton btnBuscar;
	private JTable tblTabla;
	private DefaultTableModel miTabla;
	private JScrollPane scrTabla;
	
	private Datos misDatos;
	private int usuActual =0 ;
	private boolean nuevo=false;
	
	public void setDatos(Datos datos)
	{
		misDatos = datos;
	}
	public frmContraseña()
	{
		setClosable(true);
		setIconifiable(true);
		setResizable(false);
		setTitle("Cambio Clave");
		setLayout(null);
		setSize(550,450);
		Icon icoPrimero = new ImageIcon(getClass().getResource("/imagenes/primero.png"));
		Icon icoAnterior = new ImageIcon(getClass().getResource("/imagenes/anterior.png"));
		Icon icoSiguiente = new ImageIcon(getClass().getResource("/imagenes/siguiente.png"));
		Icon icoUltimo = new ImageIcon(getClass().getResource("/imagenes/ultimo.png"));
		Icon icoModificar = new ImageIcon(getClass().getResource("/imagenes/modificar.png"));
		Icon icoGuardar = new ImageIcon(getClass().getResource("/imagenes/guardar.png"));
		Icon icoCancelar = new ImageIcon(getClass().getResource("/imagenes/cancelar2.png"));
		Icon icoBuscar = new ImageIcon(getClass().getResource("/imagenes/buscar.png"));
		lblIDUsuario = new JLabel("ID Usuario: *");
		txtIDUsuario =new JTextField(10);
		lblClave = new JLabel("Contraseña: *");
		txtClave =new JPasswordField(10);
		lblConfirmacion = new JLabel("Confirmación: *");
		txtConfirmacion =new JPasswordField(10);
		lblMensaje = new JLabel("* Campos obligatorios");
		btnPrimero=new JButton(icoPrimero);
		btnAnterior=new JButton(icoAnterior);
		btnSiguiente=new JButton(icoSiguiente);
		btnUltimo=new JButton(icoUltimo);
		btnModificar=new JButton(icoModificar);
		btnGuardar=new JButton(icoGuardar);
		btnCancelar=new JButton(icoCancelar);
		btnBuscar=new JButton(icoBuscar);
		tblTabla=new JTable();
		scrTabla=new JScrollPane();
		
		btnPrimero.setToolTipText("Va al primer usuario");
		btnAnterior.setToolTipText("Va al anterior usuario");
		btnSiguiente.setToolTipText("Va al siguiente usuario");
		btnUltimo.setToolTipText("Va al ultimo usuario");
		btnModificar.setToolTipText("Modifica/edita el usuario actual");
		btnGuardar.setToolTipText("Guarda cambios del usuario");
		btnCancelar.setToolTipText("cancela cambios del usuario");
		btnBuscar.setToolTipText("Busca un usuario");
		
		scrTabla.setViewportView(tblTabla);
		add(lblIDUsuario);
		add(txtIDUsuario);
		add(lblClave);
		add(txtClave);
		add(lblConfirmacion);
		add(txtConfirmacion);
		add(lblMensaje);
		add(btnPrimero);
		add(btnAnterior);
		add(btnSiguiente);
		add(btnUltimo);
		add(btnModificar);
		add(btnGuardar);
		add(btnCancelar);
		add(btnBuscar);
		add(scrTabla);
		lblIDUsuario.reshape   		( 20, 20,110, 20);
		txtIDUsuario.reshape   		(130, 20,100, 20);
		lblClave.reshape      		( 20, 45,110, 20);
		txtClave.reshape      		(130, 45,370, 20);
		lblConfirmacion.reshape		( 20, 70,110, 20);
		txtConfirmacion.reshape		(130, 70,370, 20);
		lblMensaje.reshape     		( 20, 95,110, 20);
		btnPrimero.reshape     ( 20,145, 45, 45);
		btnAnterior.reshape    ( 70,145, 45, 45);
		btnSiguiente.reshape   (120,145, 45, 45);
		btnUltimo.reshape      (170,145, 45, 45);
		btnModificar.reshape   (220,145, 45, 45);
		btnGuardar.reshape     (270,145, 45, 45);
		btnCancelar.reshape    (320,145, 45, 45);
		btnBuscar.reshape      (370,145, 45, 45);
		scrTabla.reshape       ( 20,195,500,200);
		
		addInternalFrameListener(new InternalFrameListener() 
		{
			public void internalFrameClosed(InternalFrameEvent evt)
			{
				
			}
			public void internalFrameClosing(InternalFrameEvent evt)
			{
				
			}
			public void internalFrameOpened(InternalFrameEvent evt)
			{
				formInternalFrameOpended(evt);
			}
			public void internalFrameActivated(InternalFrameEvent evt)
			{
				
			}
			public void internalFrameDeactivated(InternalFrameEvent evt)
			{
				
			}
			public void internalFrameIconified(InternalFrameEvent evt)
			{
				
			}
			public void internalFrameDeiconified(InternalFrameEvent evt)
			{
				
			}
		});
		btnPrimero.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				btnPrimeroActionPerformed(evt);
			}
		});
		btnAnterior.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				btnAnteriorActionPerformed(evt);
			}
		});
		btnSiguiente.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				btnSiguienteActionPerformed(evt);
			}
		});
		btnUltimo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				btnUltimoActionPerformed(evt);
			}
		});
		
		btnModificar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				btnModificarActionPerformed(evt);
			}
		});
		btnGuardar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				btnGuardarActionPerformed(evt);
			}
		});
		btnCancelar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				btnCancelarActionPerformed(evt);
			}
		});
		
		btnBuscar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				btnBuscarActionPerformed(evt);
			}
		});
	}
	private void formInternalFrameOpended(InternalFrameEvent evt)
	{
		
		llenartabla();
		deshabilitarEdicion();
		mostrarRegistro();
		
	}
	private void llenartabla()
	{
		
		String titulos[]={"ID Usuario","Perfil","Nombres","Apellidos"};
		String registro[]= new String[4];
		miTabla= new DefaultTableModel(null,titulos);
		for(int i=0; i< misDatos.numeroUsuarios();i++)
		{
			registro[0]=misDatos.getUsuarios()[i].getIdUsuario();
			registro[1]=perfil(misDatos.getUsuarios()[i].getPerfil());
			registro[2]=misDatos.getUsuarios()[i].getNombres();
			registro[3]=misDatos.getUsuarios()[i].getApellidos();
			
			miTabla.addRow(registro);
		}
		tblTabla.setModel(miTabla);
		
	}
	private void habilitarEdicion()
	{
		
		btnPrimero.setEnabled(false);
		btnAnterior.setEnabled(false);
		btnSiguiente.setEnabled(false);
		btnUltimo.setEnabled(false);
		btnModificar.setEnabled(false);
		btnGuardar.setEnabled(true);
		btnCancelar.setEnabled(true);
		btnBuscar.setEnabled(false);
		
		txtClave.setEnabled(true);
		txtConfirmacion.setEnabled(true);		
		
	}
	private void deshabilitarEdicion()
	{
		
		btnPrimero.setEnabled(true);
		btnAnterior.setEnabled(true);
		btnSiguiente.setEnabled(true);
		btnUltimo.setEnabled(true);
		btnModificar.setEnabled(true);
		btnGuardar.setEnabled(false);
		btnCancelar.setEnabled(false);
		btnBuscar.setEnabled(true);
		
		txtIDUsuario.setEnabled(false);
		txtClave.setEnabled(false);
		txtConfirmacion.setEnabled(false);		
		
	}
	private void mostrarRegistro()
	{
		
		txtIDUsuario.setText(misDatos.getUsuarios()[usuActual].getIdUsuario());
		txtClave.setText(misDatos.getUsuarios()[usuActual].getClave());
		txtConfirmacion.setText(misDatos.getUsuarios()[usuActual].getClave());
		
	}
	private void btnPrimeroActionPerformed(ActionEvent evt)
	{
		
		usuActual=0;
		mostrarRegistro();
		
	}
	private void btnAnteriorActionPerformed(ActionEvent evt)
	{
		
		if(usuActual >= 0)
		{
			usuActual--;
			mostrarRegistro();
		}
		
	}
	private void btnSiguienteActionPerformed(ActionEvent evt)
	{
	
		if(!((usuActual+1) == misDatos.numeroUsuarios()))
		{
			usuActual++;
			mostrarRegistro();
		}
		
	}
	private void btnUltimoActionPerformed(ActionEvent evt)
	{
		
		usuActual=misDatos.numeroUsuarios()-1;
		mostrarRegistro();	  	
		
	}
	
	private void btnModificarActionPerformed(ActionEvent evt)
	{
		
		habilitarEdicion();
		txtIDUsuario.requestFocusInWindow();
		nuevo=false;
		
	}
	private void btnGuardarActionPerformed(ActionEvent evt)
	{
		
		if(txtIDUsuario.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"favor de ingresar un ID de usuario");
			txtIDUsuario.requestFocusInWindow();
			return ;
		}
		if(txtClave.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"favor de ingresar una clave");
			txtClave.requestFocusInWindow();
			return ;
		}
		String clave= new String(txtClave.getPassword());
		String confirmacion= new String(txtConfirmacion.getPassword());
		if(clave.equals(""))
		{
			JOptionPane.showMessageDialog(null,"favor de ingresar una contraseña");
			txtClave.requestFocusInWindow();
			return ;
		}
		if(confirmacion.equals(""))
		{
			JOptionPane.showMessageDialog(null,"favor de ingresar la confirmacion de su contraseña");
			txtConfirmacion.requestFocusInWindow();
			return ;
		}
		if(!clave.equals(confirmacion))
		{
			JOptionPane.showMessageDialog(null,"no coincide la contraseña con la confirmación");
			txtClave.setText("");
			txtConfirmacion.setText("");
			txtConfirmacion.requestFocusInWindow();
			return ;
		}
		int pos=misDatos.posicionUsuario(txtIDUsuario.getText());
		if(nuevo)
		{
			if (pos != -1)
			{
				JOptionPane.showMessageDialog(this,"el usuario ya existe");
				txtIDUsuario.requestFocusInWindow();
			}
		}
		else
		{
		Contraseña miUsuario = new Contraseña(txtIDUsuario.getText(),clave);
		String msg="";
		if(nuevo=false)
		{
			msg=misDatos.agregarContraseña(miUsuario);
		}		
		else
		{
			msg=misDatos.modificarContraseña(miUsuario,pos);
		}
		JOptionPane.showMessageDialog(this,msg);
		}
		
		deshabilitarEdicion();
		llenartabla();
		
		
	}
	private void btnCancelarActionPerformed(ActionEvent evt)
	{
		
		deshabilitarEdicion();
		mostrarRegistro();
		
	}
	
	private void btnBuscarActionPerformed(ActionEvent evt)
	{
		String usuario=JOptionPane.showInputDialog(null,"ingrese ID de usuario: ");
		if(usuario.equals(""))
		{
			return;
		}
		int pos=misDatos.posicionUsuario(usuario);
		if(pos==-1)
		{
			JOptionPane.showMessageDialog(null,"el usuario no existe");
			return;
		}
		usuActual=pos;
		mostrarRegistro();
		
	}
	private String perfil(int idPerfil)
	{
		
		if(idPerfil==0)
		{
			return "Administrador";
		}
		else
		{
			return "Empleado";
	    }
	    
    }
}