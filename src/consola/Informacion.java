package consola;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import uniandes.dpoo.taller4.modelo.RegistroTop10;
import uniandes.dpoo.taller4.modelo.Tablero;

public class Informacion extends JPanel{
	Informacion(Tablero tablero){
		this.setBackground(new Color(224,224,224));
		this.setPreferredSize(new Dimension(600,40));
		this.setLayout(new GridLayout(1,4,5,5));
		
		Border border = BorderFactory.createLineBorder(Color.lightGray, 1);
		JLabel jugadas = new JLabel();
		jugadas.setText("Jugadas:");
		JLabel numeroJugadas = new JLabel();
		numeroJugadas.setText(Integer.toString(tablero.darJugadas()));
		JLabel nombre = new JLabel();
		nombre.setText("Jugador:");
		JLabel nombreJugador = new JLabel();
		nombreJugador.setText("No se");
		
		jugadas.setHorizontalAlignment(JLabel.CENTER);
		jugadas.setBorder(border);
		
		numeroJugadas.setHorizontalAlignment(JLabel.CENTER);
		numeroJugadas.setBorder(border);
		
		nombre.setHorizontalAlignment(JLabel.CENTER);
		nombre.setBorder(border);
		
		nombreJugador.setHorizontalAlignment(JLabel.CENTER);
		nombreJugador.setBorder(border);
		
		this.add(jugadas);
		this.add(numeroJugadas);
		this.add(nombre);
		this.add(nombreJugador);
	}
}
