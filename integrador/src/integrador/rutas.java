package integrador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;

public class rutas extends resultados{
	public rutas (String rResultados, String rPronostico) {
		try {
		FileReader archivoRuta = new FileReader(rResultados);
		BufferedReader lectorRuta = new BufferedReader(archivoRuta);
		String cadena = lectorRuta.readLine();
		String arreglo [] = cadena.split(",");
		String equipo1 = arreglo[0];
		String equipo2 = arreglo[2];
		int golesE1 = Integer.parseInt(arreglo[1]);
		int golesE2 = Integer.parseInt(arreglo[3]);
		
		FileReader archivoRuta2 = new FileReader(rPronostico);
		BufferedReader lectorRuta2 = new BufferedReader(archivoRuta2);
		String cadena2 = lectorRuta2.readLine();
		String arreglo2 [] = cadena2.split(",");
		String pronostico1 = arreglo2[0];
		String pronostico2 = arreglo2[1];
	
		String resultado1;
		if(golesE1 > golesE2) {
			resultado1= equipo1;
			
		}else if(golesE1 < golesE2){
			resultado1= equipo2;
			
		}else {
			resultado1= "EMPATE";
		}
		System.out.println("Resultado del primer partido: " + "\n" +  resultado1 + "\n" );
		
		int puntaje1 = 0;
		if(resultado1.equals(pronostico1)) {
			puntaje1++;
			System.out.println("Tu Pronostico: "+ "\n" + pronostico1 + "\n" + "Ganaste 1 punto" + "\n");
			System.out.println("-----------------------");
			System.out.println("Puntaje total: " + puntaje1);
		}else{
			System.out.println("Tu Pronostico: "+ "\n" + pronostico1 + "\n" + "Perdiste" + "\n");
			System.out.println("-----------------------");
			System.out.println("Puntaje total: " + puntaje1);
			}
		
	}catch(Exception e) {
		System.out.println("error");
	}
		
	}
}