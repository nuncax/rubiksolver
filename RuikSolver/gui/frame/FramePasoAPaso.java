package frame;

import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import panel.RubCruz;

public class FramePasoAPaso extends JFrame {
	
	public FramePasoAPaso() throws HeadlessException {
		
		super();
		this.setTitle("Rubik by Temba");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(new Color(175, 200, 255));
	//	this.setSize(475, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		this.add(new RubCruz(0, 0, 33));
		this.pack();
	}
	
	public static void main(String[] args) {
		new FramePasoAPaso();
	}
}
