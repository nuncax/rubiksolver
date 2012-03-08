package cube;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import color.Color;

import pieza.Pieza;
import pieza.Stick;
import pieza.Vectr;

public class RubikCubeData {

	final Color blanco = new Color("blanco");
	final Color verde = new Color("verde");
	final Color azul = new Color("azul");
	final Color rojo = new Color("rojo");
	final Color amarillo = new Color("amarillo");
	final Color naranja = new Color("naranja");

	final private Stick rojo_stick = new Stick(rojo, new Vectr(1, 0, 0));
	final private Stick naranja_stick = new Stick(naranja, new Vectr(-1, 0, 0));
	final private Stick azul_stick = new Stick(azul, new Vectr(0, 1, 0));
	final private Stick verde_stick = new Stick(verde, new Vectr(0, -1, 0));
	final private Stick amarillo_stick = new Stick(amarillo,
			new Vectr(0, 0, -1));
	final private Stick blanco_stick = new Stick(blanco, new Vectr(0, 0, 1));

	private List<Pieza> cubeList;
	private List<Pieza> cubeCentersList;

	public List<Pieza> createCube() {
		this.cubeList = new ArrayList<Pieza>();
		this.cubeCentersList = new ArrayList<Pieza>();
		createCentros();
		createAristas();
		createVertices();
		return cubeList;
	}

	private int[][] getMatriz(Pieza centro, int signo) {
		int[][] maux = null;
		if (centro.getColorPuntero().equals(this.blanco_stick)) {
			maux = new int[][] { { 0, signo * 1, 0 }, { signo * -1, 0, 0 },
					{ 0, 0, 1 }, };
		} else if (centro.getColorPuntero().equals(this.amarillo_stick)) {
			maux = new int[][] { { 0, signo * -1, 0 }, { signo * 1, 0, 0 },
					{ 0, 0, 1 }, };
		} else if (centro.getColorPuntero().equals(this.azul_stick)) {
			maux = new int[][] { { 0, 0, signo * -1 }, { 0, 1, 0 },
					{ signo * 1, 0, 0 }, };
		} else if (centro.getColorPuntero().equals(this.naranja_stick)) {
			maux = new int[][] { { 1, 0, 0 }, { 0, 0, signo * -1 },
					{ 0, signo * 1, 0 }, };
		} else if (centro.getColorPuntero().equals(this.rojo_stick)) {
			maux = new int[][] { { 1, 0, 0 }, { 0, 0, signo * 1 },
					{ 0, signo * -1, 0 }, };
		} else if (centro.getColorPuntero().equals(this.verde_stick)) {
			maux = new int[][] { { 0, 0, signo * 1 }, { 0, 1, 0 },
					{ signo * -1, 0, 0 }, };
		}
		return maux;
	}

