package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Hashtable;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import actionListener.NotepadActionListener;
import actionListener.SalirActionListener;
import actionListener.ScrambleActionListener;
import actionListener.SolucionarActionListener;
import observer.AWTObserver;
import observer.IObserver;
import cube.RubikCube;
import panel.FacePanel;
import panel.RubCruz;
import panel.StickPanel;
import pieza.Pieza;
import pieza.Stick;
import pieza.Vectr;
import solution.SolutionMethodTemba;

public class VentanaPpal extends JFrame {
	private RubikCube rubikCube = new RubikCube();
	public static RubCruz rubCruz = new RubCruz(1, 3, 50);
	private SolutionMethodTemba temba = new SolutionMethodTemba(rubikCube);
	private IObserver observer;

	private Color colorAzulito = new Color(175, 200, 255);
	private Color colorCarga = null;

	private JPanel panelBotonero = new JPanel();
	private JTextPane textPane = new MyJtexPane();
	public static JTextArea textAreaPad = new JTextArea();
	private JSlider slider;

	public static JButton buttonSolucionar;
	public static JButton buttonSolucionarPasoApaso;
	public static JButton buttonOriginal;
	public static JButton buttonNotepad;
	public static JButton buttonCargaManual;
	public static JButton buttonAleatorio;
	public static JButton buttonSalirPasoAPaso;

	public static JButton buttonPasoApaso;
	private int sleep;
	public static JScrollPane scroll;
	public static int numGiros;

	private static final long serialVersionUID = -4226961849442887198L;

	public VentanaPpal() throws HeadlessException {
		super();

		sleep = 150;

		buttonPasoApaso = (JButton) botonNext();
		buttonSalirPasoAPaso = (JButton) botonSalirPasoAPaso();

		observer = new AWTObserver(rubCruz.getMap(), sleep);
		rubikCube.addObservador(observer);

		propiedadesFrame();

		cargaContainer();
		setEnableSolucion(false);
	}

