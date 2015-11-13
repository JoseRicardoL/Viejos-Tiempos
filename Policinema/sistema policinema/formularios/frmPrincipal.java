package formularios;
import clases.Datos;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu.*;
import javax.swing.JDesktopPane;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import clases.DesktopConFondo;
public class frmPrincipal extends JFrame 
{
	private JMenuBar mnbMenu;
	private JMenu mnuArchivo;
	private JMenu mnuMovimientos;
	private JMenu mnuAyuda;
	private JMenuItem mnuArchivoClientes;
	private JMenuItem mnuArchivoPeliculas;
	private JMenuItem mnuArchivoUsuarios;
	private JMenuItem mnuArchivoCambioClave;
	private JMenuItem mnuArchivoCambioUsuario;
	private JMenuItem mnuArchivoSalir;
	private Separator mnuSeparador1;
	private Separator mnuSeparador2;
	
	private JMenuItem mnuMovimientosReporteRegistro;
	private JMenuItem mnuAyudaAcercaDe;
	private JMenuItem mnuAyudaAyuda;
	private JDesktopPane dpnEscritorio;
	private Datos misDatos;
	public void setDatos(Datos datos)
	{
		misDatos = datos;
	}
	public frmPrincipal()
	{
		setTitle("Sistema Policinema beta");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(600,800);
	    Icon icoArchivo = new ImageIcon(getClass().getResource("/imagenes/archivo.png"));
	    Icon icoMovimientos = new ImageIcon(getClass().getResource("/imagenes/movimientos.png"));
	    Icon icoAyuda = new ImageIcon(getClass().getResource("/imagenes/ayuda.png"));
	    Icon icoClientes = new ImageIcon(getClass().getResource("/imagenes/clientes.png"));
	    Icon icoPeliculas = new ImageIcon(getClass().getResource("/imagenes/peliculas.png"));
	    Icon icoUsuarios = new ImageIcon(getClass().getResource("/imagenes/usuarios.png"));
	    Icon icoCambioClave = new ImageIcon(getClass().getResource("/imagenes/cambioclave.png"));
	    Icon icoCambioUsuario = new ImageIcon(getClass().getResource("/imagenes/cambiousuario.png"));
	    Icon icoSalir = new ImageIcon(getClass().getResource("/imagenes/salir.png"));
	    
	    Icon icoReporteRegistro = new ImageIcon(getClass().getResource("/imagenes/reporte.png"));
	    Icon icoAcercaDe = new ImageIcon(getClass().getResource("/imagenes/acerca.png"));
	    Icon icoAyudaAyuda = new ImageIcon(getClass().getResource("/imagenes/ayuda2.png"));
	    
	    mnbMenu=new JMenuBar();
	    mnuArchivo=new JMenu("Archivo");
	    mnuArchivo.setIcon(icoArchivo);
	    mnuMovimientos=new JMenu("Movimientos");
	    mnuMovimientos.setIcon(icoMovimientos);
	    mnuAyuda=new JMenu("Ayuda");
	    mnuAyuda.setIcon(icoAyuda);
	    mnuArchivoClientes=new JMenuItem("Clientes");
	    mnuArchivoClientes.setIcon(icoClientes);
	    mnuArchivoClientes.addActionListener(new ActionListener()
	    {
		    public void actionPerformed(ActionEvent evt)
		    {
		   		mnuArchivoClientesActionPerformed(evt);
		    }
	    });
	    mnuArchivoPeliculas=new JMenuItem("Peliculas");
	    mnuArchivoPeliculas.setIcon(icoPeliculas);
	    mnuArchivoPeliculas.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent evt)
	    	{
	    		mnuArchivoPeliculasActionPerformed(evt);
	    	}
	    });
	    mnuArchivoUsuarios=new JMenuItem("Usuarios");
	    mnuArchivoUsuarios.setIcon(icoUsuarios);
	    mnuArchivoUsuarios.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent evt)
	    	{
	    		mnuArchivoUsuariosActionPerformed(evt);
	    	}
	    });
	    mnuArchivoCambioClave=new JMenuItem("CambioContraseña");
	    mnuArchivoCambioClave.setIcon(icoCambioClave);
	    mnuArchivoCambioClave.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent evt)
	    	{
	    		mnuArchivoCambioClaveActionPerformed(evt);
	    	}
	    });
	    mnuArchivoCambioUsuario=new JMenuItem("CambioUsuario");
	    mnuArchivoCambioUsuario.setIcon(icoCambioUsuario);
	    mnuArchivoCambioUsuario.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent evt)
	    	{
	    		mnuArchivoCambioUsuarioActionPerformed(evt);
	    	}
	    });
	    mnuArchivoSalir=new JMenuItem("Salir");
	    mnuArchivoSalir.setIcon(icoSalir);
	    mnuArchivoSalir.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent evt)
	    	{
	    		mnuArchivoSalirActionPerformed(evt);
	    	}
	    });
	   
	    mnuMovimientosReporteRegistro=new JMenuItem("ReporteRegistro");
	    mnuMovimientosReporteRegistro.setIcon(icoReporteRegistro);
	    mnuMovimientosReporteRegistro.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent evt)
	    	{
	    		mnuMovimientosReporteRegistroActionPerformed(evt);
	    	}
	    });
	    mnuAyudaAcercaDe=new JMenuItem("AcercaDe");
	    mnuAyudaAcercaDe.setIcon(icoAcercaDe);
	    mnuAyudaAcercaDe.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent evt)
	    	{
	    		mnuAyudaAcercaDeActionPerformed(evt);
	    	}
	    });
	    mnuAyudaAyuda=new JMenuItem("Ayuda");
	    mnuAyudaAyuda.setIcon(icoAyudaAyuda);
	    mnuAyudaAyuda.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent evt)
	    	{
	    		mnuAyudaAyudaActionPerformed(evt);
	    	}
	    });
	    mnuSeparador1=new Separator();
	    mnuSeparador2=new Separator();
	    mnuArchivo.add(mnuArchivoClientes);
	    mnuArchivo.add(mnuArchivoPeliculas);
	    mnuArchivo.add(mnuArchivoUsuarios);
	    mnuArchivo.add(mnuSeparador1);
	    mnuArchivo.add(mnuArchivoCambioClave);
	    mnuArchivo.add(mnuArchivoCambioUsuario);
	    mnuArchivo.add(mnuSeparador2);
	    mnuArchivo.add(mnuArchivoSalir);
	    mnbMenu.add(mnuArchivo);
	    
	    mnuMovimientos.add(mnuMovimientosReporteRegistro);
	    mnbMenu.add(mnuMovimientos);
	    mnuAyuda.add(mnuAyudaAcercaDe);
	    mnuAyuda.add(mnuAyudaAyuda);
	    mnbMenu.add(mnuAyuda);
	    setJMenuBar(mnbMenu);
	    dpnEscritorio= new DesktopConFondo();
	    ((DesktopConFondo) dpnEscritorio) .setImagen("/imagenes/Fondo.jpg");
	    setContentPane(dpnEscritorio);
	    
	    }
	    
	    private void mnuArchivoClientesActionPerformed(ActionEvent evt)
	    {
	    	Archivo x= new Archivo();
		    x.Abrir();
	    	
	    }
	     private void mnuArchivoPeliculasActionPerformed(ActionEvent evt)
	    {
	    	frmPeliculas z=new frmPeliculas();
	    	z.setDatos(misDatos);
	    	dpnEscritorio.add(z);
	    	z.show();
	    }
	     private void mnuArchivoUsuariosActionPerformed(ActionEvent evt)
	    {
	    	frmUsuarios z=new frmUsuarios();
	    	z.setDatos(misDatos);
	    	dpnEscritorio.add(z);
	    	z.show();
	    }
	     private void mnuArchivoCambioClaveActionPerformed(ActionEvent evt)
	    {
	    	frmContraseña z=new frmContraseña();
	    	z.setDatos(misDatos);
	    	dpnEscritorio.add(z);
	    	z.show();
	    }
	     private void mnuArchivoCambioUsuarioActionPerformed(ActionEvent evt)
	    {
	    	frmCamusu z=new frmCamusu();
	    	z.setDatos(misDatos);
	    	dpnEscritorio.add(z);
	    	z.show();
	    }
	     private void mnuArchivoSalirActionPerformed(ActionEvent evt)
	    {
	    	System.exit(0);
	    }
	    
	     private void mnuMovimientosReporteRegistroActionPerformed(ActionEvent evt)
	    {
	    	
	    }
	     private void mnuAyudaAcercaDeActionPerformed(ActionEvent evt)
	    {
	    	JOptionPane.showMessageDialog(null,"\n\nACERCA DE:\n-----------------------\n\nEste simulador de cine surgió debido a que debíamos realizar un proyecto aula y después de mucho pensar, decidimos crear un simulador de cine que tuviese cine de arte como tema principal, para ello el grupo se dividió en varios \nDepartamentos, cada uno encargado de realizar una actividad distinta, debido al poco tiempo que tuvimos.\n\n-----------------------\nLos Departamentos fueron:\n\n-Investigación\n-Diseño\n-Programación\n-----------------------\n\nMediante el proceso cada sector fue dando ideas para conformar el proyecto terminado como tal,Mientras el sector de Investigación buscaba la información, películas y algunos métodos sobre como programar,  a su vez\n el sector de Diseño realizo algunas animacionesen Macromedia Flash para que los integrase el sector de programación.El sector de programación fue el encargado de realizar toda la estructura de programación en Jcreator \npara el simulador, además de que integraron toda la información y animaciones al mismo.\nEste proyecto fue creado con el objetivo de  acabar con la falta de interés de toda la población por la cultural que no solamente es a un nivel general sino también a un nivel mundial y dar a conocer por medio de estas películas \nlas diversas culturas.\nEnfocamos este  en la necesidad que como sociedad tenemos puesto que en estos tiempos en los que vivimos se necesita con una gran urgencia nutrirnos de cultura y no solamente por la de nuestro país,  por que \nlamentablemente nos hemos aislado del mundo que nos rodea , sin antes  mencionar que  este trabajo no solamente es para  la comunidad politécnica, sino  también para todo aquel usuario mayor de doce años ya que consideramos\n pertinente que el simulador no sería apto o conveniente para usuarios menores porque en él solo se contienen películas culturales.\nEsperamos que este trabajo llevado acabo cumpla con el objetivo antes mencionado y  se dé a conocer a toda la comunidad estudiantil y al público en general, una cartelera representativa para el cine cultural");
	    }
	     private void mnuAyudaAyudaActionPerformed(ActionEvent evt)
	    {
	    	int op,op2;
    	do{
    	
    	op=Integer.parseInt(JOptionPane.showInputDialog("¿En que apartado tiene duda? 1.ARCHIVO \t 2.MOVIMIENTOS "));
    	}while((op<1)||(op>2));
    	if(op==1)
    	{   do{
    	
    		op2=Integer.parseInt(JOptionPane.showInputDialog("1.CLIENTES \n 2.PELICULAS \n 3.USUARIOS \n 4.CAMBIO CONTRASEÑA \n 5.CAMBIO USUARIO"));
    
    		
    		
    		if(op2==1)
    		{
    			JOptionPane.showMessageDialog(null,"AYUDA AL EMPLEADO A REGISTRAR NUEVOS CLIENTES");
    		}
    		
    		if(op2==2)
    		{
    			JOptionPane.showMessageDialog(null,"AYUDA A EL EMPLEADO A REGISTAR LAS NUEVAS PELICULAS PARA QUE ESTEN VISIBLES EN LA CARTELERA");
    		}
    		if(op2==3)
    		{
    			JOptionPane.showMessageDialog(null,"AYUDA A EL EMPLEADO A VER TODOS LOS USUARIOS");
    		}
    		if(op2==4)
    		{
    			JOptionPane.showMessageDialog(null,"ESTE APARTADO PERMITE CAMBIAR LAS CONTRASEÑA CUANTAS VECES LO DESEE");
    		}
    		if(op2==5)
    		{
    			JOptionPane.showMessageDialog(null,"NOS PERMITE CAMBIAR EL USUARIO CUANTAS VECES LO DESEE");
    		}
    	}
    	while((op2<1)||(op2>5));
    	}
    	if(op==2)
    	{
    		do{
    			
    		
    			op2=Integer.parseInt(JOptionPane.showInputDialog("1.NUEVO REGISTRO \n 2.REPORTE REGISTRO"));
    			if(op==1)
    			{
    			
    			JOptionPane.showMessageDialog(null,"LIMPIA EL REGISTRO DE PELICULAS");
    			}
    		if(op2==2)
    		{
    			JOptionPane.showMessageDialog(null,"MUESTRA EL REPORTE DE PELICULAS");
    		}
    	
    	}
    	
    	while((op!=1)||(op!=2));
    	}
	    }
}
