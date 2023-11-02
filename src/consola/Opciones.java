package consola;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Opciones extends JPanel{
	
	private JButton botonNuevo;
	private JButton botonReiniciar;
	private JButton botonTop10;
	private JButton botonCambiarJugador;
	
	Opciones(){
		this.setBackground(new Color(224,224,224));
		this.setPreferredSize(new Dimension(140,500));
		this.setLayout(new BorderLayout());
		
		JPanel panelButtons = new JPanel();
		panelButtons.setLayout(new BoxLayout(panelButtons, BoxLayout.Y_AXIS));
		panelButtons.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelButtons.setAlignmentY(Component.CENTER_ALIGNMENT);
		
		botonNuevo = new JButton("NUEVO");
		botonReiniciar = new JButton("REINICIAR");
		botonTop10 = new JButton("TOP 10");
		botonCambiarJugador = new JButton("CAMBIAR JUGADOR");
		
		panelButtons.add(Box.createVerticalGlue());
		panelButtons.add(botonNuevo);
		panelButtons.add(Box.createVerticalStrut(5));
		panelButtons.add(botonReiniciar);
		panelButtons.add(Box.createVerticalStrut(5));
		panelButtons.add(botonTop10);
		panelButtons.add(Box.createVerticalStrut(5));
		panelButtons.add(botonCambiarJugador);
		panelButtons.add(Box.createVerticalGlue());
		
		this.add(panelButtons, BorderLayout.CENTER);
	}
}
