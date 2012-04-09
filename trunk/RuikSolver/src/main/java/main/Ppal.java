package main;

import java.awt.Color;

import javax.swing.JFrame;

import stickPanel.Stick;
import structure.Structure;

public class Ppal {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Colors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.add(new Structure());
		
		Stick stick = new Stick(Color.blue, 0, 0, 33, 33);
		
		frame.add(stick);
		frame.setSize(360, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
