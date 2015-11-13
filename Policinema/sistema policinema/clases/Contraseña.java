package clases;

public class Contraseña{
	private String idUsuario;
	private String clave;
	
	public Contraseña(String idUsuario,String clave)
    {
		this.idUsuario = 	idUsuario;
		this.clave = clave;
		
	}	
	public String getIdUsuario()
	{
		return idUsuario;
	}
	public String getClave()
	{
		return clave;
	}
	public void setIdUsuario(String idUsuario)
	{
		this.idUsuario = idUsuario;
	}
	public void setClave(String clave)
	{
		this.clave = clave;
	}

	
}
