package frame;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import panel.RubCruz;


public class VentanaPpal extends JFrame {

	private RubCruz comp = new RubCruz(1, 1, 33);

	/**
	 * 
	 */
	private static final long serialVersionUID = -4226961849442887198L;

	public RubCruz getComp() {
		return comp;
	}

	public void setComp(RubCruz comp) {
		this.comp = comp;
	}

	public VentanaPpal() throws HeadlessException {
		super();
		this.setTitle("Rubik by Temba");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);

		// frame.setResizable(false);

		this.setBackground(new Color(175, 200, 255));

		this.add(comp);

		this.setSize(475, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
