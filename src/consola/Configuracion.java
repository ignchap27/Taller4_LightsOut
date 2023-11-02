package consola;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Configuracion extends JPanel{
	
	JRadioButton facilButton;
	JRadioButton medioButton;
	JRadioButton dificilButton;
	JComboBox box;
	
	Configuracion(){
		this.setBackground(new Color(72,85,172));
		this.setPreferredSize(new Dimension(600,40));
		this.setLayout(new GridLayout(1,6,5,3));
		
		JLabel sizeString = new JLabel("Tamaño:", JLabel.CENTER);
		sizeString.setForeground(Color.WHITE);
		sizeString.setFont(new Font("Arial", Font.BOLD, 15));
		this.add(sizeString);
		
		
		String[]sizes = {"3x3", "5x5"};
		box = new JComboBox(sizes);
		this.add(box);
		
		JLabel dificultadString = new JLabel("Dificultad: ", JLabel.CENTER);
		dificultadString.setForeground(Color.WHITE);
		dificultadString.setFont(new Font("Arial", Font.BOLD, 15));
		this.add(dificultadString);
		
		facilButton = new JRadioButton("Facil");
		facilButton.setOpaque(false);
		facilButton.setForeground(Color.WHITE);
		
		medioButton = new JRadioButton("Medio");
		medioButton.setOpaque(false);
		medioButton.setForeground(Color.WHITE);
		
		dificilButton = new JRadioButton("Dificil");
		dificilButton.setOpaque(false);
		dificilButton.setForeground(Color.WHITE);
		
		ButtonGroup group = new ButtonGroup();
		group.add(facilButton);
		group.add(medioButton);
		group.add(dificilButton);
		
		this.add(facilButton);
		this.add(medioButton);
		this.add(dificilButton);
		
	}
}
