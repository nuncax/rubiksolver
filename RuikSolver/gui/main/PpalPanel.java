package main;

import javax.swing.JFrame;
import structure.Structure;

public class PpalPanel {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Colors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.add(new Stick(Color.blue, 0, 0, 33, 33));
		frame.add(new Structure());
		frame.setSize(475, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
