package cube;

import java.util.HashSet;
import java.util.Set;

import pieza.Pieza;


public class RubikCube {

	public RubikCube() {
		this.data.cubeSet.addAll(data.createCube());
		
	}

	public Set<Pieza> getBlueFace() {
		Set<Pieza> blueFace = new HashSet<Pieza>();
		for (Pieza pieza : this.data.cubeSet) {
			if (pieza.isBlue() && !pieza.esCentro()) {
				blueFace.add(pieza);
			}
		}
		return blueFace;
	}

	public Set<Pieza> getRedFace() {
		Set<Pieza> redFace = new HashSet<Pieza>();
		for (Pieza pieza : this.data.cubeSet) {
			if (pieza.isRed() && !pieza.esCentro()) {
				redFace.add(pieza);
			}
		}
		return redFace;
	}

	public Set<Pieza> getYellowFace() {
		Set<Pieza> yellowFace = new HashSet<Pieza>();
		for (Pieza pieza : this.data.cubeSet) {
			if (pieza.isYellow() && !pieza.esCentro()) {
				yellowFace.add(pieza);
			}
		}
		return yellowFace;
	}

	public Set<Pieza> getGreenFace() {
		Set<Pieza> greenFace = new HashSet<Pieza>();
		for (Pieza pieza : this.data.cubeSet) {
			if (pieza.isGreen() && !pieza.esCentro()) {
				greenFace.add(pieza);
			}
		}
		return greenFace;
	}

	public Set<Pieza> getOrangeFace() {
		Set<Pieza> orangeFace = new HashSet<Pieza>();
		for (Pieza pieza : this.data.cubeSet) {
			if (pieza.isOrange() && !pieza.esCentro()) {
				orangeFace.add(pieza);
			}
		}
		return orangeFace;
	}

	public Set<Pieza> getWhiteFace() {
		Set<Pieza> whiteFace = new HashSet<Pieza>();
		for (Pieza pieza : this.data.cubeSet) {
			if (pieza.isWhite() && !pieza.esCentro()) {
				whiteFace.add(pieza);
			}
		}
		return whiteFace;
	}

	RubikCubeData data = new RubikCubeData();

	public void rotateWhiteFaceClockwise() {
		for (Pieza pieza : getWhiteFace()) {
			data.posY = -pieza.getPosX();
			data.posX = pieza.getPosY();
			pieza.setPosY(data.posY);
			pieza.setPosX(data.posX);
			
			data.orY = -pieza.getOrX();
			data.orX = pieza.getOrY();
			pieza.setOrY(data.orY);
			pieza.setOrX(data.orX);
		}
	}

	/**
	 * Rotates the white face counterclockwise.
	 */
	public void rotateWhiteFaceCounterClockwise() {
		for (Pieza pieza : getWhiteFace()) {
			data.posY = pieza.getPosX();
			data.posX = -pieza.getPosY();
			pieza.setPosY(data.posY);
			pieza.setPosX(data.posX);
			
			data.orY = pieza.getOrX();
			data.orX = -pieza.getOrY();
			pieza.setOrY(data.orY);
			pieza.setOrX(data.orX);
		}
	}

	/**
	 * Rotates the red face clockwise.
	 */
	public void rotateRedFaceClockwise() {
		for (Pieza pieza : getRedFace()) {
			data.posZ = -pieza.getPosY();
			data.posY = pieza.getPosZ();
			pieza.setPosZ(data.posZ);
			pieza.setPosY(data.posY);
			
			data.orZ = -pieza.getOrY();
			data.orY = pieza.getOrZ();
			pieza.setOrZ(data.orZ);
			pieza.setOrY(data.orY);

		}
	}

	public void rotateRedFaceCounterClockwise() {
		for (Pieza pieza : getRedFace()) {
			data.posZ = pieza.getPosY();
			data.posY = -pieza.getPosZ();
			pieza.setPosZ(data.posZ);
			pieza.setPosY(data.posY);
			
			data.orZ = pieza.getOrY();
			data.orY = -pieza.getOrZ();
			pieza.setOrZ(data.orZ);
			pieza.setOrY(data.orY);
		}
	}

