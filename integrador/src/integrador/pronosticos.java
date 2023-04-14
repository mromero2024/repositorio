package integrador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;

public class pronosticos {
	String pronostico1;
	String pronostico2;
	
	public pronosticos() {
		try {
		FileReader archivoPronosticos = new FileReader("C:\\Users\\mromero\\Desktop\\Argentina Programa\\tareas\\integrador\\pronosticos.txt");
		BufferedReader lectorPronosticos = new BufferedReader(archivoPronosticos);
		String cadena = lectorPronosticos.readLine();
		String pronosticos [] = cadena.split(",");
		pronostico1=pronosticos[0];
		pronostico2=pronosticos[1];
		}catch(Exception e){
		System.out.println("error" + e.getMessage());
	}
		System.out.println(pronostico1);
		System.out.println(pronostico2);
		

		
}
}