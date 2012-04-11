package com.zetcode;


import java.awt.Graphics;

import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Skeleton extends JPanel {

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawRect(5,33,33,33);
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("Java 2D Skeleton");
		frame.add(new Skeleton());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(280, 240);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}