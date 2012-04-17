/**
 * |············································|
 * |·  AUTHOR:      OLIVER HIJANO CUBELOS      ·|
 * |·  E-MAIL:      oliver_hijano@hotmail.com  ·|
 * |·  DEVELOPED:   15/ June/ 2008             ·|
 * |·  UPDATED:     27/ June/ 2008             ·|
 * |············································|
 */

package panelOld;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFrame;

/**
 * Thread which solves the cube using the classical method.
 * 
 * @author Oliver Hijano
 * 
 */
public class ClassicalMethodThread extends Thread {

	public String[] brw = { "brw", "1", "1", "1", "0", "0", "1" }, bow = {
			"bow", "-1", "1", "1", "0", "0", "1" }, gow = { "gow", "-1", "-1",
			"1", "0", "0", "1" },
			grw = { "grw", "1", "-1", "1", "0", "0", "1" }, boy = { "boy",
					"-1", "1", "-1", "0", "0", "-1" }, bry = { "bry", "1", "1",
					"-1", "0", "0", "-1" }, gry = { "gry", "1", "-1", "-1",
					"0", "0", "-1" }, goy = { "goy", "-1", "-1", "-1", "0",
					"0", "-1" }, rw = { "rw", "1", "0", "1", "0", "0", "1" },
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

	public static ArrayList<String[]> cubesarray = new ArrayList<String[]>();
	public static ArrayList<String[]> cubesarrayB = new ArrayList<String[]>();
	public ArrayList<String[]> solvedarray = new ArrayList<String[]>();
	public ArrayList<String> solutionarray = new ArrayList<String>();
	public static ArrayList<String> finalsolutionarray = new ArrayList<String>();
	public static ArrayList<String> auxiliarfinalsolutionarray = new ArrayList<String>();
	public static int auxiliarxpos, auxiliarypos, auxiliarzpos, auxiliarxdir,
			auxiliarydir, auxiliarzdir, numberofmovements = 0,
			randomnumber = 17, auxiliarrandomnumber = 16, securitychanger = 0,
			specialfinalBluerotations = 0, numberofcornersunoriented;
	public boolean isStarted = false, areSimilar = false;
	public static String line = "";

