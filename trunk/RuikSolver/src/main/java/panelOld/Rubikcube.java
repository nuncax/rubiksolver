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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFrame;

/**
 * This class lets the user manipulate a 'virtual' Rubik's Cube. It is highly
 * recommended to read the THE_CUBE.pdf and USING_RUBIKCUBE_PACKAGE.pdf files.
 * Any comments, bugs or questions can be sent to: oliver_hijano@hotmail.com
 * 
 * @author Oliver Hijano
 * 
 */
public class Rubikcube {

	public static String[] brw = { "brw", "1", "1", "1", "0", "0", "1" },
			bow = { "bow", "-1", "1", "1", "0", "0", "1" }, gow = { "gow",
					"-1", "-1", "1", "0", "0", "1" }, grw = { "grw", "1", "-1",
					"1", "0", "0", "1" }, boy = { "boy", "-1", "1", "-1", "0",
					"0", "-1" },
			bry = { "bry", "1", "1", "-1", "0", "0", "-1" }, gry = { "gry",
					"1", "-1", "-1", "0", "0", "-1" }, goy = { "goy", "-1",
					"-1", "-1", "0", "0", "-1" }, rw = { "rw", "1", "0", "1",
					"0", "0", "1" },
			bw = { "bw", "0", "1", "1", "0", "0", "1" }, ow = { "ow", "-1",
					"0", "1", "0", "0", "1" }, gw = { "gw", "0", "-1", "1",
					"0", "0", "1" },
			br = { "br", "1", "1", "0", "1", "0", "0" }, bo = { "bo", "-1",
					"1", "0", "-1", "0", "0" }, go = { "go", "-1", "-1", "0",
					"-1", "0", "0" }, gr = { "gr", "1", "-1", "0", "1", "0",
					"0" }, ry = { "ry", "1", "0", "-1", "0", "0", "-1" },
			by = { "by", "0", "1", "-1", "0", "0", "-1" }, oy = { "oy", "-1",
					"0", "-1", "0", "0", "-1" }, gy = { "gy", "0", "-1", "-1",
					"0", "0", "-1" },
			Cw = { "Cw", "0", "0", "1", "0", "0", "1" }, Co = { "Co", "-1",
					"0", "0", "-1", "0", "0" }, Cb = { "Cb", "0", "1", "0",
					"0", "1", "0" },
			Cr = { "Cr", "1", "0", "0", "1", "0", "0" }, Cg = { "Cg", "0",
					"-1", "0", "0", "-1", "0" }, Cy = { "Cy", "0", "0", "-1",
					"0", "0", "-1" }, Bbrw = { "brw", "1", "1", "1", "0", "0",
					"1" }, Bbow = { "bow", "-1", "1", "1", "0", "0", "1" },
			Bgow = { "gow", "-1", "-1", "1", "0", "0", "1" }, Bgrw = { "grw",
					"1", "-1", "1", "0", "0", "1" }, Bboy = { "boy", "-1", "1",
					"-1", "0", "0", "-1" }, Bbry = { "bry", "1", "1", "-1",
					"0", "0", "-1" }, Bgry = { "gry", "1", "-1", "-1", "0",
					"0", "-1" }, Bgoy = { "goy", "-1", "-1", "-1", "0", "0",
					"-1" }, Brw = { "rw", "1", "0", "1", "0", "0", "1" },
			Bbw = { "bw", "0", "1", "1", "0", "0", "1" }, Bow = { "ow", "-1",
					"0", "1", "0", "0", "1" }, Bgw = { "gw", "0", "-1", "1",
					"0", "0", "1" },
			Bbr = { "br", "1", "1", "0", "1", "0", "0" }, Bbo = { "bo", "-1",
					"1", "0", "-1", "0", "0" }, Bgo = { "go", "-1", "-1", "0",
					"-1", "0", "0" }, Bgr = { "gr", "1", "-1", "0", "1", "0",
					"0" }, Bry = { "ry", "1", "0", "-1", "0", "0", "-1" },
			Bby = { "by", "0", "1", "-1", "0", "0", "-1" }, Boy = { "oy", "-1",
					"0", "-1", "0", "0", "-1" }, Bgy = { "gy", "0", "-1", "-1",
					"0", "0", "-1" }, BCw = { "Cw", "0", "0", "1", "0", "0",
					"1" }, BCo = { "Co", "-1", "0", "0", "-1", "0", "0" },
			BCb = { "Cb", "0", "1", "0", "0", "1", "0" }, BCr = { "Cr", "1",
					"0", "0", "1", "0", "0" }, BCg = { "Cg", "0", "-1", "0",
					"0", "-1", "0" }, BCy = { "Cy", "0", "0", "-1", "0", "0",
					"-1" }, solbrw = { "brw", "1", "1", "1", "0", "0", "1" },
			solbow = { "bow", "-1", "1", "1", "0", "0", "1" }, solgow = {
					"gow", "-1", "-1", "1", "0", "0", "1" }, solgrw = { "grw",
					"1", "-1", "1", "0", "0", "1" }, solboy = { "boy", "-1",
					"1", "-1", "0", "0", "-1" }, solbry = { "bry", "1", "1",
					"-1", "0", "0", "-1" }, solgry = { "gry", "1", "-1", "-1",
					"0", "0", "-1" }, solgoy = { "goy", "-1", "-1", "-1", "0",
					"0", "-1" },
			solrw = { "rw", "1", "0", "1", "0", "0", "1" }, solbw = { "bw",
					"0", "1", "1", "0", "0", "1" }, solow = { "ow", "-1", "0",
					"1", "0", "0", "1" }, solgw = { "gw", "0", "-1", "1", "0",
					"0", "1" }, solbr = { "br", "1", "1", "0", "1", "0", "0" },
			solbo = { "bo", "-1", "1", "0", "-1", "0", "0" }, solgo = { "go",
					"-1", "-1", "0", "-1", "0", "0" }, solgr = { "gr", "1",
					"-1", "0", "1", "0", "0" }, solry = { "ry", "1", "0", "-1",
					"0", "0", "-1" }, solby = { "by", "0", "1", "-1", "0", "0",
					"-1" }, soloy = { "oy", "-1", "0", "-1", "0", "0", "-1" },
			solgy = { "gy", "0", "-1", "-1", "0", "0", "-1" }, solCw = { "Cw",
					"0", "0", "1", "0", "0", "1" }, solCo = { "Co", "-1", "0",
					"0", "-1", "0", "0" }, solCb = { "Cb", "0", "1", "0", "0",
					"1", "0" }, solCr = { "Cr", "1", "0", "0", "1", "0", "0" },
			solCg = { "Cg", "0", "-1", "0", "0", "-1", "0" }, solCy = { "Cy",
					"0", "0", "-1", "0", "0", "-1" };
	public static boolean isStarted = false;
	public static ArrayList<String[]> cubesarray = new ArrayList<String[]>();
	public static ArrayList<String[]> cubesarrayB = new ArrayList<String[]>();
	public static ArrayList<String[]> solvedarray = new ArrayList<String[]>();
	public static ArrayList<String> solutionarray = new ArrayList<String>();
	public static ArrayList<String> fungamearray = new ArrayList<String>();
	public static int auxiliarxpos, auxiliarypos, auxiliarzpos, auxiliarxdir,
			auxiliarydir, auxiliarzdir, numberofmovements = 0,
			randomnumber = 17, auxiliarrandomnumber = 16;
	public static JFrame frame = new JFrame("Rubik's cube current position");
	static JFrame frameposition = new JFrame("Rubik's cube position");
	public final static Drawingpanel drawingpanel = new Drawingpanel();
	final static Positionpanel positionpanel = new Positionpanel(frameposition);
	public static ClassicalMethodThread classicalmethodthread;
	public boolean isclassicalstarted = false;
	public static boolean goOn = true;

