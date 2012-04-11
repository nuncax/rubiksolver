package stick;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Stick extends JPanel {
	public Rectangle2D colorsquare = new Rectangle2D.Double();
	public Graphics2D g2;

	/**
	 * Create the panel.
	 */
	public Stick() {
		// draw Rectangle2D.Double
		g2.draw(new Rectangle2D.Double(9, 9, 9,9));
	}

}
