package clase4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio__1b {
	String numeros [] = new String[10];
	String orden;
	
	

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	public String[] getNumeros() {
		return numeros;
	}

	public void setNumeros(String[] numeros) {
		this.numeros = numeros;
	}

	
	public ejercicio__1b() {
		
		System.out.println("ingrese 3 numeros separados por espacio");
		Scanner ingreso = new Scanner(System.in);
		String numStr = ingreso.nextLine();
		numeros=numStr.split(" ");
		Arrays.sort(numeros);
		
		System.out.println("ingrese 'a' para ordenar de manera ascendente o 'd' de manera descendente");
		Scanner letraScanner = new Scanner(System.in);
		String letra = letraScanner.nextLine();
		orden = letra;
		
		switch(orden){
			case "a":
				for(int i = 0; i<numeros.length; i++) {
					System.out.println(numeros[i]);
				}
			break;
			case "d":
				for(int i = numeros.length-1; i>= 0; i--) {
					System.out.println(numeros[i]);
				}
			break;
			default: System.out.println("ingrese 'a' o 'd'");

		
		}
		}
}
