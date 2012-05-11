package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

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
				String[] arrayMovimientos = textAreaPad.getText().split(",");
				if (cadenaMovimientoValida(arrayMovimientos)) {
					rubikCube.setPositions(textAreaPad.getText());

					VentanaPpal.buttonSolucionar.setEnabled(true);
					VentanaPpal.buttonOriginal.setEnabled(true);
					VentanaPpal.buttonSolucionarNext.setEnabled(true);
					VentanaPpal.buttonAleatorio.setEnabled(true);
					VentanaPpal.buttonManual.setEnabled(true);
					

					// VentanaPpal.textAreaPad.setVisible(false);
					VentanaPpal.scroll.setVisible(false);
					VentanaPpal.buttonCargaNotePad.setVisible(false);
					VentanaPpal.buttonCancelaCargaNotePad.setVisible(false);

				} else {

					JOptionPane
							.showMessageDialog(new JFrame(),
									"Movimientos validos:\n F,R,L,U,D,B,FP,RP,LP,UP,DP,BP\n Entre comas.");
				}
			}
		});

		thread.start();
	}

	private boolean cadenaMovimientoValida(String[] arrayMovimientos) {
		boolean valida = true;
		for (int i = 0; i < arrayMovimientos.length; i++) {
			String movimiento = arrayMovimientos[i].toUpperCase();
			if (!movimientoValido(movimiento)) {
				valida = false;
				i = arrayMovimientos.length;
			}
		}
		return valida;
	}

	private boolean movimientoValido(String movimiento) {
		boolean valido = false;
		String[] movimientosValidos = { "F", "R", "L", "U", "D", "B", "FP",
				"RP", "LP", "UP", "DP", "BP" };
		for (int i = 0; i < movimientosValidos.length; i++) {
			if (movimientosValidos[i].equals(movimiento)) {
				valido = true;
				i = movimientosValidos.length;
			}

		}

		return valido;
	}
}