	/**
	 * Rotates the blue face clockwise.
	 */
	public void rotateBlueFaceClockwise() {
		for (Pieza pieza : getBlueFace()) {
			data.posZ = pieza.getPosX();
			data.posX = -pieza.getPosZ();
			pieza.setPosZ(data.posZ);
			pieza.setPosX(data.posX);
			
			data.orZ = pieza.getOrX();
			data.orX = -pieza.getOrZ();
			pieza.setOrZ(data.orZ);
			pieza.setOrX(data.orX);
		}
	}

	/**
	 * Rotates the blue face counterclockwise.
	 */
	public void rotateBlueFaceCounterClockwise() {
		for (Pieza pieza : getBlueFace()) {
			data.posZ = -pieza.getPosX();
			data.posX = pieza.getPosZ();
			pieza.setPosZ(data.posZ);
			pieza.setPosX(data.posX);
			
			data.orZ = -pieza.getOrX();
			data.orX = pieza.getOrZ();
			pieza.setOrZ(data.orZ);
			pieza.setOrX(data.orX);
		}
	}

	/**
	 * Rotates the orange face clockwise.
	 */
	public void rotateOrangeFaceClockwise() {
		for (Pieza pieza : getOrangeFace()) {
			data.posZ = pieza.getPosY();
			data.posY = -pieza.getPosZ();
			pieza.setPosZ(data.posZ);
			pieza.setPosY(data.posY);
			
			data.orZ = pieza.getOrY();
			data.orY = -pieza.getOrZ();
			pieza.setOrZ(data.orZ);
			pieza.setOrY(data.orY);
		}
	}

	/**
	 * Rotates the orange face counterclockwise.
	 */
	public void rotateOrangeFaceCounterClockwise() {
		for (Pieza pieza : getOrangeFace()) {
			data.posZ = -pieza.getPosY();
			data.posY = pieza.getPosZ();
			pieza.setPosZ(data.posZ);
			pieza.setPosY(data.posY);
			
			data.orZ = -pieza.getOrY();
			data.orY = pieza.getOrZ();
			pieza.setOrZ(data.orZ);
			pieza.setOrY(data.orY);
		}
	}

	/**
	 * Rotates the green face clockwise.
	 */
	public void rotateGreenFaceClockwise() {
		for (Pieza pieza : getGreenFace()) {
			data.posZ = -pieza.getPosX();
			data.posX = pieza.getPosZ();
			pieza.setPosZ(data.posZ);
			pieza.setPosX(data.posX);
			
			data.orZ = -pieza.getOrX();
			data.orX = pieza.getOrZ();
			pieza.setOrZ(data.orZ);
			pieza.setOrX(data.orX);
		}
	}

	/**
	 * Rotates the green face counterclockwise.
	 */
	public void rotateGreenFaceCounterClockwise() {
		for (Pieza pieza : getGreenFace()) {
			data.posZ = pieza.getPosX();
			data.posX = -pieza.getPosZ();
			pieza.setPosZ(data.posZ);
			pieza.setPosX(data.posX);
			
			data.orZ = pieza.getOrX();
			data.orX = -pieza.getOrZ();
			pieza.setOrZ(data.orZ);
			pieza.setOrX(data.orX);
		}
	}

	/**
	 * Rotates the yellow face clockwise.
	 */
	public void rotateYellowFaceClockwise() {
		for (Pieza pieza : getYellowFace()) {
			data.posY = pieza.getPosX();
			data.posX = -pieza.getPosY();
			pieza.setPosY(data.posY);
			pieza.setPosX(data.posX);
			
			data.orY = pieza.getOrX();
			data.orX = -pieza.getOrY();
			pieza.setOrY(data.orY);
			pieza.setOrX(data.orX);
		}
	}

	/**
	 * Rotates the yellow face counterclockwise.
	 */
	public void rotateYellowFaceCounterClockwise() {
		for (Pieza pieza : getYellowFace()) {
			data.posY = -pieza.getPosX();
			data.posX = pieza.getPosY();
			pieza.setPosY(data.posY);
			pieza.setPosX(data.posX);
			
			data.orY = -pieza.getOrX();
			data.orX = pieza.getOrY();
			pieza.setOrY(data.orY);
			pieza.setOrX(data.orX);
		}
	}

}
