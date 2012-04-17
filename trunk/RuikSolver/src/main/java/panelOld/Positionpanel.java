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
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import cube.RubikCube;

/**
 * This class lets the user draw the cube manually, instead of set the pieces
 * information one by one.
 * 
 * @author Oliver Hijano
 * 
 */
public class Positionpanel extends JPanel {

	public Color color = Color.white;
	public static Color colora, colorb, colorc;
	public JPanel northpanel = new JPanel(), southpanel = new JPanel(),
			undersouthpanel = new JPanel();
	public String piecename = "", lettera = "", letterb = "", letterc;
	public final JComboBox colorcombo;
	public final JButton okbutton, exitbutton;
	public Mousepositionpanel mouselistener = new Mousepositionpanel();
	public JLabel infoa, infob;
	public ArrayList<JPanel> panelarray = new ArrayList<JPanel>();
	public static int posx, posy, posz, dirx, diry, dirz;
	public static boolean hasWhiteYellow;

	/**
	 * Positionpanel is started here.
	 * 
	 * @param frame
	 */
	public Positionpanel(final JFrame frame) {
		addMouseListener(mouselistener);
		setSize(new Dimension(450, 420));
		setMinimumSize(new Dimension(450, 420));
		setPreferredSize(new Dimension(450, 420));
		setMaximumSize(new Dimension(450, 420));
		setBackground(new Color(175, 200, 255));

		createPanelNet();

		northpanel.setSize(new Dimension(400, 300));
		northpanel.setMinimumSize(new Dimension(400, 300));
		northpanel.setPreferredSize(new Dimension(400, 300));
		northpanel.setMaximumSize(new Dimension(400, 300));
		northpanel.setBackground(new Color(175, 200, 255));
		southpanel.setSize(new Dimension(450, 70));
		southpanel.setMinimumSize(new Dimension(450, 70));
		southpanel.setPreferredSize(new Dimension(450, 70));
		southpanel.setMaximumSize(new Dimension(450, 70));
		southpanel.setBackground(new Color(175, 200, 255));
		southpanel.setLayout(new FlowLayout());
		add(Box.createRigidArea(new Dimension(25, 25)));
		add(northpanel);
		add(Box.createRigidArea(new Dimension(0, 25)));
		add(southpanel);
		southpanel.setLayout(new FlowLayout());
		northpanel.setLayout(new GridLayout(3, 3));
		undersouthpanel.setLayout(new GridLayout(2, 1));
		undersouthpanel.setBackground(new Color(175, 200, 255));

		colorcombo = new JComboBox();
		colorcombo.addItem(" Blue");
		colorcombo.addItem(" Red");
		colorcombo.addItem(" White");
		colorcombo.addItem(" Green");
		colorcombo.addItem(" Orange");
		colorcombo.addItem(" Yellow");
		colorcombo.setSelectedIndex(2);
		colorcombo.setBackground(Color.white);
		colorcombo.setMinimumSize(new Dimension(100, 20));
		colorcombo.setPreferredSize(new Dimension(100, 20));
		colorcombo.setMaximumSize(new Dimension(100, 20));
		southpanel.add(colorcombo);
		colorcombo.addMouseListener(mouselistener);
		colorcombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (colorcombo.getSelectedItem() == " Blue") {
					colorcombo.setBackground(Color.blue);
					okbutton.setBorder(new MatteBorder(2, 2, 2, 2, Color.blue));
					exitbutton
							.setBorder(new MatteBorder(2, 2, 2, 2, Color.blue));
					color = color.blue;
				}
				if (colorcombo.getSelectedItem() == " Red") {
					colorcombo.setBackground(Color.red);
					okbutton.setBorder(new MatteBorder(2, 2, 2, 2, Color.red));
					exitbutton
							.setBorder(new MatteBorder(2, 2, 2, 2, Color.red));
					color = color.red;
				}
				if (colorcombo.getSelectedItem() == " White") {
					colorcombo.setBackground(Color.white);
					okbutton
							.setBorder(new MatteBorder(2, 2, 2, 2, Color.white));
					exitbutton.setBorder(new MatteBorder(2, 2, 2, 2,
							Color.white));
					color = color.white;
				}
				if (colorcombo.getSelectedItem() == " Green") {
					colorcombo.setBackground(Color.green);
					okbutton
							.setBorder(new MatteBorder(2, 2, 2, 2, Color.green));
					exitbutton.setBorder(new MatteBorder(2, 2, 2, 2,
							Color.green));
					color = color.green;
				}
				if (colorcombo.getSelectedItem() == " Orange") {
					colorcombo.setBackground(Color.orange);
					okbutton
							.setBorder(new MatteBorder(2, 2, 2, 2, Color.orange));
					exitbutton.setBorder(new MatteBorder(2, 2, 2, 2,
							Color.orange));
					color = color.orange;
				}
				if (colorcombo.getSelectedItem() == " Yellow") {
					colorcombo.setBackground(Color.yellow);
					okbutton
							.setBorder(new MatteBorder(2, 2, 2, 2, Color.yellow));
					exitbutton.setBorder(new MatteBorder(2, 2, 2, 2,
							Color.yellow));
					color = color.yellow;
				}
			}
		});

		okbutton = new JButton("  Ok  ");
		exitbutton = new JButton("  Cancel  ");
		okbutton.setMinimumSize(new Dimension(100, 20));
		okbutton.setPreferredSize(new Dimension(100, 20));
		okbutton.setMaximumSize(new Dimension(100, 20));
		exitbutton.setMinimumSize(new Dimension(100, 20));
		exitbutton.setPreferredSize(new Dimension(100, 20));
		exitbutton.setMaximumSize(new Dimension(100, 20));
		southpanel.add(okbutton);
		southpanel.add(exitbutton);
		okbutton.setBorder(new MatteBorder(2, 2, 2, 2, Color.white));
		exitbutton.setBorder(new MatteBorder(2, 2, 2, 2, Color.white));
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < panelarray.size(); i++) {
					if (i != 4 && i != 13 && i != 22 && i != 31 && i != 40
							&& i != 49) {
						panelarray.get(i).setBackground(
								new Color(175, 200, 255));
					}
				}
				frame.setVisible(false);
			}
		});
		okbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPanelNetColors();
				frame.setVisible(false);
			}
		});

		infoa = new JLabel(
				"WARNING: The user must be sure the cube drawn is possible,");
		infoa.setFont(new Font("Serif", Font.BOLD, 14));
		infoa.setForeground(Color.red);
		undersouthpanel.add(infoa);
		infob = new JLabel("if not, the package may not work correctly.");
		infob.setFont(new Font("Serif", Font.BOLD, 14));
		infob.setForeground(Color.red);
		undersouthpanel.add(infob);
		southpanel.add(undersouthpanel);
	}

	/**
	 * Prepares everything the user needs in order to draw the cube manually.
	 */
	private void createPanelNet() {
		JPanel panel11 = new JPanel();
		JPanel panel12 = new JPanel();
		JPanel panel13 = new JPanel();
		JPanel panel14 = new JPanel();
		JPanel panel21 = new JPanel();
		JPanel panel22 = new JPanel();
		JPanel panel23 = new JPanel();
		JPanel panel24 = new JPanel();
		JPanel panel31 = new JPanel();
		JPanel panel32 = new JPanel();
		JPanel panel33 = new JPanel();
		JPanel panel34 = new JPanel();
		panel11.setBackground(new Color(175, 200, 255));
		panel12.setBackground(new Color(175, 200, 255));
		panel13.setBackground(new Color(175, 200, 255));
		panel14.setBackground(new Color(175, 200, 255));
		panel21.setBackground(new Color(175, 200, 255));
		panel22.setBackground(new Color(175, 200, 255));
		panel23.setBackground(new Color(175, 200, 255));
		panel24.setBackground(new Color(175, 200, 255));
		panel31.setBackground(new Color(175, 200, 255));
		panel32.setBackground(new Color(175, 200, 255));
		panel33.setBackground(new Color(175, 200, 255));
		panel34.setBackground(new Color(175, 200, 255));
		panel11.setLayout(new GridLayout(3, 3));
		panel12.setLayout(new GridLayout(3, 3));
		panel13.setLayout(new GridLayout(3, 3));
		panel14.setLayout(new GridLayout(3, 3));
		panel21.setLayout(new GridLayout(3, 3));
		panel22.setLayout(new GridLayout(3, 3));
		panel23.setLayout(new GridLayout(3, 3));
		panel24.setLayout(new GridLayout(3, 3));
		panel31.setLayout(new GridLayout(3, 3));
		panel32.setLayout(new GridLayout(3, 3));
		panel33.setLayout(new GridLayout(3, 3));
		panel34.setLayout(new GridLayout(3, 3));

		northpanel.add(panel11);
		northpanel.add(panel12);
		northpanel.add(panel13);
		northpanel.add(panel14);
		northpanel.add(panel21);
		northpanel.add(panel22);
		northpanel.add(panel23);
		northpanel.add(panel24);
		northpanel.add(panel31);
		northpanel.add(panel32);
		northpanel.add(panel33);
		northpanel.add(panel34);

		String name = "";

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 9; k++) {
					name = "micropanel" + i + "" + j + "" + k + "";
					JPanel micropanel = new JPanel();
					micropanel.setName(name);
					micropanel.setBackground(new Color(175, 200, 255));
					if (i == 1) {
						if (j == 1) {
							panel11.add(micropanel);
						} else {
							if (j == 2) {
								panel12.add(micropanel);
								micropanel.setBorder(new MatteBorder(1, 1, 1,
										1, Color.black));
								panelarray.add(micropanel);
								if (k == 5) {
									micropanel.setBackground(Color.orange);
								}
							} else {
								if (j == 3) {
									panel13.add(micropanel);
								} else {
									panel14.add(micropanel);
								}
							}
						}
					} else {
						if (i == 2) {
							if (j == 1) {
								panel21.add(micropanel);
								micropanel.setBorder(new MatteBorder(1, 1, 1,
										1, Color.black));
								panelarray.add(micropanel);
								if (k == 5) {
									micropanel.setBackground(Color.green);
								}
							} else {
								if (j == 2) {
									panel22.add(micropanel);
									micropanel.setBorder(new MatteBorder(1, 1,
											1, 1, Color.black));
									panelarray.add(micropanel);
									if (k == 5) {
										micropanel.setBackground(Color.white);
									}
								} else {
									if (j == 3) {
										panel23.add(micropanel);
										micropanel.setBorder(new MatteBorder(1,
												1, 1, 1, Color.black));
										panelarray.add(micropanel);
										if (k == 5) {
											micropanel
													.setBackground(Color.blue);
										}
									} else {
										panel24.add(micropanel);
										micropanel.setBorder(new MatteBorder(1,
												1, 1, 1, Color.black));
										panelarray.add(micropanel);
										if (k == 5) {
											micropanel
													.setBackground(Color.yellow);
										}
									}
								}
							}
						} else {
							if (j == 1) {
								panel31.add(micropanel);
							} else {
								if (j == 2) {
									panel32.add(micropanel);
									micropanel.setBorder(new MatteBorder(1, 1,
											1, 1, Color.black));
									panelarray.add(micropanel);
									if (k == 5) {
										micropanel.setBackground(Color.red);
									}
								} else {
									if (j == 3) {
										panel33.add(micropanel);
									} else {
										panel34.add(micropanel);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * Reads the cube drawn by the user manually, and call the methods which
	 * will read the picture.
	 */
	private void getPanelNetColors() {
		setUpCorners();
		setDownCorners();
		setUpEdges();
		setDownEdges();
		setMiddleEdges();
	}

	/**
	 * Reads the cube drawn by the user manually, and sets the coordinates of
	 * the up corners.
	 */
	private void setUpCorners() {
		posx = 1;
		posy = 1;
		posz = 1;
		dirx = 0;
		diry = 0;
		dirz = 0;
		if (panelarray.get(26).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirz = 1;
		}
		if (panelarray.get(26).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirz = 1;
		}
		if (panelarray.get(26).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(26).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(26).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(26).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(33).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = 1;
		}
		if (panelarray.get(33).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = 1;
		}
		if (panelarray.get(33).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(33).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(33).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(33).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(47).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirx = 1;
		}
		if (panelarray.get(47).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirx = 1;
		}
		if (panelarray.get(47).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(47).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(47).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(47).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);

		posx = -1;
		posy = 1;
		posz = 1;
		dirx = 0;
		diry = 0;
		dirz = 0;
		if (panelarray.get(20).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirz = 1;
		}
		if (panelarray.get(20).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirz = 1;
		}
		if (panelarray.get(20).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(20).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(20).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(20).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(27).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = 1;
		}
		if (panelarray.get(27).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = 1;
		}
		if (panelarray.get(27).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(27).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(27).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(27).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(8).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirx = -1;
		}
		if (panelarray.get(8).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirx = -1;
		}
		if (panelarray.get(8).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(8).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(8).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(8).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);

		posx = -1;
		posy = -1;
		posz = 1;
		dirx = 0;
		diry = 0;
		dirz = 0;
		if (panelarray.get(18).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirz = 1;
		}
		if (panelarray.get(18).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirz = 1;
		}
		if (panelarray.get(18).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(18).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(18).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(18).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(11).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = -1;
		}
		if (panelarray.get(11).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = -1;
		}
		if (panelarray.get(11).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(11).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(11).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(11).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(6).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirx = -1;
		}
		if (panelarray.get(6).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirx = -1;
		}
		if (panelarray.get(6).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(6).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(6).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(6).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);

		posx = 1;
		posy = -1;
		posz = 1;
		dirx = 0;
		diry = 0;
		dirz = 0;
		if (panelarray.get(24).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirz = 1;
		}
		if (panelarray.get(24).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirz = 1;
		}
		if (panelarray.get(24).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(24).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(24).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(24).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(17).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = -1;
		}
		if (panelarray.get(17).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = -1;
		}
		if (panelarray.get(17).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(17).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(17).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(17).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(45).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirx = 1;
		}
		if (panelarray.get(45).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirx = 1;
		}
		if (panelarray.get(45).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(45).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(45).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(45).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);
	}

	/**
	 * Reads the cube drawn by the user manually, and sets the coordinates of
	 * the down corners.
	 */
	private void setDownCorners() {
		posx = 1;
		posy = 1;
		posz = -1;
		dirx = 0;
		diry = 0;
		dirz = 0;
		if (panelarray.get(42).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirz = -1;
		}
		if (panelarray.get(42).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirz = -1;
		}
		if (panelarray.get(42).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(42).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(42).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(42).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(35).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = 1;
		}
		if (panelarray.get(35).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = 1;
		}
		if (panelarray.get(35).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(35).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(35).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(35).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(53).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirx = 1;
		}
		if (panelarray.get(53).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirx = 1;
		}
		if (panelarray.get(53).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(53).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(53).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(53).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);

		posx = -1;
		posy = 1;
		posz = -1;
		dirx = 0;
		diry = 0;
		dirz = 0;
		if (panelarray.get(36).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirz = -1;
		}
		if (panelarray.get(36).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirz = -1;
		}
		if (panelarray.get(36).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(36).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(36).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(36).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(29).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = 1;
		}
		if (panelarray.get(29).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = 1;
		}
		if (panelarray.get(29).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(29).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(29).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(29).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(2).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirx = -1;
		}
		if (panelarray.get(2).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirx = -1;
		}
		if (panelarray.get(2).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(2).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(2).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(2).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);

		posx = -1;
		posy = -1;
		posz = -1;
		dirx = 0;
		diry = 0;
		dirz = 0;
		if (panelarray.get(38).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirz = -1;
		}
		if (panelarray.get(38).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirz = -1;
		}
		if (panelarray.get(38).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(38).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(38).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(38).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(9).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = -1;
		}
		if (panelarray.get(9).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = -1;
		}
		if (panelarray.get(9).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(9).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(9).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(9).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(0).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirx = -1;
		}
		if (panelarray.get(0).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirx = -1;
		}
		if (panelarray.get(0).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(0).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(0).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(0).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);

		posx = 1;
		posy = -1;
		posz = -1;
		dirx = 0;
		diry = 0;
		dirz = 0;
		if (panelarray.get(44).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirz = -1;
		}
		if (panelarray.get(44).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirz = -1;
		}
		if (panelarray.get(44).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(44).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(44).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(44).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(51).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirx = 1;
		}
		if (panelarray.get(51).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirx = 1;
		}
		if (panelarray.get(51).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(51).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(51).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(51).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(15).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = -1;
		}
		if (panelarray.get(15).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = -1;
		}
		if (panelarray.get(15).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
		}
		if (panelarray.get(15).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
		}
		if (panelarray.get(15).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(15).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);
	}

	/**
	 * Reads the cube drawn by the user manually, and sets the coordinates of
	 * the up edges.
	 */
	private void setUpEdges() {
		posx = 1;
		posy = 0;
		posz = 1;
		dirx = 0;
		diry = 0;
		dirz = 0;
		lettera = "";
		letterb = "";
		letterc = "";
		hasWhiteYellow = false;
		if (panelarray.get(25).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirz = 1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(25).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirz = 1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(25).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				dirz = 1;
			}
		}
		if (panelarray.get(25).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				dirz = 1;
			}
		}
		if (panelarray.get(25).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(25).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(46).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirx = 1;
			dirz = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(46).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirx = 1;
			dirz = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(46).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				dirx = 1;
				dirz = 0;
			}
		}
		if (panelarray.get(46).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				dirx = 1;
				dirz = 0;
			}
		}
		if (panelarray.get(46).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(46).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);

		posx = 0;
		posy = 1;
		posz = 1;
		dirx = 0;
		diry = 0;
		dirz = 0;
		lettera = "";
		letterb = "";
		letterc = "";
		hasWhiteYellow = false;
		if (panelarray.get(23).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirz = 1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(23).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirz = 1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(23).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				dirz = 1;
			}
		}
		if (panelarray.get(23).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				dirz = 1;
			}
		}
		if (panelarray.get(23).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(23).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(30).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = 1;
			dirz = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(30).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = 1;
			dirz = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(30).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				diry = 1;
				dirz = 0;
			}
		}
		if (panelarray.get(30).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				diry = 1;
				dirz = 0;
			}
		}
		if (panelarray.get(30).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(30).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);

		posx = -1;
		posy = 0;
		posz = 1;
		dirx = 0;
		diry = 0;
		dirz = 0;
		lettera = "";
		letterb = "";
		letterc = "";
		hasWhiteYellow = false;
		if (panelarray.get(19).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirz = 1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(19).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirz = 1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(19).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				dirz = 1;
			}
		}
		if (panelarray.get(19).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				dirz = 1;
			}
		}
		if (panelarray.get(19).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(19).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(7).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirx = -1;
			dirz = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(7).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirx = -1;
			dirz = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(7).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				dirx = -1;
				dirz = 0;
			}
		}
		if (panelarray.get(7).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				dirx = -1;
				dirz = 0;
			}
		}
		if (panelarray.get(7).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(7).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);

		posx = 0;
		posy = -1;
		posz = 1;
		dirx = 0;
		diry = 0;
		dirz = 0;
		lettera = "";
		letterb = "";
		letterc = "";
		hasWhiteYellow = false;
		if (panelarray.get(21).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirz = 1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(21).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirz = 1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(21).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				dirz = 1;
			}
		}
		if (panelarray.get(21).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				dirz = 1;
			}
		}
		if (panelarray.get(21).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(21).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(14).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = -1;
			dirz = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(14).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = -1;
			dirz = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(14).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				diry = -1;
				dirz = 0;
			}
		}
		if (panelarray.get(14).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				diry = -1;
				dirz = 0;
			}
		}
		if (panelarray.get(14).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(14).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);
	}

	/**
	 * Reads the cube drawn by the user manually, and sets the coordinates of
	 * the down edges.
	 */
	private void setDownEdges() {
		posx = 1;
		posy = 0;
		posz = -1;
		dirx = 0;
		diry = 0;
		dirz = 0;
		lettera = "";
		letterb = "";
		letterc = "";
		hasWhiteYellow = false;
		if (panelarray.get(43).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirz = -1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(43).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirz = -1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(43).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				dirz = -1;
			}
		}
		if (panelarray.get(43).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				dirz = -1;
			}
		}
		if (panelarray.get(43).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(43).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(52).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirx = 1;
			dirz = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(52).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirx = 1;
			dirz = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(52).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				dirx = 1;
				dirz = 0;
			}
		}
		if (panelarray.get(52).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				dirx = 1;
				dirz = 0;
			}
		}
		if (panelarray.get(52).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(52).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);

		posx = 0;
		posy = 1;
		posz = -1;
		dirx = 0;
		diry = 0;
		dirz = 0;
		lettera = "";
		letterb = "";
		letterc = "";
		hasWhiteYellow = false;
		if (panelarray.get(32).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = 1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(32).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = 1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(32).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				diry = 1;
			}
		}
		if (panelarray.get(32).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				diry = 1;
			}
		}
		if (panelarray.get(32).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(32).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(39).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = 0;
			dirz = -1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(39).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = 0;
			dirz = -1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(39).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				diry = 0;
				dirz = -1;
			}
		}
		if (panelarray.get(39).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				diry = 0;
				dirz = -1;
			}
		}
		if (panelarray.get(39).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(39).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);

		posx = 0;
		posy = -1;
		posz = -1;
		dirx = 0;
		diry = 0;
		dirz = 0;
		lettera = "";
		letterb = "";
		letterc = "";
		hasWhiteYellow = false;
		if (panelarray.get(41).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirz = -1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(41).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirz = -1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(41).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				dirz = -1;
			}
		}
		if (panelarray.get(41).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				dirz = -1;
			}
		}
		if (panelarray.get(41).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(41).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(12).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = -1;
			dirz = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(12).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = -1;
			dirz = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(12).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				diry = -1;
				dirz = 0;
			}
		}
		if (panelarray.get(12).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				diry = -1;
				dirz = 0;
			}
		}
		if (panelarray.get(12).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(12).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);

		posx = -1;
		posy = 0;
		posz = -1;
		dirx = 0;
		diry = 0;
		dirz = 0;
		lettera = "";
		letterb = "";
		letterc = "";
		hasWhiteYellow = false;
		if (panelarray.get(37).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirz = -1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(37).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirz = -1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(37).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				dirz = -1;
			}
		}
		if (panelarray.get(37).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				dirz = -1;
			}
		}
		if (panelarray.get(37).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(37).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(1).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirx = -1;
			dirz = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(1).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirx = -1;
			dirz = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(1).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				dirx = -1;
				dirz = 0;
			}
		}
		if (panelarray.get(1).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				dirx = -1;
				dirz = 0;
			}
		}
		if (panelarray.get(1).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(1).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);
	}

	/**
	 * Reads the cube drawn by the user manually, and sets the coordinates of
	 * the middle edges.
	 */
	private void setMiddleEdges() {
		posx = 1;
		posy = 1;
		posz = 0;
		dirx = 0;
		diry = 0;
		dirz = 0;
		lettera = "";
		letterb = "";
		letterc = "";
		hasWhiteYellow = false;
		if (panelarray.get(50).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirx = 1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(50).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirx = 1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(50).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				dirx = 1;
			}
		}
		if (panelarray.get(50).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				dirx = 1;
			}
		}
		if (panelarray.get(50).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(50).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(34).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = 1;
			dirx = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(34).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = 1;
			dirx = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(34).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				diry = 1;
				dirx = 0;
			}
		}
		if (panelarray.get(34).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				diry = 1;
				dirx = 0;
			}
		}
		if (panelarray.get(34).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(34).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);

		posx = -1;
		posy = 1;
		posz = 0;
		dirx = 0;
		diry = 0;
		dirz = 0;
		lettera = "";
		letterb = "";
		letterc = "";
		hasWhiteYellow = false;
		if (panelarray.get(5).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirx = -1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(5).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirx = -1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(5).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				dirx = -1;
			}
		}
		if (panelarray.get(5).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				dirx = -1;
			}
		}
		if (panelarray.get(5).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(5).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(28).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = 1;
			dirx = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(28).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = 1;
			dirx = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(28).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				diry = 1;
				dirx = 0;
			}
		}
		if (panelarray.get(28).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				diry = 1;
				dirx = 0;
			}
		}
		if (panelarray.get(28).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(28).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);

		posx = -1;
		posy = -1;
		posz = 0;
		dirx = 0;
		diry = 0;
		dirz = 0;
		lettera = "";
		letterb = "";
		letterc = "";
		hasWhiteYellow = false;
		if (panelarray.get(3).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirx = -1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(3).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirx = -1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(3).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				dirx = -1;
			}
		}
		if (panelarray.get(3).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				dirx = -1;
			}
		}
		if (panelarray.get(3).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(3).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(10).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = -1;
			dirx = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(10).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = -1;
			dirx = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(10).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				diry = -1;
				dirx = 0;
			}
		}
		if (panelarray.get(10).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				diry = -1;
				dirx = 0;
			}
		}
		if (panelarray.get(10).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(10).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);

		posx = 1;
		posy = -1;
		posz = 0;
		dirx = 0;
		diry = 0;
		dirz = 0;
		lettera = "";
		letterb = "";
		letterc = "";
		hasWhiteYellow = false;
		if (panelarray.get(48).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			dirx = 1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(48).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			dirx = 1;
			hasWhiteYellow = true;
		}
		if (panelarray.get(48).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				dirx = 1;
			}
		}
		if (panelarray.get(48).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				dirx = 1;
			}
		}
		if (panelarray.get(48).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(48).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		if (panelarray.get(16).getBackground() == Color.white) {
			colora = Color.white;
			letterc = "w";
			diry = -1;
			dirx = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(16).getBackground() == Color.yellow) {
			colora = Color.yellow;
			letterc = "y";
			diry = -1;
			dirx = 0;
			hasWhiteYellow = true;
		}
		if (panelarray.get(16).getBackground() == Color.red) {
			colorb = Color.red;
			letterb = "r";
			if (!hasWhiteYellow) {
				diry = -1;
				dirx = 0;
			}
		}
		if (panelarray.get(16).getBackground() == Color.orange) {
			colorb = Color.orange;
			letterb = "o";
			if (!hasWhiteYellow) {
				diry = -1;
				dirx = 0;
			}
		}
		if (panelarray.get(16).getBackground() == Color.green) {
			colorc = Color.green;
			lettera = "g";
		}
		if (panelarray.get(16).getBackground() == Color.blue) {
			colorc = Color.blue;
			lettera = "b";
		}
		piecename = lettera + letterb + letterc;
		RubikCube.setPieceInformation(piecename, posx, posy, posz, dirx, diry,
				dirz);
	}

	/**
	 * Lets the user set the cube's colors manually, by using the mouse.
	 * 
	 * @author Oliver Hijano
	 * 
	 */
	public class Mousepositionpanel implements MouseListener {

		public void mouseClicked(MouseEvent e) {
			for (int i = 0; i < panelarray.size(); i++) {
				if (panelarray.get(i).getMousePosition() != null) {
					if (i != 4 && i != 13 && i != 22 && i != 31 && i != 40
							&& i != 49) {
						panelarray.get(i).setBackground(color);
					}
				}
			}
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}
	}
}
