package consola;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Configuracion extends JPanel implements ActionListener{
	
	private JRadioButton facilButton;
	private JRadioButton medioButton;
	private JRadioButton dificilButton;
	private ButtonGroup group;
	private JComboBox box;
	private Font font = new Font("Arial", Font.BOLD, 15);
	private Frame frame;
	
	Configuracion(Frame frame){
		this.frame = frame;
		
		this.setBackground(new Color(72,85,172));
		this.setPreferredSize(new Dimension(600,40));
		this.setLayout(new GridLayout(1,6,5,3));
		
		JLabel sizeString = new JLabel("Tamaño:", JLabel.CENTER);
		sizeString.setForeground(Color.WHITE);
		sizeString.setFont(new Font("Arial", Font.BOLD, 15));
		this.add(sizeString);
		
		
		String[]sizes = {"4X4", "5X5", "6X6", "7X7", "8X8", "9X9"};
		box = new JComboBox(sizes);
		box.addActionListener(this);
		box.setFont(font);
		
		this.add(box);
		
		JLabel dificultadString = new JLabel("Dificultad: ", JLabel.CENTER);
		dificultadString.setForeground(Color.WHITE);
		dificultadString.setFont(new Font("Arial", Font.BOLD, 15));
		this.add(dificultadString);
		
		facilButton = new JRadioButton("Facil");
		facilButton.addActionListener(this);
		facilButton.setOpaque(false);
		facilButton.setForeground(Color.WHITE);
		facilButton.addActionListener(this);
		
		medioButton = new JRadioButton("Medio");
		medioButton.addActionListener(this);
		medioButton.setOpaque(false);
		medioButton.setForeground(Color.WHITE);
		
		dificilButton = new JRadioButton("Dificil");
		dificilButton.addActionListener(this);
		dificilButton.setOpaque(false);
		dificilButton.setForeground(Color.WHITE);
		
		group = new ButtonGroup();
		group.add(facilButton);
		group.add(medioButton);
		group.add(dificilButton);
		
		this.add(facilButton);
		this.add(medioButton);
		this.add(dificilButton);
		
	}
	
	public int getElement(){
		String item = this.box.getSelectedItem().toString();
		String[] elementos = item.split("X");
		int size = Integer.parseInt(elementos[0]);
		return size;
	}

	public int getDificultad() {
		
		ButtonModel boton = group.getSelection();
		if(facilButton.getModel() == boton) {
			return 20;
		}
		else if(medioButton.getModel() == boton) {
			return 30;
		}
		else if(dificilButton.getModel() == boton) {
			return 50;
		}
		else {
			return 10;
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == box) {
			Object boxItem = this.box.getSelectedItem();
			String[] item = this.box.getSelectedItem().toString().split("X");
			int size = Integer.parseInt(item[0]);
			int dificultad = this.getDificultad();
			frame.nuevoTablero(size, dificultad);
		}
		
	}
}
