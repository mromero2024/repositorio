package clase4;
import java.util.Arrays;


	public class ejercicio__1a {
		int num1=5;
		int num2=1;
		int num3=9;
		String orden= "b";
		int numeros [] = new int[3];
		
		public int getNum1() {
			return num1;
		}
		public void setNum1(int num1) {
			this.num1 = num1;
		}
		public int getNum2() {
			return num2;
		}
		public void setNum2(int num2) {
			this.num2 = num2;
		}
		public int getNum3() {
			return num3;
		}
		public void setNum3(int num3) {
			this.num3 = num3;
		}
		public String getOrden() {
			return orden;
		}
		public void setOrden(String orden) {
			this.orden = orden;
		}
		
		public ejercicio__1a() {
			for(int i=0; i<3; i++) {
				numeros[0]= num1;
				numeros[1]= num2;
				numeros[2]= num3;		
			}		
			Arrays.sort(numeros);
			
			switch(orden) {
			case "a":
				for(int m=0; m<numeros.length; m++) {
					System.out.println(numeros[m]);
		}
				break;
			case "b":
				for(int m=numeros.length-1; m>=0; m--) {
					System.out.println(numeros[m]);
		}
				break;
				default: System.out.println("el caracter ingresado debe ser 'a' o 'd'");
				
		}
		}}




