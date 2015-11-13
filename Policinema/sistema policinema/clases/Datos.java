package clases;
public class Datos
{
	private int maxUsu=100;
	private int maxPel=100;
	private Usuario misUsuarios[] = new Usuario[maxUsu];
	private Pelicula misPeliculas[] = new Pelicula[maxPel];
	private Contraseña misContraseñas[] = new Contraseña[maxUsu];
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
	public String agregarContraseña(Contraseña miUsuario)
	{
		if(conUsu==maxUsu)
		{
			return "se ha alcanzado el numero maximo de usuarios";
		}
		misContraseñas[conUsu]= miUsuario;
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
        misPeliculas[pos].setAño(miPelicula.getAño());
        misPeliculas[pos].setDuracion(miPelicula.getDuracion());
        misPeliculas[pos].setCategoria(miPelicula.getCategoria());
        
        return "Pelicula Modificada Correctamente";
	}
	public String modificarContraseña(Contraseña miUsuario, int pos)
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
		miUsuario=new Usuario ("pam","pamela","saldaña","princesa",0);
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
		miPelicula=new Pelicula ("Num Tchai: La danza ceremonial de los Kung",1,"John Marshall","Estados Unidos","20 min","1969","Inglés","Tchai es la palabra utilizada por los ju/’hoansi para referirse a la danza y al canto; n/um puede traducirse como medicina o potencia sobrenatural. En la década de 1950, cuando este documental fue realizado, los ju/’hoansi se reunían para practicar danzas medicinales. Este documental introduce el papel del n/um tchai para curar y evitar el mal, posteriormente mostrando escenas de una noche dedicada por entero a una danza donde se mezcla el ritual de la curación con el placer de la música y el baile");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Homenaje a Tarzán",1,"Rafael Ruiz Balerdi","España","5 min.","1970","Sin diálogos","El pintor vasco Rafael Ruiz Balerdi creó esta película pintando directamente sobre celuloide.Tomando como referencia fragmentos de un largometraje sobre Tarzán, dibujó sobre película transparente las imágenes filmadas, utilizando el método de la calcomanía. El aspecto figurativo del filme contrasta con la abstracción de los dibujos, a menudo irreconocibles");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Jinetes divinos: los dioses",1,"Maya Deren","Estados Unidos","47 min","1947–1954","Inglés, francés","En 1947 Maya Deren desembarcó en Haití, con dieciocho maletas llenas de equipo cinematográfico, y se quedó ocho meses. Su plan era registrar danzas haitianas, explorando la pureza de la forma en la danza, pero su trabajo la condujo a filmar material para un documental sobre vudú haitiano, danza y posesión. En 1981, 20 años tras la muerte de Deren, la película fue terminada por su tercer esposo, Teiji Ito, y su entonces esposa, Cherel Winett Ito.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("bosque de Dicha",1,"Robert Gardner","Estados Unidos","90 min.","1989","Sin diálogos","Bosque de dicha narra la implacable pero redentora acumulación de dolor, fervor religioso y frecuente felicidad que marca la vida diaria en la ciudad de Benares, la ciudad más sagrada de la India. La cinta se desarrolla de un amanecer a otro, sin comentarios, subtítulos o diálogos. Es un intento por darle al espectador la sensación de estar participando en los acontecimientos que se examinan en el documental.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Las estaciones",0,"Artavazd Pelechian","Armenia","29 min.","1971","Sin diálogos","Las estaciones supone una mirada sobre las relaciones armoniosas y contradictorias entre la humanidad y la naturaleza. Las estaciones del año y las etapas de la vida humana sirven para mostrar que no es la humanidad quien se impone ante la naturaleza, sino lo contrario. Imágenes de pastores Armenios, trabajando en la montaña, se sobrelapan con Vivaldi, construyendo una perspectiva universal sobre la condición humana.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Fábrica de fruta artificial",0,"Chick Strand","México-Estados Unidos","22 min","1989","Español, inglés","Un íntimo documental acerca de jóvenes mujeres que producen frutas y vegetales de papel maché en una pequeña fábrica en México. Su jefe es estadounidense, pero quien rige en la fábrica es su esposa mexicana. La película se enfoca en el color, la música y el movimiento, así como los constantes rumores que revelan lo que estas mujeres piensan sobre los hombres.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Valentín de las Sierras",1,"Bruce Baillie","México-Estados Unidos","10 min","1968","Español","Estructurada en torno a un corrido mexicano, cantado por José Santollo Nasido, en Santa Cruz de la Soledad, Chapala, en Jalisco, se cuenta la historia de Valentín, héroe revolucionario, quien pudo haber sido un mártir o un traidor.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Judea: Semana Santa entre los Coras",0,"Nicolás Echevarría","México","22 min","1974","Español","Filmado en la comunidad de Santa Teresa Nayarit, en la Sierra Madre Occidental de México, este ensayo cinematográfico sobre la Semana Santa entre los Coras muestra el rito de iniciación de los adolescentes, que consiste en la escenificación de la pasión de Cristo.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("El Venado",1,"Pablo Fulgueira","México","43 min","2009","Español","Un retrato de los jicareros, responsables de cumplir con la tradición wixarika. Los marakame — chamanes, cantadores, curanderos— recorren más de tres mil kilómetros de infinitos paisajes, sostenidos por su compleja espiritualidad y un gran sentido del humor. En sus fiestas lo poético es primordial y cotidiano, mientras que la música los acompaña siempre. Un fragmento de la película filmada a solicitud de los jicareros del Centro Ceremonial Tserie’kame de Cohamiata.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Ex-voto para tres ánimas",2,"Diego Rivera Kohn","México","43 min","2008","Español","Tres historias se entretejen con un mismo sentido: la espera de un milagro que logre trascender las dificultades de la vida. Guiados por la fe, Cristian, un joven boxeador, María Teresa, una mujer mayor y Luis, un pescador, esperan con paciencia y luchan para que su destino cambie y les brinde nuevas oportunidades.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("La creación como nosotros la vimos",1,"Ben Rivers","Reino Unido","15 min","2012","Sin dialogos","Tres míticas historias de Vanuatu relacionadas con el origen de la humanidad, explican por qué los cerdos caminan en cuatro patas y por qué el volcán se sienta donde lo hace.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Las figuras talladas en el cuchillo por la sabia de los bananos",1,"Joana Pimenta","Portugal, Estados Unidos","16 min","2014","Portugués","El giro veloz de una luz dibuja un círculo. En el espacio enmarcado por su línea se desenreda un archivo de postales enviadas entre la isla de Madeira y la antigua colonia portuguesa de Mozambique. Un filme que circula entre una remembranza colonial ficcional y la ciencia ficción.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("Saludos a los ancestros",0,"Ben Russell","Estados Unidos-Inglaterra","29 min","2014","Xhosa, inglés","Filmado entre Suazilandia y Sudáfrica, en una región que continúa lidiando con las divisiones producidas por el apartheid, este documental registra la vida en sueños de los habitantes del territorio, mientras los límites de la conciencia se expanden y disuelven. A la vez documental, etnografía y cine de sueños, el filme explora el universo onírico como andamiaje espiritual de la adivinación ancestral Xhosa.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("El Final",1,"Artavazd Pelechian","Armenia","9 min","1991","Sin diálogos","La experiencia tangible de un recorrido en tren vista a través de una mirada detallada sobre los cuerpos en movimiento y las expresiones de sus habitantes temporales, en yuxtaposición a los sonidos de la estructura metálica que los contiene durante el viaje.");
		misPeliculas[conPeli]=miPelicula;
		conPeli++;
		miPelicula=new Pelicula ("El ministro de Hierro",0,"J.P. Sniadecki","China-Estados Unidos","83 min","2014","Mandarin","Filmado durante tres años en los trenes de China, este documental traza los vastos interiores de un país en movimiento: carne y metal, choque y chillidos, luz y oscuridad, lenguaje y gesto. Múltiples viajes en tren se convierten en uno, capturando las emociones y ansiedades de la transformación social y tecnológica. Un encuentro entre humanos y máquinas en lo que se convertirá en la red de trenes más grande del mundo.");
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
