package clases;

public class Contrase�a{
	private String idUsuario;
	private String clave;
	
	public Contrase�a(String idUsuario,String clave)
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
