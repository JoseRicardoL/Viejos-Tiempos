package clases;
import formularios.frmLogin;

public class Principal
{
	
	public static void main(String[] args) 
	{
		Datos misDatos=new Datos();
		frmLogin x=new frmLogin();
		x.setLocationRelativeTo(null);
		x.setDatos(misDatos);
		x.setVisible(true);
	}	
}
