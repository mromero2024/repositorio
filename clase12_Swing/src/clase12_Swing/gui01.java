package clase12_Swing;
import java.awt.Container;

import javax.swing.*;
public class gui01 extends JFrame {
	private Container panel;
	private JButton miBoton;
	
	public gui01() {
		super("Ejemplo 01 con botno");
		
		//configurar componentes
		miBoton = new JButton("Aceptar");
		panel = getContentPane();
		panel.add(miBoton);
		
		setSize(200, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