	/**
	 * Initializes the pieces.
	 */
	private void begin() {
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
		}
	}

	/**
	 * Starts the thread.
	 * 
	 * @param c
	 * @param s
	 */
	public void run(ArrayList<String[]> c, ArrayList<String[]> s) {

		if (!isStarted) {
			begin();
		}

		for (int i = 0; i < c.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarray.get(i)[j] = c.get(i)[j];
			}
		}

		for (int i = 0; i < s.size(); i++) {
			for (int j = 0; j < 7; j++) {
				solvedarray.get(i)[j] = s.get(i)[j];
			}
		}

		for (int i = 0; i < cubesarrayB.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}

		if (isSolved()) {
			System.err.println("The cube is already solved!");
		} else {
			System.err
					.println("Be patient, this action may take several minutes...");

			randomnumber = 17;
			auxiliarrandomnumber = 16;
			solutionarray.clear();

			setRedWhiteEdge();
			setBlueWhiteEdge();
			setOrangeWhiteEdge();
			setGreenWhiteEdge();
			System.out.println(("Done whitecoloredges"));
			setBlueRedWhiteCorner();
			if (Integer.parseInt(cubesarray.get(12)[1]) == 1
					&& Integer.parseInt(cubesarray.get(12)[2]) == 1
					&& !isBlueRedEdgeDone()) {
				rotateBlueFaceCounterClockwise();
				rotateGreenFaceClockwise();
				rotateYellowFaceCounterClockwise();
				rotateGreenFaceCounterClockwise();
				rotateYellowFaceCounterClockwise();
				rotateGreenFaceClockwise();
				rotateYellowFaceClockwise();
				rotateBlueFaceClockwise();
				rotateGreenFaceCounterClockwise();
				rotateYellowFaceClockwise();
				finalsolutionarray.add("rotate Blue face CounterClockwise");
				finalsolutionarray.add("rotate Green face Clockwise");
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
				finalsolutionarray.add("rotate Green face CounterClockwise");
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
				finalsolutionarray.add("rotate Green face Clockwise");
				finalsolutionarray.add("rotate Yellow face Clockwise");
				finalsolutionarray.add("rotate Blue face Clockwise");
				finalsolutionarray.add("rotate Green face CounterClockwise");
				finalsolutionarray.add("rotate Yellow face Clockwise");
				sequenceBlueRedEdge();
			} else {
				if (Integer.parseInt(cubesarray.get(12)[1]) == 1
						&& Integer.parseInt(cubesarray.get(12)[2]) == 1
						&& isBlueRedEdgeDone()) {
				} else {
					setBlueRedEdgeDown();
					setBlueRedEdgeInPosition();
					sequenceBlueRedEdge();
				}
			}
			System.out.println("Done brw corner & edge");
			if (!isGreenRedWhiteCornerWellDone()) {
				setGreenRedWhiteCornerDown();
			}
			setGreenRedWhiteCorner();
System.out.println("Done rgw cor");
			if (Integer.parseInt(cubesarray.get(15)[1]) == 1
					&& Integer.parseInt(cubesarray.get(15)[2]) == -1
					&& !isGreenRedEdgeDone()) {
				rotateRedFaceCounterClockwise();
				rotateOrangeFaceClockwise();
				rotateYellowFaceCounterClockwise();
				rotateOrangeFaceCounterClockwise();
				rotateYellowFaceCounterClockwise();
				rotateOrangeFaceClockwise();
				rotateYellowFaceClockwise();
				rotateRedFaceClockwise();
				rotateOrangeFaceCounterClockwise();
				rotateYellowFaceClockwise();
				finalsolutionarray.add("rotate Red face CounterClockwise");
				finalsolutionarray.add("rotate Orange face Clockwise");
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
				finalsolutionarray.add("rotate Orange face CounterClockwise");
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
				finalsolutionarray.add("rotate Orange face Clockwise");
				finalsolutionarray.add("rotate Yellow face Clockwise");
				finalsolutionarray.add("rotate Red face Clockwise");
				finalsolutionarray.add("rotate Orange face CounterClockwise");
				finalsolutionarray.add("rotate Yellow face Clockwise");
				sequenceGreenRedEdge();
			} else {
				if (Integer.parseInt(cubesarray.get(15)[1]) == 1
						&& Integer.parseInt(cubesarray.get(15)[2]) == -1
						&& isGreenRedEdgeDone()) {
				} else {
					setGreenRedEdgeDown();
					setGreenRedEdgeInPosition();
					sequenceGreenRedEdge();
				}
			}
			System.out.println("Done gr");
			if (!isBlueOrangeWhiteCornerWellDone()) {
				setBlueOrangeWhiteCornerDown();
			}
			setBlueOrangeWhiteCorner();
System.out.println("done bowcorner");
			if (Integer.parseInt(cubesarray.get(13)[1]) == -1
					&& Integer.parseInt(cubesarray.get(13)[2]) == 1
					&& !isBlueOrangeEdgeDone()) {
				rotateBlueFaceClockwise();
				rotateGreenFaceCounterClockwise();
				rotateYellowFaceClockwise();
				rotateGreenFaceClockwise();
				rotateYellowFaceClockwise();
				rotateGreenFaceCounterClockwise();
				rotateYellowFaceCounterClockwise();
				rotateBlueFaceCounterClockwise();
				rotateGreenFaceClockwise();
				rotateYellowFaceCounterClockwise();
				finalsolutionarray.add("rotate Blue face Clockwise");
				finalsolutionarray.add("rotate Green face CounterClockwise");
				finalsolutionarray.add("rotate Yellow face Clockwise");
				finalsolutionarray.add("rotate Green face Clockwise");
				finalsolutionarray.add("rotate Yellow face Clockwise");
				finalsolutionarray.add("rotate Green face CounterClockwise");
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
				finalsolutionarray.add("rotate Blue face CounterClockwise");
				finalsolutionarray.add("rotate Green face Clockwise");
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
				sequenceBlueOrangeEdge();
			} else {
				if (Integer.parseInt(cubesarray.get(13)[1]) == -1
						&& Integer.parseInt(cubesarray.get(13)[2]) == 1
						&& isBlueOrangeEdgeDone()) {
				} else {
					setBlueOrangeEdgeDown();
					setBlueOrangeEdgeInPosition();
					sequenceBlueOrangeEdge();
				}
			}
			System.out.println("Done bow");
			setRedYellowEdge();
			setBlueYellowEdge();
			setOrangeYellowEdge();
			System.out.println("Done three yellow");

			if (!isGreenYellowEdgeDone()) {
				sequenceGreenYellowEdge();
			}
			setFinalCorners();
			solveFinalSteps();

			FileWriter filewritera = null;
			try {
				filewritera = new FileWriter(
						"Solution_classical_method_befre.txt");
				BufferedWriter bufferedwritera = new BufferedWriter(filewritera);
				PrintWriter printwritera = new PrintWriter(bufferedwritera);

				printwritera.print("··· Rubik's cube solution ···");
				printwritera.println();
				printwritera.println();

				for (int k = 0; k < finalsolutionarray.size(); k++) {
					printwritera.print(k + 1 + ")   "
							+ finalsolutionarray.get(k));
					printwritera.println();
				}
				printwritera.println();
				printwritera.print("Solution found in "
						+ finalsolutionarray.size() + " movements");
				printwritera.close();
				System.out
						.println("Solution has been found in "
								+ finalsolutionarray.size()
								+ " movements. See 'Solution_classical_method.txt' file");
			} catch (Exception e) {
				System.err
						.println("Solution has been found, but it couldn't be exported correctly: "
								+ e);
			}

			boolean needRepetition = true;
			boolean changesMade = false;
			auxiliarfinalsolutionarray.clear();
			for (int k = 0; k < finalsolutionarray.size(); k++) {
				auxiliarfinalsolutionarray.add(finalsolutionarray.get(k));
			}

			while (needRepetition && securitychanger <= 20) {
				needRepetition = false;
				changesMade = false;
				for (int a = 0; a < finalsolutionarray.size(); a++) {
					try {
						if (finalsolutionarray.get(a).contains("Red")
								&& finalsolutionarray.get(a + 1)
										.contains("Red") && !changesMade) {
							if (finalsolutionarray.get(a).contains("Counter")) {
								if (finalsolutionarray.get(a + 1).contains(
										"Counter")) {
								} else {
									changesMade = true;
									needRepetition = true;
									securitychanger = 0;
									auxiliarfinalsolutionarray.remove(a + 1);
									auxiliarfinalsolutionarray.remove(a);
								}
							}
						}
					} catch (Exception e) {
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if (finalsolutionarray.get(a).contains("Red")
									&& finalsolutionarray.get(a + 1).contains(
											"Red") && !changesMade) {
								if (finalsolutionarray.get(a).contains(
										"Counter")) {
								} else {
									if (finalsolutionarray.get(a + 1).contains(
											"Counter")) {
										changesMade = true;
										needRepetition = true;
										securitychanger = 0;
										auxiliarfinalsolutionarray
												.remove(a + 1);
										auxiliarfinalsolutionarray.remove(a);
									}
								}
							}
						} catch (Exception e) {
						}
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if (finalsolutionarray.get(a).contains("Orange")
									&& finalsolutionarray.get(a + 1).contains(
											"Orange") && !changesMade) {
								if (finalsolutionarray.get(a).contains(
										"Counter")) {
									if (finalsolutionarray.get(a + 1).contains(
											"Counter")) {
									} else {
										changesMade = true;
										needRepetition = true;
										securitychanger = 0;
										auxiliarfinalsolutionarray
												.remove(a + 1);
										auxiliarfinalsolutionarray.remove(a);
									}
								}
							}
						} catch (Exception e) {
						}
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if (finalsolutionarray.get(a).contains("Orange")
									&& finalsolutionarray.get(a + 1).contains(
											"Orange") && !changesMade) {
								if (finalsolutionarray.get(a).contains(
										"Counter")) {
								} else {
									if (finalsolutionarray.get(a + 1).contains(
											"Counter")) {
										changesMade = true;
										needRepetition = true;
										securitychanger = 0;
										auxiliarfinalsolutionarray
												.remove(a + 1);
										auxiliarfinalsolutionarray.remove(a);
									}
								}
							}
						} catch (Exception e) {
						}
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if (finalsolutionarray.get(a).contains("Blue")
									&& finalsolutionarray.get(a + 1).contains(
											"Blue") && !changesMade) {
								if (finalsolutionarray.get(a).contains(
										"Counter")) {
									if (finalsolutionarray.get(a + 1).contains(
											"Counter")) {
									} else {
										changesMade = true;
										needRepetition = true;
										securitychanger = 0;
										auxiliarfinalsolutionarray
												.remove(a + 1);
										auxiliarfinalsolutionarray.remove(a);
									}
								}
							}
						} catch (Exception e) {
						}
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if (finalsolutionarray.get(a).contains("Blue")
									&& finalsolutionarray.get(a + 1).contains(
											"Blue") && !changesMade) {
								if (finalsolutionarray.get(a).contains(
										"Counter")) {
								} else {
									if (finalsolutionarray.get(a + 1).contains(
											"Counter")) {
										changesMade = true;
										securitychanger = 0;
										needRepetition = true;
										auxiliarfinalsolutionarray
												.remove(a + 1);
										auxiliarfinalsolutionarray.remove(a);
									}
								}
							}
						} catch (Exception e) {
						}
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if (finalsolutionarray.get(a).contains("Green")
									&& finalsolutionarray.get(a + 1).contains(
											"Green") && !changesMade) {
								if (finalsolutionarray.get(a).contains(
										"Counter")) {
									if (finalsolutionarray.get(a + 1).contains(
											"Counter")) {
									} else {
										changesMade = true;
										securitychanger = 0;
										needRepetition = true;
										auxiliarfinalsolutionarray
												.remove(a + 1);
										auxiliarfinalsolutionarray.remove(a);
									}
								}
							}
						} catch (Exception e) {
						}
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if (finalsolutionarray.get(a).contains("Green")
									&& finalsolutionarray.get(a + 1).contains(
											"Green") && !changesMade) {
								if (finalsolutionarray.get(a).contains(
										"Counter")) {
								} else {
									if (finalsolutionarray.get(a + 1).contains(
											"Counter")) {
										changesMade = true;
										needRepetition = true;
										securitychanger = 0;
										auxiliarfinalsolutionarray
												.remove(a + 1);
										auxiliarfinalsolutionarray.remove(a);
									}
								}
							}
						} catch (Exception e) {
						}
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if (finalsolutionarray.get(a).contains("White")
									&& finalsolutionarray.get(a + 1).contains(
											"White") && !changesMade) {
								if (finalsolutionarray.get(a).contains(
										"Counter")) {
									if (finalsolutionarray.get(a + 1).contains(
											"Counter")) {
									} else {
										changesMade = true;
										needRepetition = true;
										securitychanger = 0;
										auxiliarfinalsolutionarray
												.remove(a + 1);
										auxiliarfinalsolutionarray.remove(a);
									}
								}
							}
						} catch (Exception e) {
						}
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if (finalsolutionarray.get(a).contains("White")
									&& finalsolutionarray.get(a + 1).contains(
											"White") && !changesMade) {
								if (finalsolutionarray.get(a).contains(
										"Counter")) {
								} else {
									if (finalsolutionarray.get(a + 1).contains(
											"Counter")) {
										changesMade = true;
										needRepetition = true;
										securitychanger = 0;
										auxiliarfinalsolutionarray
												.remove(a + 1);
										auxiliarfinalsolutionarray.remove(a);
									}
								}
							}
						} catch (Exception e) {
						}
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if (finalsolutionarray.get(a).contains("Orange")
									&& finalsolutionarray.get(a + 1).contains(
											"Orange") && !changesMade) {
								if (finalsolutionarray.get(a).contains(
										"Counter")) {
									if (finalsolutionarray.get(a + 1).contains(
											"Counter")) {
									} else {
										changesMade = true;
										needRepetition = true;
										securitychanger = 0;
										auxiliarfinalsolutionarray
												.remove(a + 1);
										auxiliarfinalsolutionarray.remove(a);
									}
								}
							}
						} catch (Exception e) {
						}
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if (finalsolutionarray.get(a).contains("Yellow")
									&& finalsolutionarray.get(a + 1).contains(
											"Yellow") && !changesMade) {
								if (finalsolutionarray.get(a).contains(
										"Counter")) {
								} else {
									if (finalsolutionarray.get(a + 1).contains(
											"Counter")) {
										changesMade = true;
										needRepetition = true;
										securitychanger = 0;
										auxiliarfinalsolutionarray
												.remove(a + 1);
										auxiliarfinalsolutionarray.remove(a);
									}
								}
							}
						} catch (Exception e) {
						}
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if (finalsolutionarray.get(a) == finalsolutionarray
									.get(a + 1)
									&& finalsolutionarray.get(a + 1) == finalsolutionarray
											.get(a + 2)
									&& finalsolutionarray.get(a + 2) == finalsolutionarray
											.get(a + 3)) {
								if (!changesMade) {
									changesMade = true;
									needRepetition = true;
									securitychanger = 0;
									auxiliarfinalsolutionarray.remove(a + 3);
									auxiliarfinalsolutionarray.remove(a + 2);
									auxiliarfinalsolutionarray.remove(a + 1);
									auxiliarfinalsolutionarray.remove(a);
								}
							}
						} catch (Exception e) {
						}
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if (finalsolutionarray.get(a) == finalsolutionarray
									.get(a + 1)
									&& finalsolutionarray.get(a + 1) == finalsolutionarray
											.get(a + 2)) {
								if (!changesMade) {
									if (finalsolutionarray.get(a).contains(
											"Counter")) {
										changesMade = true;
										needRepetition = true;
										securitychanger = 0;
										auxiliarfinalsolutionarray
												.remove(a + 2);
										auxiliarfinalsolutionarray
												.remove(a + 1);
										auxiliarfinalsolutionarray
												.set(a, finalsolutionarray.get(
														a).replace(
														"CounterClockwise",
														"Clockwise"));
									} else {
										changesMade = true;
										needRepetition = true;
										securitychanger = 0;
										auxiliarfinalsolutionarray
												.remove(a + 2);
										auxiliarfinalsolutionarray
												.remove(a + 1);
										auxiliarfinalsolutionarray
												.set(a, finalsolutionarray.get(
														a).replace("Clockwise",
														"CounterClockwise"));
									}
								}
							}
						} catch (Exception e) {
						}
					}
				}
				if (changesMade) {
					finalsolutionarray.clear();
					for (int k = 0; k < auxiliarfinalsolutionarray.size(); k++) {
						finalsolutionarray.add(auxiliarfinalsolutionarray
								.get(k));
					}
					auxiliarfinalsolutionarray.clear();
					for (int k = 0; k < finalsolutionarray.size(); k++) {
						auxiliarfinalsolutionarray.add(finalsolutionarray
								.get(k));
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if ((finalsolutionarray.get(a).contains("Red"))
									&& (finalsolutionarray.get(a + 1)
											.contains("Orange"))
									&& (finalsolutionarray.get(a + 2)
											.contains("Red"))) {
								auxiliarfinalsolutionarray.set(a + 1,
										finalsolutionarray.get(a + 2));
								auxiliarfinalsolutionarray.set(a + 2,
										finalsolutionarray.get(a + 1));
								needRepetition = true;
								securitychanger = +1;
							}
						} catch (Exception e) {
						}
					}
				}
				if (needRepetition) {
					finalsolutionarray.clear();
					for (int k = 0; k < auxiliarfinalsolutionarray.size(); k++) {
						finalsolutionarray.add(auxiliarfinalsolutionarray
								.get(k));
					}
					auxiliarfinalsolutionarray.clear();
					for (int k = 0; k < finalsolutionarray.size(); k++) {
						auxiliarfinalsolutionarray.add(finalsolutionarray
								.get(k));
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if ((finalsolutionarray.get(a).contains("Orange"))
									&& (finalsolutionarray.get(a + 1)
											.contains("Red"))
									&& (finalsolutionarray.get(a + 2)
											.contains("Orange"))) {
								auxiliarfinalsolutionarray.set(a + 1,
										finalsolutionarray.get(a + 2));
								auxiliarfinalsolutionarray.set(a + 2,
										finalsolutionarray.get(a + 1));
								needRepetition = true;
								securitychanger = +1;
							}
						} catch (Exception e) {
						}
					}
				}
				if (needRepetition) {
					finalsolutionarray.clear();
					for (int k = 0; k < auxiliarfinalsolutionarray.size(); k++) {
						finalsolutionarray.add(auxiliarfinalsolutionarray
								.get(k));
					}
					auxiliarfinalsolutionarray.clear();
					for (int k = 0; k < finalsolutionarray.size(); k++) {
						auxiliarfinalsolutionarray.add(finalsolutionarray
								.get(k));
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if ((finalsolutionarray.get(a).contains("Blue"))
									&& (finalsolutionarray.get(a + 1)
											.contains("Green"))
									&& (finalsolutionarray.get(a + 2)
											.contains("Blue"))) {
								auxiliarfinalsolutionarray.set(a + 1,
										finalsolutionarray.get(a + 2));
								auxiliarfinalsolutionarray.set(a + 2,
										finalsolutionarray.get(a + 1));
								needRepetition = true;
								securitychanger = +1;
							}
						} catch (Exception e) {
						}
					}
				}
				if (needRepetition) {
					finalsolutionarray.clear();
					for (int k = 0; k < auxiliarfinalsolutionarray.size(); k++) {
						finalsolutionarray.add(auxiliarfinalsolutionarray
								.get(k));
					}
					auxiliarfinalsolutionarray.clear();
					for (int k = 0; k < finalsolutionarray.size(); k++) {
						auxiliarfinalsolutionarray.add(finalsolutionarray
								.get(k));
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if ((finalsolutionarray.get(a).contains("Green"))
									&& (finalsolutionarray.get(a + 1)
											.contains("Blue"))
									&& (finalsolutionarray.get(a + 2)
											.contains("Green"))) {
								auxiliarfinalsolutionarray.set(a + 1,
										finalsolutionarray.get(a + 2));
								auxiliarfinalsolutionarray.set(a + 2,
										finalsolutionarray.get(a + 1));
								needRepetition = true;
								securitychanger = +1;
							}
						} catch (Exception e) {
						}
					}
				}
				if (needRepetition) {
					finalsolutionarray.clear();
					for (int k = 0; k < auxiliarfinalsolutionarray.size(); k++) {
						finalsolutionarray.add(auxiliarfinalsolutionarray
								.get(k));
					}
					auxiliarfinalsolutionarray.clear();
					for (int k = 0; k < finalsolutionarray.size(); k++) {
						auxiliarfinalsolutionarray.add(finalsolutionarray
								.get(k));
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if ((finalsolutionarray.get(a).contains("Yellow"))
									&& (finalsolutionarray.get(a + 1)
											.contains("White"))
									&& (finalsolutionarray.get(a + 2)
											.contains("Yellow"))) {
								auxiliarfinalsolutionarray.set(a + 1,
										finalsolutionarray.get(a + 2));
								auxiliarfinalsolutionarray.set(a + 2,
										finalsolutionarray.get(a + 1));
								needRepetition = true;
								securitychanger = +1;
							}
						} catch (Exception e) {
						}
					}
				}
				if (needRepetition) {
					finalsolutionarray.clear();
					for (int k = 0; k < auxiliarfinalsolutionarray.size(); k++) {
						finalsolutionarray.add(auxiliarfinalsolutionarray
								.get(k));
					}
					auxiliarfinalsolutionarray.clear();
					for (int k = 0; k < finalsolutionarray.size(); k++) {
						auxiliarfinalsolutionarray.add(finalsolutionarray
								.get(k));
					}
				}
				if (!changesMade) {
					for (int a = 0; a < finalsolutionarray.size(); a++) {
						try {
							if ((finalsolutionarray.get(a).contains("White"))
									&& (finalsolutionarray.get(a + 1)
											.contains("Yellow"))
									&& (finalsolutionarray.get(a + 2)
											.contains("White"))) {
								auxiliarfinalsolutionarray.set(a + 1,
										finalsolutionarray.get(a + 2));
								auxiliarfinalsolutionarray.set(a + 2,
										finalsolutionarray.get(a + 1));
								needRepetition = true;
								securitychanger = +1;
							}
						} catch (Exception e) {
						}
					}
				}
				if (needRepetition) {
					finalsolutionarray.clear();
					for (int k = 0; k < auxiliarfinalsolutionarray.size(); k++) {
						finalsolutionarray.add(auxiliarfinalsolutionarray
								.get(k));
					}
					auxiliarfinalsolutionarray.clear();
					for (int k = 0; k < finalsolutionarray.size(); k++) {
						auxiliarfinalsolutionarray.add(finalsolutionarray
								.get(k));
					}
				}
			}

			FileWriter filewriter = null;
			try {
				filewriter = new FileWriter("Solution_classical_method.txt");
				BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
				PrintWriter printwriter = new PrintWriter(bufferedwriter);

				printwriter.print("··· Rubik's cube solution ···");
				printwriter.println();
				printwriter.println();

				for (int k = 0; k < finalsolutionarray.size(); k++) {
					printwriter.print(k + 1 + ")   "
							+ finalsolutionarray.get(k));
					printwriter.println();
				}
				printwriter.println();
				printwriter.print("Solution found in "
						+ finalsolutionarray.size() + " movements");
				printwriter.close();
				System.out
						.println("Solution has been found in "
								+ finalsolutionarray.size()
								+ " movements. See 'Solution_classical_method.txt' file");
			} catch (Exception e) {
				System.err
						.println("Solution has been found, but it couldn't be exported correctly: "
								+ e);
			}
			Rubikcube.receiveCube(cubesarray);
			isStarted = false;
		}
	}

	/**
	 * Returns whether the Red-White edge is done or not.
	 */
	private boolean isRedWhiteEdgeDone() {
		if (Integer.parseInt(cubesarray.get(8)[1]) == 1
				&& Integer.parseInt(cubesarray.get(8)[2]) == 0
				&& Integer.parseInt(cubesarray.get(8)[3]) == 1
				&& Integer.parseInt(cubesarray.get(8)[6]) == 1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Returns whether the Green-White edge is done or not.
	 */
	private boolean isGreenWhiteEdgeDone() {
		if (Integer.parseInt(cubesarray.get(11)[1]) == 0
				&& Integer.parseInt(cubesarray.get(11)[2]) == -1
				&& Integer.parseInt(cubesarray.get(11)[3]) == 1
				&& Integer.parseInt(cubesarray.get(11)[6]) == 1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Returns whether the Blue-White edge is done or not.
	 */
	private boolean isBlueWhiteEdgeDone() {
		if (Integer.parseInt(cubesarray.get(9)[1]) == 0
				&& Integer.parseInt(cubesarray.get(9)[2]) == 1
				&& Integer.parseInt(cubesarray.get(9)[3]) == 1
				&& Integer.parseInt(cubesarray.get(9)[6]) == 1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Returns whether the Orange-White edge is done or not.
	 */
	private boolean isOrangeWhiteEdgeDone() {
		if (Integer.parseInt(cubesarray.get(10)[1]) == -1
				&& Integer.parseInt(cubesarray.get(10)[2]) == 0
				&& Integer.parseInt(cubesarray.get(10)[3]) == 1
				&& Integer.parseInt(cubesarray.get(10)[6]) == 1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Returns whether the Blue-Red edge is done or not.
	 */
	private boolean isBlueRedEdgeDone() {
		if (Integer.parseInt(cubesarray.get(12)[1]) == 1
				&& Integer.parseInt(cubesarray.get(12)[2]) == 1
				&& Integer.parseInt(cubesarray.get(12)[3]) == 0
				&& Integer.parseInt(cubesarray.get(12)[4]) == 1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Returns whether the Blue-Orange edge is done or not.
	 */
	private boolean isBlueOrangeEdgeDone() {
		if (Integer.parseInt(cubesarray.get(13)[1]) == -1
				&& Integer.parseInt(cubesarray.get(13)[2]) == 1
				&& Integer.parseInt(cubesarray.get(13)[3]) == 0
				&& Integer.parseInt(cubesarray.get(13)[4]) == -1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Returns whether the Green-Red edge is done or not.
	 */
	private boolean isGreenRedEdgeDone() {
		if (Integer.parseInt(cubesarray.get(15)[1]) == 1
				&& Integer.parseInt(cubesarray.get(15)[2]) == -1
				&& Integer.parseInt(cubesarray.get(15)[3]) == 0
				&& Integer.parseInt(cubesarray.get(15)[4]) == 1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Returns whether the Blue-Red-White corner is well done or not.
	 */
	private boolean isBlueRedWhiteCornerWellDone() {
		if (Integer.parseInt(cubesarray.get(0)[3]) == 1
				&& Integer.parseInt(cubesarray.get(0)[1]) == 1
				&& Integer.parseInt(cubesarray.get(0)[2]) == 1
				&& Integer.parseInt(cubesarray.get(0)[6]) == 1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Returns whether the Blue-Orange-White corner is well done or not.
	 */
	private boolean isBlueOrangeWhiteCornerWellDone() {
		if (Integer.parseInt(cubesarray.get(1)[1]) == -1
				&& Integer.parseInt(cubesarray.get(1)[2]) == 1
				&& Integer.parseInt(cubesarray.get(1)[3]) == 1
				&& Integer.parseInt(cubesarray.get(1)[6]) == 1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Returns whether the Green-Red-White corner is well done or not.
	 */
	private boolean isGreenRedWhiteCornerWellDone() {
		if (Integer.parseInt(cubesarray.get(3)[1]) == 1
				&& Integer.parseInt(cubesarray.get(3)[2]) == -1
				&& Integer.parseInt(cubesarray.get(3)[3]) == 1
				&& Integer.parseInt(cubesarray.get(3)[6]) == 1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Returns whether the cube is solved or not.
	 */
	public boolean isSolved() {

		if (!isStarted) {
			begin();
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
	 * Rotates the White face Clockwise.
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
	 * Rotates the White face counterClockwise.
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
	 * Rotates the Red face Clockwise.
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
	 * Rotates the Red face counterClockwise.
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
	 * Rotates the Blue face Clockwise.
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
	 * Rotates the Blue face counterClockwise.
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
	 * Rotates the Orange face Clockwise.
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
	 * Rotates the Orange face counterClockwise.
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
	 * Rotates the Green face Clockwise.
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
	 * Rotates the Green face counterClockwise.
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
	 * Rotates the Yellow face Clockwise.
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
	 * Rotates the Yellow face counterClockwise.
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
	 * Draws the extended cube, showing the current position of the pieces.
	 */
	public void drawCube(JFrame frame, Drawingpanel drawingpanel,
			ArrayList<String[]> c) {
		for (int i = 0; i < c.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarray.get(i)[j] = c.get(i)[j];
			}
		}
		drawingpanel.showcube(cubesarray);
		frame.setVisible(true);
	}

	/**
	 * Sets the Red-White edge in its position.
	 */
	private void setRedWhiteEdge() {
		while (!isRedWhiteEdgeDone()) {
			if (numberofmovements < 5) {

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
					solutionarray.add("rotate Yellow face CounterClockwise");
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
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
		numberofmovements = 0;
		for (int i = 0; i < solutionarray.size(); i++) {
			finalsolutionarray.add(solutionarray.get(i));
		}
		solutionarray.clear();
	}

	/**
	 * Sets the Blue-White edge in its position.
	 */
	private void setBlueWhiteEdge() {
		while (!isBlueWhiteEdgeDone() || !isRedWhiteEdgeDone()) {
			if (numberofmovements < 5) {

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
					solutionarray.add("rotate Yellow face CounterClockwise");
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
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
		numberofmovements = 0;
		for (int i = 0; i < solutionarray.size(); i++) {
			finalsolutionarray.add(solutionarray.get(i));
		}
		solutionarray.clear();
	}

	/**
	 * Sets the Orange-White edge in its position.
	 */
	private void setOrangeWhiteEdge() {
		while (!isOrangeWhiteEdgeDone() || !isBlueWhiteEdgeDone()
				|| !isRedWhiteEdgeDone()) {
			if (numberofmovements < 5) {

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
					solutionarray.add("rotate Yellow face CounterClockwise");
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
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
		numberofmovements = 0;
		for (int i = 0; i < solutionarray.size(); i++) {
			finalsolutionarray.add(solutionarray.get(i));
		}
		solutionarray.clear();
	}

	/**
	 * Sets the Green-White edge in its position.
	 */
	private void setGreenWhiteEdge() {
		while (!isGreenWhiteEdgeDone() || !isOrangeWhiteEdgeDone()
				|| !isBlueWhiteEdgeDone() || !isRedWhiteEdgeDone()) {
			if (numberofmovements < 5) {

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
					solutionarray.add("rotate Yellow face CounterClockwise");
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
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
		numberofmovements = 0;
		for (int i = 0; i < solutionarray.size(); i++) {
			finalsolutionarray.add(solutionarray.get(i));
		}
		solutionarray.clear();
	}

	/**
	 * Sets the Blue-Red-White in its position.
	 */
	private void setBlueRedWhiteCorner() {
		while (!isBlueRedWhiteCornerWellDone() || !isGreenWhiteEdgeDone()
				|| !isOrangeWhiteEdgeDone() || !isBlueWhiteEdgeDone()
				|| !isRedWhiteEdgeDone()) {
			if (numberofmovements < 9) {

				randomnumber = (int) (Math.random() * 10);

				if (auxiliarrandomnumber % 2 == 1) {
					while (randomnumber == auxiliarrandomnumber - 1) {
						randomnumber = (int) (Math.random() * 10);
					}
				} else {
					while (randomnumber == auxiliarrandomnumber + 1) {
						randomnumber = (int) (Math.random() * 10);
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
					rotateYellowFaceClockwise();
					solutionarray.add("rotate Yellow face Clockwise");
				}
				if (randomnumber == 9) {
					rotateYellowFaceCounterClockwise();
					solutionarray.add("rotate Yellow face CounterClockwise");
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
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
		numberofmovements = 0;
		for (int i = 0; i < solutionarray.size(); i++) {
			finalsolutionarray.add(solutionarray.get(i));
		}
		solutionarray.clear();
	}

	/**
	 * Sequence which sets the Blue-Red edge in its position.
	 */
	private void sequenceBlueRedEdge() {
		rotateYellowFaceCounterClockwise();
		rotateRedFaceClockwise();
		rotateYellowFaceCounterClockwise();
		rotateYellowFaceCounterClockwise();
		rotateRedFaceCounterClockwise();
		rotateBlueFaceCounterClockwise();
		rotateYellowFaceCounterClockwise();
		rotateYellowFaceCounterClockwise();
		rotateBlueFaceClockwise();
		rotateYellowFaceCounterClockwise();
		rotateBlueFaceCounterClockwise();
		rotateYellowFaceCounterClockwise();
		rotateBlueFaceClockwise();
		rotateYellowFaceCounterClockwise();
		rotateYellowFaceCounterClockwise();
		rotateRedFaceClockwise();
		rotateYellowFaceCounterClockwise();
		rotateRedFaceCounterClockwise();
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Red face Clockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Red face CounterClockwise");
		finalsolutionarray.add("rotate Blue face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Blue face Clockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Blue face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Blue face Clockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Red face Clockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Red face CounterClockwise");
	}

	/**
	 * Sets the Blue-Red edge at the bottom of the cube.
	 */
	private void setBlueRedEdgeDown() {
		while (Integer.parseInt(cubesarray.get(12)[6]) != 0
				|| Integer.parseInt(cubesarray.get(12)[3]) != -1
				|| !isBlueRedWhiteCornerWellDone() || !isGreenWhiteEdgeDone()
				|| !isOrangeWhiteEdgeDone() || !isBlueWhiteEdgeDone()
				|| !isRedWhiteEdgeDone()) {
			if (numberofmovements < 6) {

				randomnumber = (int) (Math.random() * 10);

				if (auxiliarrandomnumber % 2 == 1) {
					while (randomnumber == auxiliarrandomnumber - 1) {
						randomnumber = (int) (Math.random() * 10);
					}
				} else {
					while (randomnumber == auxiliarrandomnumber + 1) {
						randomnumber = (int) (Math.random() * 10);
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
					rotateYellowFaceClockwise();
					solutionarray.add("rotate Yellow face Clockwise");
				}
				if (randomnumber == 9) {
					rotateYellowFaceCounterClockwise();
					solutionarray.add("rotate Yellow face CounterClockwise");
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
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
		numberofmovements = 0;
		for (int i = 0; i < solutionarray.size(); i++) {
			finalsolutionarray.add(solutionarray.get(i));
		}
		solutionarray.clear();
	}

	/**
	 * Sets the Blue-Red edge in position, so that it can be well placed using
	 * its sequence.
	 */
	private void setBlueRedEdgeInPosition() {
		while (Integer.parseInt(cubesarray.get(12)[3]) != -1
				|| Integer.parseInt(cubesarray.get(12)[2]) != 0
				|| Integer.parseInt(cubesarray.get(12)[1]) != 1
				|| Integer.parseInt(cubesarray.get(12)[4]) != 1
				|| !isBlueRedWhiteCornerWellDone() || !isGreenWhiteEdgeDone()
				|| !isOrangeWhiteEdgeDone() || !isBlueWhiteEdgeDone()
				|| !isRedWhiteEdgeDone()) {
			if (numberofmovements < 3) {

				randomnumber = (int) (Math.random() * 2);

				if (auxiliarrandomnumber % 2 == 1) {
					while (randomnumber == auxiliarrandomnumber - 1) {
						randomnumber = (int) (Math.random() * 2);
					}
				} else {
					while (randomnumber == auxiliarrandomnumber + 1) {
						randomnumber = (int) (Math.random() * 2);
					}
				}

				auxiliarrandomnumber = randomnumber;
				numberofmovements = numberofmovements + 1;

				if (randomnumber == 0) {
					rotateYellowFaceClockwise();
					solutionarray.add("rotate Yellow face Clockwise");
				}
				if (randomnumber == 1) {
					rotateYellowFaceCounterClockwise();
					solutionarray.add("rotate Yellow face CounterClockwise");
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
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
		numberofmovements = 0;
		for (int i = 0; i < solutionarray.size(); i++) {
			finalsolutionarray.add(solutionarray.get(i));
		}
		solutionarray.clear();
	}

	/**
	 * Sets the Green-Red-White corner at the bottom of the cube.
	 */
	private void setGreenRedWhiteCornerDown() {
		if (!isGreenRedWhiteCornerWellDone()) {
			while (Integer.parseInt(cubesarray.get(3)[3]) != -1
					|| Integer.parseInt(cubesarray.get(3)[6]) == -1
					|| !isBlueRedEdgeDone() || !isBlueRedWhiteCornerWellDone()
					|| !isGreenWhiteEdgeDone() || !isOrangeWhiteEdgeDone()
					|| !isBlueWhiteEdgeDone() || !isRedWhiteEdgeDone()) {
				if (numberofmovements < 7) {

					randomnumber = (int) (Math.random() * 10);

					if (auxiliarrandomnumber % 2 == 1) {
						while (randomnumber == auxiliarrandomnumber - 1) {
							randomnumber = (int) (Math.random() * 10);
						}
					} else {
						while (randomnumber == auxiliarrandomnumber + 1) {
							randomnumber = (int) (Math.random() * 10);
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
						solutionarray
								.add("rotate Orange face CounterClockwise");
					}
					if (randomnumber == 8) {
						rotateYellowFaceClockwise();
						solutionarray.add("rotate Yellow face Clockwise");
					}
					if (randomnumber == 9) {
						rotateYellowFaceCounterClockwise();
						solutionarray
								.add("rotate Yellow face CounterClockwise");
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
			for (int i = 0; i < cubesarray.size(); i++) {
				for (int j = 0; j < 7; j++) {
					cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
				}
			}
			numberofmovements = 0;
			for (int i = 0; i < solutionarray.size(); i++) {
				finalsolutionarray.add(solutionarray.get(i));
			}
			solutionarray.clear();
		}
	}

	/**
	 * Sets the Green-Red-White corner well placed.
	 */
	private void setGreenRedWhiteCorner() {
		while (!isGreenRedWhiteCornerWellDone() || !isBlueRedEdgeDone()
				|| !isBlueRedWhiteCornerWellDone() || !isGreenWhiteEdgeDone()
				|| !isOrangeWhiteEdgeDone() || !isBlueWhiteEdgeDone()
				|| !isRedWhiteEdgeDone()) {
			if (numberofmovements < 5) {

				randomnumber = (int) (Math.random() * 10);

				if (auxiliarrandomnumber % 2 == 1) {
					while (randomnumber == auxiliarrandomnumber - 1) {
						randomnumber = (int) (Math.random() * 10);
					}
				} else {
					while (randomnumber == auxiliarrandomnumber + 1) {
						randomnumber = (int) (Math.random() * 10);
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
					rotateYellowFaceClockwise();
					solutionarray.add("rotate Yellow face Clockwise");
				}
				if (randomnumber == 9) {
					rotateYellowFaceCounterClockwise();
					solutionarray.add("rotate Yellow face CounterClockwise");
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
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
		numberofmovements = 0;
		for (int i = 0; i < solutionarray.size(); i++) {
			finalsolutionarray.add(solutionarray.get(i));
		}
		solutionarray.clear();
	}

	/**
	 * Sets the Green-Red edge in position, so that it can be well placed using
	 * its sequence.
	 */
	private void setGreenRedEdgeInPosition() {
		while (Integer.parseInt(cubesarray.get(15)[3]) != -1
				|| Integer.parseInt(cubesarray.get(15)[6]) != -1
				|| Integer.parseInt(cubesarray.get(15)[1]) != 0
				|| Integer.parseInt(cubesarray.get(15)[2]) != -1
				|| !isBlueRedEdgeDone() || !isBlueRedWhiteCornerWellDone()
				|| !isGreenWhiteEdgeDone() || !isOrangeWhiteEdgeDone()
				|| !isBlueWhiteEdgeDone() || !isRedWhiteEdgeDone()) {
			if (numberofmovements < 3) {

				randomnumber = (int) (Math.random() * 2);

				if (auxiliarrandomnumber % 2 == 1) {
					while (randomnumber == auxiliarrandomnumber - 1) {
						randomnumber = (int) (Math.random() * 2);
					}
				} else {
					while (randomnumber == auxiliarrandomnumber + 1) {
						randomnumber = (int) (Math.random() * 2);
					}
				}

				auxiliarrandomnumber = randomnumber;
				numberofmovements = numberofmovements + 1;

				if (randomnumber == 0) {
					rotateYellowFaceClockwise();
					solutionarray.add("rotate Yellow face Clockwise");
				}
				if (randomnumber == 1) {
					rotateYellowFaceCounterClockwise();
					solutionarray.add("rotate Yellow face CounterClockwise");
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
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
		numberofmovements = 0;
		for (int i = 0; i < solutionarray.size(); i++) {
			finalsolutionarray.add(solutionarray.get(i));
		}
		solutionarray.clear();
	}

	/**
	 * Sequence which sets the Green-Red edge in its position.
	 */
	private void sequenceGreenRedEdge() {
		rotateYellowFaceCounterClockwise();
		rotateGreenFaceClockwise();
		rotateYellowFaceCounterClockwise();
		rotateYellowFaceCounterClockwise();
		rotateGreenFaceCounterClockwise();
		rotateRedFaceCounterClockwise();
		rotateYellowFaceCounterClockwise();
		rotateYellowFaceCounterClockwise();
		rotateRedFaceClockwise();
		rotateYellowFaceCounterClockwise();
		rotateRedFaceCounterClockwise();
		rotateYellowFaceCounterClockwise();
		rotateRedFaceClockwise();
		rotateYellowFaceCounterClockwise();
		rotateYellowFaceCounterClockwise();
		rotateGreenFaceClockwise();
		rotateYellowFaceCounterClockwise();
		rotateGreenFaceCounterClockwise();
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Green face Clockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Green face CounterClockwise");
		finalsolutionarray.add("rotate Red face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Red face Clockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Red face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Red face Clockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Green face Clockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Green face CounterClockwise");
	}

	/**
	 * Sets the Green-Red edge at the bottom of the cube.
	 */
	private void setGreenRedEdgeDown() {
		while (Integer.parseInt(cubesarray.get(15)[6]) != -1
				|| Integer.parseInt(cubesarray.get(15)[3]) != -1
				|| !isGreenRedWhiteCornerWellDone() || !isBlueRedEdgeDone()
				|| !isBlueRedWhiteCornerWellDone() || !isGreenWhiteEdgeDone()
				|| !isOrangeWhiteEdgeDone() || !isBlueWhiteEdgeDone()
				|| !isRedWhiteEdgeDone()) {
			if (numberofmovements < 6) {

				randomnumber = (int) (Math.random() * 10);

				if (auxiliarrandomnumber % 2 == 1) {
					while (randomnumber == auxiliarrandomnumber - 1) {
						randomnumber = (int) (Math.random() * 10);
					}
				} else {
					while (randomnumber == auxiliarrandomnumber + 1) {
						randomnumber = (int) (Math.random() * 10);
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
					rotateYellowFaceClockwise();
					solutionarray.add("rotate Yellow face Clockwise");
				}
				if (randomnumber == 9) {
					rotateYellowFaceCounterClockwise();
					solutionarray.add("rotate Yellow face CounterClockwise");
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
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
		numberofmovements = 0;
		for (int i = 0; i < solutionarray.size(); i++) {
			finalsolutionarray.add(solutionarray.get(i));
		}
		solutionarray.clear();
	}

	/**
	 * Sets the Blue-Orange-White corner at the bottom of the cube.
	 */
	private void setBlueOrangeWhiteCornerDown() {
		if (!isBlueOrangeWhiteCornerWellDone()) {
			while (Integer.parseInt(cubesarray.get(1)[3]) != -1
					|| Integer.parseInt(cubesarray.get(1)[6]) != 0
					|| !isGreenRedEdgeDone()
					|| !isGreenRedWhiteCornerWellDone() || !isBlueRedEdgeDone()
					|| !isBlueRedWhiteCornerWellDone()
					|| !isGreenWhiteEdgeDone() || !isOrangeWhiteEdgeDone()
					|| !isBlueWhiteEdgeDone() || !isRedWhiteEdgeDone()) {
				if (numberofmovements < 5) {

					randomnumber = (int) (Math.random() * 8);

					if (auxiliarrandomnumber % 2 == 1) {
						while (randomnumber == auxiliarrandomnumber - 1) {
							randomnumber = (int) (Math.random() * 8);
						}
					} else {
						while (randomnumber == auxiliarrandomnumber + 1) {
							randomnumber = (int) (Math.random() * 8);
						}
					}

					auxiliarrandomnumber = randomnumber;
					numberofmovements = numberofmovements + 1;

					if (randomnumber == 0) {
						rotateBlueFaceClockwise();
						solutionarray.add("rotate Blue face Clockwise");
					}
					if (randomnumber == 1) {
						rotateBlueFaceCounterClockwise();
						solutionarray.add("rotate Blue face CounterClockwise");
					}
					if (randomnumber == 2) {
						rotateGreenFaceClockwise();
						solutionarray.add("rotate Green face Clockwise");
					}
					if (randomnumber == 3) {
						rotateGreenFaceCounterClockwise();
						solutionarray.add("rotate Green face CounterClockwise");
					}
					if (randomnumber == 4) {
						rotateOrangeFaceClockwise();
						solutionarray.add("rotate Orange face Clockwise");
					}
					if (randomnumber == 5) {
						rotateOrangeFaceCounterClockwise();
						solutionarray
								.add("rotate Orange face CounterClockwise");
					}
					if (randomnumber == 6) {
						rotateYellowFaceClockwise();
						solutionarray.add("rotate Yellow face Clockwise");
					}
					if (randomnumber == 7) {
						rotateYellowFaceCounterClockwise();
						solutionarray
								.add("rotate Yellow face CounterClockwise");
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
			for (int i = 0; i < cubesarray.size(); i++) {
				for (int j = 0; j < 7; j++) {
					cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
				}
			}
			numberofmovements = 0;
			for (int i = 0; i < solutionarray.size(); i++) {
				finalsolutionarray.add(solutionarray.get(i));
			}
			solutionarray.clear();
		}
	}

	/**
	 * Sets the Blue-Orange-White corner well placed.
	 */
	private void setBlueOrangeWhiteCorner() {
		while (!isBlueOrangeWhiteCornerWellDone() || !isGreenRedEdgeDone()
				|| !isGreenRedWhiteCornerWellDone() || !isBlueRedEdgeDone()
				|| !isBlueRedWhiteCornerWellDone() || !isGreenWhiteEdgeDone()
				|| !isOrangeWhiteEdgeDone() || !isBlueWhiteEdgeDone()
				|| !isRedWhiteEdgeDone()) {
			if (numberofmovements < 6) {

				randomnumber = (int) (Math.random() * 10);

				if (auxiliarrandomnumber % 2 == 1) {
					while (randomnumber == auxiliarrandomnumber - 1) {
						randomnumber = (int) (Math.random() * 10);
					}
				} else {
					while (randomnumber == auxiliarrandomnumber + 1) {
						randomnumber = (int) (Math.random() * 10);
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
					rotateYellowFaceClockwise();
					solutionarray.add("rotate Yellow face Clockwise");
				}
				if (randomnumber == 9) {
					rotateYellowFaceCounterClockwise();
					solutionarray.add("rotate Yellow face CounterClockwise");
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
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
		numberofmovements = 0;
		for (int i = 0; i < solutionarray.size(); i++) {
			finalsolutionarray.add(solutionarray.get(i));
		}
		solutionarray.clear();
	}

	/**
	 * Sequence which sets the Blue-Orange edge in its position.
	 */
	private void sequenceBlueOrangeEdge() {
		rotateYellowFaceClockwise();
		rotateOrangeFaceCounterClockwise();
		rotateYellowFaceClockwise();
		rotateYellowFaceClockwise();
		rotateOrangeFaceClockwise();
		rotateBlueFaceClockwise();
		rotateYellowFaceClockwise();
		rotateYellowFaceClockwise();
		rotateBlueFaceCounterClockwise();
		rotateYellowFaceClockwise();
		rotateBlueFaceClockwise();
		rotateYellowFaceClockwise();
		rotateBlueFaceCounterClockwise();
		rotateYellowFaceClockwise();
		rotateYellowFaceClockwise();
		rotateOrangeFaceCounterClockwise();
		rotateYellowFaceClockwise();
		rotateOrangeFaceClockwise();
		finalsolutionarray.add("rotate Yellow face Clockwise");
		finalsolutionarray.add("rotate Orange face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face Clockwise");
		finalsolutionarray.add("rotate Yellow face Clockwise");
		finalsolutionarray.add("rotate Orange face Clockwise");
		finalsolutionarray.add("rotate Blue face Clockwise");
		finalsolutionarray.add("rotate Yellow face Clockwise");
		finalsolutionarray.add("rotate Yellow face Clockwise");
		finalsolutionarray.add("rotate Blue face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face Clockwise");
		finalsolutionarray.add("rotate Blue face Clockwise");
		finalsolutionarray.add("rotate Yellow face Clockwise");
		finalsolutionarray.add("rotate Blue face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face Clockwise");
		finalsolutionarray.add("rotate Yellow face Clockwise");
		finalsolutionarray.add("rotate Orange face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face Clockwise");
		finalsolutionarray.add("rotate Orange face Clockwise");
	}

	/**
	 * Sets the Blue-Orange edge at the bottom of the cube.
	 */
	private void setBlueOrangeEdgeDown() {
		while (Integer.parseInt(cubesarray.get(13)[6]) == -1
				|| Integer.parseInt(cubesarray.get(13)[3]) != -1
				|| !isGreenRedEdgeDone() || !isGreenRedWhiteCornerWellDone()
				|| !isBlueRedEdgeDone() || !isBlueRedWhiteCornerWellDone()
				|| !isGreenWhiteEdgeDone() || !isOrangeWhiteEdgeDone()
				|| !isBlueWhiteEdgeDone() || !isRedWhiteEdgeDone()) {
			if (numberofmovements < 8) {

				randomnumber = (int) (Math.random() * 10);

				if (auxiliarrandomnumber % 2 == 1) {
					while (randomnumber == auxiliarrandomnumber - 1) {
						randomnumber = (int) (Math.random() * 10);
					}
				} else {
					while (randomnumber == auxiliarrandomnumber + 1) {
						randomnumber = (int) (Math.random() * 10);
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
					rotateYellowFaceClockwise();
					solutionarray.add("rotate Yellow face Clockwise");
				}
				if (randomnumber == 9) {
					rotateYellowFaceCounterClockwise();
					solutionarray.add("rotate Yellow face CounterClockwise");
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
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
		numberofmovements = 0;
		for (int i = 0; i < solutionarray.size(); i++) {
			finalsolutionarray.add(solutionarray.get(i));
		}
		solutionarray.clear();
	}

	/**
	 * Sets the Blue-Orange edge in position, so that it can be well placed
	 * using its sequence.
	 */
	private void setBlueOrangeEdgeInPosition() {
		while (Integer.parseInt(cubesarray.get(13)[1]) != -1
				|| Integer.parseInt(cubesarray.get(13)[2]) != 0
				|| Integer.parseInt(cubesarray.get(13)[3]) != -1
				|| Integer.parseInt(cubesarray.get(13)[6]) == -1
				|| !isGreenRedEdgeDone() || !isGreenRedWhiteCornerWellDone()
				|| !isBlueRedEdgeDone() || !isBlueRedWhiteCornerWellDone()
				|| !isGreenWhiteEdgeDone() || !isOrangeWhiteEdgeDone()
				|| !isBlueWhiteEdgeDone() || !isRedWhiteEdgeDone()) {
			if (numberofmovements < 3) {

				randomnumber = (int) (Math.random() * 2);

				if (auxiliarrandomnumber % 2 == 1) {
					while (randomnumber == auxiliarrandomnumber - 1) {
						randomnumber = (int) (Math.random() * 2);
					}
				} else {
					while (randomnumber == auxiliarrandomnumber + 1) {
						randomnumber = (int) (Math.random() * 2);
					}
				}

				auxiliarrandomnumber = randomnumber;
				numberofmovements = numberofmovements + 1;

				if (randomnumber == 0) {
					rotateYellowFaceClockwise();
					solutionarray.add("rotate Yellow face Clockwise");
				}
				if (randomnumber == 1) {
					rotateYellowFaceCounterClockwise();
					solutionarray.add("rotate Yellow face CounterClockwise");
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
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
		numberofmovements = 0;
		for (int i = 0; i < solutionarray.size(); i++) {
			finalsolutionarray.add(solutionarray.get(i));
		}
		solutionarray.clear();
	}

	/**
	 * Returns whether the Red-Yellow edge is done or not.
	 */
	private boolean isRedYellowEdgeDone() {
		if (Integer.parseInt(cubesarray.get(16)[1]) == 1
				&& Integer.parseInt(cubesarray.get(16)[2]) == 0
				&& Integer.parseInt(cubesarray.get(16)[3]) == -1
				&& Integer.parseInt(cubesarray.get(16)[6]) == -1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Sets the Red-Yellow edge in its position.
	 */
	private void setRedYellowEdge() {
		while (!isRedYellowEdgeDone() || !isBlueOrangeWhiteCornerWellDone()
				|| !isBlueOrangeEdgeDone() || !isGreenRedEdgeDone()
				|| !isGreenRedWhiteCornerWellDone() || !isBlueRedEdgeDone()
				|| !isBlueRedWhiteCornerWellDone() || !isGreenWhiteEdgeDone()
				|| !isOrangeWhiteEdgeDone() || !isBlueWhiteEdgeDone()
				|| !isRedWhiteEdgeDone()) {
			if (numberofmovements < 13) {

				randomnumber = (int) (Math.random() * 6);

				if (auxiliarrandomnumber % 2 == 1) {
					while (randomnumber == auxiliarrandomnumber - 1) {
						randomnumber = (int) (Math.random() * 6);
					}
				} else {
					while (randomnumber == auxiliarrandomnumber + 1) {
						randomnumber = (int) (Math.random() * 6);
					}
				}

				auxiliarrandomnumber = randomnumber;
				numberofmovements = numberofmovements + 1;

				if (randomnumber == 0) {
					rotateYellowFaceClockwise();
					solutionarray.add("rotate Yellow face Clockwise");
				}
				if (randomnumber == 1) {
					rotateYellowFaceCounterClockwise();
					solutionarray.add("rotate Yellow face CounterClockwise");
				}
				if (randomnumber == 2) {
					rotateOrangeFaceClockwise();
					solutionarray.add("rotate Orange face Clockwise");
				}
				if (randomnumber == 3) {
					rotateOrangeFaceCounterClockwise();
					solutionarray.add("rotate Orange face CounterClockwise");
				}
				if (randomnumber == 4) {
					rotateGreenFaceClockwise();
					solutionarray.add("rotate Green face Clockwise");
				}
				if (randomnumber == 5) {
					rotateGreenFaceCounterClockwise();
					solutionarray.add("rotate Green face CounterClockwise");
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
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
		numberofmovements = 0;
		for (int i = 0; i < solutionarray.size(); i++) {
			finalsolutionarray.add(solutionarray.get(i));
		}
		solutionarray.clear();
	}

	/**
	 * Returns whether the Orange-Yellow edge is done or not.
	 */
	private boolean isOrangeYellowEdgeDone() {
		if (Integer.parseInt(cubesarray.get(18)[1]) == -1
				&& Integer.parseInt(cubesarray.get(18)[2]) == 0
				&& Integer.parseInt(cubesarray.get(18)[3]) == -1
				&& Integer.parseInt(cubesarray.get(18)[6]) == -1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Sets the Orange-Yellow edge in its position.
	 */
	private void setOrangeYellowEdge() {
		while (!isBlueYellowEdgeDone() || !isOrangeYellowEdgeDone()
				|| !isRedYellowEdgeDone() || !isBlueOrangeWhiteCornerWellDone()
				|| !isBlueOrangeEdgeDone() || !isGreenRedEdgeDone()
				|| !isGreenRedWhiteCornerWellDone() || !isBlueRedEdgeDone()
				|| !isBlueRedWhiteCornerWellDone() || !isGreenWhiteEdgeDone()
				|| !isOrangeWhiteEdgeDone() || !isBlueWhiteEdgeDone()
				|| !isRedWhiteEdgeDone()) {
			if (numberofmovements < 13) {

				randomnumber = (int) (Math.random() * 6);

				if (auxiliarrandomnumber % 2 == 1) {
					while (randomnumber == auxiliarrandomnumber - 1) {
						randomnumber = (int) (Math.random() * 6);
					}
				} else {
					while (randomnumber == auxiliarrandomnumber + 1) {
						randomnumber = (int) (Math.random() * 6);
					}
				}

				auxiliarrandomnumber = randomnumber;
				numberofmovements = numberofmovements + 1;

				if (randomnumber == 0) {
					rotateYellowFaceClockwise();
					solutionarray.add("rotate Yellow face Clockwise");
				}
				if (randomnumber == 1) {
					rotateYellowFaceCounterClockwise();
					solutionarray.add("rotate Yellow face CounterClockwise");
				}
				if (randomnumber == 2) {
					rotateOrangeFaceClockwise();
					solutionarray.add("rotate Orange face Clockwise");
				}
				if (randomnumber == 3) {
					rotateOrangeFaceCounterClockwise();
					solutionarray.add("rotate Orange face CounterClockwise");
				}
				if (randomnumber == 4) {
					rotateGreenFaceClockwise();
					solutionarray.add("rotate Green face Clockwise");
				}
				if (randomnumber == 5) {
					rotateGreenFaceCounterClockwise();
					solutionarray.add("rotate Green face CounterClockwise");
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
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
		numberofmovements = 0;
		for (int i = 0; i < solutionarray.size(); i++) {
			finalsolutionarray.add(solutionarray.get(i));
		}
		solutionarray.clear();
	}

	/**
	 * Returns whether the Blue-Yellow edge is done or not.
	 */
	private boolean isBlueYellowEdgeDone() {
		if (Integer.parseInt(cubesarray.get(17)[1]) == 0
				&& Integer.parseInt(cubesarray.get(17)[2]) == 1
				&& Integer.parseInt(cubesarray.get(17)[3]) == -1
				&& Integer.parseInt(cubesarray.get(17)[6]) == -1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Sets the Blue-Yellow edge in its position.
	 */
	private void setBlueYellowEdge() {
		while (!isBlueYellowEdgeDone() || !isRedYellowEdgeDone()
				|| !isBlueOrangeWhiteCornerWellDone()
				|| !isBlueOrangeEdgeDone() || !isGreenRedEdgeDone()
				|| !isGreenRedWhiteCornerWellDone() || !isBlueRedEdgeDone()
				|| !isBlueRedWhiteCornerWellDone() || !isGreenWhiteEdgeDone()
				|| !isOrangeWhiteEdgeDone() || !isBlueWhiteEdgeDone()
				|| !isRedWhiteEdgeDone()) {
			if (numberofmovements < 10) {

				randomnumber = (int) (Math.random() * 6);

				if (auxiliarrandomnumber % 2 == 1) {
					while (randomnumber == auxiliarrandomnumber - 1) {
						randomnumber = (int) (Math.random() * 6);
					}
				} else {
					while (randomnumber == auxiliarrandomnumber + 1) {
						randomnumber = (int) (Math.random() * 6);
					}
				}

				auxiliarrandomnumber = randomnumber;
				numberofmovements = numberofmovements + 1;

				if (randomnumber == 0) {
					rotateYellowFaceClockwise();
					solutionarray.add("rotate Yellow face Clockwise");
				}
				if (randomnumber == 1) {
					rotateYellowFaceCounterClockwise();
					solutionarray.add("rotate Yellow face CounterClockwise");
				}
				if (randomnumber == 2) {
					rotateOrangeFaceClockwise();
					solutionarray.add("rotate Orange face Clockwise");
				}
				if (randomnumber == 3) {
					rotateOrangeFaceCounterClockwise();
					solutionarray.add("rotate Orange face CounterClockwise");
				}
				if (randomnumber == 4) {
					rotateGreenFaceClockwise();
					solutionarray.add("rotate Green face Clockwise");
				}
				if (randomnumber == 5) {
					rotateGreenFaceCounterClockwise();
					solutionarray.add("rotate Green face CounterClockwise");
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
		for (int i = 0; i < cubesarray.size(); i++) {
			for (int j = 0; j < 7; j++) {
				cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
			}
		}
		numberofmovements = 0;
		for (int i = 0; i < solutionarray.size(); i++) {
			finalsolutionarray.add(solutionarray.get(i));
		}
		solutionarray.clear();
	}

	/**
	 * Returns whether the Blue-Yellow edge is done or not.
	 */
	private boolean isGreenYellowEdgeDone() {
		if (Integer.parseInt(cubesarray.get(19)[1]) == 0
				&& Integer.parseInt(cubesarray.get(19)[2]) == -1
				&& Integer.parseInt(cubesarray.get(19)[3]) == -1
				&& Integer.parseInt(cubesarray.get(19)[6]) == -1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Sequence which sets the Green-Yellow edge in its position.
	 */
	private void sequenceGreenYellowEdge() {
		if (Integer.parseInt(cubesarray.get(19)[4]) == -1) {
			rotateGreenFaceCounterClockwise();
			rotateYellowFaceClockwise();
			rotateGreenFaceClockwise();
			rotateYellowFaceClockwise();
			rotateGreenFaceCounterClockwise();
			rotateYellowFaceClockwise();
			rotateGreenFaceClockwise();
			rotateYellowFaceClockwise();
			rotateGreenFaceCounterClockwise();
			rotateYellowFaceClockwise();
			rotateGreenFaceClockwise();
			finalsolutionarray.add("rotate Green face CounterClockwise");
			finalsolutionarray.add("rotate Yellow face Clockwise");
			finalsolutionarray.add("rotate Green face Clockwise");
			finalsolutionarray.add("rotate Yellow face Clockwise");
			finalsolutionarray.add("rotate Green face CounterClockwise");
			finalsolutionarray.add("rotate Yellow face Clockwise");
			finalsolutionarray.add("rotate Green face Clockwise");
			finalsolutionarray.add("rotate Yellow face Clockwise");
			finalsolutionarray.add("rotate Green face CounterClockwise");
			finalsolutionarray.add("rotate Yellow face Clockwise");
			finalsolutionarray.add("rotate Green face Clockwise");
		} else {
			if (Integer.parseInt(cubesarray.get(19)[3]) == -1) {
				rotateYellowFaceCounterClockwise();
				rotateGreenFaceCounterClockwise();
				rotateYellowFaceClockwise();
				rotateGreenFaceClockwise();
				rotateYellowFaceCounterClockwise();
				rotateOrangeFaceClockwise();
				rotateYellowFaceCounterClockwise();
				rotateOrangeFaceCounterClockwise();
				rotateYellowFaceClockwise();
				rotateYellowFaceClockwise();
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
				finalsolutionarray.add("rotate Green face CounterClockwise");
				finalsolutionarray.add("rotate Yellow face Clockwise");
				finalsolutionarray.add("rotate Green face Clockwise");
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
				finalsolutionarray.add("rotate Orange face Clockwise");
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
				finalsolutionarray.add("rotate Orange face CounterClockwise");
				finalsolutionarray.add("rotate Yellow face Clockwise");
				finalsolutionarray.add("rotate Yellow face Clockwise");
			} else {
				rotateYellowFaceCounterClockwise();
				rotateOrangeFaceClockwise();
				rotateYellowFaceCounterClockwise();
				rotateOrangeFaceCounterClockwise();
				rotateYellowFaceCounterClockwise();
				rotateOrangeFaceClockwise();
				rotateYellowFaceCounterClockwise();
				rotateOrangeFaceCounterClockwise();
				rotateYellowFaceCounterClockwise();
				rotateOrangeFaceClockwise();
				rotateYellowFaceCounterClockwise();
				rotateOrangeFaceCounterClockwise();
				rotateYellowFaceClockwise();
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
				finalsolutionarray.add("rotate Orange face Clockwise");
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
				finalsolutionarray.add("rotate Orange face CounterClockwise");
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
				finalsolutionarray.add("rotate Orange face Clockwise");
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
				finalsolutionarray.add("rotate Orange face CounterClockwise");
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
				finalsolutionarray.add("rotate Orange face Clockwise");
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
				finalsolutionarray.add("rotate Orange face CounterClockwise");
				finalsolutionarray.add("rotate Yellow face Clockwise");
			}
		}
	}

	/**
	 * Returns whether the Blue-Orange-Yellow corner is done or not.
	 * 
	 * @return
	 */
	private boolean isBlueOrangeYellowCornerWellDone() {
		if (Integer.parseInt(cubesarray.get(4)[1]) == -1
				&& Integer.parseInt(cubesarray.get(4)[2]) == 1
				&& Integer.parseInt(cubesarray.get(4)[3]) == -1
				&& Integer.parseInt(cubesarray.get(4)[6]) == -1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Returns whether the Blue-Red-Yellow corner is done or not.
	 * 
	 * @return
	 */
	private boolean isBlueRedYellowCornerWellDone() {
		if (Integer.parseInt(cubesarray.get(5)[1]) == 1
				&& Integer.parseInt(cubesarray.get(5)[2]) == 1
				&& Integer.parseInt(cubesarray.get(5)[3]) == -1
				&& Integer.parseInt(cubesarray.get(5)[6]) == -1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Returns whether the Green-Red-Yellow corner is done or not.
	 * 
	 * @return
	 */
	private boolean isGreenRedYellowCornerWellDone() {
		if (Integer.parseInt(cubesarray.get(6)[1]) == 1
				&& Integer.parseInt(cubesarray.get(6)[2]) == -1
				&& Integer.parseInt(cubesarray.get(6)[3]) == -1
				&& Integer.parseInt(cubesarray.get(6)[6]) == -1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Returns whether the Green-Orange-Yellow corner is done or not.
	 * 
	 * @return
	 */
	private boolean isGreenOrangeYellowCornerWellDone() {
		if (Integer.parseInt(cubesarray.get(7)[1]) == -1
				&& Integer.parseInt(cubesarray.get(7)[2]) == -1
				&& Integer.parseInt(cubesarray.get(7)[3]) == -1
				&& Integer.parseInt(cubesarray.get(7)[6]) == -1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Sets the every corner in its position, although they are unoriented.
	 */
	private void setFinalCorners() {
		if ((Integer.parseInt(cubesarray.get(4)[1]) == -1
				&& Integer.parseInt(cubesarray.get(4)[2]) == -1 && Integer
				.parseInt(cubesarray.get(4)[3]) == -1)) {
			rotateYellowFaceClockwise();
			rotateYellowFaceClockwise();
			rotateBlueFaceClockwise();
			rotateWhiteFaceClockwise();
			rotateWhiteFaceClockwise();
			rotateBlueFaceCounterClockwise();
			rotateYellowFaceClockwise();
			rotateBlueFaceClockwise();
			rotateWhiteFaceClockwise();
			rotateWhiteFaceClockwise();
			rotateBlueFaceCounterClockwise();
			rotateYellowFaceClockwise();
			finalsolutionarray.add("rotate Yellow face Clockwise");
			finalsolutionarray.add("rotate Yellow face Clockwise");
			finalsolutionarray.add("rotate Blue face Clockwise");
			finalsolutionarray.add("rotate White face Clockwise");
			finalsolutionarray.add("rotate White face Clockwise");
			finalsolutionarray.add("rotate Blue face CounterClockwise");
			finalsolutionarray.add("rotate Yellow face Clockwise");
			finalsolutionarray.add("rotate Blue face Clockwise");
			finalsolutionarray.add("rotate White face Clockwise");
			finalsolutionarray.add("rotate White face Clockwise");
			finalsolutionarray.add("rotate Blue face CounterClockwise");
			finalsolutionarray.add("rotate Yellow face Clockwise");
		} else {
			if ((Integer.parseInt(cubesarray.get(4)[1]) == -1
					&& Integer.parseInt(cubesarray.get(4)[2]) == -1 && Integer
					.parseInt(cubesarray.get(4)[3]) == 1)) {
				rotateYellowFaceCounterClockwise();
				rotateBlueFaceClockwise();
				rotateWhiteFaceClockwise();
				rotateWhiteFaceClockwise();
				rotateBlueFaceCounterClockwise();
				rotateYellowFaceClockwise();
				rotateBlueFaceClockwise();
				rotateWhiteFaceClockwise();
				rotateWhiteFaceClockwise();
				rotateBlueFaceCounterClockwise();
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
				finalsolutionarray.add("rotate Blue face Clockwise");
				finalsolutionarray.add("rotate White face Clockwise");
				finalsolutionarray.add("rotate White face Clockwise");
				finalsolutionarray.add("rotate Blue face CounterClockwise");
				finalsolutionarray.add("rotate Yellow face Clockwise");
				finalsolutionarray.add("rotate Blue face Clockwise");
				finalsolutionarray.add("rotate White face Clockwise");
				finalsolutionarray.add("rotate White face Clockwise");
				finalsolutionarray.add("rotate Blue face CounterClockwise");
			} else {
				if ((Integer.parseInt(cubesarray.get(4)[1]) == 1
						&& Integer.parseInt(cubesarray.get(4)[2]) == 1 && Integer
						.parseInt(cubesarray.get(4)[3]) == -1)) {
					rotateBlueFaceClockwise();
					rotateWhiteFaceClockwise();
					rotateWhiteFaceClockwise();
					rotateBlueFaceCounterClockwise();
					rotateYellowFaceCounterClockwise();
					rotateBlueFaceClockwise();
					rotateWhiteFaceClockwise();
					rotateWhiteFaceClockwise();
					rotateBlueFaceCounterClockwise();
					rotateYellowFaceClockwise();
					finalsolutionarray.add("rotate Blue face Clockwise");
					finalsolutionarray.add("rotate White face Clockwise");
					finalsolutionarray.add("rotate White face Clockwise");
					finalsolutionarray.add("rotate Blue face CounterClockwise");
					finalsolutionarray
							.add("rotate Yellow face CounterClockwise");
					finalsolutionarray.add("rotate Blue face Clockwise");
					finalsolutionarray.add("rotate White face Clockwise");
					finalsolutionarray.add("rotate White face Clockwise");
					finalsolutionarray.add("rotate Blue face CounterClockwise");
					finalsolutionarray.add("rotate Yellow face Clockwise");
				} else {
					if ((Integer.parseInt(cubesarray.get(4)[1]) == 1
							&& Integer.parseInt(cubesarray.get(4)[2]) == -1 && Integer
							.parseInt(cubesarray.get(4)[3]) == -1)) {
						rotateYellowFaceClockwise();
						rotateBlueFaceClockwise();
						rotateWhiteFaceClockwise();
						rotateWhiteFaceClockwise();
						rotateBlueFaceCounterClockwise();
						rotateYellowFaceCounterClockwise();
						rotateYellowFaceCounterClockwise();
						rotateBlueFaceClockwise();
						rotateWhiteFaceClockwise();
						rotateWhiteFaceClockwise();
						rotateBlueFaceCounterClockwise();
						rotateYellowFaceClockwise();
						finalsolutionarray.add("rotate Yellow face Clockwise");
						finalsolutionarray.add("rotate Blue face Clockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray
								.add("rotate Blue face CounterClockwise");
						finalsolutionarray
								.add("rotate Yellow face CounterClockwise");
						finalsolutionarray
								.add("rotate Yellow face CounterClockwise");
						finalsolutionarray.add("rotate Blue face Clockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray
								.add("rotate Blue face CounterClockwise");
						finalsolutionarray.add("rotate Yellow face Clockwise");
					}
				}
			}
		}

		if ((Integer.parseInt(cubesarray.get(7)[1]) == -1
				&& Integer.parseInt(cubesarray.get(7)[2]) == -1 && Integer
				.parseInt(cubesarray.get(7)[3]) == 1)) {
			rotateYellowFaceClockwise();
			rotateYellowFaceClockwise();
			rotateBlueFaceClockwise();
			rotateWhiteFaceClockwise();
			rotateWhiteFaceClockwise();
			rotateBlueFaceCounterClockwise();
			rotateYellowFaceCounterClockwise();
			rotateBlueFaceClockwise();
			rotateWhiteFaceClockwise();
			rotateWhiteFaceClockwise();
			rotateBlueFaceCounterClockwise();
			rotateYellowFaceCounterClockwise();
			finalsolutionarray.add("rotate Yellow face Clockwise");
			finalsolutionarray.add("rotate Yellow face Clockwise");
			finalsolutionarray.add("rotate Blue face Clockwise");
			finalsolutionarray.add("rotate White face Clockwise");
			finalsolutionarray.add("rotate White face Clockwise");
			finalsolutionarray.add("rotate Blue face CounterClockwise");
			finalsolutionarray.add("rotate Yellow face CounterClockwise");
			finalsolutionarray.add("rotate Blue face Clockwise");
			finalsolutionarray.add("rotate White face Clockwise");
			finalsolutionarray.add("rotate White face Clockwise");
			finalsolutionarray.add("rotate Blue face CounterClockwise");
			finalsolutionarray.add("rotate Yellow face CounterClockwise");
		} else {
			if ((Integer.parseInt(cubesarray.get(7)[1]) == 1
					&& Integer.parseInt(cubesarray.get(7)[2]) == 1 && Integer
					.parseInt(cubesarray.get(7)[3]) == -1)) {
				rotateBlueFaceClockwise();
				rotateWhiteFaceClockwise();
				rotateWhiteFaceClockwise();
				rotateBlueFaceCounterClockwise();
				rotateYellowFaceClockwise();
				rotateYellowFaceClockwise();
				rotateBlueFaceClockwise();
				rotateWhiteFaceClockwise();
				rotateWhiteFaceClockwise();
				rotateBlueFaceCounterClockwise();
				rotateYellowFaceClockwise();
				rotateYellowFaceClockwise();
				finalsolutionarray.add("rotate Blue face Clockwise");
				finalsolutionarray.add("rotate White face Clockwise");
				finalsolutionarray.add("rotate White face Clockwise");
				finalsolutionarray.add("rotate Blue face CounterClockwise");
				finalsolutionarray.add("rotate Yellow face Clockwise");
				finalsolutionarray.add("rotate Yellow face Clockwise");
				finalsolutionarray.add("rotate Blue face Clockwise");
				finalsolutionarray.add("rotate White face Clockwise");
				finalsolutionarray.add("rotate White face Clockwise");
				finalsolutionarray.add("rotate Blue face CounterClockwise");
				finalsolutionarray.add("rotate Yellow face Clockwise");
				finalsolutionarray.add("rotate Yellow face Clockwise");
			} else {
				if ((Integer.parseInt(cubesarray.get(7)[1]) == 1
						&& Integer.parseInt(cubesarray.get(7)[2]) == -1 && Integer
						.parseInt(cubesarray.get(7)[3]) == -1)) {
					rotateYellowFaceClockwise();
					rotateBlueFaceClockwise();
					rotateWhiteFaceClockwise();
					rotateWhiteFaceClockwise();
					rotateBlueFaceCounterClockwise();
					rotateYellowFaceClockwise();
					rotateBlueFaceClockwise();
					rotateWhiteFaceClockwise();
					rotateWhiteFaceClockwise();
					rotateBlueFaceCounterClockwise();
					rotateYellowFaceClockwise();
					rotateYellowFaceClockwise();
					finalsolutionarray.add("rotate Yellow face Clockwise");
					finalsolutionarray.add("rotate Blue face Clockwise");
					finalsolutionarray.add("rotate White face Clockwise");
					finalsolutionarray.add("rotate White face Clockwise");
					finalsolutionarray.add("rotate Blue face CounterClockwise");
					finalsolutionarray.add("rotate Yellow face Clockwise");
					finalsolutionarray.add("rotate Blue face Clockwise");
					finalsolutionarray.add("rotate White face Clockwise");
					finalsolutionarray.add("rotate White face Clockwise");
					finalsolutionarray.add("rotate Blue face CounterClockwise");
					finalsolutionarray.add("rotate Yellow face Clockwise");
					finalsolutionarray.add("rotate Yellow face Clockwise");
				}
			}
		}

		if ((Integer.parseInt(cubesarray.get(5)[1]) == 1
				&& Integer.parseInt(cubesarray.get(5)[2]) == -1 && Integer
				.parseInt(cubesarray.get(5)[3]) == -1)) {
			rotateYellowFaceClockwise();
			rotateBlueFaceClockwise();
			rotateWhiteFaceClockwise();
			rotateWhiteFaceClockwise();
			rotateBlueFaceCounterClockwise();
			rotateYellowFaceCounterClockwise();
			rotateBlueFaceClockwise();
			rotateWhiteFaceClockwise();
			rotateWhiteFaceClockwise();
			rotateBlueFaceCounterClockwise();
			finalsolutionarray.add("rotate Yellow face Clockwise");
			finalsolutionarray.add("rotate Blue face Clockwise");
			finalsolutionarray.add("rotate White face Clockwise");
			finalsolutionarray.add("rotate White face Clockwise");
			finalsolutionarray.add("rotate Blue face CounterClockwise");
			finalsolutionarray.add("rotate Yellow face CounterClockwise");
			finalsolutionarray.add("rotate Blue face Clockwise");
			finalsolutionarray.add("rotate White face Clockwise");
			finalsolutionarray.add("rotate White face Clockwise");
			finalsolutionarray.add("rotate Blue face CounterClockwise");
		} else {
			if ((Integer.parseInt(cubesarray.get(5)[1]) == -1
					&& Integer.parseInt(cubesarray.get(5)[2]) == -1 && Integer
					.parseInt(cubesarray.get(5)[3]) == 1)) {
				rotateBlueFaceClockwise();
				rotateWhiteFaceClockwise();
				rotateWhiteFaceClockwise();
				rotateBlueFaceCounterClockwise();
				rotateYellowFaceClockwise();
				rotateBlueFaceClockwise();
				rotateWhiteFaceClockwise();
				rotateWhiteFaceClockwise();
				rotateBlueFaceCounterClockwise();
				rotateYellowFaceCounterClockwise();
				finalsolutionarray.add("rotate Blue face Clockwise");
				finalsolutionarray.add("rotate White face Clockwise");
				finalsolutionarray.add("rotate White face Clockwise");
				finalsolutionarray.add("rotate Blue face CounterClockwise");
				finalsolutionarray.add("rotate Yellow face Clockwise");
				finalsolutionarray.add("rotate Blue face Clockwise");
				finalsolutionarray.add("rotate White face Clockwise");
				finalsolutionarray.add("rotate White face Clockwise");
				finalsolutionarray.add("rotate Blue face CounterClockwise");
				finalsolutionarray.add("rotate Yellow face CounterClockwise");
			}
		}

	}

	/**
	 * Solves the cube using final steps and sequences.
	 */
	private void solveFinalSteps() {
		if (Integer.parseInt(cubesarray.get(2)[5]) == -1) {
			rotateRedFaceClockwise();
			rotateGreenFaceClockwise();
			rotateRedFaceCounterClockwise();
			rotateGreenFaceCounterClockwise();
			rotateRedFaceClockwise();
			rotateGreenFaceClockwise();
			rotateRedFaceCounterClockwise();
			rotateGreenFaceCounterClockwise();
			rotateOrangeFaceCounterClockwise();
			rotateGreenFaceClockwise();
			rotateRedFaceClockwise();
			rotateGreenFaceCounterClockwise();
			rotateRedFaceCounterClockwise();
			rotateGreenFaceClockwise();
			rotateRedFaceClockwise();
			rotateGreenFaceCounterClockwise();
			rotateRedFaceCounterClockwise();
			rotateOrangeFaceClockwise();
			finalsolutionarray.add("rotate Red face Clockwise");
			finalsolutionarray.add("rotate Green face Clockwise");
			finalsolutionarray.add("rotate Red face CounterClockwise");
			finalsolutionarray.add("rotate Green face CounterClockwise");
			finalsolutionarray.add("rotate Red face Clockwise");
			finalsolutionarray.add("rotate Green face Clockwise");
			finalsolutionarray.add("rotate Red face CounterClockwise");
			finalsolutionarray.add("rotate Green face CounterClockwise");
			finalsolutionarray.add("rotate Orange face CounterClockwise");
			finalsolutionarray.add("rotate Green face Clockwise");
			finalsolutionarray.add("rotate Red face Clockwise");
			finalsolutionarray.add("rotate Green face CounterClockwise");
			finalsolutionarray.add("rotate Red face CounterClockwise");
			finalsolutionarray.add("rotate Green face Clockwise");
			finalsolutionarray.add("rotate Red face Clockwise");
			finalsolutionarray.add("rotate Green face CounterClockwise");
			finalsolutionarray.add("rotate Red face CounterClockwise");
			finalsolutionarray.add("rotate Orange face Clockwise");
		} else {
			if (Integer.parseInt(cubesarray.get(2)[4]) == -1) {
				rotateGreenFaceClockwise();
				rotateRedFaceClockwise();
				rotateGreenFaceCounterClockwise();
				rotateRedFaceCounterClockwise();
				rotateGreenFaceClockwise();
				rotateRedFaceClockwise();
				rotateGreenFaceCounterClockwise();
				rotateRedFaceCounterClockwise();
				rotateOrangeFaceCounterClockwise();
				rotateRedFaceClockwise();
				rotateGreenFaceClockwise();
				rotateRedFaceCounterClockwise();
				rotateGreenFaceCounterClockwise();
				rotateRedFaceClockwise();
				rotateGreenFaceClockwise();
				rotateRedFaceCounterClockwise();
				rotateGreenFaceCounterClockwise();
				rotateOrangeFaceClockwise();
				finalsolutionarray.add("rotate Green face Clockwise");
				finalsolutionarray.add("rotate Red face Clockwise");
				finalsolutionarray.add("rotate Green face CounterClockwise");
				finalsolutionarray.add("rotate Red face CounterClockwise");
				finalsolutionarray.add("rotate Green face Clockwise");
				finalsolutionarray.add("rotate Red face Clockwise");
				finalsolutionarray.add("rotate Green face CounterClockwise");
				finalsolutionarray.add("rotate Red face CounterClockwise");
				finalsolutionarray.add("rotate Orange face CounterClockwise");
				finalsolutionarray.add("rotate Red face Clockwise");
				finalsolutionarray.add("rotate Green face Clockwise");
				finalsolutionarray.add("rotate Red face CounterClockwise");
				finalsolutionarray.add("rotate Green face CounterClockwise");
				finalsolutionarray.add("rotate Red face Clockwise");
				finalsolutionarray.add("rotate Green face Clockwise");
				finalsolutionarray.add("rotate Red face CounterClockwise");
				finalsolutionarray.add("rotate Green face CounterClockwise");
				finalsolutionarray.add("rotate Orange face Clockwise");
			}
		}

		numberofcornersunoriented = 0;
		if (!isBlueRedYellowCornerWellDone()) {
			numberofcornersunoriented = numberofcornersunoriented + 1;
		}
		if (!isBlueOrangeYellowCornerWellDone()) {
			numberofcornersunoriented = numberofcornersunoriented + 1;
		}
		if (!isGreenRedYellowCornerWellDone()) {
			numberofcornersunoriented = numberofcornersunoriented + 1;
		}
		if (!isGreenOrangeYellowCornerWellDone()) {
			numberofcornersunoriented = numberofcornersunoriented + 1;
		}
		if (numberofcornersunoriented == 2) {
			if (isBlueOrangeYellowCornerWellDone()) {
				if (isBlueRedYellowCornerWellDone()) {
					if (Integer.parseInt(cubesarray.get(6)[5]) == -1) {
						rotateYellowFaceClockwise();
						finalsolutionarray.add("rotate Yellow face Clockwise");
						secuenceClockCounter();
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						rotateYellowFaceCounterClockwise();
						finalsolutionarray
								.add("rotate Yellow face CounterClockwise");
						secuenceCounterClock();
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
					} else {
						rotateYellowFaceClockwise();
						finalsolutionarray.add("rotate Yellow face Clockwise");
						secuenceCounterClock();
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						rotateYellowFaceCounterClockwise();
						finalsolutionarray
								.add("rotate Yellow face CounterClockwise");
						secuenceClockCounter();
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
					}
				} else {
					if (isGreenRedYellowCornerWellDone()) {
						if (Integer.parseInt(cubesarray.get(5)[4]) == 1) {
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
							secuenceClockCounter();
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
							secuenceCounterClock();
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
						} else {
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
							secuenceCounterClock();
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
							secuenceClockCounter();
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
						}
					} else {
						if (Integer.parseInt(cubesarray.get(5)[4]) == 1) {
							secuenceClockCounter();
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
							secuenceCounterClock();
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
						} else {
							secuenceCounterClock();
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
							secuenceClockCounter();
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
						}
					}
				}
			} else {
				if (isBlueRedYellowCornerWellDone()) {
					if (isGreenOrangeYellowCornerWellDone()) {
						if (Integer.parseInt(cubesarray.get(6)[4]) == 1) {
							secuenceClockCounter();
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
							secuenceCounterClock();
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
						} else {
							secuenceCounterClock();
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
							secuenceClockCounter();
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
						}
					} else {
						if (Integer.parseInt(cubesarray.get(4)[4]) == -1) {
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
							secuenceClockCounter();
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
							secuenceCounterClock();
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
						} else {
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
							rotateYellowFaceClockwise();
							finalsolutionarray
									.add("rotate Yellow face Clockwise");
							secuenceCounterClock();
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
							secuenceClockCounter();
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
						}
					}
				} else {
					if (Integer.parseInt(cubesarray.get(5)[4]) == 1) {
						rotateYellowFaceCounterClockwise();
						finalsolutionarray
								.add("rotate Yellow face CounterClockwise");
						secuenceCounterClock();
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						rotateYellowFaceCounterClockwise();
						finalsolutionarray
								.add("rotate Yellow face CounterClockwise");
						secuenceClockCounter();
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						rotateYellowFaceCounterClockwise();
						finalsolutionarray
								.add("rotate Yellow face CounterClockwise");
						rotateYellowFaceCounterClockwise();
						finalsolutionarray
								.add("rotate Yellow face CounterClockwise");
					} else {
						rotateYellowFaceCounterClockwise();
						finalsolutionarray
								.add("rotate Yellow face CounterClockwise");
						secuenceClockCounter();
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						rotateYellowFaceCounterClockwise();
						finalsolutionarray
								.add("rotate Yellow face CounterClockwise");
						secuenceCounterClock();
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						rotateYellowFaceCounterClockwise();
						finalsolutionarray
								.add("rotate Yellow face CounterClockwise");
						rotateYellowFaceCounterClockwise();
						finalsolutionarray
								.add("rotate Yellow face CounterClockwise");
					}
				}
			}

			int secuencesused = 0;
			boolean clockused = false;
			boolean counterclockused = false;

			while (!isSolved()) {
				if (numberofmovements < 25 && secuencesused < 2) {

					randomnumber = (int) (Math.random() * 4);

					if (auxiliarrandomnumber == 0) {
						while (randomnumber == 1) {
							randomnumber = (int) (Math.random() * 4);
						}
					} else {
						if (auxiliarrandomnumber == 1) {
							while (randomnumber == 0) {
								randomnumber = (int) (Math.random() * 4);
							}
						}
					}

					auxiliarrandomnumber = randomnumber;

					if (randomnumber == 0) {
						rotateYellowFaceClockwise();
						solutionarray.add("rotate Yellow face Clockwise");
						numberofmovements = numberofmovements + 1;
					}
					if (randomnumber == 1) {
						rotateYellowFaceCounterClockwise();
						solutionarray
								.add("rotate Yellow face CounterClockwise");
						numberofmovements = numberofmovements + 1;
					}
					if (randomnumber == 2 && !counterclockused) {
						secuenceCounterClock();
						counterclockused = true;
						secuencesused = secuencesused + 1;
						numberofmovements = numberofmovements + 8;
						solutionarray.add("rotate White face Clockwise");
						solutionarray.add("rotate Red face Clockwise");
						solutionarray.add("rotate White face CounterClockwise");
						solutionarray.add("rotate Red face CounterClockwise");
						solutionarray.add("rotate White face Clockwise");
						solutionarray.add("rotate Red face Clockwise");
						solutionarray.add("rotate White face CounterClockwise");
						solutionarray.add("rotate Red face CounterClockwise");
					}
					if (randomnumber == 3 && !clockused) {
						secuenceClockCounter();
						clockused = true;
						secuencesused = secuencesused + 1;
						numberofmovements = numberofmovements + 8;
						solutionarray.add("rotate Red face Clockwise");
						solutionarray.add("rotate White face Clockwise");
						solutionarray.add("rotate Red face CounterClockwise");
						solutionarray.add("rotate White face CounterClockwise");
						solutionarray.add("rotate Red face Clockwise");
						solutionarray.add("rotate White face Clockwise");
						solutionarray.add("rotate Red face CounterClockwise");
						solutionarray.add("rotate White face CounterClockwise");
					}
				} else {
					clockused = false;
					counterclockused = false;
					numberofmovements = 0;
					solutionarray.clear();
					secuencesused = 0;
					for (int i = 0; i < cubesarray.size(); i++) {
						for (int j = 0; j < 7; j++) {
							cubesarray.get(i)[j] = cubesarrayB.get(i)[j];
						}
					}
				}
			}
			for (int i = 0; i < cubesarray.size(); i++) {
				for (int j = 0; j < 7; j++) {
					cubesarrayB.get(i)[j] = cubesarray.get(i)[j];
				}
			}
			numberofmovements = 0;
			for (int i = 0; i < solutionarray.size(); i++) {
				finalsolutionarray.add(solutionarray.get(i));
			}
			solutionarray.clear();
		} else {
			if (numberofcornersunoriented == 3) {
				if (isGreenOrangeYellowCornerWellDone()) {
					if (Integer.parseInt(cubesarray.get(6)[4]) == 1) {
						secuenceTripleClockwise();
						rotateYellowFaceClockwise();
						rotateYellowFaceClockwise();
						finalsolutionarray.add("rotate Yellow face Clockwise");
						finalsolutionarray.add("rotate Yellow face Clockwise");
					} else {
						secuenceTripleCounterClockwise();
						rotateYellowFaceClockwise();
						rotateYellowFaceClockwise();
						finalsolutionarray.add("rotate Yellow face Clockwise");
						finalsolutionarray.add("rotate Yellow face Clockwise");
					}
				} else {
					if (isGreenRedYellowCornerWellDone()) {
						if (Integer.parseInt(cubesarray.get(5)[5]) == -1) {
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
							secuenceTripleClockwise();
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
						} else {
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
							secuenceTripleCounterClockwise();
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
						}
					} else {
						if (isBlueOrangeYellowCornerWellDone()) {
							if (Integer.parseInt(cubesarray.get(6)[4]) == 1) {
								rotateYellowFaceClockwise();
								finalsolutionarray
										.add("rotate Yellow face Clockwise");
								secuenceTripleClockwise();
								rotateYellowFaceClockwise();
								finalsolutionarray
										.add("rotate Yellow face Clockwise");
							} else {
								rotateYellowFaceClockwise();
								finalsolutionarray
										.add("rotate Yellow face Clockwise");
								secuenceTripleCounterClockwise();
								rotateYellowFaceClockwise();
								finalsolutionarray
										.add("rotate Yellow face Clockwise");
							}
						} else {
							if (isBlueRedYellowCornerWellDone()) {
								if (Integer.parseInt(cubesarray.get(6)[4]) == 1) {
									rotateYellowFaceClockwise();
									finalsolutionarray
											.add("rotate Yellow face Clockwise");
									rotateYellowFaceClockwise();
									finalsolutionarray
											.add("rotate Yellow face Clockwise");
									secuenceTripleClockwise();
								} else {
									rotateYellowFaceClockwise();
									finalsolutionarray
											.add("rotate Yellow face Clockwise");
									rotateYellowFaceClockwise();
									finalsolutionarray
											.add("rotate Yellow face Clockwise");
									secuenceTripleCounterClockwise();
								}
							}
						}
					}
				}
			} else {
				if (numberofcornersunoriented == 4) {
					if (Integer.parseInt(cubesarray.get(6)[5]) == -1) {
						secuenceCounterClock();
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						rotateYellowFaceCounterClockwise();
						finalsolutionarray
								.add("rotate Yellow face CounterClockwise");
						secuenceClockCounter();
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						rotateYellowFaceCounterClockwise();
						finalsolutionarray
								.add("rotate Yellow face CounterClockwise");
						if (Integer.parseInt(cubesarray.get(4)[4]) == 1) {
							secuenceClockCounter();
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
							secuenceCounterClock();
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
						} else {
							secuenceCounterClock();
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
							secuenceClockCounter();
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
						}
					} else {
						secuenceClockCounter();
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						rotateYellowFaceCounterClockwise();
						finalsolutionarray
								.add("rotate Yellow face CounterClockwise");
						secuenceCounterClock();
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						finalsolutionarray.add("rotate White face Clockwise");
						finalsolutionarray.add("rotate Red face Clockwise");
						finalsolutionarray
								.add("rotate White face CounterClockwise");
						finalsolutionarray
								.add("rotate Red face CounterClockwise");
						rotateYellowFaceCounterClockwise();
						finalsolutionarray
								.add("rotate Yellow face CounterClockwise");
						if (Integer.parseInt(cubesarray.get(4)[4]) == 1) {
							secuenceClockCounter();
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
							secuenceCounterClock();
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
						} else {
							secuenceCounterClock();
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
							secuenceClockCounter();
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							finalsolutionarray.add("rotate Red face Clockwise");
							finalsolutionarray
									.add("rotate White face Clockwise");
							finalsolutionarray
									.add("rotate Red face CounterClockwise");
							finalsolutionarray
									.add("rotate White face CounterClockwise");
							rotateYellowFaceCounterClockwise();
							finalsolutionarray
									.add("rotate Yellow face CounterClockwise");
						}
					}
				}
			}
		}
	}

	/**
	 * Sequence which rotates three corners Clockwise.
	 */
	private void secuenceTripleClockwise() {
		rotateRedFaceClockwise();
		rotateWhiteFaceClockwise();
		rotateRedFaceCounterClockwise();
		rotateWhiteFaceCounterClockwise();
		rotateRedFaceClockwise();
		rotateWhiteFaceClockwise();
		rotateRedFaceCounterClockwise();
		rotateWhiteFaceCounterClockwise();
		rotateYellowFaceCounterClockwise();
		rotateRedFaceClockwise();
		rotateWhiteFaceClockwise();
		rotateRedFaceCounterClockwise();
		rotateWhiteFaceCounterClockwise();
		rotateRedFaceClockwise();
		rotateWhiteFaceClockwise();
		rotateRedFaceCounterClockwise();
		rotateWhiteFaceCounterClockwise();
		rotateYellowFaceCounterClockwise();
		rotateRedFaceClockwise();
		rotateWhiteFaceClockwise();
		rotateRedFaceCounterClockwise();
		rotateWhiteFaceCounterClockwise();
		rotateRedFaceClockwise();
		rotateWhiteFaceClockwise();
		rotateRedFaceCounterClockwise();
		rotateWhiteFaceCounterClockwise();
		finalsolutionarray.add("rotate Red face Clockwise");
		finalsolutionarray.add("rotate White face Clockwise");
		finalsolutionarray.add("rotate Red face CounterClockwise");
		finalsolutionarray.add("rotate White face CounterClockwise");
		finalsolutionarray.add("rotate Red face Clockwise");
		finalsolutionarray.add("rotate White face Clockwise");
		finalsolutionarray.add("rotate Red face CounterClockwise");
		finalsolutionarray.add("rotate White face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Red face Clockwise");
		finalsolutionarray.add("rotate White face Clockwise");
		finalsolutionarray.add("rotate Red face CounterClockwise");
		finalsolutionarray.add("rotate White face CounterClockwise");
		finalsolutionarray.add("rotate Red face Clockwise");
		finalsolutionarray.add("rotate White face Clockwise");
		finalsolutionarray.add("rotate Red face CounterClockwise");
		finalsolutionarray.add("rotate White face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate Red face Clockwise");
		finalsolutionarray.add("rotate White face Clockwise");
		finalsolutionarray.add("rotate Red face CounterClockwise");
		finalsolutionarray.add("rotate White face CounterClockwise");
		finalsolutionarray.add("rotate Red face Clockwise");
		finalsolutionarray.add("rotate White face Clockwise");
		finalsolutionarray.add("rotate Red face CounterClockwise");
		finalsolutionarray.add("rotate White face CounterClockwise");
	}

	/**
	 * Sequence which rotates three corners counter-Clockwise.
	 */
	private void secuenceTripleCounterClockwise() {
		rotateWhiteFaceClockwise();
		rotateRedFaceClockwise();
		rotateWhiteFaceCounterClockwise();
		rotateRedFaceCounterClockwise();
		rotateWhiteFaceClockwise();
		rotateRedFaceClockwise();
		rotateWhiteFaceCounterClockwise();
		rotateRedFaceCounterClockwise();
		rotateYellowFaceCounterClockwise();
		rotateWhiteFaceClockwise();
		rotateRedFaceClockwise();
		rotateWhiteFaceCounterClockwise();
		rotateRedFaceCounterClockwise();
		rotateWhiteFaceClockwise();
		rotateRedFaceClockwise();
		rotateWhiteFaceCounterClockwise();
		rotateRedFaceCounterClockwise();
		rotateYellowFaceCounterClockwise();
		rotateWhiteFaceClockwise();
		rotateRedFaceClockwise();
		rotateWhiteFaceCounterClockwise();
		rotateRedFaceCounterClockwise();
		rotateWhiteFaceClockwise();
		rotateRedFaceClockwise();
		rotateWhiteFaceCounterClockwise();
		rotateRedFaceCounterClockwise();
		finalsolutionarray.add("rotate White face Clockwise");
		finalsolutionarray.add("rotate Red face Clockwise");
		finalsolutionarray.add("rotate White face CounterClockwise");
		finalsolutionarray.add("rotate Red face CounterClockwise");
		finalsolutionarray.add("rotate White face Clockwise");
		finalsolutionarray.add("rotate Red face Clockwise");
		finalsolutionarray.add("rotate White face CounterClockwise");
		finalsolutionarray.add("rotate Red face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate White face Clockwise");
		finalsolutionarray.add("rotate Red face Clockwise");
		finalsolutionarray.add("rotate White face CounterClockwise");
		finalsolutionarray.add("rotate Red face CounterClockwise");
		finalsolutionarray.add("rotate White face Clockwise");
		finalsolutionarray.add("rotate Red face Clockwise");
		finalsolutionarray.add("rotate White face CounterClockwise");
		finalsolutionarray.add("rotate Red face CounterClockwise");
		finalsolutionarray.add("rotate Yellow face CounterClockwise");
		finalsolutionarray.add("rotate White face Clockwise");
		finalsolutionarray.add("rotate Red face Clockwise");
		finalsolutionarray.add("rotate White face CounterClockwise");
		finalsolutionarray.add("rotate Red face CounterClockwise");
		finalsolutionarray.add("rotate White face Clockwise");
		finalsolutionarray.add("rotate Red face Clockwise");
		finalsolutionarray.add("rotate White face CounterClockwise");
		finalsolutionarray.add("rotate Red face CounterClockwise");
	}

	/**
	 * Sequence which rotates two corners, the first one Clockwise and the
	 * second one counter-Clockwise.
	 */
	private void secuenceClockCounter() {
		rotateRedFaceClockwise();
		rotateWhiteFaceClockwise();
		rotateRedFaceCounterClockwise();
		rotateWhiteFaceCounterClockwise();
		rotateRedFaceClockwise();
		rotateWhiteFaceClockwise();
		rotateRedFaceCounterClockwise();
		rotateWhiteFaceCounterClockwise();
	}

	/**
	 * Sequence which rotates two corners, the first one counter-Clockwise and
	 * the second one Clockwise.
	 */
	private void secuenceCounterClock() {
		rotateWhiteFaceClockwise();
		rotateRedFaceClockwise();
		rotateWhiteFaceCounterClockwise();
		rotateRedFaceCounterClockwise();
		rotateWhiteFaceClockwise();
		rotateRedFaceClockwise();
		rotateWhiteFaceCounterClockwise();
		rotateRedFaceCounterClockwise();
	}
}
