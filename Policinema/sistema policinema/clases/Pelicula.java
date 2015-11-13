package clases;

public class Pelicula
{
	private String idPelicula;
	private String sinopsis;
	private String director;
	private String pais;
	private String a�o;
	private String idioma;
	private String duracion;
	private int categoria;
	
    
	public Pelicula(String idPelicula,int categoria,String director,String pais,String duracion,String a�o,String idioma,String sinopsis)
    {
		this.idPelicula = idPelicula;
		this.categoria = categoria;
		this.director = director;
		this.pais = pais;
		this.duracion = duracion;
		this.a�o = a�o;
		this.idioma = idioma;
		this.sinopsis = sinopsis;
		
		
	}	
	public String getIDPelicula()
	{
		return idPelicula;
	}
	public int getCategoria()
	{
		return categoria;
	}
	public String getDirector()
	{
		return director;
	}
	public String getPais()
	{
		return pais;
	}
	public String getDuracion()
	{
		return duracion;
	}
	public String getA�o()
	{
		return a�o;
	}
	public String getIdioma()
	{
		return idioma;
	}
	public String getSinopsis()
	{
		return sinopsis;
	}
	public void setIDPelicula(String ididPelicula)
	{
		this.idPelicula = idPelicula;
	}
	public void setCategoria(int categoria)
	{
		this.categoria = categoria;
	}
	public void setDirector(String director)
	{
		this.director = director;
	}
	public void setPais(String pais)
	{
		this.pais = pais;
	}
	public void setDuracion(String duracion)
	{
		this.duracion = duracion;
	}
	public void setA�o(String a�o)
	{
		this.a�o = a�o;
	}
	public void setIdioma(String idioma)
	{
		this.idioma = idioma;
	}
	public void setSinopsis(String sinopsis)
	{
		this.sinopsis = sinopsis;
	}	
}