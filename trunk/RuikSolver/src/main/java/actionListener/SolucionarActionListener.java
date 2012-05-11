package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.google.common.collect.Sets.SetView;

import frame.VentanaPpal;
import solution.SolutionMethodTemba;

public class SolucionarActionListener extends Thread implements ActionListener, Runnable {
	SolutionMethodTemba temba;

	public SolucionarActionListener(SolutionMethodTemba temba) {
		this.temba = temba;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VentanaPpal.numGiros = 0;
	
		start();
		
		VentanaPpal.setEnableAll(false);
	}

	@Override
	public void run() {
		temba.solucionar();
		VentanaPpal.iniciado = false;
		VentanaPpal.setVisiblePasoAPaso(false);		
		VentanaPpal.setEnableCargar(true);		
	}
}
