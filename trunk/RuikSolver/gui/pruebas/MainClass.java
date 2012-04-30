package pruebas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import main.MainPrincipalDelTODO;

import observer.AWTObserver;
import observer.IObserver;

import cube.RubikCube;
import frame.VentanaPpal;

import panel.FacePanel;
import panel.RubCruz;
import panel.StickPanel;
import pieza.Pieza;
import pieza.Stick;
import pieza.Vectr;
import solutions.SolutionMethodTemba;
import thread.MiThread;

public class MainClass extends JFrame {

	private RubikCube cube = new RubikCube();

	private RubCruz rubCruz = new RubCruz(3, 1, 33);

	private JButton amarillo;
	private JButton blanco;
	private JButton rojo;
	private JButton naranja;
	private JButton verde;
	private JButton azul;

	Color color = null;

	private Color colorFondo = new Color(175, 200, 255);

	public MainClass() {
		super();
		this.addMouseListener(adapter);

		JButton amarillo = new JButton("Amarillo");
		amarillo.setBackground(Color.yellow);
		// amarillo.setBounds(0, 325, 100, 30);
		amarillo.addActionListener(actionY);

		JButton blanco = new JButton("Blanco");
		blanco.setBackground(Color.white);
		// blanco.setBounds(100, 325, 100, 30);
		blanco.addActionListener(actionW);

		JButton rojo = new JButton("Rojo");
		rojo.setBackground(Color.red);
		// rojo.setBounds(200, 325, 100, 30);
		rojo.addActionListener(actionR);

		JButton naranja = new JButton("Naranja");
		naranja.setBackground(Color.orange);
		// naranja.setBounds(300, 325, 100, 30);
		naranja.addActionListener(actionO);

		JButton verde = new JButton("Verde");
		verde.setBackground(Color.green);
		// verde.setBounds(400, 325, 100, 30);
		verde.addActionListener(actionG);

		JButton azul = new JButton("Azul");
		azul.setBackground(Color.blue);
		// azul.setBounds(500, 325, 100, 30);
		azul.addActionListener(actionB);

		this.setTitle("Rubik by Temba");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, 400, 400);
		this.setLocationRelativeTo(null);
		this.setSize(620, 425);

		JPanel panelBoton = new JPanel();
		panelBoton.setBackground(colorFondo);
//		panelBoton.add(azul);
//		panelBoton.add(amarillo);
//		panelBoton.add(verde);
//		panelBoton.add(rojo);
//		panelBoton.add(blanco);
//		panelBoton.add(naranja);

		// boton cargar
	//	rubCruz.setLayout(null);
		JButton cargar = new JButton("cargar");
		cargar.setBounds(325, 70, 80, 30);
		cargar.addActionListener(actionCargar);
//		rubCruz.add(cargar);
		panelBoton.add(cargar);

		// boton solucionar
		JButton solucionar = new JButton("Solucionar");
		solucionar.setBounds(325, 40, 80, 30);
		solucionar.addActionListener(actionSolucionar);
//		rubCruz.add(solucionar);
		panelBoton.add(solucionar);

		Container container = this.getContentPane();
		container.setBackground(colorFondo);
		container.add(solucionar, BorderLayout.SOUTH);
		container.add(rubCruz, BorderLayout.CENTER);

		this.setContentPane(container);

		// this.add(comp);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MainClass();
	}

	final MouseAdapter adapter = new MouseAdapter() {

		public void mouseClicked(MouseEvent e) {
			for (Vectr v : rubCruz.getMap().keySet()) {
				panel.FacePanel facePanel = rubCruz.getMap().get(v);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (!(i == 1 && j == 1)) {
							StickPanel panel = facePanel.getStickPanel(i, j);

							double x = getMousePosition().getX() - 10;
							double y = getMousePosition().getY() - panel.w;

							if (panel.getSquare().contains(x, y)) {

								panel.setColor(color);
								repaint();
							}
						}
					}
				}
			}

		}
	};
	ActionListener actionY = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			color = Color.yellow;

		}
	};
	ActionListener actionR = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			color = Color.red;

		}
	};
	ActionListener actionB = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			color = Color.blue;

		}
	};
	ActionListener actionG = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			color = Color.green;

		}
	};
	ActionListener actionO = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			color = Color.orange;

		}
	};
	ActionListener actionW = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			color = Color.white;

		}
	};

	ActionListener actionSolucionar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e)  { 
			new MainPrincipalDelTODO();
		}

		private RubCruz getRubCruz() {
			// TODO Auto-generated method stub
			return rubCruz;
		}
	};

	ActionListener actionCargar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			for (Pieza pieza : cube.getPiezas()) {
				Vectr posicion = pieza.getPosicion();
				Stick stickers[] = pieza.getStickers();
				for (int i = 0; i < stickers.length; i++) {
					Vectr orientacion = stickers[i].getOrientacion();
					FacePanel facePanel = rubCruz.getMap().get(orientacion);
					StickPanel stickpanel = facePanel.getMap().get(posicion);
					// stickpanel.setColor(calcColor(stickers[i].getColor()));

					Color colorStickPanel = stickpanel.getColor();
					pieza.Color calcColor = calcColor(colorStickPanel);
					stickers[i].setColor(calcColor);
					System.out.println();
				}
			}

		}

		private pieza.Color calcColor(Color color) {
			pieza.Color colorRes = null;
			if (color.equals(Color.blue)) {
				colorRes = pieza.Color.BLUE;
			} else if (color.equals(Color.green)) {
				colorRes = pieza.Color.GREEN;
			} else if (color.equals(Color.orange)) {
				colorRes = pieza.Color.ORANGE;
			} else if (color.equals(Color.red)) {
				colorRes = pieza.Color.RED;
			} else if (color.equals(Color.white)) {
				colorRes = pieza.Color.WHITE;
			} else if (color.equals(Color.yellow)) {
				colorRes = pieza.Color.YELLOW;
			}
			return colorRes;
		}
	};
}
