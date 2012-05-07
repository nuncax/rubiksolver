package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cube.RubikCube;

public class NotepadActionListener implements ActionListener {
	RubikCube rubikCube;

	public NotepadActionListener(RubikCube rubikCube) {
		this.rubikCube = rubikCube;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				rubikCube.setPositions();

			}

		});

		thread.start();
	}
}