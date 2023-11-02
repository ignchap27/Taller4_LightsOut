package consola;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.Tablero;

public class TableroLuz extends JPanel{
	
	Tablero tablero;
	
	public TableroLuz(Tablero tablero){
		this.tablero = tablero;
		boolean[][] grid = tablero.darTablero();
		this.setBackground(new Color(0,0,0));
		int size = grid.length;
		this.setLayout(new GridLayout(size,size,5,5));
		this.setPreferredSize(new Dimension(360,500));
		
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(grid[i][j]) {
					Button boton = new Button(true);
					this.add(boton);
				}
				else {
					Button boton = new Button(false);
					this.add(boton);
				}
				
			}
			
		}
	}
	
}
