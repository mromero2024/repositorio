package clase6;

public class calculadora {
	int operacion;
	double total;
	double numero1=10;
	double numero2=5;
	
	
	
	
	
	public int getOperacion() {
		return operacion;
	}
	public void setOperacion(int operacion) {
		this.operacion = operacion;
	}
	double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getNumero1() {
		return numero1;
	}
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	public double getNumero2() {
		return numero2;
	}
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	public void lacalculadora(int operacion) {
		if(operacion==1) {
			total=numero1+numero2;		
			System.out.println("la suma de dichos numeros es: " +total);
		}
		if(operacion==2) {
			total=numero1-numero2;		
			System.out.println("la resta de dichos numeros es: " + total);
		}
		if(operacion==3) {
			total=numero1*numero2;		
			System.out.println("la multiplicacion de dichos numeros es: " +total);
		}
		if(operacion==4) {
			total=numero1/numero2;		
			System.out.println("la division de dichos numeros es: " +total);
		}
	}
	
}
	
	
	
	
	
	

