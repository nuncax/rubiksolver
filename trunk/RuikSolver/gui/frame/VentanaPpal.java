package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.SalirActionListener;
import listener.ScrambleActionListener;
import main.MainPrincipalDelTODO;

import observer.AWTObserver;
import observer.IObserver;

import cube.RubikCube;

import panel.RubCruz;
import thread.MiThread;

public class VentanaPpal extends JFrame {

	private RubikCube rubikCube = new RubikCube();
	private RubCruz rubCruz = new RubCruz(2, 3, 50);

	// private SolutionMethodTemba temba = new SolutionMethodTemba(rubikCube);
	// private MiThread thre = new MiThread(this);

	BufferedImage img;

	private static final long serialVersionUID = -4226961849442887198L;

	public RubCruz getRubCruz() {
		return rubCruz;
	}

	public void setRubCruz(RubCruz comp) {
		this.rubCruz = comp;
	}

	public VentanaPpal() throws HeadlessException {
		super();

		IObserver observer = new AWTObserver(rubCruz.getMap());
		rubikCube.addObservador(observer);

		this.setTitle("Rubik by Temba");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);

		// this.setExtendedState(JFrame.MAXIMIZED_BOTH);

		JPanel panel = new JPanel();
		JLabel etqImagen = new JLabel();

		panel.setPreferredSize(new Dimension(1366, 768));
		panel.setLayout(null);
		etqImagen.setIcon(new ImageIcon(getClass().getResource(
				"panelBotoneraIzq.png")));
		panel.add(etqImagen);
		etqImagen.add(botonAleatorio());
		etqImagen.add(botonSalir());

		Container container = this.getContentPane();

		// container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
		container.setLayout(new BorderLayout());
		container.setBackground(new Color(175, 200, 255));

		container.add(rubCruz, BorderLayout.CENTER);
		container.add(etqImagen, BorderLayout.WEST);

		// container.add(botonAleatorio());

		this.setSize(1366, 768);
		this.setLocationRelativeTo(null);
	}

	private Component botonAleatorio() {
		// JButton button = new JButton();
		JButton button = new JButton(new ImageIcon("boton1menu.png"));
		button.setBackground(new Color(238, 238, 236));
		button.setBounds(10, 400, 235, 55);
		// button.setComponentZOrder(comp, index)

		// button.setIcon();

		ActionListener solucion = new ScrambleActionListener(rubikCube);
		button.addActionListener(solucion);
		return button;
	}

	private Component botonSalir() {
		JButton button = new JButton("Salir");
		button.setBackground(new Color(238, 238, 236));
		button.setBounds(10, 700, 235, 55);
		
		ActionListener salir = new SalirActionListener();
		button.addActionListener(salir);
		return button;
	}
}
