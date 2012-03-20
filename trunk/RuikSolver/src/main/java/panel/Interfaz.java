package panel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

//import rubikcube.ClassicalMethodThread;

public class Interfaz {
	private static boolean isStarted = false;
	static JFrame frameposition = new JFrame("Rubik's cube position");
	static JFrame frame = new JFrame("Rubik's cube current position");
	final static Drawingpanel drawingpanel = new Drawingpanel();
	final static Positionpanel positionpanel = new Positionpanel(frameposition);

	public void openPositionWorkstation() {
		if (!isStarted) {
			start();
		}
		frameposition.setVisible(true);
	}

	/**
	 * Sets the pieces to their initial position. This method is only called
	 * once by the first public method called by the user. Moreover it
	 * initializes the JAVA objects which will be used in order to show the cube
	 * once it has been drawn.
	 */
	private static void start() {
		if (!isStarted) {
			// The pieces start in their original position

			isStarted = true;
			frame.setSize(450, 400);
			frame.setLocation(50, 50);
			frameposition.setSize(450, 420);
			frameposition.setLocation(50, 50);
			drawingpanel.setSize(new Dimension(450, 355));
			drawingpanel.setMinimumSize(new Dimension(450, 355));
			drawingpanel.setPreferredSize(new Dimension(450, 355));
			drawingpanel.setMaximumSize(new Dimension(450, 355));
			drawingpanel.setBackground(new Color(175, 200, 255));
			positionpanel.setSize(new Dimension(450, 455));
			positionpanel.setMinimumSize(new Dimension(450, 455));
			positionpanel.setPreferredSize(new Dimension(450, 455));
			positionpanel.setMaximumSize(new Dimension(450, 455));
			positionpanel.setBackground(new Color(175, 200, 255));
			frame.add(drawingpanel);
			frameposition.add(positionpanel);
			// classicalmethodthread = new ClassicalMethodThread();
			// classicalmethodthread.setPriority(Thread.NORM_PRIORITY);
		}
	}
}