	/**
	 * Sets visible a JFrame which lets the user set the pieces using colors.
	 */
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
			cubesarray.add(brw);
			cubesarray.add(bow);
			cubesarray.add(gow);
			cubesarray.add(grw);
			cubesarray.add(boy);
			cubesarray.add(bry);
			cubesarray.add(gry);
			cubesarray.add(goy);
			cubesarray.add(rw);
			cubesarray.add(bw);
			cubesarray.add(ow);
			cubesarray.add(gw);
			cubesarray.add(br);
			cubesarray.add(bo);
			cubesarray.add(go);
			cubesarray.add(gr);
			cubesarray.add(ry);
			cubesarray.add(by);
			cubesarray.add(oy);
			cubesarray.add(gy);
			cubesarray.add(Cw);
			cubesarray.add(Cr);
			cubesarray.add(Cb);
			cubesarray.add(Cy);
			cubesarray.add(Co);
			cubesarray.add(Cg);

			cubesarrayB.add(Bbrw);
			cubesarrayB.add(Bbow);
			cubesarrayB.add(Bgow);
			cubesarrayB.add(Bgrw);
			cubesarrayB.add(Bboy);
			cubesarrayB.add(Bbry);
			cubesarrayB.add(Bgry);
			cubesarrayB.add(Bgoy);
			cubesarrayB.add(Brw);
			cubesarrayB.add(Bbw);
			cubesarrayB.add(Bow);
			cubesarrayB.add(Bgw);
			cubesarrayB.add(Bbr);
			cubesarrayB.add(Bbo);
			cubesarrayB.add(Bgo);
			cubesarrayB.add(Bgr);
			cubesarrayB.add(Bry);
			cubesarrayB.add(Bby);
			cubesarrayB.add(Boy);
			cubesarrayB.add(Bgy);
			cubesarrayB.add(BCw);
			cubesarrayB.add(BCr);
			cubesarrayB.add(BCb);
			cubesarrayB.add(BCy);
			cubesarrayB.add(BCo);
			cubesarrayB.add(BCg);

