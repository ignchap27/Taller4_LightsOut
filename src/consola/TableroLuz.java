package consola;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class TableroLuz extends JPanel{
	
	public TableroLuz(boolean[][] tablero){
		this.setBackground(new Color(0,0,0));
		int size = tablero.length;
		this.setLayout(new GridLayout(size,size,5,5));
		this.setPreferredSize(new Dimension(360,500));
		
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(tablero[i][j]) {
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
