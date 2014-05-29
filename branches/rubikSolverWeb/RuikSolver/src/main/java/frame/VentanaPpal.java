package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
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
import utiles.Utiles;

public class VentanaPpal extends JFrame {
	private RubikCube rubikCube = new RubikCube();
	public static RubCruz rubCruz = new RubCruz(2, 3, 50);
	private SolutionMethodTemba temba = new SolutionMethodTemba(rubikCube);
	private IObserver observer;

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
	public static JButton buttonCancelaCargaNotePad;
	public static JButton buttonCargaNotePad;
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
		panel.setBackground(Color.yellow);

		textPane.setEditable(false);
		textPane.setSelectedTextColor(null);

		textPane.setBackground(Color.red);
		textPane.setOpaque(true);

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

	private Component panelDer() {

		JLabel etqImagen = new JLabel();
		etqImagen.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/panelLateralDerecho.fw.png")));

		textPane.getMargin();
		textPane.setMargin(new Insets(50, 50, 50, 50));

		textPane.setEditable(false);
		textPane.setSelectedTextColor(null);
		textPane.setOpaque(false);
		textPane.setBackground(Utiles.colorAzulito);

		JScrollPane scrollPane = new JScrollPane(textPane);
		scrollPane.setBounds(0, 0, 282, 777);
		scrollPane.setBorder(null);

		scrollPane
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane
				.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		etqImagen.add(scrollPane);

		return etqImagen;
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
		container.setBackground(Utiles.colorAzulito);

		container.add(botoneraColores(), BorderLayout.CENTER);
		// container.add(botoneraColores(), BorderLayout.NORTH);
		container.add(panelIzq(), BorderLayout.WEST);
		container.add(panelDer(), BorderLayout.EAST);

		// panelDer();
		// panelIzq();
	}

	private Component botoneraColores() {

		panelBotonero.setLayout(null);
		panelBotonero.setBounds(185, 8, 432, 57);
		panelBotonero.setBackground(colorCarga);
		// panelBotonero.setOpaque(false);

		panelBotonero.add(botonGreen());
		panelBotonero.add(botonRed());
		panelBotonero.add(botonBlue());
		panelBotonero.add(botonOrange());
		panelBotonero.add(botonWhite());
		panelBotonero.add(botonYellow());
		panelBotonero.add(botonCargar());
		panelBotonero.add(botonCancelarCargar());

		panelBotonero.setVisible(false);

		rubCruz.setLayout(null);
		rubCruz.add(up());
		rubCruz.add(down());
		rubCruz.add(left());
		rubCruz.add(right());
		rubCruz.add(back());
		rubCruz.add(front());
		rubCruz.add(panelBotonero);
		rubCruz.add(buttonPasoApaso);
		rubCruz.add(buttonSalirPasoAPaso);
		rubCruz.add(botonSalirPasoAPaso());
		rubCruz.add(botonSalirPasoAPaso());
		rubCruz.add(createSlider());
		rubCruz.addMouseListener(mouseAdapterCargaManual);
		return rubCruz;
	}

	private Component front() {
		JLabel etqImagen = new JLabel();
		etqImagen.setBounds(190, 450, 58, 25);
		etqImagen.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/front.fw.png")));
		return etqImagen;
	}

	private Component back() {
		JLabel etqImagen = new JLabel();
		etqImagen.setBounds(655, 278, 48, 25);
		etqImagen.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/back.fw.png")));
		return etqImagen;
	}

	private Component right() {
		JLabel etqImagen = new JLabel();
		etqImagen.setBounds(500, 278, 53, 25);
		etqImagen.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/right.fw.png")));
		return etqImagen;
	}

	private Component left() {
		JLabel etqImagen = new JLabel();
		etqImagen.setBounds(100, 278, 41, 25);
		etqImagen.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/left.fw.png")));
		return etqImagen;
	}

	private JLabel up() {
		JLabel etqImagen = new JLabel();
		etqImagen.setBounds(380, 128, 26, 25);
		etqImagen.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/up.fw.png")));
		return etqImagen;
	}

	private JLabel down() {
		JLabel etqImagen = new JLabel();
		etqImagen.setBounds(350, 599, 57, 25);
		etqImagen.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/down.fw.png")));
		return etqImagen;
	}