			solvedarray.add(solbrw);
			solvedarray.add(solbow);
			solvedarray.add(solgow);
			solvedarray.add(solgrw);
			solvedarray.add(solboy);
			solvedarray.add(solbry);
			solvedarray.add(solgry);
			solvedarray.add(solgoy);
			solvedarray.add(solrw);
			solvedarray.add(solbw);
			solvedarray.add(solow);
			solvedarray.add(solgw);
			solvedarray.add(solbr);
			solvedarray.add(solbo);
			solvedarray.add(solgo);
			solvedarray.add(solgr);
			solvedarray.add(solry);
			solvedarray.add(solby);
			solvedarray.add(soloy);
			solvedarray.add(solgy);
			solvedarray.add(solCw);
			solvedarray.add(solCr);
			solvedarray.add(solCb);
			solvedarray.add(solCy);
			solvedarray.add(solCo);
			solvedarray.add(solCg);

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
			classicalmethodthread = new ClassicalMethodThread();
			classicalmethodthread.setPriority(Thread.NORM_PRIORITY);
		}
	}

	/**
	 * Sets the pieces to their initial position.
	 */
	public void setSolvedPosition() {
		if (!isStarted) {
			start();
		}
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarray.get(i)[j] = solvedarray.get(i)[j];
			}
		}
	}

	/**
	 * Sets the pieces to their original position, the one set by the user using
	 * setPieceInformation(args) method.
	 */
	public void setOriginalPosition() {
		if (!isStarted) {
			start();
		}
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarray.get(i)[j] = cubesarrayB.get(i)[j];
			}
		}
	}

	/**
	 * Draws the extended cube, showing the current position of the pieces.
	 */
	public void drawCube() {
		if (!isStarted) {
			start();
		}
		if (!isclassicalstarted) {
			drawingpanel.showcube(cubesarray);
			frame.setVisible(true);
		} else {
			classicalmethodthread.drawCube(frame, drawingpanel, cubesarray);
		}
	}

	/**
	 * Hides the JFrame which is showing the cube extended. This frame is shown
	 * when the method drawCube() is called.
	 */
	public void hideCube() {
		if (!isStarted) {
			start();
		}
		frame.setVisible(false);
		frameposition.setVisible(false);
	}

	/**
	 * Gets the information of one piece. The user should sent seven Strings,
	 * the first one indicates the name of the piece, this name should be: "Cx"
	 * (Center which color is 'x'), or "xy" (Edge which colors are 'x' and 'y'),
	 * or "xyz" (Corner which colors are 'x', 'y' and 'z'. 'x', 'y' and 'z' are
	 * the first letter of the color the user wants to write, and they should be
	 * in alphabetical order. The second, third and fourth Strings contain the
	 * position of the piece in the cube. It is highly recommended to read the
	 * THE_CUBE.pdf file, so you will know how to set these coordinates. The
	 * last three coordinates indicates the 'spin' or orientation of the piece.
	 * It is highly recommended to read the THE_CUBE.pdf file. The user must
	 * specify the position and orientation of all the pieces of the cube, if
	 * not, the methods may not work, since they may not know where the pieces
	 * are.
	 */
	public static void setPieceInformation(String piecename, int posx,
			int posy, int posz, int xdir, int ydir, int zdir) {
		if (!isStarted) {
			start();
		}
		for (int i = 0; i < cubesarray.size(); i++) {
			goOn = true;
			for (int k = 0; k < piecename.length(); k++) {
				try {
					if (piecename.charAt(k) != cubesarray.get(i)[0].charAt(k)
							|| piecename.length() != cubesarray.get(i)[0]
									.length()) {
						goOn = false;
					}
				} catch (Exception e) {
					goOn = false;
				}
			}
			if (goOn) {
				if ((posx <= 1) && (posx >= -1) && (posy <= 1) && (posy >= -1)
						&& (posz <= 1) && (posz >= -1) && (xdir <= 1)
						&& (xdir >= -1) && (ydir <= 1) && (ydir >= -1)
						&& (zdir <= 1) && (zdir >= -1)) {
					cubesarray.get(i)[1] = Integer.toString(posx);
					cubesarray.get(i)[2] = Integer.toString(posy);
					cubesarray.get(i)[3] = Integer.toString(posz);
					cubesarray.get(i)[4] = Integer.toString(xdir);
					cubesarray.get(i)[5] = Integer.toString(ydir);
					cubesarray.get(i)[6] = Integer.toString(zdir);
					System.out.println(piecename
							+ " set succesfully in position (" + posx + ", "
							+ posy + ", " + posz + ") in direction (" + xdir
							+ ", " + ydir + ", " + zdir + ")");
				} else {
					System.err.println("Workstation can't set the position in "
							+ piecename);
				}
			}
		}
		for (int i = 0; i < cubesarrayB.size(); i++) {
			goOn = true;
			for (int k = 0; k < piecename.length(); k++) {
				try {
					if (piecename.charAt(k) != cubesarrayB.get(i)[0].charAt(k)
							|| piecename.length() != cubesarray.get(i)[0]
									.length()) {
						goOn = false;
					}
				} catch (Exception e) {
					goOn = false;
				}
			}
			if (cubesarrayB.get(i)[0] == piecename) {
				if ((posx <= 1) && (posx >= -1) && (posy <= 1) && (posy >= -1)
						&& (posz <= 1) && (posz >= -1) && (xdir <= 1)
						&& (xdir >= -1) && (ydir <= 1) && (ydir >= -1)
						&& (zdir <= 1) && (zdir >= -1)) {
					cubesarrayB.get(i)[1] = Integer.toString(posx);
					cubesarrayB.get(i)[2] = Integer.toString(posy);
					cubesarrayB.get(i)[3] = Integer.toString(posz);
					cubesarrayB.get(i)[4] = Integer.toString(xdir);
					cubesarrayB.get(i)[5] = Integer.toString(ydir);
					cubesarrayB.get(i)[6] = Integer.toString(zdir);
				}
			}
		}
	}

	/**
	 * Creates a .txt file which indicates the position and orientation of all
	 * the pieces of the cube.
	 */
	public static void makeTXTfile(String filename) {
		if (!isStarted) {
			start();
		}
		FileWriter filewriter = null;
		filename = filename + ".txt";
		try {
			filewriter = new FileWriter(filename);
			BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
			PrintWriter printwriter = new PrintWriter(bufferedwriter);

			printwriter.print("··· Rubik's cube current position ···");
			printwriter.println();
			printwriter.println();

			for (int i = 0; i < cubesarray.size(); i++) {
				for (int j = 0; j < 7; j++) {
					if ((j < 7) && (j > 1)) {
						printwriter.print(", ");
					}
					if (j == 1) {
						printwriter.print(": (");
					}
					printwriter.print(cubesarray.get(i)[j]);
					if (j == 6) {
						printwriter.print(")");
						printwriter.println();
					}
				}
			}

			printwriter.println();
			printwriter.println();
			printwriter.println();
			printwriter.print("NOTATION:");
			printwriter.println();
			printwriter.print("Ca means Center which color is a");
			printwriter.println();
			printwriter.print("ab means edge which colors are a & b");
			printwriter.println();
			printwriter.print("abc means corner which colors are a,b &c");
			printwriter.println();
			printwriter.println();
			printwriter.print("ab: (xpos, ypos, zpos, xdir, ydir, zdir). ");
			printwriter
					.print("These coordinates are explained in THE_CUBE.pdf file, page 3.");
			printwriter.close();

			System.out.println(filename + " has been succesfully exported");
		} catch (IOException e) {
			System.err.println(filename + " couldn't be exported: " + e);
		}
	}

	/**
	 * Rotates the white face clockwise.
	 */
	public void rotateWhiteFaceClockwise(int times) {
		if (!isStarted) {
			start();
		}
		if (times < 0) {
			rotateWhiteFaceCounterClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateWhiteFaceCounterClockwise(1);
			} else {
				for (int i = 0; i < cubesarray.size(); i++) {
					if (Integer.parseInt(cubesarray.get(i)[3]) == 1) {

						auxiliarypos = -(int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[1])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[2]);
						auxiliarxpos = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[1])
								+ (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[2]);
						cubesarray.get(i)[2] = Integer.toString(auxiliarypos);
						cubesarray.get(i)[1] = Integer.toString(auxiliarxpos);

						auxiliarydir = -(int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[4])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[5]);
						auxiliarxdir = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[4])
								+ (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[5]);
						cubesarray.get(i)[5] = Integer.toString(auxiliarydir);
						cubesarray.get(i)[4] = Integer.toString(auxiliarxdir);
					}
				}
			}
		}
	}

	/**
	 * Rotates the white face counterclockwise.
	 */
	public void rotateWhiteFaceCounterClockwise(int times) {
		if (!isStarted) {
			start();
		}
		if (times < 0) {
			rotateWhiteFaceClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateWhiteFaceClockwise(1);
			} else {
				for (int i = 0; i < cubesarray.size(); i++) {
					if (Integer.parseInt(cubesarray.get(i)[3]) == 1) {

						auxiliarypos = (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[1])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[2]);
						auxiliarxpos = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[1])
								- (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[2]);
						cubesarray.get(i)[2] = Integer.toString(auxiliarypos);
						cubesarray.get(i)[1] = Integer.toString(auxiliarxpos);

						auxiliarydir = (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[4])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[5]);
						auxiliarxdir = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[4])
								- (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[5]);
						cubesarray.get(i)[5] = Integer.toString(auxiliarydir);
						cubesarray.get(i)[4] = Integer.toString(auxiliarxdir);
					}
				}
			}
		}
	}

	/**
	 * Rotates the red face clockwise.
	 */
	public void rotateRedFaceClockwise(int times) {
		if (!isStarted) {
			start();
		}
		if (times < 0) {
			rotateRedFaceCounterClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateRedFaceCounterClockwise(1);
			} else {
				for (int i = 0; i < cubesarray.size(); i++) {
					if (Integer.parseInt(cubesarray.get(i)[1]) == 1) {

						auxiliarzpos = -(int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[2])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[3]);
						auxiliarypos = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[2])
								+ (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[3]);
						cubesarray.get(i)[3] = Integer.toString(auxiliarzpos);
						cubesarray.get(i)[2] = Integer.toString(auxiliarypos);

						auxiliarzdir = -(int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[5])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[6]);
						auxiliarydir = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[5])
								+ (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[6]);
						cubesarray.get(i)[6] = Integer.toString(auxiliarzdir);
						cubesarray.get(i)[5] = Integer.toString(auxiliarydir);
					}
				}
			}
		}
	}

	/**
	 * Rotates the red face counterclockwise.
	 */
	public void rotateRedFaceCounterClockwise(int times) {
		if (!isStarted) {
			start();
		}
		if (times < 0) {
			rotateRedFaceClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateRedFaceClockwise(1);
			} else {
				for (int i = 0; i < cubesarray.size(); i++) {
					if (Integer.parseInt(cubesarray.get(i)[1]) == 1) {

						auxiliarzpos = (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[2])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[3]);
						auxiliarypos = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[2])
								- (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[3]);
						cubesarray.get(i)[3] = Integer.toString(auxiliarzpos);
						cubesarray.get(i)[2] = Integer.toString(auxiliarypos);

						auxiliarzdir = (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[5])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[6]);
						auxiliarydir = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[5])
								- (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[6]);
						cubesarray.get(i)[6] = Integer.toString(auxiliarzdir);
						cubesarray.get(i)[5] = Integer.toString(auxiliarydir);
					}
				}
			}
		}
	}

	/**
	 * Rotates the blue face clockwise.
	 */
	public void rotateBlueFaceClockwise(int times) {
		if (!isStarted) {
			start();
		}
		if (times < 0) {
			rotateBlueFaceCounterClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateBlueFaceCounterClockwise(1);
			} else {
				for (int i = 0; i < cubesarray.size(); i++) {
					if (Integer.parseInt(cubesarray.get(i)[2]) == 1) {

						auxiliarzpos = (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[1])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[3]);
						auxiliarxpos = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[1])
								- (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[3]);
						cubesarray.get(i)[3] = Integer.toString(auxiliarzpos);
						cubesarray.get(i)[1] = Integer.toString(auxiliarxpos);

						auxiliarzdir = (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[4])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[6]);
						auxiliarxdir = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[4])
								- (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[6]);
						cubesarray.get(i)[6] = Integer.toString(auxiliarzdir);
						cubesarray.get(i)[4] = Integer.toString(auxiliarxdir);
					}
				}
			}
		}
	}

	/**
	 * Rotates the blue face counterclockwise.
	 */
	public void rotateBlueFaceCounterClockwise(int times) {
		if (!isStarted) {
			start();
		}
		if (times < 0) {
			rotateBlueFaceClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateBlueFaceClockwise(1);
			} else {
				for (int i = 0; i < cubesarray.size(); i++) {
					if (Integer.parseInt(cubesarray.get(i)[2]) == 1) {

						auxiliarzpos = -(int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[1])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[3]);
						auxiliarxpos = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[1])
								+ (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[3]);
						cubesarray.get(i)[3] = Integer.toString(auxiliarzpos);
						cubesarray.get(i)[1] = Integer.toString(auxiliarxpos);

						auxiliarzdir = -(int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[4])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[6]);
						auxiliarxdir = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[4])
								+ (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[6]);
						cubesarray.get(i)[6] = Integer.toString(auxiliarzdir);
						cubesarray.get(i)[4] = Integer.toString(auxiliarxdir);
					}
				}
			}
		}
	}

	/**
	 * Rotates the orange face clockwise.
	 */
	public void rotateOrangeFaceClockwise(int times) {
		if (!isStarted) {
			start();
		}
		if (times < 0) {
			rotateOrangeFaceCounterClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateOrangeFaceCounterClockwise(1);
			} else {
				for (int i = 0; i < cubesarray.size(); i++) {
					if (Integer.parseInt(cubesarray.get(i)[1]) == -1) {

						auxiliarzpos = (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[2])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[3]);
						auxiliarypos = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[2])
								- (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[3]);
						cubesarray.get(i)[3] = Integer.toString(auxiliarzpos);
						cubesarray.get(i)[2] = Integer.toString(auxiliarypos);

						auxiliarzdir = (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[5])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[6]);
						auxiliarydir = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[5])
								- (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[6]);
						cubesarray.get(i)[6] = Integer.toString(auxiliarzdir);
						cubesarray.get(i)[5] = Integer.toString(auxiliarydir);
					}
				}
			}
		}
	}

	/**
	 * Rotates the orange face counterclockwise.
	 */
	public void rotateOrangeFaceCounterClockwise(int times) {
		if (!isStarted) {
			start();
		}
		if (times < 0) {
			rotateOrangeFaceClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateOrangeFaceClockwise(1);
			} else {
				for (int i = 0; i < cubesarray.size(); i++) {
					if (Integer.parseInt(cubesarray.get(i)[1]) == -1) {

						auxiliarzpos = -(int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[2])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[3]);
						auxiliarypos = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[2])
								+ (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[3]);
						cubesarray.get(i)[3] = Integer.toString(auxiliarzpos);
						cubesarray.get(i)[2] = Integer.toString(auxiliarypos);

						auxiliarzdir = -(int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[5])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[6]);
						auxiliarydir = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[5])
								+ (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[6]);
						cubesarray.get(i)[6] = Integer.toString(auxiliarzdir);
						cubesarray.get(i)[5] = Integer.toString(auxiliarydir);
					}
				}
			}
		}
	}

	/**
	 * Rotates the green face clockwise.
	 */
	public void rotateGreenFaceClockwise(int times) {
		if (!isStarted) {
			start();
		}
		if (times < 0) {
			rotateGreenFaceCounterClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateGreenFaceCounterClockwise(1);
			} else {
				for (int i = 0; i < cubesarray.size(); i++) {
					if (Integer.parseInt(cubesarray.get(i)[2]) == -1) {

						auxiliarzpos = -(int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[1])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[3]);
						auxiliarxpos = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[1])
								+ (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[3]);
						cubesarray.get(i)[3] = Integer.toString(auxiliarzpos);
						cubesarray.get(i)[1] = Integer.toString(auxiliarxpos);

						auxiliarzdir = -(int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[4])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[6]);
						auxiliarxdir = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[4])
								+ (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[6]);
						cubesarray.get(i)[6] = Integer.toString(auxiliarzdir);
						cubesarray.get(i)[4] = Integer.toString(auxiliarxdir);
					}
				}
			}
		}
	}

	/**
	 * Rotates the green face counterclockwise.
	 */
	public void rotateGreenFaceCounterClockwise(int times) {
		if (!isStarted) {
			start();
		}
		if (times < 0) {
			rotateGreenFaceClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateGreenFaceClockwise(1);
			} else {
				for (int i = 0; i < cubesarray.size(); i++) {
					if (Integer.parseInt(cubesarray.get(i)[2]) == -1) {

						auxiliarzpos = (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[1])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[3]);
						auxiliarxpos = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[1])
								- (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[3]);
						cubesarray.get(i)[3] = Integer.toString(auxiliarzpos);
						cubesarray.get(i)[1] = Integer.toString(auxiliarxpos);

						auxiliarzdir = (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[4])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[6]);
						auxiliarxdir = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[4])
								- (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[6]);
						cubesarray.get(i)[6] = Integer.toString(auxiliarzdir);
						cubesarray.get(i)[4] = Integer.toString(auxiliarxdir);
					}
				}
			}
		}
	}

	/**
	 * Rotates the yellow face clockwise.
	 */
	public void rotateYellowFaceClockwise(int times) {
		if (!isStarted) {
			start();
		}
		if (times < 0) {
			rotateYellowFaceCounterClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateYellowFaceCounterClockwise(1);
			} else {
				for (int i = 0; i < cubesarray.size(); i++) {
					if (Integer.parseInt(cubesarray.get(i)[3]) == -1) {

						auxiliarypos = (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[1])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[2]);
						auxiliarxpos = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[1])
								- (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[2]);
						cubesarray.get(i)[2] = Integer.toString(auxiliarypos);
						cubesarray.get(i)[1] = Integer.toString(auxiliarxpos);

						auxiliarydir = (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[4])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[5]);
						auxiliarxdir = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[4])
								- (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[5]);
						cubesarray.get(i)[5] = Integer.toString(auxiliarydir);
						cubesarray.get(i)[4] = Integer.toString(auxiliarxdir);
					}
				}
			}
		}
	}

	/**
	 * Rotates the yellow face counterclockwise.
	 */
	public void rotateYellowFaceCounterClockwise(int times) {
		if (!isStarted) {
			start();
		}
		if (times < 0) {
			rotateYellowFaceClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateYellowFaceClockwise(1);
			} else {
				for (int i = 0; i < cubesarray.size(); i++) {
					if (Integer.parseInt(cubesarray.get(i)[3]) == -1) {

						auxiliarypos = -(int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[1])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[2]);
						auxiliarxpos = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[1])
								+ (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[2]);
						cubesarray.get(i)[2] = Integer.toString(auxiliarypos);
						cubesarray.get(i)[1] = Integer.toString(auxiliarxpos);

						auxiliarydir = -(int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[4])
								+ (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[5]);
						auxiliarxdir = (int) Math.cos(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[4])
								+ (int) Math.sin(times * 0.5 * Math.PI)
								* Integer.parseInt(cubesarray.get(i)[5]);
						cubesarray.get(i)[5] = Integer.toString(auxiliarydir);
						cubesarray.get(i)[4] = Integer.toString(auxiliarxdir);
					}
				}
			}
		}
	}

	/**
	 * Solves the cube in less than 27 movements. It exports the solution
	 * (Solution.txt) so that the user can foloow the movements. WARNING: This
	 * method should be called if the user is sure that the cube can be solved
	 * in less than 10 movements. The method is supposed to be able to solve
	 * every cube, but it may need to work during hole years, since it
	 * randomizes movements. If the cube is completely it is recommended to use
	 * the solveClassicalMethod() method.
	 */
	public void solveInFewMovements() {
		if (!isStarted) {
			start();
		}

		for (int i = 0; i < cubesarrayB.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}

		if (isSolved()) {
			System.out.println("The cube is already solved!");
		} else {
			System.err
					.println("Be patient, this action may take several minutes...");
		}
		while (!isSolved()) {
			if (numberofmovements < 27) {
				randomnumber = (int) (Math.random() * 12);

				if (auxiliarrandomnumber % 2 == 1) {
					while (randomnumber == auxiliarrandomnumber - 1) {
						randomnumber = (int) (Math.random() * 12);
					}
				} else {
					while (randomnumber == auxiliarrandomnumber + 1) {
						randomnumber = (int) (Math.random() * 12);
					}
				}

				auxiliarrandomnumber = randomnumber;
				numberofmovements = numberofmovements + 1;

				if (randomnumber == 0) {
					rotateRedFaceClockwise();
					solutionarray.add("rotate Red face Clockwise");
				}
				if (randomnumber == 1) {
					rotateRedFaceCounterClockwise();
					solutionarray.add("rotate Red face CounterClockwise");
				}
				if (randomnumber == 2) {
					rotateBlueFaceClockwise();
					solutionarray.add("rotate Blue face Clockwise");
				}
				if (randomnumber == 3) {
					rotateBlueFaceCounterClockwise();
					solutionarray.add("rotate Blue face CounterClockwise");
				}
				if (randomnumber == 4) {
					rotateGreenFaceClockwise();
					solutionarray.add("rotate Green face Clockwise");
				}
				if (randomnumber == 5) {
					rotateGreenFaceCounterClockwise();
					solutionarray.add("rotate Green face CounterClockwise");
				}
				if (randomnumber == 6) {
					rotateOrangeFaceClockwise();
					solutionarray.add("rotate Orange face Clockwise");
				}
				if (randomnumber == 7) {
					rotateOrangeFaceCounterClockwise();
					solutionarray.add("rotate Orange face CounterClockwise");
				}
				if (randomnumber == 8) {
					rotateWhiteFaceClockwise();
					solutionarray.add("rotate White face Clockwise");
				}
				if (randomnumber == 9) {
					rotateWhiteFaceCounterClockwise();
					solutionarray.add("rotate White face CounterClockwise");
				}
				if (randomnumber == 10) {
					rotateYellowFaceClockwise();
					solutionarray.add("rotate Yellow face Clockwise");
				}
				if (randomnumber == 11) {
					rotateYellowFaceCounterClockwise();
					solutionarray.add("rotate yellow face CounterClockwise");
				}

				if (isSolved()) {
					FileWriter filewriter = null;
					try {
						filewriter = new FileWriter(
								"Solution_few_movements.txt");
						BufferedWriter bufferedwriter = new BufferedWriter(
								filewriter);
						PrintWriter printwriter = new PrintWriter(
								bufferedwriter);

						printwriter.print("··· Rubik's cube solution ···");
						printwriter.println();
						printwriter.println();

						for (int k = 0; k < solutionarray.size(); k++) {
							printwriter.print(solutionarray.get(k));
							printwriter.println();
						}
						printwriter.println();
						printwriter.print("Solution found in "
								+ numberofmovements + " movements");
						printwriter.close();
						System.out
								.println("Solution has been found in "
										+ numberofmovements
										+ " movements. See 'Solution_few_movements.txt' file");
					} catch (Exception e) {
						System.err
								.println("Solution has been found, but it couldn't be exported correctly: "
										+ e);
					}
				}
			} else {
				numberofmovements = 0;
				solutionarray.clear();
				for (int i = 0; i < cubesarray.size(); i++) {
					for (int j = 0; j < 7; j++) {
						cubesarray.get(i)[j] = cubesarrayB.get(i)[j];
					}
				}
			}
		}
	}

	/**
	 * Solves the cube using the classical method. It exports the solution
	 * (Solution.txt) so that the user can follow the movements.
	 */
	public void solveClassicalMethod() {
		if (!isStarted) {
			start();
		}
		isclassicalstarted = true;
		classicalmethodthread.run(cubesarray, solvedarray);
	}

	/**
	 * Returns whether the cube is solved or not.
	 */
	public boolean isSolved() {
		if (!isStarted) {
			start();
		}

		boolean isValid = true;

		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 1; j < 7; j++) {
				if (Integer.parseInt(cubesarray.get(i)[j]) != Integer
						.parseInt(solvedarray.get(i)[j])) {
					isValid = false;
				}
			}
		}

		if (isValid) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Rotates the white face clockwise.
	 */
	private void rotateWhiteFaceClockwise() {
		for (int i = 0; i < cubesarray.size(); i++) {
			if (Integer.parseInt(cubesarray.get(i)[3]) == 1) {

				auxiliarypos = -Integer.parseInt(cubesarray.get(i)[1]);
				auxiliarxpos = Integer.parseInt(cubesarray.get(i)[2]);
				cubesarray.get(i)[2] = Integer.toString(auxiliarypos);
				cubesarray.get(i)[1] = Integer.toString(auxiliarxpos);

				auxiliarydir = -Integer.parseInt(cubesarray.get(i)[4]);
				auxiliarxdir = Integer.parseInt(cubesarray.get(i)[5]);
				cubesarray.get(i)[5] = Integer.toString(auxiliarydir);
				cubesarray.get(i)[4] = Integer.toString(auxiliarxdir);

			}
		}
	}

	/**
	 * Rotates the white face counterclockwise.
	 */
	private void rotateWhiteFaceCounterClockwise() {
		for (int i = 0; i < cubesarray.size(); i++) {
			if (Integer.parseInt(cubesarray.get(i)[3]) == 1) {

				auxiliarypos = Integer.parseInt(cubesarray.get(i)[1]);
				auxiliarxpos = -Integer.parseInt(cubesarray.get(i)[2]);
				cubesarray.get(i)[2] = Integer.toString(auxiliarypos);
				cubesarray.get(i)[1] = Integer.toString(auxiliarxpos);

				auxiliarydir = Integer.parseInt(cubesarray.get(i)[4]);
				auxiliarxdir = -Integer.parseInt(cubesarray.get(i)[5]);
				cubesarray.get(i)[5] = Integer.toString(auxiliarydir);
				cubesarray.get(i)[4] = Integer.toString(auxiliarxdir);
			}
		}
	}

	/**
	 * Rotates the red face clockwise.
	 */
	private void rotateRedFaceClockwise() {
		for (int i = 0; i < cubesarray.size(); i++) {
			if (Integer.parseInt(cubesarray.get(i)[1]) == 1) {

				auxiliarzpos = -Integer.parseInt(cubesarray.get(i)[2]);
				auxiliarypos = Integer.parseInt(cubesarray.get(i)[3]);
				cubesarray.get(i)[3] = Integer.toString(auxiliarzpos);
				cubesarray.get(i)[2] = Integer.toString(auxiliarypos);

				auxiliarzdir = -Integer.parseInt(cubesarray.get(i)[5]);
				auxiliarydir = Integer.parseInt(cubesarray.get(i)[6]);
				cubesarray.get(i)[6] = Integer.toString(auxiliarzdir);
				cubesarray.get(i)[5] = Integer.toString(auxiliarydir);
			}
		}
	}

	/**
	 * Rotates the red face counterclockwise.
	 */
	private void rotateRedFaceCounterClockwise() {
		for (int i = 0; i < cubesarray.size(); i++) {
			if (Integer.parseInt(cubesarray.get(i)[1]) == 1) {

				auxiliarzpos = Integer.parseInt(cubesarray.get(i)[2]);
				auxiliarypos = -Integer.parseInt(cubesarray.get(i)[3]);
				cubesarray.get(i)[3] = Integer.toString(auxiliarzpos);
				cubesarray.get(i)[2] = Integer.toString(auxiliarypos);

				auxiliarzdir = Integer.parseInt(cubesarray.get(i)[5]);
				auxiliarydir = -Integer.parseInt(cubesarray.get(i)[6]);
				cubesarray.get(i)[6] = Integer.toString(auxiliarzdir);
				cubesarray.get(i)[5] = Integer.toString(auxiliarydir);
			}
		}
	}

	/**
	 * Rotates the blue face clockwise.
	 */
	private void rotateBlueFaceClockwise() {
		for (int i = 0; i < cubesarray.size(); i++) {
			if (Integer.parseInt(cubesarray.get(i)[2]) == 1) {

				auxiliarzpos = Integer.parseInt(cubesarray.get(i)[1]);
				auxiliarxpos = -Integer.parseInt(cubesarray.get(i)[3]);
				cubesarray.get(i)[3] = Integer.toString(auxiliarzpos);
				cubesarray.get(i)[1] = Integer.toString(auxiliarxpos);

				auxiliarzdir = Integer.parseInt(cubesarray.get(i)[4]);
				auxiliarxdir = -Integer.parseInt(cubesarray.get(i)[6]);
				cubesarray.get(i)[6] = Integer.toString(auxiliarzdir);
				cubesarray.get(i)[4] = Integer.toString(auxiliarxdir);
			}
		}
	}

	/**
	 * Rotates the blue face counterclockwise.
	 */
	private void rotateBlueFaceCounterClockwise() {
		for (int i = 0; i < cubesarray.size(); i++) {
			if (Integer.parseInt(cubesarray.get(i)[2]) == 1) {

				auxiliarzpos = -Integer.parseInt(cubesarray.get(i)[1]);
				auxiliarxpos = Integer.parseInt(cubesarray.get(i)[3]);
				cubesarray.get(i)[3] = Integer.toString(auxiliarzpos);
				cubesarray.get(i)[1] = Integer.toString(auxiliarxpos);

				auxiliarzdir = -Integer.parseInt(cubesarray.get(i)[4]);
				auxiliarxdir = Integer.parseInt(cubesarray.get(i)[6]);
				cubesarray.get(i)[6] = Integer.toString(auxiliarzdir);
				cubesarray.get(i)[4] = Integer.toString(auxiliarxdir);
			}
		}
	}

	/**
	 * Rotates the orange face clockwise.
	 */
	private void rotateOrangeFaceClockwise() {
		for (int i = 0; i < cubesarray.size(); i++) {
			if (Integer.parseInt(cubesarray.get(i)[1]) == -1) {

				auxiliarzpos = Integer.parseInt(cubesarray.get(i)[2]);
				auxiliarypos = -Integer.parseInt(cubesarray.get(i)[3]);
				cubesarray.get(i)[3] = Integer.toString(auxiliarzpos);
				cubesarray.get(i)[2] = Integer.toString(auxiliarypos);

				auxiliarzdir = Integer.parseInt(cubesarray.get(i)[5]);
				auxiliarydir = -Integer.parseInt(cubesarray.get(i)[6]);
				cubesarray.get(i)[6] = Integer.toString(auxiliarzdir);
				cubesarray.get(i)[5] = Integer.toString(auxiliarydir);
			}
		}
	}

	/**
	 * Rotates the orange face counterclockwise.
	 */
	private void rotateOrangeFaceCounterClockwise() {
		for (int i = 0; i < cubesarray.size(); i++) {
			if (Integer.parseInt(cubesarray.get(i)[1]) == -1) {

				auxiliarzpos = -Integer.parseInt(cubesarray.get(i)[2]);
				auxiliarypos = Integer.parseInt(cubesarray.get(i)[3]);
				cubesarray.get(i)[3] = Integer.toString(auxiliarzpos);
				cubesarray.get(i)[2] = Integer.toString(auxiliarypos);

				auxiliarzdir = -Integer.parseInt(cubesarray.get(i)[5]);
				auxiliarydir = Integer.parseInt(cubesarray.get(i)[6]);
				cubesarray.get(i)[6] = Integer.toString(auxiliarzdir);
				cubesarray.get(i)[5] = Integer.toString(auxiliarydir);
			}
		}
	}

	/**
	 * Rotates the green face clockwise.
	 */
	private void rotateGreenFaceClockwise() {
		for (int i = 0; i < cubesarray.size(); i++) {
			if (Integer.parseInt(cubesarray.get(i)[2]) == -1) {

				auxiliarzpos = -Integer.parseInt(cubesarray.get(i)[1]);
				auxiliarxpos = Integer.parseInt(cubesarray.get(i)[3]);
				cubesarray.get(i)[3] = Integer.toString(auxiliarzpos);
				cubesarray.get(i)[1] = Integer.toString(auxiliarxpos);

				auxiliarzdir = -Integer.parseInt(cubesarray.get(i)[4]);
				auxiliarxdir = Integer.parseInt(cubesarray.get(i)[6]);
				cubesarray.get(i)[6] = Integer.toString(auxiliarzdir);
				cubesarray.get(i)[4] = Integer.toString(auxiliarxdir);
			}
		}
	}

	/**
	 * Rotates the green face counterclockwise.
	 */
	private void rotateGreenFaceCounterClockwise() {
		for (int i = 0; i < cubesarray.size(); i++) {
			if (Integer.parseInt(cubesarray.get(i)[2]) == -1) {

				auxiliarzpos = Integer.parseInt(cubesarray.get(i)[1]);
				auxiliarxpos = -Integer.parseInt(cubesarray.get(i)[3]);
				cubesarray.get(i)[3] = Integer.toString(auxiliarzpos);
				cubesarray.get(i)[1] = Integer.toString(auxiliarxpos);

				auxiliarzdir = Integer.parseInt(cubesarray.get(i)[4]);
				auxiliarxdir = -Integer.parseInt(cubesarray.get(i)[6]);
				cubesarray.get(i)[6] = Integer.toString(auxiliarzdir);
				cubesarray.get(i)[4] = Integer.toString(auxiliarxdir);
			}
		}
	}

	/**
	 * Rotates the yellow face clockwise.
	 */
	private void rotateYellowFaceClockwise() {
		for (int i = 0; i < cubesarray.size(); i++) {
			if (Integer.parseInt(cubesarray.get(i)[3]) == -1) {

				auxiliarypos = Integer.parseInt(cubesarray.get(i)[1]);
				auxiliarxpos = -Integer.parseInt(cubesarray.get(i)[2]);
				cubesarray.get(i)[2] = Integer.toString(auxiliarypos);
				cubesarray.get(i)[1] = Integer.toString(auxiliarxpos);

				auxiliarydir = Integer.parseInt(cubesarray.get(i)[4]);
				auxiliarxdir = -Integer.parseInt(cubesarray.get(i)[5]);
				cubesarray.get(i)[5] = Integer.toString(auxiliarydir);
				cubesarray.get(i)[4] = Integer.toString(auxiliarxdir);
			}
		}
	}

	/**
	 * Rotates the yellow face counterclockwise.
	 */
	private void rotateYellowFaceCounterClockwise() {
		for (int i = 0; i < cubesarray.size(); i++) {
			if (Integer.parseInt(cubesarray.get(i)[3]) == -1) {

				auxiliarypos = -Integer.parseInt(cubesarray.get(i)[1]);
				auxiliarxpos = Integer.parseInt(cubesarray.get(i)[2]);
				cubesarray.get(i)[2] = Integer.toString(auxiliarypos);
				cubesarray.get(i)[1] = Integer.toString(auxiliarxpos);

				auxiliarydir = -Integer.parseInt(cubesarray.get(i)[4]);
				auxiliarxdir = Integer.parseInt(cubesarray.get(i)[5]);
				cubesarray.get(i)[5] = Integer.toString(auxiliarydir);
				cubesarray.get(i)[4] = Integer.toString(auxiliarxdir);
			}
		}
	}

	/**
	 * The cube seems to be a chess table.
	 */
	public void setChessMode() {
		setSolvedPosition();
		rotateYellowFaceClockwise();
		rotateYellowFaceClockwise();
		rotateWhiteFaceClockwise();
		rotateWhiteFaceClockwise();
		rotateBlueFaceClockwise();
		rotateBlueFaceClockwise();
		rotateGreenFaceClockwise();
		rotateGreenFaceClockwise();
		rotateRedFaceClockwise();
		rotateRedFaceClockwise();
		rotateOrangeFaceClockwise();
		rotateOrangeFaceClockwise();
	}

	/**
	 * Changes the centers of the cube.
	 */
	public void setChangedCentersMode() {
		setSolvedPosition();
		rotateRedFaceCounterClockwise();
		rotateOrangeFaceClockwise();
		rotateYellowFaceCounterClockwise();
		rotateWhiteFaceClockwise();
		rotateBlueFaceCounterClockwise();
		rotateGreenFaceClockwise();
		rotateRedFaceCounterClockwise();
		rotateOrangeFaceClockwise();
	}

	/**
	 * Receives the cube solved by ClassicalMethodThread. Another cube can be
	 * sent as well.
	 */
	public static void receiveCube(ArrayList<String[]> c) {
		for (int i = 0; i < c.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarray.get(i)[j] = c.get(i)[j];
			}
		}
		for (int i = 0; i < cubesarrayB.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
	}
}
