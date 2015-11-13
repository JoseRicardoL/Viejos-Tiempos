package clases;
public class Datos
{
	private int maxUsu=100;
	private int maxPel=100;
	private Usuario misUsuarios[] = new Usuario[maxUsu];
	private Pelicula misPeliculas[] = new Pelicula[maxPel];
	private Contrase�a misContrase�as[] = new Contrase�a[maxUsu];
	private int conUsu = 0;
	private int conPeli = 0;
	
	
	public Datos()
	{
		cargarUsuarios();
		cargarPelicula();
	}
	
	public boolean validarUsuario(String usuario,String clave)
	{
		for(int i=0; i<conUsu;i++)
		{
			if(misUsuarios[i].getIdUsuario().equalsIgnoreCase(usuario)&&misUsuarios[i].getClave().equals(clave))
			{
				return true;
			}
		}
    	return false;
	}
	public int posicionUsuario(String usuario)
	{
		for(int i=0; i<conUsu;i++)
		{
			if(misUsuarios[i].getIdUsuario().equalsIgnoreCase(usuario))
			{
				return i;
			}
		}
    	return -1;
	}
	public int posicionPelicula(String pelicula)
	{
		for(int i=0; i<conPeli;i++)
		{
			if(misPeliculas[i].getIDPelicula().equalsIgnoreCase(pelicula))
			{
				return i;
			}
		}
    	return -1;
	}
	public String agregarUsuario(Usuario miUsuario)
	{
		if(conUsu==maxUsu)
		{
			return "se ha alcanzado el numero maximo de usuarios";
		}
		misUsuarios[conUsu]= miUsuario;
		conUsu++;
		return "usuario agregado con exito";
	}
	public String agregarPelicula(Pelicula miPelicula)
	{
		if(conPeli==maxPel)
		{
			return "se ha alcanzado el numero maximo de Peliculas";
		}
		misPeliculas[conPeli]= miPelicula;
		conPeli++;
		return "pelicula agregada con exito";
	}
	public String agregarContrase�a(Contrase�a miUsuario)
	{
		if(conUsu==maxUsu)
		{
			return "se ha alcanzado el numero maximo de usuarios";
		}
		misContrase�as[conUsu]= miUsuario;
		conUsu++;
		return "usuario agregado con exito";
	}
	
