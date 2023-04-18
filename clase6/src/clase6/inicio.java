package clase6;

import java.util.Scanner;

//import java.util.Scanner;

public class inicio {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------INGRESE EL NUMERO DE OPERACION QUE DESEA REALIZAR-----");
		System.out.println("1_SUMA \n2_RESTA \n3_MULTIPLICACION \n4_DIVISION");
		System.out.println("_______");
		Scanner ingreso = new Scanner(System.in);
		String operacion = ingreso.nextLine();
		
		System.out.println("------INGRESE 2 VALORES SEPARADOS SEPARADOS POR ESPACIO-----");
		Scanner ingreso2 = new Scanner(System.in);
		String arr = ingreso2.nextLine();
		String arreglo [] = arr.split(" ");
		
		int num1 = Integer.parseInt(arreglo[0]);
		int num2 = Integer.parseInt(arreglo[1]);
		System.out.println("------------------------");
		switch(operacion) {
		case "1" : System.out.println("La suma de dichos valores es:");
		sumar suma = new sumar(num1, num2);
		break;
		
		case "2": System.out.println("La resta de dichos valores es:");
		restar resta = new restar(num1, num2);
		break;
		
		case "3": System.out.println("La multiplicacion de dichos valores es");
		multiplicar multi = new multiplicar(num1, num2);
		break;
		
		case "4": System.out.println("La division de dichos valores es:");
		dividir div = new dividir(num1, num2);
		break;
		
		default : System.out.println("Error: solo puede ingresar los numeros indicados");
		
		
		}
		
	}
	
	
}
