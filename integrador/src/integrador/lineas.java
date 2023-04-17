package integrador;

import java.io.BufferedReader;
import java.io.FileReader;

public class lineas {
	int puntaje1=0;
	
public lineas(String rResultados, String rPronostico) {
	try {
	FileReader archivo = new FileReader(rResultados);
	BufferedReader lector = new BufferedReader(archivo);
	String cadena;
	int contador = 0;
	String resultado1[];
	String equipo1;
	String equipo2;
	int golesE1;
	int golesE2;
	
	FileReader archivoRuta2 = new FileReader(rPronostico);
	BufferedReader lectorRuta2 = new BufferedReader(archivoRuta2);
	String cadena2 = lectorRuta2.readLine();
	String arreglo2 [] = cadena2.split(",");
	String pronostico1 = arreglo2[0];
	String pronostico2 = arreglo2[1];
	String pronostico3 = arreglo2[2];
	

	 while((cadena = lector.readLine()) != null){
		 
		 contador++;
		 if(contador ==1 ) {	 //PRIMER PARTIDO
			 resultado1= cadena.split(",");
			 equipo1 = resultado1[0];
			 equipo2 = resultado1[2];
			 golesE1 = Integer.parseInt(resultado1[1]);
			 golesE2 = Integer.parseInt(resultado1[3]);
			
			 String resultadoPartido;
				if(golesE1 > golesE2) {
					resultadoPartido= equipo1;
					
				}else if(golesE1 < golesE2){
					resultadoPartido= equipo2;
					
				}else {
					resultadoPartido= "EMPATE";
				}
				System.out.println("Resultado del primer partido: " + " " +  resultadoPartido);
				
				
				if(resultadoPartido.equals(pronostico1)) {
					puntaje1++;
					System.out.println("Tu Pronostico fue: "+ " " + pronostico1 + "\n" + "Ganaste 1 punto" + "\n");
					System.out.println("-----------------------");
					
				}else{
					System.out.println("Tu Pronostico: "+ " " + pronostico1 + "\n" + "Perdiste" + "\n");
					System.out.println("-----------------------");
					
					}
		 } 
		 
		if(contador==2) {  //SEGUNDO PARTIDO
			 resultado1= cadena.split(",");
			 equipo1 = resultado1[0];
			 equipo2 = resultado1[2];
			 golesE1 = Integer.parseInt(resultado1[1]);
			 golesE2 = Integer.parseInt(resultado1[3]);
			 
			 String resultadoPartido;
				if(golesE1 > golesE2) {
					resultadoPartido= equipo1;
					
				}else if(golesE1 < golesE2){
					resultadoPartido= equipo2;
					
				}else {
					resultadoPartido= "EMPATE";
				}
				System.out.println("Resultado del segundo partido: " + " " +  resultadoPartido);
				
				if(resultadoPartido.equals(pronostico2)) {
					puntaje1++;
					System.out.println("Tu Pronostico fue: "+ " " + pronostico2 + "\n" + "Ganaste 1 punto");
					System.out.println("-----------------------");
					
				}else{
					System.out.println("Tu Pronostico: " + pronostico2 + "\n" + "Perdiste" + "\n");
					System.out.println("-----------------------");
					
					}
				}
				if(contador==3) {  //TERCER PARTIDO
					 resultado1= cadena.split(",");
					 equipo1 = resultado1[0];
					 equipo2 = resultado1[2];
					 golesE1 = Integer.parseInt(resultado1[1]);
					 golesE2 = Integer.parseInt(resultado1[3]);
					 
					 String resultadoPartido;
						if(golesE1 > golesE2) {
							resultadoPartido= equipo1;
							
						}else if(golesE1 < golesE2){
							resultadoPartido= equipo2;
							
						}else {
							resultadoPartido= "EMPATE";
						}
						System.out.println("Resultado del tercer partido: " + " " +  resultadoPartido);
						
						if(resultadoPartido.equals(pronostico3)) {
							puntaje1++;
							System.out.println("Tu Pronostico fue: "+ " " + pronostico3 + "\n" + "Ganaste 1 punto" + "\n");
							System.out.println("-----------------------");
							System.out.println("PUNTAJE TOTAL: " + puntaje1);
						}else{
							System.out.println("Tu Pronostico: "+ "\n" + pronostico3 + "\n" + "Perdiste" + "\n");
							System.out.println("-----------------------");
							System.out.println("PUNTAJE TOTAL: " + puntaje1);
							} 
		}
		
	}
	
	}catch(Exception e) {
		System.out.println("ERROR");
	}
}
}
