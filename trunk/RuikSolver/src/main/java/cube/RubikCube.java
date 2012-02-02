package cube;

import java.util.HashSet;
import java.util.Set;

import pieza.Pieza;
import pieza.Vectr;

import color.Color;

public class RubikCube {

	private Set<Pieza> cubeSet;
	Integer posX;
	Integer posY;
	Integer posZ;
	Integer orX;
	Integer orY;
	Integer orZ;

	public RubikCube() {
		this.cubeSet = new HashSet<Pieza>();
		createCentros();
		createAristas();
		createVertices();
	}

	private void createVertices() {
		Color blanco = new Color("blanco");
		Color verde = new Color("verde");
		Color azul = new Color("azul");
		Color rojo = new Color("rojo");
		Color amarillo = new Color("amarillo");
		Color naranja = new Color("naranja");

		Vectr orientacion;
		Vectr posicion;
		Set<Color> colors = new HashSet<Color>();

		// AzRB
		colors.add(azul);
		colors.add(rojo);
		colors.add(blanco);
		posicion = new Vectr(1, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		// verticeAzulRojoBlanco = new Pieza(posicion, orientacion, colors);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzNB
		colors.add(azul);
		colors.add(naranja);
		colors.add(blanco);
		posicion = new Vectr(-1, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VNB
		colors.add(verde);
		colors.add(naranja);
		colors.add(blanco);
		posicion = new Vectr(-1, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VRB
		colors.add(verde);
		colors.add(rojo);
		colors.add(blanco);
		posicion = new Vectr(1, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzNA
		colors.add(azul);
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vectr(-1, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzRA
		colors.add(azul);
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vectr(1, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VRA
		colors.add(verde);
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vectr(1, -1, -1);
		orientacion = new Vectr(0, 0, -1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VNA
		colors.add(verde);
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vectr(-1, -1, -1);
		orientacion = new Vectr(0, 0, -1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));

	}

	private void createAristas() {

		Color blanco = new Color("blanco");
		Color verde = new Color("verde");
		Color azul = new Color("azul");
		Color rojo = new Color("rojo");
		Color amarillo = new Color("amarillo");
		Color naranja = new Color("naranja");

		Vectr orientacion;
		Vectr posicion;
		Set<Color> colors = new HashSet<Color>();
		// RB
		colors.add(rojo);
		colors.add(blanco);
		posicion = new Vectr(1, 0, 1);
		orientacion = new Vectr(0, 0, 1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AB
		colors.add(azul);
		colors.add(blanco);
		posicion = new Vectr(0, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// NB
		colors.add(naranja);
		colors.add(blanco);
		posicion = new Vectr(-1, 0, 1);
		orientacion = new Vectr(0, 0, 1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VB
		colors.add(verde);
		colors.add(blanco);
		posicion = new Vectr(0, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzR
		colors.add(azul);
		colors.add(rojo);
		posicion = new Vectr(1, 1, 0);
		orientacion = new Vectr(1, 0, 0);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzN
		colors.add(azul);
		colors.add(naranja);
		posicion = new Vectr(-1, 1, 0);
		orientacion = new Vectr(-1, 0, 0);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VN
		colors.add(verde);
		colors.add(naranja);
		posicion = new Vectr(-1, -1, 0);
		orientacion = new Vectr(-1, 0, 0);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VR
		colors.add(verde);
		colors.add(rojo);
		posicion = new Vectr(1, -1, 0);
		orientacion = new Vectr(1, 0, 0);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// RA
		colors.add(rojo);
		colors.add(amarillo);
		posicion = new Vectr(1, 0, -1);
		orientacion = new Vectr(0, 0, 1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// AzA
		colors.add(azul);
		colors.add(amarillo);
		posicion = new Vectr(0, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// NA
		colors.add(naranja);
		colors.add(amarillo);
		posicion = new Vectr(-1, 0, -1);
		orientacion = new Vectr(0, 0, -1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// VA
		colors.add(verde);
		colors.add(amarillo);
		posicion = new Vectr(0, -1, -1);
		orientacion = new Vectr(0, 0, -1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));

	}

	private void createCentros() {

		Color blanco = new Color("blanco");
		Color verde = new Color("verde");
		Color azul = new Color("azul");
		Color rojo = new Color("rojo");
		Color amarillo = new Color("amarillo");
		Color naranja = new Color("naranja");

		Vectr orientacion;
		Vectr posicion;
		Set<Color> colors = new HashSet<Color>();

		// blanco
		colors.add(blanco);
		posicion = new Vectr(0, 0, 1);
		orientacion = new Vectr(0, 0, 1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// amarillo
		colors.add(amarillo);
		posicion = new Vectr(0, 0, -1);
		orientacion = new Vectr(0, 0, -1);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// verde
		colors.add(verde);
		posicion = new Vectr(0, -1, 0);
		orientacion = new Vectr(0, -1, 0);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// rojo
		colors.add(rojo);
		posicion = new Vectr(1, 0, 0);
		orientacion = new Vectr(1, 0, 0);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// azul
		colors.add(azul);
		posicion = new Vectr(0, 1, 0);
		orientacion = new Vectr(0, 1, 0);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
		colors = new HashSet<Color>();
		// naranja
		colors.add(naranja);
		posicion = new Vectr(-1, 0, 0);
		orientacion = new Vectr(-1, 0, 0);
		this.cubeSet.add(new Pieza(posicion, orientacion, colors));
	}

	public Set<Pieza> getBlueFace() {
		Set<Pieza> blueFace = new HashSet<Pieza>();
		for (Pieza pieza : this.cubeSet) {
			if (pieza.isBlue() && !pieza.esCentro()) {
				blueFace.add(pieza);
			}
		}
		return blueFace;
	}

	public Set<Pieza> getRedFace() {
		Set<Pieza> redFace = new HashSet<Pieza>();
		for (Pieza pieza : this.cubeSet) {
			if (pieza.isRed() && !pieza.esCentro()) {
				redFace.add(pieza);
			}
		}
		return redFace;
	}

	public Set<Pieza> getYellowFace() {
		Set<Pieza> yellowFace = new HashSet<Pieza>();
		for (Pieza pieza : this.cubeSet) {
			if (pieza.isYellow() && !pieza.esCentro()) {
				yellowFace.add(pieza);
			}
		}
		return yellowFace;
	}

	public Set<Pieza> getGreenFace() {
		Set<Pieza> greenFace = new HashSet<Pieza>();
		for (Pieza pieza : this.cubeSet) {
			if (pieza.isGreen() && !pieza.esCentro()) {
				greenFace.add(pieza);
			}
		}
		return greenFace;
	}

	public Set<Pieza> getOrangeFace() {
		Set<Pieza> orangeFace = new HashSet<Pieza>();
		for (Pieza pieza : this.cubeSet) {
			if (pieza.isOrange() && !pieza.esCentro()) {
				orangeFace.add(pieza);
			}
		}
		return orangeFace;
	}

	public Set<Pieza> getWhiteFace() {
		Set<Pieza> whiteFace = new HashSet<Pieza>();
		for (Pieza pieza : this.cubeSet) {
			if (pieza.isWhite() && !pieza.esCentro()) {
				whiteFace.add(pieza);
			}
		}
		return whiteFace;
	}

	private Integer cosNPi05(Integer times) {
		return (int) Math.cos(times * 0.5 * Math.PI);
	}

	private Integer sinNPi05(Integer times) {
		return (int) Math.sin(times * 0.5 * Math.PI);
	}

	public void rotateWhiteFaceClockwise(int times) {
		if (times < 0) {
			rotateWhiteFaceCounterClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateWhiteFaceCounterClockwise(1);
			} else {
				for (Pieza pieza : getWhiteFace()) {
					posY = menosSenoXMasCosenoY(times, pieza);
					posX = cosPxSenPy(times, pieza);
					pieza.setPosY(posY);
					pieza.setPosX(posX);

					orY = menosSenOxCosOy(times, pieza);
					orX = cosOxSenOy(times, pieza);
					pieza.setOrY(orY);
					pieza.setOrX(orX);
				}
			}
		}
	}

	protected int menosSenoXMasCosenoY(int times, Pieza pieza) {
		return -sinNPi05(times) * pieza.getPosX() + cosNPi05(times)	* pieza.getPosY();
	}

	public void rotateWhiteFaceCounterClockwise(int times) {
		if (times < 0) {
			rotateWhiteFaceClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateWhiteFaceClockwise(1);
			} else {
				for (Pieza pieza : getWhiteFace()) {

					posY = sinNPi05(times) * pieza.getPosX() + cosNPi05(times)
							* pieza.getPosY();
					posX = cosNPi05(times) * pieza.getPosX() - sinNPi05(times)
							* pieza.getPosY();
					pieza.setPosY(posY);
					pieza.setPosX(posX);

					orY = sinNPi05(times) * pieza.getOrX() + cosNPi05(times)
							* pieza.getOrY();
					orX = cosNPi05(times) * pieza.getOrX() - sinNPi05(times)
							* pieza.getOrY();
					pieza.setOrY(orY);
					pieza.setOrX(orX);
				}

			}
		}
	}

	public void rotateRedFaceClockwise(int times) {
		if (times < 0) {
			rotateRedFaceCounterClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateRedFaceCounterClockwise(1);
			} else {
				for (Pieza pieza : getWhiteFace()) {
					posZ = -sinNPi05(times) * pieza.getPosY() + cosNPi05(times)
							* pieza.getPosZ();
					posY = cosNPi05(times) * pieza.getPosY() + sinNPi05(times)
							* pieza.getPosZ();
					pieza.setPosZ(posZ);

					pieza.setPosY(posY);

					orZ = -sinNPi05(times) * pieza.getOrY() + cosNPi05(times)
							* pieza.getOrZ();
					orY = cosNPi05(times) * pieza.getOrY() + sinNPi05(times)
							* pieza.getOrZ();
					pieza.setOrZ(orZ);
					pieza.setOrY(orY);

				}
			}
		}
	}

	public void rotateRedFaceCounterClockwise(int times) {
		if (times < 0) {
			rotateRedFaceClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateRedFaceClockwise(1);
			} else {
				for (Pieza pieza : getWhiteFace()) {

					posZ = senPyCosPz(times, pieza);
					posY = cosPyMenosSenPz(times, pieza);
					pieza.setPosZ(posZ);
					pieza.setPosY(posY);

					orZ = senOyCosOz(times, pieza);
					orY = cosOyMenosSenOz(times, pieza);
					pieza.setOrZ(orZ);
					pieza.setOrY(orY);
				}

			}
		}
	}

	protected int senPyCosPz(int times, Pieza pieza) {
		return sinNPi05(times) * pieza.getPosY() + cosNPi05(times)
				* pieza.getPosZ();
	}

	protected int cosPyMenosSenPz(int times, Pieza pieza) {
		return cosNPi05(times) * pieza.getPosY() - sinNPi05(times)
				* pieza.getPosZ();
	}

	protected int senOyCosOz(int times, Pieza pieza) {
		return sinNPi05(times) * pieza.getOrY() + cosNPi05(times)
				* pieza.getOrZ();
	}

	protected int cosOyMenosSenOz(int times, Pieza pieza) {
		return cosNPi05(times) * pieza.getOrY() - sinNPi05(times)
				* pieza.getOrZ();
	}

	public void rotateBlueFaceClockwise(int times) {
		if (times < 0) {
			rotateBlueFaceCounterClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateBlueFaceCounterClockwise(1);
			} else {
				for (Pieza pieza : getWhiteFace()) {

					posZ = senPxCosPz(times, pieza);
					posX = cosPxMenosSenPz(times, pieza);
					pieza.setPosZ(posZ);
					pieza.setPosX(posX);

					orZ = senOxCosOz(times, pieza);
					orX = cosOxMenosSenOz(times, pieza);
					pieza.setOrZ(orZ);
					pieza.setOrX(orX);

				}
			}
		}
	}

	protected int senPxCosPz(int times, Pieza pieza) {
		return sinNPi05(times) * pieza.getPosX() + cosNPi05(times)
				* pieza.getPosZ();
	}

	protected int cosPxMenosSenPz(int times, Pieza pieza) {
		return cosNPi05(times) * pieza.getPosX() - sinNPi05(times)
				* pieza.getPosZ();
	}

	protected int senOxCosOz(int times, Pieza pieza) {
		return sinNPi05(times) * pieza.getOrX() + cosNPi05(times)
				* pieza.getOrZ();
	}

	protected int cosOxMenosSenOz(int times, Pieza pieza) {
		return cosNPi05(times) * pieza.getOrX() - sinNPi05(times)
				* pieza.getOrZ();
	}

	public void rotateBlueFaceCounterClockwise(int times) {
		if (times < 0) {
			rotateBlueFaceClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateBlueFaceClockwise(1);
			} else {
				for (Pieza pieza : getWhiteFace()) {

					posZ = menosSenPxCosPz(times, pieza);
					posX = cosXsenZ(times, pieza);
					pieza.setPosZ(posZ);
					pieza.setPosX(posX);

					orZ = menosSenOxCosOz(times, pieza);
					orX = cosOxSenOz(times, pieza);
					pieza.setOrZ(orZ);
					pieza.setOrX(orX);
				}
			}

		}
	}

	protected int menosSenPxCosPz(int times, Pieza pieza) {
		return -sinNPi05(times) * pieza.getPosX() + cosNPi05(times)
				* pieza.getPosZ();
	}

	protected int menosSenOxCosOz(int times, Pieza pieza) {
		return -sinNPi05(times) * pieza.getOrX() + cosNPi05(times)
				* pieza.getOrZ();
	}

	protected int cosOxSenOz(int times, Pieza pieza) {
		return cosNPi05(times) * pieza.getOrX() + sinNPi05(times)
				* pieza.getOrZ();
	}

	public void rotateOrangeFaceClockwise(int times) {
		if (times < 0) {
			rotateOrangeFaceCounterClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateOrangeFaceCounterClockwise(1);
			} else {
				for (Pieza pieza : getWhiteFace()) {

					posZ = senPyCosPz(times, pieza);
					posY = cosPyMenosSenPz(times, pieza);
					pieza.setPosZ(posZ);
					pieza.setPosY(posY);

					orZ = senOyCosOz(times, pieza);
					orY = cosOyMenosSenOz(times, pieza);
					pieza.setOrZ(orZ);
					pieza.setOrY(orY);

				}
			}
		}
	}

	public void rotateOrangeFaceCounterClockwise(int times) {
		if (times < 0) {
			rotateOrangeFaceClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateOrangeFaceClockwise(1);
			} else {
				for (Pieza pieza : getWhiteFace()) {

					posZ = -sinNPi05(times) * pieza.getPosY() + cosNPi05(times)
							* pieza.getPosZ();
					posY = cosNPi05(times) * pieza.getPosY() + sinNPi05(times)
							* pieza.getPosZ();
					pieza.setPosZ(posZ);
					pieza.setPosY(posY);

					orZ = -sinNPi05(times) * pieza.getOrY() + cosNPi05(times)
							* pieza.getOrZ();
					orY = cosNPi05(times) * pieza.getOrY() + sinNPi05(times)
							* pieza.getOrZ();
					pieza.setOrZ(orZ);
					pieza.setOrY(orY);

				}
			}
		}
	}

	public void rotateGreenFaceClockwise(int times) {
		if (times < 0) {
			rotateGreenFaceCounterClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateGreenFaceCounterClockwise(1);
			} else {
				for (Pieza pieza : getWhiteFace()) {

					posZ = menosSenPxCosPz(times, pieza);
					posX = cosXsenZ(times, pieza);
					pieza.setPosZ(posZ);
					pieza.setPosX(posX);

					orZ = menosSenOxCosOz(times, pieza);
					orX = cosOxSenOz(times, pieza);
					pieza.setOrZ(orZ);
					pieza.setOrX(orX);

				}
			}
		}
	}

	protected int cosXsenZ(int times, Pieza pieza) {
		return cosNPi05(times) * pieza.getPosX() + sinNPi05(times)
				* pieza.getPosZ();
	}

	public void rotateGreenFaceCounterClockwise(int times) {
		if (times < 0) {
			rotateGreenFaceClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateGreenFaceClockwise(1);
			} else {
				for (Pieza pieza : getWhiteFace()) {

					posZ = senPxCosPz(times, pieza);
					posX = cosPxMenosSenPz(times, pieza);
					pieza.setPosZ(posZ);
					pieza.setPosX(posX);

					orZ = senOxCosOz(times, pieza);
					orX = cosOxMenosSenOz(times, pieza);
					pieza.setOrZ(orZ);
					pieza.setOrX(orX);

				}
			}
		}
	}

	public void rotateYellowFaceClockwise(int times) {
		if (times < 0) {
			rotateYellowFaceCounterClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateYellowFaceCounterClockwise(1);
			} else {
				for (Pieza pieza : getWhiteFace()) {

					posY = sinNPi05(times) * pieza.getPosX() + cosNPi05(times)
							* pieza.getPosY();
					posX = cosNPi05(times) * pieza.getPosX() - sinNPi05(times)
							* pieza.getPosY();
					pieza.setPosY(posY);
					pieza.setPosX(posX);

					orY = sinNPi05(times) * pieza.getOrX() + cosNPi05(times)
							* pieza.getOrY();
					orX = cosNPi05(times) * pieza.getOrX() - sinNPi05(times)
							* pieza.getOrY();
					pieza.setOrY(orY);
					pieza.setOrX(orX);
				}
			}

		}
	}

	public void rotateYellowFaceCounterClockwise(int times) {
		if (times < 0) {
			rotateYellowFaceClockwise(Math.abs(times));
		} else {
			while (times >= 4) {
				times = times - 4;
			}
			if (times == 3) {
				rotateYellowFaceClockwise(1);
			} else {
				for (Pieza pieza : getWhiteFace()) {

					posY = menosSenoXMasCosenoY(times, pieza);
					posX = cosPxSenPy(times, pieza);
					pieza.setPosY(posY);
					pieza.setPosX(posX);

					orY = menosSenOxCosOy(times, pieza);
					orX = cosOxSenOy(times, pieza);
					pieza.setOrY(orY);
					pieza.setOrX(orX);

				}
			}
		}
	}

	protected int cosOxSenOy(int times, Pieza pieza) {
		return cosNPi05(times) * pieza.getOrX() + sinNPi05(times)
				* pieza.getOrY();
	}

	protected int cosPxSenPy(int times, Pieza pieza) {
		return cosNPi05(times) * pieza.getPosX() + sinNPi05(times)
				* pieza.getPosY();
	}

	protected int menosSenOxCosOy(int times, Pieza pieza) {
		return -sinNPi05(times) * pieza.getOrX() + cosNPi05(times)
				* pieza.getOrY();
	}

}
