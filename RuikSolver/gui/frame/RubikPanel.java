package frame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import observer.AWTObserver;
import observer.IObserver;
import cube.RubikCube;
import panel.RubCruz;
import solutions.SolutionMethodTemba;
import thread.MiThread;

public class RubikPanel extends JPanel {

	RubCruz rubCruz;

	public RubikPanel() {
		super();
		rubCruz = new RubCruz(0, 0, 33);
		this.add(rubCruz);

		JButton button = new JButton("Cargar");
		this.add(button);

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		button.addActionListener(actionListener);

	}

	public static void main(String[] args) throws IOException {
		JFrame frame = new JFrame();

		RubikPanel rubikPanel = new RubikPanel();
		frame.add(rubikPanel);
		// frame.getContentPane().setLayout(new FlowLayout());
		frame.setTitle("Rubik by Temba");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
		frame.pack();
	}
}