package integrador;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;


public class inicio {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//resultados partido1 = new resultados();
		//pronosticos ronda1 = new pronosticos();
		//rutas ruta1 = new rutas("C:\\Users\\mromero\\Desktop\\Argentina Programa\\tareas\\integrador\\resultadosPartidos.txt", "C:\\Users\\mromero\\Desktop\\Argentina Programa\\tareas\\integrador\\pronosticos.txt");
		lineas nlineas = new lineas("C:\\Users\\mromero\\Desktop\\Argentina Programa\\tareas\\integrador\\resultadosPartidos.txt", "C:\\Users\\mromero\\Desktop\\Argentina Programa\\tareas\\integrador\\pronosticos.txt");
		
		
		
	/*	try{
			FileReader archivo = new FileReader("C:\\Users\\mromero\\Desktop\\Argentina Programa\\tareas\\integrador\\equipos.txt");
			if(archivo.ready()) {
			BufferedReader lector = new BufferedReader(archivo);
			String cadena = lector.readLine();
			String arreglo [] = cadena.split(",");
			String equipo1 = arreglo[0];
			String equipo2 = arreglo[2];
			int golesE1 = Integer.parseInt(arreglo[1]);
			int golesE2 = Integer.parseInt(arreglo[3]);
			String resultado;
			String prediccion = "ARGENTINA";
			
			
			
	/*		if(golesE1>golesE2) {
				 resultado=equipo1;
				
			}else if(golesE1<golesE2){
				resultado=equipo2;
			}else {
				resultado="EMPATE";
			}
			
			System.out.println(resultado);
			
		/*	System.out.println(prediccion);
			if(resultado == prediccion) {
				System.out.println("ganaste");
			}else {
				System.out.println("perdiste");

			}
			
			
			}}
		
			
			
				catch(Exception e) {
			System.out.println("algo salio mal" + e.getMessage());
		}*/
		
		

		
	}}
				

		
	


