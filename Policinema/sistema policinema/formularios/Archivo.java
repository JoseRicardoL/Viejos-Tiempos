package formularios;
import java.io.*;
import javax.swing.*;
public class Archivo
{
	public void Abrir()
	{
		String file= new String ("C:\\Users/Ricardo/Downloads/PROYECTO.accdb");
		try
		{
			Runtime.getRuntime().exec("cmd /c start "+file);
   		}
   		catch(IOException e)
   		{
   			e.printStackTrace();
		} 
	}
}