	public String modificarUsuario(Usuario miUsuario, int pos)
	{
		misUsuarios[pos].setNombres(miUsuario.getNombres());
        misUsuarios[pos].setApellidos(miUsuario.getApellidos());
        misUsuarios[pos].setClave(miUsuario.getClave());
        misUsuarios[pos].setPerfil(miUsuario.getPerfil());
        return "Usuario Modificado Correctamente";
	}
	public String modificarPelicula(Pelicula miPelicula, int pos)
	{
		misPeliculas[pos].setIDPelicula(miPelicula.getIDPelicula());
        misPeliculas[pos].setSinopsis(miPelicula.getSinopsis());
        misPeliculas[pos].setPais(miPelicula.getDirector());
        misPeliculas[pos].setIdioma(miPelicula.getIdioma());
        misPeliculas[pos].setPais(miPelicula.getPais());
        misPeliculas[pos].setA�o(miPelicula.getA�o());
        misPeliculas[pos].setDuracion(miPelicula.getDuracion());
        misPeliculas[pos].setCategoria(miPelicula.getCategoria());
        
        return "Pelicula Modificada Correctamente";
	}
	public String modificarContrase�a(Contrase�a miUsuario, int pos)
	{
		misUsuarios[pos].setIdUsuario(miUsuario.getIdUsuario());
        misUsuarios[pos].setClave(miUsuario.getClave());
        return "Usuario Modificado Correctamente";
	}
	public String borrarUsuario(int pos)
	{
		for(int i=pos; i<conUsu-1; i++)
		{
			misUsuarios[i]=misUsuarios[i+1];
		}
		conUsu--;
		return "Usuario Borrado Correctamente";
	}
	public String borrarPelicula(int pos)
	{
		for(int i=pos; i<conPeli-1; i++)
		{
			misPeliculas[i]=misPeliculas[i+1];
		}
		conPeli--;
		return "La Pelicula Ha Borrado Correctamente";
	}
	private void cargarUsuarios()
	{
		Usuario miUsuario;
		miUsuario=new Usuario ("halo","ricardo","lopez","123",1);
		misUsuarios[conUsu]=miUsuario;
		conUsu++;
		miUsuario=new Usuario ("chema","jose maria","morales","4815",1);
		misUsuarios[conUsu]=miUsuario;
		conUsu++;
		miUsuario=new Usuario ("pam","pamela","salda�a","princesa",0);
		misUsuarios[conUsu]=miUsuario;
		conUsu++;
		miUsuario=new Usuario ("yopli","karla","perez","2880",1);
		misUsuarios[conUsu]=miUsuario;
		conUsu++;
		miUsuario=new Usuario ("luis1415","luis","sanchez","voca5",1);
		misUsuarios[conUsu]=miUsuario;
		conUsu++;
	}
	private void cargarPelicula()
	{
		Pelicula miPelicula;
		miPelicula=new Pelicula ("Num Tchai: La danza ceremonial de los Kung",1,"John Marshall","Estados Unidos","20 min","1969","Ingl�s","Tchai es la palabra utilizada por los ju/�hoansi para referirse a la danza y al canto; n/um puede traducirse como medicina o potencia sobrenatural. En la d�cada de 1950, cuando este documental fue realizado, los ju/�hoansi se reun�an para practicar danzas medicinales. Este documental introduce el papel del n/um tchai para curar y evitar el mal, posteriormente mostrando escenas de una noche dedicada por entero a una danza donde se mezcla el ritual de la curaci�n con el placer de la m�sica y el baile");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Homenaje a Tarz�n",1,"Rafael Ruiz Balerdi","Espa�a","5 min.","1970","Sin di�logos","El pintor vasco Rafael Ruiz Balerdi cre� esta pel�cula pintando directamente sobre celuloide.Tomando como referencia fragmentos de un largometraje sobre Tarz�n, dibuj� sobre pel�cula transparente las im�genes filmadas, utilizando el m�todo de la calcoman�a. El aspecto figurativo del filme contrasta con la abstracci�n de los dibujos, a menudo irreconocibles");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Jinetes divinos: los dioses",1,"Maya Deren","Estados Unidos","47 min","1947�1954","Ingl�s, franc�s","En 1947 Maya Deren desembarc� en Hait�, con dieciocho maletas llenas de equipo cinematogr�fico, y se qued� ocho meses. Su plan era registrar danzas haitianas, explorando la pureza de la forma en la danza, pero su trabajo la condujo a filmar material para un documental sobre vud� haitiano, danza y posesi�n. En 1981, 20 a�os tras la muerte de Deren, la pel�cula fue terminada por su tercer esposo, Teiji Ito, y su entonces esposa, Cherel Winett Ito.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("bosque de Dicha",1,"Robert Gardner","Estados Unidos","90 min.","1989","Sin di�logos","Bosque de dicha narra la implacable pero redentora acumulaci�n de dolor, fervor religioso y frecuente felicidad que marca la vida diaria en la ciudad de Benares, la ciudad m�s sagrada de la India. La cinta se desarrolla de un amanecer a otro, sin comentarios, subt�tulos o di�logos. Es un intento por darle al espectador la sensaci�n de estar participando en los acontecimientos que se examinan en el documental.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Las estaciones",0,"Artavazd Pelechian","Armenia","29 min.","1971","Sin di�logos","Las estaciones supone una mirada sobre las relaciones armoniosas y contradictorias entre la humanidad y la naturaleza. Las estaciones del a�o y las etapas de la vida humana sirven para mostrar que no es la humanidad quien se impone ante la naturaleza, sino lo contrario. Im�genes de pastores Armenios, trabajando en la monta�a, se sobrelapan con Vivaldi, construyendo una perspectiva universal sobre la condici�n humana.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("F�brica de fruta artificial",0,"Chick Strand","M�xico-Estados Unidos","22 min","1989","Espa�ol, ingl�s","Un �ntimo documental acerca de j�venes mujeres que producen frutas y vegetales de papel mach� en una peque�a f�brica en M�xico. Su jefe es estadounidense, pero quien rige en la f�brica es su esposa mexicana. La pel�cula se enfoca en el color, la m�sica y el movimiento, as� como los constantes rumores que revelan lo que estas mujeres piensan sobre los hombres.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Valent�n de las Sierras",1,"Bruce Baillie","M�xico-Estados Unidos","10 min","1968","Espa�ol","Estructurada en torno a un corrido mexicano, cantado por Jos� Santollo Nasido, en Santa Cruz de la Soledad, Chapala, en Jalisco, se cuenta la historia de Valent�n, h�roe revolucionario, quien pudo haber sido un m�rtir o un traidor.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Judea: Semana Santa entre los Coras",0,"Nicol�s Echevarr�a","M�xico","22 min","1974","Espa�ol","Filmado en la comunidad de Santa Teresa Nayarit, en la Sierra Madre Occidental de M�xico, este ensayo cinematogr�fico sobre la Semana Santa entre los Coras muestra el rito de iniciaci�n de los adolescentes, que consiste en la escenificaci�n de la pasi�n de Cristo.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("El Venado",1,"Pablo Fulgueira","M�xico","43 min","2009","Espa�ol","Un retrato de los jicareros, responsables de cumplir con la tradici�n wixarika. Los marakame � chamanes, cantadores, curanderos� recorren m�s de tres mil kil�metros de infinitos paisajes, sostenidos por su compleja espiritualidad y un gran sentido del humor. En sus fiestas lo po�tico es primordial y cotidiano, mientras que la m�sica los acompa�a siempre. Un fragmento de la pel�cula filmada a solicitud de los jicareros del Centro Ceremonial Tserie�kame de Cohamiata.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Ex-voto para tres �nimas",2,"Diego Rivera Kohn","M�xico","43 min","2008","Espa�ol","Tres historias se entretejen con un mismo sentido: la espera de un milagro que logre trascender las dificultades de la vida. Guiados por la fe, Cristian, un joven boxeador, Mar�a Teresa, una mujer mayor y Luis, un pescador, esperan con paciencia y luchan para que su destino cambie y les brinde nuevas oportunidades.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("La creaci�n como nosotros la vimos",1,"Ben Rivers","Reino Unido","15 min","2012","Sin dialogos","Tres m�ticas historias de Vanuatu relacionadas con el origen de la humanidad, explican por qu� los cerdos caminan en cuatro patas y por qu� el volc�n se sienta donde lo hace.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Las figuras talladas en el cuchillo por la sabia de los bananos",1,"Joana Pimenta","Portugal, Estados Unidos","16 min","2014","Portugu�s","El giro veloz de una luz dibuja un c�rculo. En el espacio enmarcado por su l�nea se desenreda un archivo de postales enviadas entre la isla de Madeira y la antigua colonia portuguesa de Mozambique. Un filme que circula entre una remembranza colonial ficcional y la ciencia ficci�n.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Saludos a los ancestros",0,"Ben Russell","Estados Unidos-Inglaterra","29 min","2014","Xhosa, ingl�s","Filmado entre Suazilandia y Sud�frica, en una regi�n que contin�a lidiando con las divisiones producidas por el apartheid, este documental registra la vida en sue�os de los habitantes del territorio, mientras los l�mites de la conciencia se expanden y disuelven. A la vez documental, etnograf�a y cine de sue�os, el filme explora el universo on�rico como andamiaje espiritual de la adivinaci�n ancestral Xhosa.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("El Final",1,"Artavazd Pelechian","Armenia","9 min","1991","Sin di�logos","La experiencia tangible de un recorrido en tren vista a trav�s de una mirada detallada sobre los cuerpos en movimiento y las expresiones de sus habitantes temporales, en yuxtaposici�n a los sonidos de la estructura met�lica que los contiene durante el viaje.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("El ministro de Hierro",0,"J.P. Sniadecki","China-Estados Unidos","83 min","2014","Mandarin","Filmado durante tres a�os en los trenes de China, este documental traza los vastos interiores de un pa�s en movimiento: carne y metal, choque y chillidos, luz y oscuridad, lenguaje y gesto. M�ltiples viajes en tren se convierten en uno, capturando las emociones y ansiedades de la transformaci�n social y tecnol�gica. Un encuentro entre humanos y m�quinas en lo que se convertir� en la red de trenes m�s grande del mundo.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
	
	}
	public int numeroUsuarios()
	{
		return conUsu;
	}
	public int numeroPeliculas()
	{
		return conPeli;
	}
	public Usuario[] getUsuarios()
	{
		return misUsuarios;
	}
	public Pelicula[] getPeliculas()
	{
		return misPeliculas;
	}
}
