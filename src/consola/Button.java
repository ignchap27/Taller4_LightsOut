package consola;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Button extends JButton implements ActionListener{
	
	boolean estado;
	
	
	public Button(boolean estado) {
		ImageIcon icon = new ImageIcon("./data/luz.png");
		this.estado = estado;
		
		if (estado) {
			this.setBackground(new Color(207,255,47));
		}
		else {
			this.setBackground(Color.BLACK);
		}
		
		this.setIcon(icon);
		this.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.estado) {
			this.setBackground(Color.BLACK);
			this.estado = false;
		}
		else {
			this.setBackground(new Color(207,255,47));
			this.estado = true;
		}
	}

}
