package consola;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import uniandes.dpoo.taller4.modelo.Tablero;


public class Frame extends JFrame{
	Frame(Tablero tablero){
		
		ImageIcon lightImage = new ImageIcon("./data/luz.png");
		this.setIconImage(lightImage.getImage());
		
		this.setTitle("Lights Out");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setSize(550,550);
		this.setLayout(new BorderLayout());
		configuracion();
		opciones();
		luces(tablero.darTablero());
		informacion(tablero);
		this.pack();
		this.setVisible(true);
	}


	private void informacion(Tablero tablero) {
		Informacion informacion = new Informacion(tablero);
		this.add(informacion, BorderLayout.SOUTH);
		
	}


	private void luces(boolean[][] tablero) {
		TableroLuz luces = new TableroLuz(tablero);
		this.add(luces, BorderLayout.CENTER);
	}


	private void opciones() {
		Opciones opciones = new Opciones();
		this.add(opciones, BorderLayout.EAST);
		
	}


	private void configuracion() {
		Configuracion configuracion = new Configuracion();
		this.add(configuracion, BorderLayout.NORTH);
	}
}