	private void createVertices() {

		Vectr orientacion;
		Vectr posicion;
		List<Stick> stickers = new ArrayList<Stick>();

		// AzRB
		stickers.add(blanco_stick);
		stickers.add(azul_stick);
		stickers.add(rojo_stick);
		posicion = new Vectr(1, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		// verticeAzulRojoBlanco = new Pieza(posicion, orientacion, stickers);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// AzNB
		stickers.add(blanco_stick);
		stickers.add(azul_stick);
		stickers.add(naranja_stick);
		posicion = new Vectr(-1, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// VNB
		stickers.add(blanco_stick);
		stickers.add(verde_stick);
		stickers.add(naranja_stick);
		posicion = new Vectr(-1, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// VRB
		stickers.add(blanco_stick);
		stickers.add(verde_stick);
		stickers.add(rojo_stick);
		posicion = new Vectr(1, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// AzNA
		stickers.add(azul_stick);
		stickers.add(naranja_stick);
		stickers.add(amarillo_stick);
		posicion = new Vectr(-1, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// AzRA
		stickers.add(azul_stick);
		stickers.add(rojo_stick);
		stickers.add(amarillo_stick);
		posicion = new Vectr(1, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// VRA
		stickers.add(verde_stick);
		stickers.add(rojo_stick);
		stickers.add(amarillo_stick);
		posicion = new Vectr(1, -1, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// VNA
		stickers.add(verde_stick);
		stickers.add(naranja_stick);
		stickers.add(amarillo_stick);
		posicion = new Vectr(-1, -1, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeList.add(new Pieza(posicion, orientacion, stickers));

	}

	private void createAristas() {

		// Stick blanco = new Stick("blanco");
		// Stick verde = new Stick("verde");
		// Stick azul = new Stick("azul");
		// Stick rojo = new Stick("rojo");
		// Stick amarillo = new Stick("amarillo");
		// Stick naranja = new Stick("naranja");

		Vectr orientacion;
		Vectr posicion;
		List<Stick> stickers = new ArrayList<Stick>();
		// RB
		stickers.add(blanco_stick);
		stickers.add(rojo_stick);
		posicion = new Vectr(1, 0, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// AB
		stickers.add(blanco_stick);
		stickers.add(azul_stick);
		posicion = new Vectr(0, 1, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// NB
		stickers.add(blanco_stick);
		stickers.add(naranja_stick);
		posicion = new Vectr(-1, 0, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// VB
		stickers.add(blanco_stick);
		stickers.add(verde_stick);
		posicion = new Vectr(0, -1, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// AzR
		stickers.add(rojo_stick);
		stickers.add(azul_stick);
		posicion = new Vectr(1, 1, 0);
		orientacion = new Vectr(1, 0, 0);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// AzN
		stickers.add(naranja_stick);
		stickers.add(azul_stick);
		posicion = new Vectr(-1, 1, 0);
		orientacion = new Vectr(-1, 0, 0);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// VN
		stickers.add(naranja_stick);
		stickers.add(verde_stick);
		posicion = new Vectr(-1, -1, 0);
		orientacion = new Vectr(-1, 0, 0);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// VR
		stickers.add(rojo_stick);
		stickers.add(verde_stick);
		posicion = new Vectr(1, -1, 0);
		orientacion = new Vectr(1, 0, 0);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// RA
		stickers.add(rojo_stick);
		stickers.add(amarillo_stick);
		posicion = new Vectr(1, 0, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// AzA
		stickers.add(azul_stick);
		stickers.add(amarillo_stick);
		posicion = new Vectr(0, 1, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// NA
		stickers.add(naranja_stick);
		stickers.add(amarillo_stick);
		posicion = new Vectr(-1, 0, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// VA
		stickers.add(verde_stick);
		stickers.add(amarillo_stick);
		posicion = new Vectr(0, -1, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeList.add(new Pieza(posicion, orientacion, stickers));

	}

	private void createCentros() {

		Vectr orientacion;
		Vectr posicion;
		List<Stick> stickers = new ArrayList<Stick>();

		// blanco
		stickers.add(blanco_stick);
		posicion = new Vectr(0, 0, 1);
		orientacion = new Vectr(0, 0, 1);
		cubeCentersList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// amarillo
		stickers.add(amarillo_stick);
		posicion = new Vectr(0, 0, -1);
		orientacion = new Vectr(0, 0, -1);
		cubeCentersList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// verde
		stickers.add(verde_stick);
		posicion = new Vectr(0, -1, 0);
		orientacion = new Vectr(0, -1, 0);
		cubeCentersList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// rojo
		stickers.add(rojo_stick);
		posicion = new Vectr(1, 0, 0);
		orientacion = new Vectr(1, 0, 0);
		cubeCentersList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// azul
		stickers.add(azul_stick);
		posicion = new Vectr(0, 1, 0);
		orientacion = new Vectr(0, 1, 0);
		cubeCentersList.add(new Pieza(posicion, orientacion, stickers));
		stickers = new ArrayList<Stick>();
		// naranja
		stickers.add(naranja_stick);
		posicion = new Vectr(-1, 0, 0);
		orientacion = new Vectr(-1, 0, 0);
		cubeCentersList.add(new Pieza(posicion, orientacion, stickers));
	}

	public List<Pieza> getCubeSet() {
		List<Pieza> piezas = new ArrayList<Pieza>();
		piezas.addAll(cubeList);
		return piezas;
	}

	private Set<Pieza> getFace(Pieza centro) {
		Set<Pieza> face = new HashSet<Pieza>();
		for (Pieza pieza : cubeList) {
			if (pieza.estaEnCara(centro) && !pieza.esCentro()) {
				face.add(pieza);
			}
		}
		return face;
	}

	public void rotateFaceClockwise(Pieza centro, int signo) {
		int[][] matriz = getMatriz(centro, signo);
		for (Pieza pieza : getFace(centro)) {
			pieza.multiplicar(matriz);
		}
		System.out.println("Gira la cara " + centro.getColorPuntero() + ","
				+ signo);
	}

	public Pieza getCentro(Color amarillo) {
		//TODO
		Pieza piezaRes = null;
		for (Pieza pieza : this.cubeCentersList) {
			if(pieza.esCentro()&&amarillo.equals(pieza.getStick(pieza).getColor()))
			piezaRes = pieza;
		}
		return piezaRes;
	}

	// public Pieza getCentro(Stick stick) {
	// Pieza piezaRes = null;
	// for (Pieza pieza : this.cubeList) {
	// if (pieza.esCentro() && pieza.getColorPuntero().equals(stick)) {
	// piezaRes = pieza;
	// }
	// }
	// return piezaRes;
	// }

}