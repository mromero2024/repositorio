package integrador;

import java.io.BufferedReader;
import java.io.FileReader;

public class resultados {
	String resu;
	//String pronostico = "ARGENTINA";
	String equipo1;
	String equipo2;
	int golesE1;
	int golesE2;
	
	
	public resultados() {
		try{
			FileReader archivo = new FileReader("C:\\Users\\mromero\\Desktop\\Argentina Programa\\tareas\\integrador\\equipos.txt");
			if(archivo.ready()) {
			BufferedReader lector = new BufferedReader(archivo);
			String cadena = lector.readLine();
			String arreglo [] = cadena.split(",");
			equipo1 = arreglo[0];
			equipo2 = arreglo[2];
			golesE1 = Integer.parseInt(arreglo[1]);
			golesE2 = Integer.parseInt(arreglo[3]);
			String resultado;
			String prediccion = "ARGENTINA";
			//System.out.println("conexion correcta");
			
			if(golesE1>golesE2) {
				 resu=equipo1;
				 
				
			}else if(golesE1<golesE2){
				resu=equipo2;
			}else {
				resu="EMPATE";
			}
			}
			
			}catch(Exception e) {
			System.out.println("algo salio mal" + e.getMessage());
		}
		//System.out.println("Resultado partido: " + resu);
		//System.out.println("El pornostico fue: " + pronostico);
		System.out.println("----------------");
/*		if(resu.equals(pronostico)) {
			System.out.println("por lo tanto, GANASTE");	
		}else {
			System.out.println("por lo tanto, PERDISTE");
		}*/
		
		
	}
	}

