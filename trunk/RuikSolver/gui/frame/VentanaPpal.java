package frame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import main.MainPrincipalDelTODO;

import observer.AWTObserver;
import observer.IObserver;

import cube.RubikCube;

import panel.RubCruz;
import pruebas.PpalPal;
import solutions.SolutionMethodTemba;
import thread.MiThread;
import thread.OldThread;

public class VentanaPpal extends JFrame {
	private RubikCube rubikCube = new RubikCube();
	private RubCruz rubCruz = new RubCruz(10, 4, 42);
	private SolutionMethodTemba temba = new SolutionMethodTemba(rubikCube);
	private MiThread thre = new MiThread(this);
	
	
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
		this.setTitle("Rubik by Temba");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setBackground(new Color(175, 200, 255));
		
		try {
			img = ImageIO.read(new File("panelBotoneraIzq.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		Container container = this.getContentPane();

		container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
		

		container.add(rubCruz);
		container.add(botonSol());
		container.setBackground(Color.pink);
		// this.add(rubCruz);

		this.setSize(475, 400);
		this.setLocationRelativeTo(null);

		// this.setVisible(true);
	}

	private Component botonSol() {
		JButton button = new JButton();
		ActionListener solucion = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			MainPrincipalDelTODO delTODO = new MainPrincipalDelTODO();
			delTODO.setB(true);
			}
		};
		button.addActionListener(solucion);
		return button;
	}
}
