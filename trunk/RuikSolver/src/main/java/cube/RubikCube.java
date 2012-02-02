package cube;

import java.util.HashSet;
import java.util.Set;

import pieza.Pieza;


public class RubikCube {
	public RubikCubeData data = new RubikCubeData();
	
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

}
