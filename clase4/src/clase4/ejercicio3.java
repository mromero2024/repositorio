package clase4;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ejercicio3  {
		FileReader archivo;
		BufferedReader lector;
		String cadena;
		String cadenaArray []= new String[10];
		
		
	
		public String getCadena() {
			return cadena;
		}



		public void setCadena(String cadena) {
			this.cadena = cadena;
		}



		public ejercicio3() {
		
		try {
				archivo = new FileReader("C:\\Users\\mromero\\Desktop\\Argentina Programa\\tareas\\clase 4\\entrada.txt");
			if(archivo.ready()){
					lector = new BufferedReader(archivo);
					cadena = lector.readLine();		
					System.out.println("la siguiente palabra es leida desde una archivo de entrada: " + cadena);
			
			}	else {
				System.out.println("el archivo no esta listo");
			}
		}catch(Exception e) {
			System.out.print("algo salio mal" + e.getMessage());
		}
		
		char arreglo [] = cadena.toCharArray();
		
		
		System.out.print("---------Indique si quiere hacer una codificacion con la letra 'C' o decodificacion con la letra 'D'---------------");
		Scanner indi = new Scanner(System.in);
		String indicacion = indi.nextLine();
		

				
		switch(indicacion) {
		case "c": 
			System.out.print("falta codigo :(");
	               
		break;
		
		case "d": 
			System.out.println("GATURRA");
		break;
		
		default: System.out.println("solo puede ingresar las letras indicadas");
		
		}
		
		
}
		
		
}
