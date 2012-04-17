/**
 * |············································|
 * |·  AUTHOR:      OLIVER HIJANO CUBELOS      ·|
 * |·  E-MAIL:      oliver_hijano@hotmail.com  ·|
 * |·  DEVELOPED:   15/ June/ 2008             ·|
 * |·  UPDATED:     27/ June/ 2008             ·|
 * |············································|
 */

package panelOld;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * The panel which shows the extended cube belongs to this class.
 * 
 * @author Oliver Hijano
 * 
 */
public class Drawingpanel extends JPanel {

	public Rectangle2D colorsquare = new Rectangle2D.Double(0, 0, 0, 0);
	public Line2D line = new Line2D.Double(0, 0, 0, 0);
	public Graphics2D g2;
	public static Color colora, colorb, colorc;
	public static ArrayList<String[]> cubesarray = new ArrayList<String[]>();

	public Drawingpanel() {
		this.setSize(new Dimension(450, 355));
		this.setMinimumSize(new Dimension(450, 355));
		this.setPreferredSize(new Dimension(450, 355));
		this.setMaximumSize(new Dimension(450, 355));
		this.setBackground(new Color(175, 200, 255));
		repaint();
	}

	public void showcube(ArrayList<String[]> c) {
		cubesarray = c;
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g2 = (Graphics2D) g;

		// EXPLORE THE CUBE
		for (int i = 0; i < cubesarray.size(); i++) {
			colora = null;
			colorb = null;
			colorc = null;

			// SET COLORS
			if (cubesarray.get(i)[0].contains("w")) {
				colora = Color.white;
			}
			if (cubesarray.get(i)[0].contains("y")) {
				colora = Color.yellow;
			}
			if (cubesarray.get(i)[0].contains("r")) {
				colorb = Color.red;
			}
			if (cubesarray.get(i)[0].contains("o")) {
				colorb = Color.orange;
			}
			if (cubesarray.get(i)[0].contains("b")) {
				colorc = Color.blue;
			}
			if (cubesarray.get(i)[0].contains("g")) {
				colorc = Color.green;
			}

			if (cubesarray.get(i)[0].length() == 3) {
				if (Integer.parseInt(cubesarray.get(i)[1]) == 1) {
					if (Integer.parseInt(cubesarray.get(i)[2]) == 1) {
						if (Integer.parseInt(cubesarray.get(i)[3]) == 1) {
							if (Integer.parseInt(cubesarray.get(i)[4]) == 1) {
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(191,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(225,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "boy")
										|| (cubesarray.get(i)[0] == "gry")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(191,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(225,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(191, 225,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
							if (Integer.parseInt(cubesarray.get(i)[5]) == 1) {
								if ((cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gry")
										|| (cubesarray.get(i)[0] == "boy")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(191,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(191,
											225, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "goy")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "bry")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(191,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(191,
											225, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(225, 191,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
							if (Integer.parseInt(cubesarray.get(i)[6]) == 1) {
								if ((cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "boy")
										|| (cubesarray.get(i)[0] == "gry")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(225,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(191,
											225, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(225,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(191,
											225, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(191, 191,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
						}
						if (Integer.parseInt(cubesarray.get(i)[3]) == -1) {
							if (Integer.parseInt(cubesarray.get(i)[4]) == 1) {
								if ((cubesarray.get(i)[0] == "boy")
										|| (cubesarray.get(i)[0] == "gry")
										|| (cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gow")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(291,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(325,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "goy")
										|| (cubesarray.get(i)[0] == "bow")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(291,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(325,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(191, 291,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
							if (Integer.parseInt(cubesarray.get(i)[5]) == 1) {
								if ((cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "goy")
										|| (cubesarray.get(i)[0] == "bry")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(191,
											291, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(325,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "gry")
										|| (cubesarray.get(i)[0] == "boy")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(191,
											291, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(325,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(291, 191,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
							if (Integer.parseInt(cubesarray.get(i)[6]) == -1) {
								if ((cubesarray.get(i)[0] == "gry")
										|| (cubesarray.get(i)[0] == "boy")
										|| (cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gow")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(191,
											291, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(291,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")
										|| (cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(191,
											291, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(291,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(325, 191,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
						}
					}
					if (Integer.parseInt(cubesarray.get(i)[2]) == -1) {
						if (Integer.parseInt(cubesarray.get(i)[3]) == 1) {
							if (Integer.parseInt(cubesarray.get(i)[4]) == 1) {
								if ((cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(125,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(91,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gry")
										|| (cubesarray.get(i)[0] == "boy")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(125,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(91,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(125, 225,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
							if (Integer.parseInt(cubesarray.get(i)[5]) == -1) {
								if ((cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "gry")
										|| (cubesarray.get(i)[0] == "boy")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(125,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(125,
											225, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(125,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(125,
											225, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(91, 191,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
							if (Integer.parseInt(cubesarray.get(i)[6]) == 1) {
								if ((cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "boy")
										|| (cubesarray.get(i)[0] == "gry")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(125,
											225, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(91,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(125,
											225, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(91,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(125, 191,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
						}
						if (Integer.parseInt(cubesarray.get(i)[3]) == -1) {
							if (Integer.parseInt(cubesarray.get(i)[4]) == 1) {
								if ((cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "goy")
										|| (cubesarray.get(i)[0] == "bry")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(25,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(391,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gry")
										|| (cubesarray.get(i)[0] == "boy")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(25,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(391,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(125, 291,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
							if (Integer.parseInt(cubesarray.get(i)[5]) == -1) {
								if ((cubesarray.get(i)[0] == "goy")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bow")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(125,
											291, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(391,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "boy")
										|| (cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gry")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(125,
											291, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(391,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(25, 191,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
							if (Integer.parseInt(cubesarray.get(i)[6]) == -1) {
								if ((cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "boy")
										|| (cubesarray.get(i)[0] == "gry")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(125,
											291, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(25,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(125,
											291, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(25,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(391, 191,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
						}
					}
				}
				if (Integer.parseInt(cubesarray.get(i)[1]) == -1) {
					if (Integer.parseInt(cubesarray.get(i)[2]) == 1) {
						if (Integer.parseInt(cubesarray.get(i)[3]) == 1) {
							if (Integer.parseInt(cubesarray.get(i)[4]) == -1) {
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(191,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(225,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gry")
										|| (cubesarray.get(i)[0] == "boy")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(191,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(225,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(191, 91,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
							if (Integer.parseInt(cubesarray.get(i)[5]) == 1) {
								if ((cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "boy")
										|| (cubesarray.get(i)[0] == "gry")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(191,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(191,
											91, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(191,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(191,
											91, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(225, 125,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
							if (Integer.parseInt(cubesarray.get(i)[6]) == 1) {
								if ((cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "boy")
										|| (cubesarray.get(i)[0] == "gry")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(191,
											91, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(225,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(191,
											91, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(225,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(191, 125,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
						}
						if (Integer.parseInt(cubesarray.get(i)[3]) == -1) {
							if (Integer.parseInt(cubesarray.get(i)[4]) == -1) {
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(291,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(325,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gry")
										|| (cubesarray.get(i)[0] == "boy")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(291,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(325,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(191, 25,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
							if (Integer.parseInt(cubesarray.get(i)[5]) == 1) {
								if ((cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "boy")
										|| (cubesarray.get(i)[0] == "gry")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(191,
											25, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(325,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(191,
											25, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(325,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(291, 125,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
							if (Integer.parseInt(cubesarray.get(i)[6]) == -1) {
								if ((cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "boy")
										|| (cubesarray.get(i)[0] == "gry")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(191,
											25, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(291,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(191,
											25, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(291,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(325, 125,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
						}
					}
					if (Integer.parseInt(cubesarray.get(i)[2]) == -1) {
						if (Integer.parseInt(cubesarray.get(i)[3]) == 1) {
							if (Integer.parseInt(cubesarray.get(i)[4]) == -1) {
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(125,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(91,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gry")
										|| (cubesarray.get(i)[0] == "boy")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(125,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(91,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(125, 91,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
							if (Integer.parseInt(cubesarray.get(i)[5]) == -1) {
								if ((cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "boy")
										|| (cubesarray.get(i)[0] == "gry")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(125,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(125,
											91, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(125,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(125,
											91, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(91, 125,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}

							if (Integer.parseInt(cubesarray.get(i)[6]) == 1) {
								if ((cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "boy")
										|| (cubesarray.get(i)[0] == "gry")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(125,
											91, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(91,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(125,
											91, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(91,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(125, 125,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
						}
						if (Integer.parseInt(cubesarray.get(i)[3]) == -1) {
							if (Integer.parseInt(cubesarray.get(i)[4]) == -1) {
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(25,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(391,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gry")
										|| (cubesarray.get(i)[0] == "boy")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(25,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(391,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(125, 25,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
							if (Integer.parseInt(cubesarray.get(i)[5]) == -1) {
								if ((cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "boy")
										|| (cubesarray.get(i)[0] == "gry")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(125,
											25, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(391,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(125,
											25, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(391,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(25, 125,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}

							if (Integer.parseInt(cubesarray.get(i)[6]) == -1) {
								if ((cubesarray.get(i)[0] == "brw")
										|| (cubesarray.get(i)[0] == "gow")
										|| (cubesarray.get(i)[0] == "boy")
										|| (cubesarray.get(i)[0] == "gry")) {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(25,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(125,
											25, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								if ((cubesarray.get(i)[0] == "bow")
										|| (cubesarray.get(i)[0] == "grw")
										|| (cubesarray.get(i)[0] == "bry")
										|| (cubesarray.get(i)[0] == "goy")) {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(25,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(125,
											25, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
								g2.setColor(colora);
								colorsquare = new Rectangle2D.Double(391, 125,
										33, 33);
								g2.draw(colorsquare);
								g2.fill(colorsquare);
							}
						}
					}
				}
			}

			// IF IT IS EDGE
			if (cubesarray.get(i)[0].length() == 2) {
				if (Integer.parseInt(cubesarray.get(i)[1]) == 0) {
					if (Integer.parseInt(cubesarray.get(i)[2]) == 1) {
						if (Integer.parseInt(cubesarray.get(i)[3]) == 1) {
							if (Integer.parseInt(cubesarray.get(i)[6]) == 1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(191,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												225, 158, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												225, 158, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(225,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(191,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
							if (Integer.parseInt(cubesarray.get(i)[5]) == 1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(225,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												191, 158, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												191, 158, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(191,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(225,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
						}
						if (Integer.parseInt(cubesarray.get(i)[3]) == -1) {
							if (Integer.parseInt(cubesarray.get(i)[6]) == -1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(325,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												291, 158, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												291, 158, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(291,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(325,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
							if (Integer.parseInt(cubesarray.get(i)[5]) == 1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(291,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												325, 158, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												325, 158, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(325,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(291,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
						}
					}
					if (Integer.parseInt(cubesarray.get(i)[2]) == -1) {
						if (Integer.parseInt(cubesarray.get(i)[3]) == 1) {
							if (Integer.parseInt(cubesarray.get(i)[6]) == 1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(125,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												91, 158, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												91, 158, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(91,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(125,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
							if (Integer.parseInt(cubesarray.get(i)[5]) == -1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(91,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												125, 158, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												125, 158, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(125,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(91,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
						}
						if (Integer.parseInt(cubesarray.get(i)[3]) == -1) {
							if (Integer.parseInt(cubesarray.get(i)[6]) == -1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(391,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												25, 158, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												25, 158, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(25,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(391,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
							if (Integer.parseInt(cubesarray.get(i)[5]) == -1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(25,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												391, 158, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												391, 158, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(391,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(25,
											158, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
						}
					}
				}
				if (Integer.parseInt(cubesarray.get(i)[2]) == 0) {
					if (Integer.parseInt(cubesarray.get(i)[1]) == 1) {
						if (Integer.parseInt(cubesarray.get(i)[3]) == 1) {
							if (Integer.parseInt(cubesarray.get(i)[6]) == 1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(158,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												158, 225, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												158, 225, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(158,
											225, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(158,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
							if (Integer.parseInt(cubesarray.get(i)[4]) == 1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(158,
											225, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												158, 191, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												158, 191, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(158,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(158,
											225, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
						}
						if (Integer.parseInt(cubesarray.get(i)[3]) == -1) {
							if (Integer.parseInt(cubesarray.get(i)[6]) == -1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(358,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												158, 291, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												158, 291, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(158,
											291, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(358,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
							if (Integer.parseInt(cubesarray.get(i)[4]) == 1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(158,
											291, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												358, 191, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												358, 191, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(358,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(158,
											291, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
						}
					}
					if (Integer.parseInt(cubesarray.get(i)[1]) == -1) {
						if (Integer.parseInt(cubesarray.get(i)[3]) == 1) {
							if (Integer.parseInt(cubesarray.get(i)[6]) == 1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(158,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												158, 91, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												158, 91, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(158,
											91, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(158,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
							if (Integer.parseInt(cubesarray.get(i)[4]) == -1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(158,
											91, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												158, 125, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												158, 125, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(158,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(158,
											91, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
						}
						if (Integer.parseInt(cubesarray.get(i)[3]) == -1) {
							if (Integer.parseInt(cubesarray.get(i)[6]) == -1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(358,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												158, 25, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												158, 25, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(158,
											25, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(358,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
							if (Integer.parseInt(cubesarray.get(i)[4]) == -1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(158,
											25, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												358, 125, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												358, 125, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(358,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(158,
											25, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
						}
					}
				}
				if (Integer.parseInt(cubesarray.get(i)[3]) == 0) {
					if (Integer.parseInt(cubesarray.get(i)[1]) == 1) {
						if (Integer.parseInt(cubesarray.get(i)[2]) == 1) {
							if (Integer.parseInt(cubesarray.get(i)[4]) == 1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(191,
											258, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												258, 191, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												258, 191, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(191,
											258, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(258,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
							if (Integer.parseInt(cubesarray.get(i)[5]) == 1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(258,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												191, 258, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												191, 258, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(191,
											258, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(258,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
						}
						if (Integer.parseInt(cubesarray.get(i)[2]) == -1) {
							if (Integer.parseInt(cubesarray.get(i)[4]) == 1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(125,
											258, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												58, 191, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												58, 191, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(58,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(125,
											258, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
							if (Integer.parseInt(cubesarray.get(i)[5]) == -1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(58,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												125, 258, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												125, 258, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(125,
											258, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(58,
											191, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
						}
					}
					if (Integer.parseInt(cubesarray.get(i)[1]) == -1) {
						if (Integer.parseInt(cubesarray.get(i)[2]) == 1) {
							if (Integer.parseInt(cubesarray.get(i)[4]) == -1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(191,
											58, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												258, 125, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												258, 125, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(258,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(191,
											58, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
							if (Integer.parseInt(cubesarray.get(i)[5]) == 1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(258,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												191, 58, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												191, 58, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(191,
											58, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(258,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
						}
						if (Integer.parseInt(cubesarray.get(i)[2]) == -1) {
							if (Integer.parseInt(cubesarray.get(i)[4]) == -1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(125,
											58, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												58, 125, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												58, 125, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(58,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(125,
											58, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
							if (Integer.parseInt(cubesarray.get(i)[5]) == -1) {
								if (colora != null) {
									g2.setColor(colora);
									colorsquare = new Rectangle2D.Double(58,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									if (colorc == null) {
										g2.setColor(colorb);
										colorsquare = new Rectangle2D.Double(
												125, 58, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
									if (colorb == null) {
										g2.setColor(colorc);
										colorsquare = new Rectangle2D.Double(
												125, 58, 33, 33);
										g2.draw(colorsquare);
										g2.fill(colorsquare);
									}
								} else {
									g2.setColor(colorc);
									colorsquare = new Rectangle2D.Double(125,
											58, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
									g2.setColor(colorb);
									colorsquare = new Rectangle2D.Double(58,
											125, 33, 33);
									g2.draw(colorsquare);
									g2.fill(colorsquare);
								}
							}
						}
					}
				}
			}
		}

		// PAINT CENTERS
		g2.setColor(Color.green);
		colorsquare = new Rectangle2D.Double(58, 158, 33, 33);
		g2.draw(colorsquare);
		g2.fill(colorsquare);
		g2.setColor(Color.white);
		colorsquare = new Rectangle2D.Double(158, 158, 33, 33);
		g2.draw(colorsquare);
		g2.fill(colorsquare);
		g2.setColor(Color.blue);
		colorsquare = new Rectangle2D.Double(258, 158, 33, 33);
		g2.draw(colorsquare);
		g2.fill(colorsquare);
		g2.setColor(Color.yellow);
		colorsquare = new Rectangle2D.Double(358, 158, 33, 33);
		g2.draw(colorsquare);
		g2.fill(colorsquare);
		g2.setColor(Color.red);
		colorsquare = new Rectangle2D.Double(158, 258, 33, 33);
		g2.draw(colorsquare);
		g2.fill(colorsquare);
		g2.setColor(Color.orange);
		colorsquare = new Rectangle2D.Double(158, 58, 33, 33);
		g2.draw(colorsquare);
		g2.fill(colorsquare);

		// DRAW BLACK LINES
		g2.setColor(Color.black);
		line = new Line2D.Double(25, 125, 425, 125);
		g2.draw(line);
		line = new Line2D.Double(25, 126, 425, 126);
		g2.draw(line);
		line = new Line2D.Double(25, 124, 425, 124);
		g2.draw(line);
		line = new Line2D.Double(25, 158, 425, 158);
		g2.draw(line);
		line = new Line2D.Double(25, 191, 425, 191);
		g2.draw(line);
		line = new Line2D.Double(25, 224, 425, 224);
		g2.draw(line);
		line = new Line2D.Double(25, 225, 425, 225);
		g2.draw(line);
		line = new Line2D.Double(25, 226, 425, 226);
		g2.draw(line);
		line = new Line2D.Double(125, 24, 225, 24);
		g2.draw(line);
		line = new Line2D.Double(125, 25, 225, 25);
		g2.draw(line);
		line = new Line2D.Double(125, 26, 225, 26);
		g2.draw(line);
		line = new Line2D.Double(125, 58, 225, 58);
		g2.draw(line);
		line = new Line2D.Double(125, 91, 225, 91);
		g2.draw(line);
		line = new Line2D.Double(125, 258, 225, 258);
		g2.draw(line);
		line = new Line2D.Double(125, 291, 225, 291);
		g2.draw(line);
		line = new Line2D.Double(125, 324, 225, 324);
		g2.draw(line);
		line = new Line2D.Double(125, 325, 225, 325);
		g2.draw(line);
		line = new Line2D.Double(125, 326, 225, 326);
		g2.draw(line);
		line = new Line2D.Double(24, 125, 24, 225);
		g2.draw(line);
		line = new Line2D.Double(25, 125, 25, 225);
		g2.draw(line);
		line = new Line2D.Double(26, 125, 26, 225);
		g2.draw(line);
		line = new Line2D.Double(58, 125, 58, 225);
		g2.draw(line);
		line = new Line2D.Double(91, 125, 91, 225);
		g2.draw(line);
		line = new Line2D.Double(124, 25, 124, 325);
		g2.draw(line);
		line = new Line2D.Double(125, 25, 125, 325);
		g2.draw(line);
		line = new Line2D.Double(126, 25, 126, 325);
		g2.draw(line);
		line = new Line2D.Double(158, 25, 158, 325);
		g2.draw(line);
		line = new Line2D.Double(191, 25, 191, 325);
		g2.draw(line);
		line = new Line2D.Double(224, 25, 224, 325);
		g2.draw(line);
		line = new Line2D.Double(225, 25, 225, 325);
		g2.draw(line);
		line = new Line2D.Double(226, 25, 226, 325);
		g2.draw(line);
		line = new Line2D.Double(258, 125, 258, 225);
		g2.draw(line);
		line = new Line2D.Double(291, 125, 291, 225);
		g2.draw(line);
		line = new Line2D.Double(324, 125, 324, 225);
		g2.draw(line);
		line = new Line2D.Double(325, 125, 325, 225);
		g2.draw(line);
		line = new Line2D.Double(326, 125, 326, 225);
		g2.draw(line);
		line = new Line2D.Double(358, 125, 358, 225);
		g2.draw(line);
		line = new Line2D.Double(391, 125, 391, 225);
		g2.draw(line);
		line = new Line2D.Double(424, 125, 424, 225);
		g2.draw(line);
		line = new Line2D.Double(425, 125, 425, 225);
		g2.draw(line);
		line = new Line2D.Double(426, 125, 426, 225);
		g2.draw(line);
	}
}
