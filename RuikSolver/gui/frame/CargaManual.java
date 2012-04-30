package frame;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import panel.FacePanel;

import panel.RubCruz;
import panel.StickPanel;
import pieza.Vectr;

public class CargaManual extends JPanel {

	private static final long serialVersionUID = 3046655897678128963L;

	private JButton buttonY = new JButton("Amarillo");
	private JButton buttonR = new JButton("Rojo");
	private JButton buttonB = new JButton("Azul");
	private JButton buttonG = new JButton("Verde");
	private JButton buttonN = new JButton("Naranja");
	private JButton buttonW = new JButton("Blanco");

	private RubCruz comp = new RubCruz(0, 0, 33);

	public CargaManual() {
		this.add(comp);
		this.add(buttonY);
		this.add(buttonR);
		this.add(buttonB);
		this.add(buttonG);
		this.add(buttonN);
		this.add(buttonW);
		this.setBackground(new Color(175, 200, 255));

		MouseAdapter adapter = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getComponent());
			}
		};

		// addMouseListener(adapter);
	//	this.comp.addMouseListener(adapter);
		buttonB.addMouseListener(adapter);
		buttonG.addMouseListener(adapter);
		buttonN.addMouseListener(adapter);
		buttonR.addMouseListener(adapter);
		buttonW.addMouseListener(adapter);
		buttonY.addMouseListener(adapter);

		for (Vectr v : comp.getMap().keySet()) {
			FacePanel facePanel = comp.getMap().get(v);

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					StickPanel panel = facePanel.getStickPanel(i, j);
					panel.addMouseListener(adapter);
				}
			}
		}
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setTitle("Rubik by Temba");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		frame.add(new CargaManual());

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.pack();
	}

}