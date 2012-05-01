package pruebas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.RepaintManager;

import observer.AWTObserver;
import observer.IObserver;

import cube.RubikCube;
import panel.FacePanel;
import pieza.Vectr;
import solutions.SolutionMethodTemba;
import thread.MiThread;

public class PpalPal {
	public static JFrame frame;
	RubCruz cruz = new RubCruz(0, 0, 33);

	private RubikCube cube = new RubikCube();
	private SolutionMethodTemba temba = new SolutionMethodTemba(cube);

	private void buildUI(Container container) {
		container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));

		container.add(cruz);
		container.add(botonSol());
		container.setBackground(Color.pink);

	}

	class RepaintCruz extends Thread implements Runnable {

		public RepaintCruz(Component[] components) {
			super();
		}

		@Override
		public void run() {

			while (true) {
				System.out.print("hilo");
				//cruz.repaint();
				PpalPal.frame.repaint();
				try {
					this.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	private Component botonSol() {
		JButton button = new JButton();
		ActionListener solucion = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				IObserver observer = new AWTObserver(cruz.getMap());
				cube.addObservador(observer);

				RepaintCruz repaintCruz = new RepaintCruz(cruz.getComponents());
				repaintCruz.start();
				try {
					cube.setPositions();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				System.out.print("lakjdsnljnasdg");

			}
		};
		button.addActionListener(solucion);
		return button;
	}

	private static void createAndShowGUI() {

		//JFrame frame = new JFrame("CoordinatesDemo");
		PpalPal.frame= new JFrame("CoordinatesDemo");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PpalPal.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		PpalPal controller = new PpalPal();
		controller.buildUI(PpalPal.frame.getContentPane());

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
	
	
	public class RubCruz extends JComponent {

		/**
		 * 
		 */
		private static final long serialVersionUID = 5180355775069038712L;

		HashMap<Vectr, FacePanel> map = new HashMap();

		private List<FacePanel> facePanels;

		private int w;
		private int oX;
		private int oY;

		public FacePanel getFacePanels(Color color) {
			FacePanel facePanels = null;
			for (FacePanel panel : this.facePanels) {
				if (panel.getColor().equals(color)) {
					facePanels = panel;
				}
			}
			return facePanels;
		}

		public void setFacePanels(List<FacePanel> facePanels) {
			this.facePanels = facePanels;
		}

		public RubCruz(int x, int y, int w) {

			oX = x;
			oY = y;
			this.w = w;

			facePanels = new ArrayList<FacePanel>();

			facePanels.add(new FacePanel(Color.white, 3 + oX, 0 + oY, this.w));
			facePanels.add(new FacePanel(Color.blue, 3 + oX, 3 + oY, this.w));
			facePanels.add(new FacePanel(Color.red, 0 + oX, 3 + oY, this.w));
			facePanels.add(new FacePanel(Color.orange, 6 + oX, 3 + oY, this.w));
			facePanels.add(new FacePanel(Color.green, 9 + oX, 3 + oY, this.w));
			facePanels.add(new FacePanel(Color.yellow, 3 + oX, 6 + oY, this.w));

			map.put(new Vectr(0, 0, 1), getFacePanels(Color.white));
			map.put(new Vectr(1, 0, 0), getFacePanels(Color.red));
			map.put(new Vectr(0, 1, 0), getFacePanels(Color.blue));
			map.put(new Vectr(0, 0, -1), getFacePanels(Color.yellow));
			map.put(new Vectr(-1, 0, 0), getFacePanels(Color.orange));
			map.put(new Vectr(0, -1, 0), getFacePanels(Color.green));

			this.setPreferredSize(new Dimension(w * 12, w * 9));
		}

		public HashMap<Vectr, FacePanel> getMap() {
			return map;
		}

		public void setMap(HashMap<Vectr, FacePanel> map) {
			this.map = map;
		}

		public void paintComponent(Graphics g) {

			for (FacePanel face : this.facePanels) {
				face.paintComponent(g);
			}
		}
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