	private Component createSlider() {
		slider = new JSlider(JSlider.VERTICAL, 0, 30, 5);
		slider.setBounds(10, 550, 80, 200);
		slider.setBackground(Utiles.colorAzulito);

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

	private JLabel panelIzq() {
		JPanel panel = new JPanel();
		JLabel etqImagen = new JLabel();

		panel.setPreferredSize(new Dimension(1366, 768));
		panel.setLayout(null);

		etqImagen.setIcon(new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/panelLateralIzquierda.fw.png")));
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

		// TODO
		etqImagen.add(botonCargar());
		etqImagen.add(botonCancelarCargar());

		return etqImagen;
	}

	private Component botonCargaNotePad() {
		buttonCargaNotePad = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/carga.fw.png")));

		// buttonCargaNotePad.setBackground(new Color(238, 238, 236));
		buttonCargaNotePad.setBounds(40, 625, 66, 66);
		buttonCargaNotePad.setBorder(null);
		buttonCargaNotePad.setCursor(Cursor
				.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonCargaNotePad.setVisible(false);
		buttonCargaNotePad.setContentAreaFilled(false);

		ActionListener actionNotePad = new NotepadActionListener(rubikCube,
				textAreaPad);
		buttonCargaNotePad.addActionListener(actionNotePad);

		return buttonCargaNotePad;
	}

	private Component botonCancelaCargaNotePad() {
		buttonCancelaCargaNotePad = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/cancelar.fw.png")));
		
		buttonCancelaCargaNotePad.setBounds(150, 625, 66, 66);
		buttonCancelaCargaNotePad.setBorder(null);
		buttonCancelaCargaNotePad.setCursor(Cursor
				.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonCancelaCargaNotePad.setVisible(false);
		buttonCancelaCargaNotePad.setContentAreaFilled(false);

		buttonCancelaCargaNotePad.addActionListener(actionCancelaCargaNotePad);

		return buttonCancelaCargaNotePad;
	}

	ActionListener actionCancelaCargaNotePad = new ActionListener() {

		@Override
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
	private JButton buttonCargar;
	private JButton buttonCancelarCargar;

	private void propiedadesFrame() {
		this.setTitle("Rubik by Temba");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.setSize(1366, 768);

	}

	private JButton botonRed() {
		JButton button = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/botonRed.fw.png")));
		button.setBounds(0, 0, 57, 57);

		button.setBorder(null);
		// button.setSelected(false);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setContentAreaFilled(false);

		button.addActionListener(actionR);
		return button;
	}

	private Component botonGreen() {
		JButton button = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/botonGreen.fw.png")));
		button.setBounds(75, 0, 57, 57);
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setContentAreaFilled(false);

		button.addActionListener(actionG);
		return button;
	}

	private Component botonBlue() {
		JButton button = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/botonBlue.fw.png")));
		button.setBounds(150, 0, 57, 57);
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setContentAreaFilled(false);

		button.addActionListener(actionB);
		return button;
	}

	private Component botonOrange() {
		JButton button = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/botonOrange.fw.png")));
		button.setBounds(225, 0, 57, 57);
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setContentAreaFilled(false);

		button.addActionListener(actionO);
		return button;
	}

	private Component botonWhite() {
		JButton button = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/botonWhite.fw.png")));
		button.setBounds(300, 0, 57, 57);
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setContentAreaFilled(false);

		button.addActionListener(actionW);
		return button;
	}

	private Component botonYellow() {
		JButton button = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/botonYellow.fw.png")));
		button.setBounds(375, 0, 57, 57);
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setContentAreaFilled(false);

		button.addActionListener(actionY);
		return button;
	}

	private Component botonCargar() {
		// TODO
		buttonCargar = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/carga.fw.png")));
		buttonCargar.setBounds(40, 625, 66, 66);
		buttonCargar.setBorder(null);
		buttonCargar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonCargar.setContentAreaFilled(false);
		buttonCargar.setVisible(false);

		buttonCargar.addActionListener(actionCargar);
		return buttonCargar;
	}

	private Component botonCancelarCargar() {
		buttonCancelarCargar = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/cancelar.fw.png")));
		buttonCancelarCargar.setBounds(150, 625, 66, 66);
		
		buttonCancelarCargar.setBorder(null);
		buttonCancelarCargar.setCursor(Cursor
				.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonCancelarCargar.setContentAreaFilled(false);
		buttonCancelarCargar.setVisible(false);

		buttonCancelarCargar.addActionListener(actionCancelaCarga);
		return buttonCancelarCargar;
	}

	private Component botonNext() {
		ImageIcon icon = new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/Siguiente.fw.png"));

		JButton button = new JButton(icon);
		button.setBounds(566, 500, icon.getIconWidth(), icon.getIconHeight());
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setVisible(false);
		button.setContentAreaFilled(false);

		button.addActionListener(actionNext);
		return button;

	}

	private Component botonSalirPasoAPaso() {
		ImageIcon icon = new ImageIcon(this.getClass().getClassLoader()
				.getResource("images/cancelar.fw.png"));

		JButton button = new JButton(icon);

		button.setBounds(500, 500, icon.getIconWidth(), icon.getIconHeight());
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setVisible(false);
		button.setContentAreaFilled(false);

		button.addActionListener(actionSalirPasoAPaso);
		return button;
	}

	private Component botonAleatorio() {
		buttonAleatorio = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/cubeAleatorio.fw.png")));
		buttonAleatorio.setBackground(null);
		buttonAleatorio.setBounds(10, 200, 235, 55);
		buttonAleatorio.setBorder(null);
		buttonAleatorio.setCursor(Cursor
				.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonAleatorio.setContentAreaFilled(false);

		ActionListener aleatorio = new ScrambleActionListener(rubikCube);
		buttonAleatorio.addActionListener(aleatorio);
		return buttonAleatorio;
	}

	private Component botonSolucionar() {
		buttonSolucionar = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/solucionar.fw.png")));
		buttonSolucionar.setBackground(new Color(238, 238, 236));
		buttonSolucionar.setBounds(10, 255, 235, 55);
		buttonSolucionar.setBorder(null);
		buttonSolucionar.setCursor(Cursor
				.getPredefinedCursor(Cursor.HAND_CURSOR));
		// buttonSolucionar.setEnabled(false);
		buttonSolucionar.setContentAreaFilled(false);

		ActionListener solucionar = new SolucionarActionListener(temba);
		buttonSolucionar.addActionListener(solucionar);
		return buttonSolucionar;
	}

	private Component botonCargaManual() {
		buttonCargaManual = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/cargamanual.fw.png")));
		// buttonCargaManual = new JButton("Carga Manual");
		buttonCargaManual.setBackground(new Color(238, 238, 236));
		buttonCargaManual.setBounds(10, 310, 235, 55);
		buttonCargaManual.setBorder(null);
		buttonCargaManual.setCursor(Cursor
				.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonCargaManual.setContentAreaFilled(false);

		buttonCargaManual.addActionListener(actionCargaManual);
		return buttonCargaManual;
	}

	private Component botonOriginal() {
		buttonOriginal = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/cubeOriginal.fw.png")));
		buttonOriginal.setBackground(new Color(238, 238, 236));
		buttonOriginal.setBounds(10, 365, 235, 55);
		buttonOriginal.setBorder(null);
		buttonOriginal
				.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonOriginal.setContentAreaFilled(false);

		// buttonOriginal.setEnabled(false);

		buttonOriginal.addActionListener(actionOriginal);
		return buttonOriginal;
	}

	private Component botonSolucionarNext() {
		buttonSolucionarPasoApaso = new JButton(new ImageIcon(this.getClass()
				.getClassLoader()
				.getResource("images/solucionarPasoApaso.fw.png")));
		buttonSolucionarPasoApaso.setBackground(new Color(238, 238, 236));
		buttonSolucionarPasoApaso.setBounds(10, 420, 235, 55);
		buttonSolucionarPasoApaso.setBorder(null);
		buttonSolucionarPasoApaso.setCursor(Cursor
				.getPredefinedCursor(Cursor.HAND_CURSOR));
		// buttonSolucionarNext.setEnabled(false);
		buttonSolucionarPasoApaso.setContentAreaFilled(false);

		buttonSolucionarPasoApaso.addActionListener(actionPasoApaso);
		return buttonSolucionarPasoApaso;
	}

	private Component botonNotepad() {
		buttonNotepad = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/cargaNotepad.fw.png")));
		// buttonNotepad.setBackground(new Color(238, 238, 236));
		buttonNotepad.setBounds(10, 475, 235, 55);
		buttonNotepad.setBorder(null);
		buttonNotepad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonNotepad.setContentAreaFilled(false);

		buttonNotepad.addActionListener(actionCargaTexto);
		return buttonNotepad;
	}

	private Component botonSalir() {
		JButton button = new JButton(new ImageIcon(this.getClass()
				.getClassLoader().getResource("images/salirDelJuego.fw.png")));
		button.setBackground(new Color(238, 238, 236));
		button.setBounds(10, 700, 235, 55);
		button.setBorder(null);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setContentAreaFilled(false);

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
			colorCarga = Utiles.yellow;

		}
	};
	ActionListener actionR = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			colorCarga = Utiles.red;
			botonRed().setFocusPainted(false);
		}
	};
	ActionListener actionB = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			colorCarga = Utiles.blue;

		}
	};
	ActionListener actionG = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			colorCarga = Utiles.green;

		}
	};
	ActionListener actionO = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			colorCarga = Utiles.orange;

		}
	};
	ActionListener actionW = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			colorCarga = Utiles.white;

		}
	};

	ActionListener actionCargaManual = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			panelBotonero.setVisible(true);
			buttonCancelarCargar.setVisible(true);
			buttonCargar.setVisible(true);

			setEnableAll(false);
		}
	};

	ActionListener actionCargar = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			cargar();

			panelBotonero.setVisible(false);

			enableCancel();
			buttonCargar.setVisible(false);
			buttonCancelarCargar.setVisible(false);

			// setEnableSolucion(true);

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
			buttonCargar.setVisible(false);
			buttonCancelarCargar.setVisible(false);

			enableCancel();

			observer.observa(rubikCube.getPiezas());
			colorCarga = null;
		}

	};

	private pieza.Color calcColor(Color color) {
		pieza.Color colorRes = null;
		if (color.equals(Utiles.blue)) {
			colorRes = pieza.Color.BLUE;
		} else if (color.equals(Utiles.green)) {
			colorRes = pieza.Color.GREEN;
		} else if (color.equals(Utiles.orange)) {
			colorRes = pieza.Color.ORANGE;
		} else if (color.equals(Utiles.red)) {
			colorRes = pieza.Color.RED;
		} else if (color.equals(Utiles.white)) {
			colorRes = pieza.Color.WHITE;
		} else if (color.equals(Utiles.yellow)) {
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
