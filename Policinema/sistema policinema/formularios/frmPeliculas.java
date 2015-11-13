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
import clases.Pelicula;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JInternalFrame;
public class frmPeliculas extends JInternalFrame
{
	private JLabel lblIDPelicula;
	private JLabel lblCategoria;
	private JLabel lblSinopsis;
	private JLabel lblDirector;
	private JLabel lblPais;
	private JLabel lblAño;
	private JLabel lblIdioma;
	private JLabel lblDuracion;
	private JLabel lblMensaje;
	private JTextField txtIDPelicula;
	private JComboBox cmbCategoria;
	private JTextField txtSinopsis;
	private JTextField txtDirector;
	private JTextField txtPais;
	private JTextField txtAño;
	private JTextField txtIdioma;
	private JTextField txtDuracion;
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
	
	private String categoria[]={"A","B","C"};
	
	private Datos misDatos;
	private int peliActual =0 ;
	private boolean nuevo=false;
	
	public void setDatos(Datos datos)
	{
		misDatos = datos;
	}
	public frmPeliculas()
	{
		setClosable(true);
		setIconifiable(true);
		setResizable(false);
		setTitle("PELICULAS");
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
		lblIDPelicula = new JLabel("ID Pelicula: *");
		txtIDPelicula =new JTextField(10);
		lblCategoria = new JLabel("Categoria: *");
		cmbCategoria =new JComboBox(categoria); 
		lblSinopsis= new JLabel("Sinopsis: *");
		txtSinopsis =new JTextField(30);
		lblDirector = new JLabel("Director: *");
		txtDirector =new JTextField(30);
		lblPais = new JLabel("Pais: *");
		txtPais =new JTextField(10);
		lblAño = new JLabel("Año: *");
		txtAño =new JTextField(10);
		lblIdioma = new JLabel("Idioma: *");
		txtIdioma =new JTextField(10);
		lblDuracion = new JLabel("Duracion: *");
		txtDuracion =new JTextField(10);
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
		add(lblIDPelicula);
		add(txtIDPelicula);
		add(lblCategoria);
		add(cmbCategoria);
		add(lblSinopsis);
		add(txtSinopsis);
		add(lblDirector);
		add(txtDirector);
		add(lblPais);
		add(txtPais);
		add(lblAño);
		add(txtAño);
		add(lblIdioma);
		add(txtIdioma);
		add(lblDuracion);
		add(txtDuracion);
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
		lblIDPelicula.reshape   ( 20, 20,110, 20);
		txtIDPelicula.reshape   (130, 20,100, 20);
		lblCategoria.reshape    (300, 20,120, 20);
		cmbCategoria.reshape    (400, 20,100, 20);
		lblDirector.reshape     ( 20, 45,110, 20);
		txtDirector.reshape     (130, 45,370, 20);
		lblPais.reshape   		( 20, 70,110, 20);
		txtPais.reshape   		(130, 70,100, 20);
		
		lblDuracion.reshape     (300, 70,120, 20);
		txtDuracion.reshape     (400, 70,100, 20);
		
		lblAño.reshape      	( 20, 95,110, 20);
		txtAño.reshape       	(130, 95,100, 20);
		lblIdioma.reshape		(300, 95,120, 20);
		txtIdioma.reshape		(400, 95,100, 20);
		
		lblSinopsis.reshape		( 20, 120,110, 20);
		txtSinopsis.reshape		(130, 120,400, 20);
		
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
		
		String titulos[]={"ID Pelicula","Categoria","Idioma","Duracion"};
		String registro[]= new String[4];
		miTabla= new DefaultTableModel(null,titulos);
		for(int i=0; i< misDatos.numeroPeliculas();i++)
		{
			registro[0]=misDatos.getPeliculas()[i].getIDPelicula();
			registro[1]=categoria(misDatos.getPeliculas()[i].getCategoria());
			registro[2]=misDatos.getPeliculas()[i].getIdioma();
			registro[3]=misDatos.getPeliculas()[i].getDuracion();
			
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
		
		
		cmbCategoria.setEnabled(true);
		txtDirector.setEnabled(true);
		txtDuracion.setEnabled(true);
		txtIdioma.setEnabled(true);
		txtAño.setEnabled(true);
		txtPais.setEnabled(true);
		txtSinopsis.setEnabled(true);
		
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
		
		cmbCategoria.setEnabled(false);
		txtDirector.setEnabled(false);
		txtDuracion.setEnabled(false);
		txtIDPelicula.setEnabled(false);
		txtIdioma.setEnabled(false);
		txtAño.setEnabled(false);
		txtPais.setEnabled(false);
		txtSinopsis.setEnabled(false);
		
	}
	private void mostrarRegistro()
	{
		
		txtIDPelicula.setText(misDatos.getPeliculas()[peliActual].getIDPelicula());
		txtSinopsis.setText(misDatos.getPeliculas()[peliActual].getSinopsis());
		txtDirector.setText(misDatos.getPeliculas()[peliActual].getDirector());
		txtPais.setText(misDatos.getPeliculas()[peliActual].getPais());
		txtAño.setText(misDatos.getPeliculas()[peliActual].getAño());
		txtIdioma.setText(misDatos.getPeliculas()[peliActual].getIdioma());
		txtDuracion.setText(misDatos.getPeliculas()[peliActual].getDuracion());
		cmbCategoria.setSelectedIndex(misDatos.getPeliculas()[peliActual].getCategoria());
		
		
	}
	private void btnPrimeroActionPerformed(ActionEvent evt)
	{
		
		peliActual=0;
		mostrarRegistro();

	}
	private void btnAnteriorActionPerformed(ActionEvent evt)
	{

		if(peliActual != 0)
		{
			peliActual--;
			mostrarRegistro();
		}
		
	}
	private void btnSiguienteActionPerformed(ActionEvent evt)
	{
		
		if(!((peliActual+1) == misDatos.numeroPeliculas()))
		{
			peliActual++;
			mostrarRegistro();
		}
		
	}
	private void btnUltimoActionPerformed(ActionEvent evt)
	{
		
		peliActual=misDatos.numeroPeliculas()-1;
		mostrarRegistro();
		
	}
	private void btnNuevoActionPerformed(ActionEvent evt)
	{
		
		habilitarEdicion();
		txtIDPelicula.setEnabled(true);
		txtIDPelicula.setText("");
		cmbCategoria.setSelectedIndex(-1);
		txtDirector.setText("");
		txtPais.setText("");
		txtDuracion.setText("");
		txtAño.setText("");
		txtIdioma.setText("");
		txtSinopsis.setText("");
		
		txtIDPelicula.requestFocusInWindow();
		nuevo=true;
		
	}
	private void btnModificarActionPerformed(ActionEvent evt)
	{
	  
		habilitarEdicion();
		cmbCategoria.requestFocusInWindow();
		nuevo=false;
		
	}
	private void btnGuardarActionPerformed(ActionEvent evt)
	{
		
		if(txtIDPelicula.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"favor de ingresar un ID de pelicula");
			txtIDPelicula.requestFocusInWindow();
			return ;
		}
		if(cmbCategoria.getSelectedIndex()==-1)
		{
			JOptionPane.showMessageDialog(null,"seleccione una categoria de la pelicula");
			cmbCategoria.requestFocusInWindow();
			return ;
		}
		if(txtDirector.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"favor de ingresar el nombre del director ");
			txtDirector.requestFocusInWindow();
			return ;
		}
		if(txtPais.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"favor de ingresar el pais de origen de la pelicula");
			txtPais.requestFocusInWindow();
			return ;
		}
		if(txtDuracion.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"favor de ingresar la duracion de la pelicula");
			txtDuracion.requestFocusInWindow();
			return ;
		}
		if(txtAño.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"favor de ingresar el año de la creacion de la pelicula ");
			txtAño.requestFocusInWindow();
			return ;
		}
		if(txtIdioma.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"favor de ingresar en que idioma esta la pelicula ");
			txtIdioma.requestFocusInWindow();
			return ;
		}
		if(txtSinopsis.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"favor de ingresar una sinopsis de la pelicula");
			txtSinopsis.requestFocusInWindow();
			return ;
		}
				
		int pos=misDatos.posicionPelicula(txtIDPelicula.getText());
		if(nuevo)
		{
			if (pos != -1)
			{
				JOptionPane.showMessageDialog(this,"esta pelicula ya existe");
				txtIDPelicula.requestFocusInWindow();
			}
		}
		
		Pelicula miPelicula = new Pelicula(txtIDPelicula.getText(),cmbCategoria.getSelectedIndex(),txtDirector.getText(),txtPais.getText(),txtDuracion.getText(),txtAño.getText(),txtIdioma.getText(),txtSinopsis.getText());
		String msg="";
		if(nuevo)
		{
			msg=misDatos.agregarPelicula(miPelicula);
		}		
		else
		{
			msg=misDatos.modificarPelicula(miPelicula,pos);
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
	  	
	   String msg=misDatos.borrarPelicula(peliActual);
	   JOptionPane.showMessageDialog(this,msg);
	   peliActual=0;
	   llenartabla();
	   mostrarRegistro(); 
	  
	}
	private void btnBuscarActionPerformed(ActionEvent evt)
	{
		
		String pelicula=JOptionPane.showInputDialog(null,"ingrese ID de la pelicula: ");
		if(pelicula.equals(""))
		{
			return;
		}
		int pos=misDatos.posicionPelicula(pelicula);
		if(pos==-1)
		{
			JOptionPane.showMessageDialog(null,"la pelicula no existe");
			return;
		}
		peliActual=pos;
		mostrarRegistro();
		
	}
	private String categoria(int idCategoria)
	{
		switch(idCategoria)
		{
			case 0: return "a";
			case 1: return "b";
			case 2: return "c";
			default:return "desconocido";
		}
	}
}
