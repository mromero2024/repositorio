package clase12_Swing;


import javax.swing.*;


public class gui00 {

	 public gui00() {
		 JFrame frame = new JFrame("Ejemplo 00"); //se instancia y crea el panel frame
		 
		 //configuro los componentes y los añado al panel frame
		 frame.pack();
		 frame.setBounds(600, 450, 450, 350);
		 frame.setTitle("Mi primer ventana");
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 }
}
