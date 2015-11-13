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
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JInternalFrame;
public class frmUsuarios extends JInternalFrame
{
	private JLabel lblIDUsuario;
	private JLabel lblPerfil;
	private JLabel lblNombres;
	private JLabel lblApellidos;
	private JLabel lblClave;
	private JLabel lblConfirmacion;
	private JLabel lblMensaje;
	private JTextField txtIDUsuario;
	private JComboBox cmbPerfil;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JPasswordField txtClave;
	private JPasswordField txtConfirmacion;
	private JTextField txtMensaje;
	private JButton btnPrimero;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnUltimo;
	private JButton btnNuevo;
	private JButton btnModificar;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private JButton btnBorrar;
	private JButton btnBuscar;
	private JTable tblTabla;
	private DefaultTableModel miTabla;
	private JScrollPane scrTabla;
	
	private String perfil[]={"Administrador","Empleado"};
	
	private Datos misDatos;
	private int usuActual =0 ;
	private boolean nuevo=false;
	
	public void setDatos(Datos datos)
	{
		misDatos = datos;
	}
	public frmUsuarios()
	{
		setClosable(true);
		setIconifiable(true);
		setResizable(false);
		setTitle("Usuarios");
		setLayout(null);
		setSize(550,450);
		Icon icoPrimero = new ImageIcon(getClass().getResource("/imagenes/primero.png"));
		Icon icoAnterior = new ImageIcon(getClass().getResource("/imagenes/anterior.png"));
		Icon icoSiguiente = new ImageIcon(getClass().getResource("/imagenes/siguiente.png"));
		Icon icoUltimo = new ImageIcon(getClass().getResource("/imagenes/ultimo.png"));
		Icon icoNuevo = new ImageIcon(getClass().getResource("/imagenes/nuevo.png"));
		Icon icoModificar = new ImageIcon(getClass().getResource("/imagenes/modificar.png"));
		Icon icoGuardar = new ImageIcon(getClass().getResource("/imagenes/guardar.png"));
		Icon icoCancelar = new ImageIcon(getClass().getResource("/imagenes/cancelar2.png"));
		Icon icoBorrar = new ImageIcon(getClass().getResource("/imagenes/borrar.png"));
		Icon icoBuscar = new ImageIcon(getClass().getResource("/imagenes/buscar.png"));
		lblIDUsuario = new JLabel("ID Usuario: *");
		txtIDUsuario =new JTextField(10);
		lblIDUsuario = new JLabel("ID Usuario: *");
		txtIDUsuario =new JTextField(10);
		lblPerfil = new JLabel("Perfil: *");
		cmbPerfil =new JComboBox(perfil); 
		lblNombres = new JLabel("Nombres: *");
		txtNombres =new JTextField(30);
		lblApellidos = new JLabel("Apellidos: *");
		txtApellidos =new JTextField(30);
		lblClave = new JLabel("Contraseña: *");
		txtClave =new JPasswordField(10);
		lblConfirmacion = new JLabel("Confirmación: *");
		txtConfirmacion =new JPasswordField(10);
		lblMensaje = new JLabel("* Campos obligatorios");
		btnPrimero=new JButton(icoPrimero);
		btnAnterior=new JButton(icoAnterior);
		btnSiguiente=new JButton(icoSiguiente);
		btnUltimo=new JButton(icoUltimo);
		btnNuevo=new JButton(icoNuevo);
		btnModificar=new JButton(icoModificar);
		btnGuardar=new JButton(icoGuardar);
		btnCancelar=new JButton(icoCancelar);
		btnBorrar=new JButton(icoBorrar);
		btnBuscar=new JButton(icoBuscar);
		tblTabla=new JTable();
		scrTabla=new JScrollPane();
		
		btnPrimero.setToolTipText("Va al primer registro");
		btnAnterior.setToolTipText("Va al anterior registro");
		btnSiguiente.setToolTipText("Va al siguiente registro");
		btnUltimo.setToolTipText("Va al ultimo registro");
		btnNuevo.setToolTipText("Crea un registro");
		btnModificar.setToolTipText("Modifica/edita el registro actual");
		btnGuardar.setToolTipText("Guarda cambios del registro");
		btnCancelar.setToolTipText("cancela cambios del registro");
		btnBorrar.setToolTipText("Borra el registro actual");
		btnBuscar.setToolTipText("Busca un registro");
		
		scrTabla.setViewportView(tblTabla);
		add(lblIDUsuario);
		add(txtIDUsuario);
		add(lblPerfil);
		add(cmbPerfil);
		add(lblNombres);
		add(txtNombres);
		add(lblApellidos);
		add(txtApellidos);
		add(lblClave);
		add(txtClave);
		add(lblConfirmacion);
		add(txtConfirmacion);
		add(lblMensaje);
		add(btnPrimero);
		add(btnAnterior);
		add(btnSiguiente);
		add(btnUltimo);
		add(btnNuevo);
		add(btnModificar);
		add(btnGuardar);
		add(btnCancelar);
		add(btnBorrar);
		add(btnBuscar);
		add(scrTabla);
		lblIDUsuario.reshape   ( 20, 20,110, 20);
		txtIDUsuario.reshape   (130, 20,100, 20);
		lblPerfil.reshape      (300, 20,120, 20);
		cmbPerfil.reshape      (400, 20,100, 20);
		lblNombres.reshape     ( 20, 45,110, 20);
		txtNombres.reshape     (130, 45,370, 20);
		lblApellidos.reshape   ( 20, 70,110, 20);
		txtApellidos.reshape   (130, 70,370, 20);
		lblClave.reshape       ( 20, 95,110, 20);
		txtClave.reshape       (130, 95,100, 20);
		lblConfirmacion.reshape(300, 95,120, 20);
		txtConfirmacion.reshape(400, 95,100, 20);
		lblMensaje.reshape     ( 20,120,400, 20);
		btnPrimero.reshape     ( 20,145, 45, 45);
		btnAnterior.reshape    ( 70,145, 45, 45);
		btnSiguiente.reshape   (120,145, 45, 45);
		btnUltimo.reshape      (170,145, 45, 45);
		btnNuevo.reshape       (220,145, 45, 45);
		btnModificar.reshape   (270,145, 45, 45);
		btnGuardar.reshape     (320,145, 45, 45);
		btnCancelar.reshape    (370,145, 45, 45);
		btnBorrar.reshape      (420,145, 45, 45);
		btnBuscar.reshape      (470,145, 45, 45);
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
		btnNuevo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				btnNuevoActionPerformed(evt);
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
		btnBorrar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				btnBorrarActionPerformed(evt);
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
		btnNuevo.setEnabled(false);
		btnModificar.setEnabled(false);
		btnGuardar.setEnabled(true);//
		btnCancelar.setEnabled(true);//
		btnBorrar.setEnabled(false);
		btnBuscar.setEnabled(false);
		
		
		cmbPerfil.setEnabled(true);
		txtNombres.setEnabled(true);
		txtApellidos.setEnabled(true);
		txtClave.setEnabled(false);
		txtConfirmacion.setEnabled(false);		
	}
	private void deshabilitarEdicion()
	{
		btnPrimero.setEnabled(true);
		btnAnterior.setEnabled(true);
		btnSiguiente.setEnabled(true);
		btnUltimo.setEnabled(true);
		btnNuevo.setEnabled(true);
		btnModificar.setEnabled(true);
		btnGuardar.setEnabled(false);
		btnCancelar.setEnabled(false);
		btnBorrar.setEnabled(true);
		btnBuscar.setEnabled(true);
		
		txtIDUsuario.setEnabled(false);
		cmbPerfil.setEnabled(false);
		txtNombres.setEnabled(false);
		txtApellidos.setEnabled(false);
		txtClave.setEnabled(false);
		txtConfirmacion.setEnabled(false);		
	}
	private void mostrarRegistro()
	{
		txtIDUsuario.setText(misDatos.getUsuarios()[usuActual].getIdUsuario());
		cmbPerfil.setSelectedIndex(misDatos.getUsuarios()[usuActual].getPerfil());
		txtNombres.setText(misDatos.getUsuarios()[usuActual].getNombres());
		txtApellidos.setText(misDatos.getUsuarios()[usuActual].getApellidos());
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
	private void btnNuevoActionPerformed(ActionEvent evt)
	{
		habilitarEdicion();
		txtIDUsuario.setEnabled(true);
		txtClave.setEnabled(true);
		txtConfirmacion.setEnabled(true);
		txtIDUsuario.setText("");
		txtNombres.setText("");
		txtApellidos.setText("");
		txtClave.setText("");
		txtConfirmacion.setText("");
		cmbPerfil.setSelectedIndex(-1);
		txtIDUsuario.requestFocusInWindow();
		nuevo=true;
	}
	private void btnModificarActionPerformed(ActionEvent evt)
	{
		habilitarEdicion();
		txtNombres.requestFocusInWindow();
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
		if(cmbPerfil.getSelectedIndex()==-1)
		{
			JOptionPane.showMessageDialog(null,"seleccione un perfil de usuario");
			cmbPerfil.requestFocusInWindow();
			return ;
		}
		if(txtNombres.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"favor de ingresar su nombre(s) ");
			txtNombres.requestFocusInWindow();
			return ;
		}
		if(txtApellidos.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"favor de ingresar su apellido(s)");
			txtApellidos.requestFocusInWindow();
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
		
		
		Usuario miUsuario = new Usuario(txtIDUsuario.getText(),txtNombres.getText(),txtApellidos.getText(),clave,cmbPerfil.getSelectedIndex());
		String msg="";
		if(nuevo)
		{
			msg=misDatos.agregarUsuario(miUsuario);
		}		
		else
		{
			msg=misDatos.modificarUsuario(miUsuario,pos);
		}
		JOptionPane.showMessageDialog(this,msg);
		
		
		deshabilitarEdicion();
		llenartabla();
		
	}
	private void btnCancelarActionPerformed(ActionEvent evt)
	{
		deshabilitarEdicion();
		mostrarRegistro();
	}
	private void btnBorrarActionPerformed(ActionEvent evt)
	{
	   int rta=JOptionPane.showConfirmDialog(this,"Esta seguro de borrar el registro");
	   if(rta!=0)
	   {
	   	return;
	   }
	  	
	   String msg=misDatos.borrarUsuario(usuActual);
	   JOptionPane.showMessageDialog(this,msg);
	   usuActual=0;
	   llenartabla();
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