	private Component jtextPane() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(380, 776));
		panel.setBackground(colorAzulito);
		textPane.setEditable(false);
		textPane.setSelectedTextColor(null);

		textPane.setBackground(new Color(238, 238, 236));

		JScrollPane scrollPane = new JScrollPane(textPane);
		scrollPane.setBounds(10, 70, 230, 640);
		scrollPane.setBorder(null);

		scrollPane
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane
				.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		panel.add(scrollPane);

		return panel;
	}

	private Component jtextPanePad() {
		textAreaPad.setBounds(40, 555, 180, 80);
		textAreaPad.setBorder(BorderFactory.createLineBorder(Color.black));
		textAreaPad.setLineWrap(true);

		scroll = new JScrollPane();
		scroll.setViewportView(textAreaPad);

		scroll.setBounds(40, 555, 180, 80);
		scroll.setBorder(null);

		scroll.setVisible(false);

		return scroll;
	}

	private void cargaContainer() {
		Container container = this.getContentPane();

		container.setLayout(new BorderLayout());
		container.setBackground(colorAzulito);

		container.add(botoneraColores(), BorderLayout.CENTER);
		container.add(panelIzq(), BorderLayout.WEST);
		container.add(jtextPane(), BorderLayout.EAST);
	}

	private Component botoneraColores() {

		panelBotonero.setLayout(null);
		panelBotonero.setBounds(500, 100, 200, 190);
		panelBotonero.setBackground(colorAzulito);
		panelBotonero.add(botonRed());
		panelBotonero.add(botonGreen());
		panelBotonero.add(botonBlue());
		panelBotonero.add(botonOrange());
		panelBotonero.add(botonWhite());
		panelBotonero.add(botonYellow());
		panelBotonero.add(botonCargar());
		panelBotonero.add(botonCancelarCargar());

		panelBotonero.setVisible(false);

		rubCruz.setLayout(null);
		rubCruz.add(panelBotonero);
		rubCruz.add(buttonPasoApaso);
		rubCruz.add(buttonSalirPasoAPaso);
		rubCruz.add(botonSalirPasoAPaso());
		rubCruz.add(botonSalirPasoAPaso());
		rubCruz.add(createSlider());
		rubCruz.addMouseListener(mouseAdapterCargaManual);
		return rubCruz;
	}

	private Component createSlider() {
		slider = new JSlider(JSlider.HORIZONTAL, 0, 30, 5);
		slider.setBounds(60, 60, 210, 50);
		slider.setBackground(colorAzulito);

		slider.setMajorTickSpacing(30);
		slider.setMinorTickSpacing(1);

		Hashtable<Integer, JLabel> labelTable = new Hashtable<Integer, JLabel>();
		labelTable.put(new Integer(0), new JLabel("Fast"));
		labelTable.put(new Integer(30), new JLabel("Slow"));
		labelTable.put(new Integer(15), new JLabel("Medium"));
		slider.setLabelTable(labelTable);

		slider.setBorder(null);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);

		slider.addChangeListener(istenerSlider);

		return slider;
	}

	private ChangeListener istenerSlider = new ChangeListener() {

		@Override
		public void stateChanged(ChangeEvent e) {
			JSlider source = (JSlider) e.getSource();
			if (!source.getValueIsAdjusting()) {
				int fps = (int) source.getValue();
				sleep = fps;
				observer.setSleep(sleep * 33);
			}
		}
	};
	public static JButton buttonCancelaCargaNotePad;
	public static JButton buttonCargaNotePad;

	private JLabel panelIzq() {
		JPanel panel = new JPanel();
		JLabel etqImagen = new JLabel();

		panel.setPreferredSize(new Dimension(1366, 768));
		panel.setLayout(null);
		etqImagen.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/panelBotoneraIzq.png")));
		panel.add(etqImagen);
		etqImagen.add(botonAleatorio());
		etqImagen.add(botonSalir());
		etqImagen.add(botonSolucionar());
		etqImagen.add(botonCargaManual());
		etqImagen.add(botonOriginal());
		etqImagen.add(botonSolucionarNext());
		etqImagen.add(botonNotepad());
		etqImagen.add(jtextPanePad());
		etqImagen.add(botonCargaNotePad());
		etqImagen.add(botonCancelaCargaNotePad());

		return etqImagen;
	}

	private Component botonCargaNotePad() {
		buttonCargaNotePad = new JButton("Carga Texto");
		buttonCargaNotePad.setBackground(new Color(238, 238, 236));
		buttonCargaNotePad.setBounds(40, 650, 66, 66);
		buttonCargaNotePad.setBorder(null);
		buttonCargaNotePad.setCursor(Cursor
				.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonCargaNotePad.setVisible(false);

		ActionListener actionNotePad = new NotepadActionListener(rubikCube,
				textAreaPad);
		buttonCargaNotePad.addActionListener(actionNotePad);

		return buttonCargaNotePad;
	}

	private Component botonCancelaCargaNotePad() {
		buttonCancelaCargaNotePad = new JButton("Cancelar");
		buttonCancelaCargaNotePad.setBackground(new Color(238, 238, 236));
		buttonCancelaCargaNotePad.setBounds(106, 650, 66, 66);
		buttonCancelaCargaNotePad.setBorder(null);
		buttonCancelaCargaNotePad.setCursor(Cursor
				.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonCancelaCargaNotePad.setVisible(false);

		buttonCancelaCargaNotePad.addActionListener(actionCancelaCargaNotePad);

		return buttonCancelaCargaNotePad;
	}

	ActionListener actionCancelaCargaNotePad = new ActionListener() {

		@Override
		// TODO
		public void actionPerformed(ActionEvent e) {
			setVisibleNotepad(false);

			enableCancel();
			textAreaPad.setText("");
		}

	};

	ActionListener actionCargaTexto = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			setVisibleNotepad(true);
			setEnableAll(false);
			textAreaPad.setText("");
		}
	};

	private void propiedadesFrame() {
		this.setTitle("Rubik by Temba");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.setSize(1366, 768);

	}

	private JButton botonRed() {
		JButton button = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/botonRed.png")));
		button.setBackground(colorAzulito);
		button.setBounds(0, 0, 66, 66);
		button.setBorder(null);
		button.setSelected(false);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		button.addActionListener(actionR);
		return button;
	}

	private Component botonGreen() {
		// JButton button = new JButton(new ImageIcon("botonRed.png"));
		JButton button = new JButton("Green");
		button.setBackground(Color.green);
		button.setBounds(66, 0, 66, 66);
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		button.addActionListener(actionG);
		return button;
	}

	private Component botonBlue() {
		// JButton button = new JButton(new ImageIcon("botonRed.png"));
		JButton button = new JButton("Blue");
		button.setBackground(Color.blue);
		button.setBounds(132, 0, 66, 66);
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		button.addActionListener(actionB);
		return button;
	}

	private Component botonOrange() {
		JButton button = new JButton("Orange");
		button.setBackground(Color.orange);
		button.setBounds(0, 66, 66, 66);
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		button.addActionListener(actionO);
		return button;
	}

	private Component botonWhite() {
		JButton button = new JButton("White");
		button.setBackground(Color.white);
		button.setBounds(66, 66, 66, 66);
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		button.addActionListener(actionW);
		return button;
	}

	private Component botonYellow() {
		JButton button = new JButton("Yellow");
		button.setBackground(Color.yellow);
		button.setBounds(132, 66, 66, 66);
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		button.addActionListener(actionY);
		return button;
	}

	private Component botonCargar() {
		JButton button = new JButton("carga");
		button.setBackground(Color.gray);
		button.setBounds(132, 124, 66, 66);
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		button.addActionListener(actionCargar);
		return button;
	}

	private Component botonCancelarCargar() {
		JButton button = new JButton("cancela");
		button.setBackground(Color.gray);
		button.setBounds(0, 124, 66, 66);
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		button.addActionListener(actionCancelaCarga);
		return button;
	}

	private Component botonNext() {
		JButton button = new JButton("Next");
		button.setBackground(Color.magenta);
		button.setBounds(500, 500, 66, 66);
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setVisible(false);
		button.addActionListener(actionNext);
		return button;

	}

	private Component botonSalirPasoAPaso() {
		JButton button = new JButton("Salir");
		button.setBackground(new Color(238, 238, 236));
		button.setBounds(566, 500, 66, 66);
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setVisible(false);

		button.addActionListener(actionSalirPasoAPaso);
		return button;
	}

	private Component botonAleatorio() {
		buttonAleatorio = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/boton1menu.png")));
		buttonAleatorio.setBackground(new Color(238, 238, 236));
		buttonAleatorio.setBounds(10, 200, 235, 55);
		buttonAleatorio.setBorder(null);
		buttonAleatorio.setCursor(Cursor
				.getPredefinedCursor(Cursor.HAND_CURSOR));

		ActionListener aleatorio = new ScrambleActionListener(rubikCube);
		buttonAleatorio.addActionListener(aleatorio);
		return buttonAleatorio;
	}

	private Component botonSolucionar() {
		buttonSolucionar = new JButton("Solucionar");
		buttonSolucionar.setBackground(new Color(238, 238, 236));
		buttonSolucionar.setBounds(10, 255, 235, 55);
		buttonSolucionar.setBorder(null);
		buttonSolucionar.setCursor(Cursor
				.getPredefinedCursor(Cursor.HAND_CURSOR));
		// buttonSolucionar.setEnabled(false);

		ActionListener solucionar = new SolucionarActionListener(temba);
		buttonSolucionar.addActionListener(solucionar);
		return buttonSolucionar;
	}

	private Component botonCargaManual() {
		buttonCargaManual = new JButton("Carga Manual");
		buttonCargaManual.setBackground(new Color(238, 238, 236));
		buttonCargaManual.setBounds(10, 310, 235, 55);
		buttonCargaManual.setBorder(null);
		buttonCargaManual.setCursor(Cursor
				.getPredefinedCursor(Cursor.HAND_CURSOR));

		buttonCargaManual.addActionListener(actionCargaManual);
		return buttonCargaManual;
	}

	private Component botonOriginal() {
		buttonOriginal = new JButton("Cube Original");
		buttonOriginal.setBackground(new Color(238, 238, 236));
		buttonOriginal.setBounds(10, 365, 235, 55);
		buttonOriginal.setBorder(null);
		buttonOriginal
				.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		// buttonOriginal.setEnabled(false);

		buttonOriginal.addActionListener(actionOriginal);
		return buttonOriginal;
	}

	private Component botonSolucionarNext() {
		buttonSolucionarPasoApaso = new JButton("Solucionar Paso a Paso");
		buttonSolucionarPasoApaso.setBackground(new Color(238, 238, 236));
		buttonSolucionarPasoApaso.setBounds(10, 420, 235, 55);
		buttonSolucionarPasoApaso.setBorder(null);
		buttonSolucionarPasoApaso.setCursor(Cursor
				.getPredefinedCursor(Cursor.HAND_CURSOR));
		// buttonSolucionarNext.setEnabled(false);

		buttonSolucionarPasoApaso.addActionListener(actionPasoApaso);
		return buttonSolucionarPasoApaso;
	}

	private Component botonNotepad() {
		buttonNotepad = new JButton("Carga notepad");
		buttonNotepad.setBackground(new Color(238, 238, 236));
		buttonNotepad.setBounds(10, 475, 235, 55);
		buttonNotepad.setBorder(null);
		buttonNotepad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		buttonNotepad.addActionListener(actionCargaTexto);
		return buttonNotepad;
	}

	private Component botonSalir() {
		JButton button = new JButton("Salir");
		button.setBackground(new Color(238, 238, 236));
		button.setBounds(10, 700, 235, 55);
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		ActionListener salir = new SalirActionListener();
		button.addActionListener(salir);
		return button;
	}

	ActionListener actionSalirPasoAPaso = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			iniciado = false;
			// SolucionarActionListener.thread.stop();

			setVisiblePasoAPaso(false);

			setEnableAll(true);

		}

	};

	ActionListener actionPasoApaso = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			setVisiblePasoAPaso(true);
			buttonSolucionar.setEnabled(false);
		}
	};

	ActionListener actionOriginal = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			rubCruz.setResuelto();
			cargar();

			setEnableSolucion(false);
			setEnableCargar(true);

		}
	};
	ActionListener actionY = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			colorCarga = Color.yellow;

		}
	};
	ActionListener actionR = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			colorCarga = Color.red;
			botonRed().setFocusPainted(false);
		}
	};
	ActionListener actionB = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			colorCarga = Color.blue;

		}
	};
	ActionListener actionG = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			colorCarga = Color.green;

		}
	};
	ActionListener actionO = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			colorCarga = Color.orange;

		}
	};
	ActionListener actionW = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			colorCarga = Color.white;

		}
	};

	ActionListener actionCargaManual = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			panelBotonero.setVisible(true);
			setEnableAll(false);
		}
	};

	ActionListener actionCargar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			cargar();

			panelBotonero.setVisible(false);

			enableCancel();

		//	setEnableSolucion(true);

			colorCarga = null;
		}

	};

	public static void enableCancel() {
		if (rubCruz.isResuelto()) {
			setEnableCargar(true);
		} else {
			setEnableAll(true);
		}
	}

	ActionListener actionCancelaCarga = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			panelBotonero.setVisible(false);

			enableCancel();

			observer.observa(rubikCube.getPiezas());
			colorCarga = null;
		}

	};

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

	private void cargar() {
		for (Pieza pieza : rubikCube.getPiezas()) {
			Vectr posicion = pieza.getPosicion();
			Stick stickers[] = pieza.getStickers();
			for (int i = 0; i < stickers.length; i++) {
				Vectr orientacion = stickers[i].getOrientacion();
				FacePanel facePanel = rubCruz.getMap().get(orientacion);
				StickPanel stickpanel = facePanel.getMap().get(posicion);

				Color colorStickPanel = stickpanel.getColor();
				pieza.Color calcColor = calcColor(colorStickPanel);
				stickers[i].setColor(calcColor);
			}
		}
	}

	public static boolean iniciado = false;
	SolucionarActionListener q;

	ActionListener actionNext = new ActionListener() {
//TODO
		@Override
		public void actionPerformed(ActionEvent e) {
			SolucionarActionListener q = new SolucionarActionListener(temba);
			if (iniciado == false) {
				iniciado = true;
				q.actionPerformed(e);

			} else {
				observer.reanudar();
			}
		}
	};

	MouseAdapter mouseAdapterCargaManual = new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			if (colorCarga != null) {
				double x = getMousePosition().getX() - 5 * 50 - 30;
				double y = getMousePosition().getY();
				for (Vectr v : rubCruz.getMap().keySet()) {
					panel.FacePanel facePanel = rubCruz.getMap().get(v);
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							if (!(i == 1 && j == 1)) {
								StickPanel panel = facePanel
										.getStickPanel(i, j);

								if (panel.getSquare().contains(x, y)) {
									panel.setColor(colorCarga);
									repaint();
								}
							}
						}
					}
				}
			}

		}
	};

	public static void setEnableCargar(boolean b) {
		buttonCargaManual.setEnabled(b);
		buttonNotepad.setEnabled(b);
		buttonAleatorio.setEnabled(b);

	}

	public static void setEnableSolucion(boolean b) {
		buttonSolucionar.setEnabled(b);
		buttonSolucionarPasoApaso.setEnabled(b);
		buttonOriginal.setEnabled(b);
	}

	public static void setEnableAll(boolean b) {
		buttonSolucionar.setEnabled(b);
		buttonOriginal.setEnabled(b);
		buttonSolucionarPasoApaso.setEnabled(b);
		buttonNotepad.setEnabled(b);
		buttonCargaManual.setEnabled(b);
		buttonAleatorio.setEnabled(b);
	}

	public static void setVisiblePasoAPaso(boolean b) {
		buttonPasoApaso.setVisible(b);
		buttonSalirPasoAPaso.setVisible(b);
	}

	public static void setVisibleNotepad(boolean b) {
		buttonCargaNotePad.setVisible(b);
		scroll.setVisible(b);
		buttonCancelaCargaNotePad.setVisible(b);
	}
}
