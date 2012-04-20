package pruebas;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import nuevoPanel.RubCruz;

public class e extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// JPanel panel = new JPanel();

	JButton boton = new JButton();

	JButton subButton = new JButton("Subboton Yahoo");

	public e() {

		RubCruz comp = new RubCruz(1, 1, 33);
		this.add(comp);
		this.setBackground(new Color(175, 200, 255));

		this.setVisible(true);
		//this.setSize(comp.getSize());

		this.setDefaultCloseOperation(3);
		
		
		
		comp.add(new JButton("xvxfbafdhg"));
		 this.pack();
	}

	public static void main(String[] args) {
		new e();
	}

}
