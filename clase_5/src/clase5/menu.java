package clase5;

import java.util.List;

public class menu {
	public void selectProducto(List<producto> listaProducto) {
		System.out.println("------------ elija un producto-----------");
		for(producto p : listaProducto) {
			System.out.println("Ingrese: " + p.getIdProducto() + " para " + p.getDescripcion() + " Precio: " + p.getPrecio());	
		}System.out.println("------------ ooooooooooooooo-----------");
	}
		public int leerProd(int lectura) {
			return lectura;
		}
		
		public String getProd(producto p) {
			String opcionElegida = "Selecciono: " + p.getDescripcion() + ", Precio: " + p.getPrecio();
			System.out.println(opcionElegida);
			System.out.println("ingrese cantidad ");
			return opcionElegida;

		}
	}

