package main;

import java.awt.Color;
import javax.swing.JFrame;

import panel.RubCruz;


public class PpalPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Rubik");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//frame.setResizable(false);
		
		frame.setBackground(new Color(175, 200, 255));

		frame.add(new RubCruz(0, 0, 33));
		
		frame.setSize(475, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}