package clase6;

import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculadora nuevoCalculo = new calculadora();
		System.out.println("-------ingrese el numero de la operacion que desea realizar Suma: 1 Resta: 2  Multiplicacion: 3 Division: 4");
		Scanner tipoOperacion = new Scanner(System.in);
		String calcular = tipoOperacion.nextLine();
		int decision = Integer.parseInt(calcular);
		nuevoCalculo.setOperacion(decision);
		nuevoCalculo.lacalculadora(decision);
		
	}

}
