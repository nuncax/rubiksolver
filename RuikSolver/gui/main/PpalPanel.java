package main;

import java.awt.Color;

import javax.swing.JFrame;

import nuevoPanel.facePanel;
import structure.Structure;

public class PpalPanel {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Colors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.add(new Stick(Color.blue, 0, 0, 33, 33));
		frame.setBackground(new Color(175, 200, 255));
		
		
		
		//frame.add(new Structure());
		frame.add(new facePanel());
		
		
		
		
		frame.setSize(475, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
