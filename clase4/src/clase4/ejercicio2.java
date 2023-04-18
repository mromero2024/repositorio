package clase4;
import java.io.BufferedReader;
import java.io.FileReader;

//Esta es la resolucion del ejercicio 2, tanto para el punto a como par b.

public class ejercicio2 {
	FileReader archivo;
	BufferedReader lector;
	String nuevaCadena[]= new String[10];
	int suma = 0;
	String operacion= "suma";
	
	public ejercicio2() {
		
		try {
			archivo = new FileReader("C:\\Users\\mromero\\Desktop\\Argentina Programa\\tareas\\clase 4\\numeros.txt");
			
			if(archivo.ready()) {
				lector = new BufferedReader(archivo);
				String cadena;
				
				while((cadena = lector.readLine()) != null) {				
					nuevaCadena= cadena.split(" ");
				}
			}else {
				System.out.println("el arvhivo no esta listo para ser leido");
			}
		}catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("los siguientes numeros fueron leidos de un archivo txt, convertidos a un arreglo y luego a enteros");
		System.out.println("----------                    ----------");
		
		if(operacion == "suma") {
		for(int i = 0; i<nuevaCadena.length; i++) {
			System.out.println(nuevaCadena[i]);	
			suma= suma + Integer.parseInt(nuevaCadena[i]);
		}}else{
			for(int i = 0; i<nuevaCadena.length; i++) {
				System.out.println(nuevaCadena[i]);	
				suma= Integer.parseInt(nuevaCadena[0]) - Integer.parseInt(nuevaCadena[1])- Integer.parseInt(nuevaCadena[2])- Integer.parseInt(nuevaCadena[3])- Integer.parseInt(nuevaCadena[4]);
			}
		}
		
		
		System.out.println("----------                    ----------");
		System.out.println("la suma de dichos numeros es: "+ suma);
}}