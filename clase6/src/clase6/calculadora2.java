package clase6;

public class calculadora2 {
	double numero1;
	double numero2;
	double total;
	
	
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
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	public void suma(double numero1, double numero2) {
		total=numero1+numero2;
		System.out.println("la suma de ambos numero es: " + total);
	}
	
	public void resta(double numero1, double numero2) {
		total=numero1-numero2;
		System.out.println("la resta de ambos numero es: " + total);
	}
	
	public void multiplicacion(double numero1, double numero2) {
		total=numero1*numero2;
		System.out.println("la multiplicacion de ambos numero es: " + total);
	}
	
	public void division(double numero1, double numero2) {
		total=numero1/numero2;
		System.out.println("la division de ambos numero es: " + total);
	}

}
