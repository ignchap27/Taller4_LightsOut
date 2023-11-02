package consola;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import uniandes.dpoo.taller4.modelo.Tablero;


public class Frame extends JFrame{
	private Tablero logicaTablero;
	private Informacion informacion;
	private TableroLuz luces;
	private Opciones opciones;
	private Configuracion configuracion;
	private int sizeTablero;
	
	public Frame(){
		
		ImageIcon lightImage = new ImageIcon("./data/luz.png");
		this.setIconImage(lightImage.getImage());
		
		this.setTitle("Lights Out");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setSize(550,550);
		this.setLayout(new BorderLayout());
		
		this.configuracion = configuracion(this);
		this.sizeTablero = this.configuracion.getElement();
		int dificultad = this.configuracion.getDificultad();
		
		logicaTablero = new Tablero(sizeTablero);
		logicaTablero.desordenar(dificultad);
		
		this.opciones = opciones();
		
		this.luces = luces(logicaTablero);
		
		this.informacion = informacion(logicaTablero);
		
		this.pack();
		this.setVisible(true);
	}

	public Frame(int size, int dificultad){
		
		ImageIcon lightImage = new ImageIcon("./data/luz.png");
		this.setIconImage(lightImage.getImage());
		
		this.setTitle("Lights Out");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setSize(550,550);
		this.setLayout(new BorderLayout());
		this.configuracion = configuracion(this);
		this.sizeTablero = size;
		
		logicaTablero = new Tablero(sizeTablero);
		logicaTablero.desordenar(dificultad);
		
		logicaTablero = new Tablero(sizeTablero);
		this.opciones = opciones();
		this.luces = luces(logicaTablero);
		this.informacion = informacion(logicaTablero);
		this.pack();
		this.setVisible(true);
	}

	private Informacion informacion(Tablero tablero) {
		informacion = new Informacion(tablero);
		this.add(informacion, BorderLayout.SOUTH);
		return informacion;
	}


	public void nuevoTablero(int size, int dificultad) {
		Tablero tablero = new Tablero(size);
		tablero.desordenar(dificultad);
		this.remove(luces);
		luces(tablero);
	}
	
	private TableroLuz luces(Tablero tablero) {
		luces = new TableroLuz(tablero);
		this.add(luces, BorderLayout.CENTER);
		return luces;
	}


	private Opciones opciones() {
		opciones = new Opciones();
		this.add(opciones, BorderLayout.EAST);
		return opciones;
		
	}


	private Configuracion configuracion(Frame frame) {
		configuracion = new Configuracion(frame);
		this.add(configuracion, BorderLayout.NORTH);
		return configuracion;
	}
}
