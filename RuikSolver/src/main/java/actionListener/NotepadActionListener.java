package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import cube.RubikCube;
import frame.VentanaPpal;

public class NotepadActionListener implements ActionListener {
	RubikCube rubikCube;
	JTextArea textAreaPad;

	public NotepadActionListener(RubikCube rubikCube, JTextArea textPanePad) {
		this.rubikCube = rubikCube;
		this.textAreaPad = textPanePad;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		VentanaPpal.numGiros = 0;
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

				VentanaPpal.buttonSolucionar.setEnabled(true);
				VentanaPpal.buttonOriginal.setEnabled(true);
				VentanaPpal.buttonSolucionarNext.setEnabled(true);
				rubikCube.setPositions(textAreaPad.getText());
				VentanaPpal.textAreaPad.setVisible(false);
				VentanaPpal.scroll.setVisible(false);
				VentanaPpal.buttonCargaNotePad.setVisible(false);
				
				
				// VentanaPpal.buttonAleatorio.setEnabled(true);
			}
		});

		thread.start();
		VentanaPpal.buttonSolucionar.setEnabled(false);
		VentanaPpal.buttonOriginal.setEnabled(false);
		VentanaPpal.buttonSolucionarNext.setEnabled(false);
		VentanaPpal.buttonNotepad.setEnabled(false);
		VentanaPpal.buttonManual.setEnabled(false);
		VentanaPpal.buttonAleatorio.setEnabled(false);

	}
}