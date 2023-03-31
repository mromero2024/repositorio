package clase5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inicio {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<producto> listaProducto = new ArrayList<>();
		
		producto Alfajor = new producto();
		Alfajor.setIdProducto(1);
		Alfajor.setCantidad(2);
		Alfajor.setDescripcion("Alfajor");
		Alfajor.setPrecio(20);
		
		listaProducto.add(Alfajor);
		
		producto Turron = new producto();
		Turron.setIdProducto(2);
		Turron.setCantidad(4);
		Turron.setDescripcion("Turron");
		Turron.setPrecio(15);
		
		listaProducto.add(Turron);
		
		producto Jugo = new producto();
		Jugo.setIdProducto(3);
		Jugo.setCantidad(5);
		Jugo.setDescripcion("Jugo");
		Jugo.setPrecio(7);
		
		listaProducto.add(Jugo);
		
		menu nuevoMenu = new menu();
		nuevoMenu.selectProducto(listaProducto);
		
		
		try {
		Scanner lectura = new Scanner(System.in);
		int opcionElegida =Integer.parseInt(lectura.nextLine());
		
		for(producto p: listaProducto) {
			if(p.idProducto== nuevoMenu.leerProd(opcionElegida)) {
				nuevoMenu.getProd(p);
				break;
			};
		}
		
		Scanner lectCant = new Scanner(System.in);
		int cantidad = Integer.parseInt(lectCant.nextLine());
		}catch(Exception e) {
			System.out.println("se produjo un error, solo puede ingresar un numero");
		}
	}

}
