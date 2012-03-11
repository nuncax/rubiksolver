package cube;

import java.util.ArrayList;
import java.util.List;

import pieza.Arista;
import pieza.Centro;
import pieza.Color;
import pieza.Pieza;
import pieza.Stick;
import pieza.Vectr;
import pieza.Vertice;

public class RubikCubeData {

	final private Stick rojo_stick = new Stick(Color.RED, new Vectr(1, 0, 0));
	final private Stick naranja_stick = new Stick(Color.ORANGE, new Vectr(-1, 0, 0));
	final private Stick azul_stick = new Stick(Color.BLUE, new Vectr(0, 1, 0));
	final private Stick verde_stick = new Stick(Color.GREEN, new Vectr(0, -1, 0));
	final private Stick amarillo_stick = new Stick(Color.YELLOW,new Vectr(0, 0, -1));
	final private Stick blanco_stick = new Stick(Color.WHITE, new Vectr(0, 0, 1));

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

	private void createVertices() {

		Vectr posicion;
		List<Stick> stickers = new ArrayList<Stick>();

		posicion = new Vectr(1, 1, 1);

		cubeList.add(new Vertice(posicion, blanco_stick, azul_stick, rojo_stick));
		stickers = new ArrayList<Stick>();
		// AzNB
		stickers.add(blanco_stick);
		stickers.add(azul_stick);
		stickers.add(naranja_stick);
		posicion = new Vectr(-1, 1, 1);

		cubeList.add(new Vertice(posicion, blanco_stick, azul_stick,
				naranja_stick));
		stickers = new ArrayList<Stick>();
		// VNB
		stickers.add(blanco_stick);
		stickers.add(verde_stick);
		stickers.add(naranja_stick);
		posicion = new Vectr(-1, -1, 1);

		cubeList.add(new Vertice(posicion, blanco_stick, verde_stick,
				naranja_stick));
		stickers = new ArrayList<Stick>();
		// VRB
		stickers.add(blanco_stick);
		stickers.add(verde_stick);
		stickers.add(rojo_stick);
		posicion = new Vectr(1, -1, 1);

		cubeList.add(new Vertice(posicion, blanco_stick, verde_stick,
				rojo_stick));
		stickers = new ArrayList<Stick>();
		// AzNA
		stickers.add(azul_stick);
		stickers.add(naranja_stick);
		stickers.add(amarillo_stick);
		posicion = new Vectr(-1, 1, -1);

		cubeList.add(new Vertice(posicion, azul_stick, naranja_stick,
				amarillo_stick));
		stickers = new ArrayList<Stick>();
		// AzRA
		stickers.add(azul_stick);
		stickers.add(rojo_stick);
		stickers.add(amarillo_stick);
		posicion = new Vectr(1, 1, -1);

		cubeList.add(new Vertice(posicion, azul_stick, rojo_stick,
				amarillo_stick));
		stickers = new ArrayList<Stick>();
		// VRA
		stickers.add(verde_stick);
		stickers.add(rojo_stick);
		stickers.add(amarillo_stick);
		posicion = new Vectr(1, -1, -1);

		cubeList.add(new Vertice(posicion, verde_stick, rojo_stick,
				amarillo_stick));
		stickers = new ArrayList<Stick>();
		// VNA
		stickers.add(verde_stick);
		stickers.add(naranja_stick);
		stickers.add(amarillo_stick);
		posicion = new Vectr(-1, -1, -1);

		cubeList.add(new Vertice(posicion, verde_stick, naranja_stick,
				amarillo_stick));

	}

	private void createAristas() {

		Vectr posicion;
		List<Stick> stickers = new ArrayList<Stick>();
		// RB
		stickers.add(blanco_stick);
		stickers.add(rojo_stick);
		posicion = new Vectr(1, 0, 1);

		cubeList.add(new Arista(posicion, blanco_stick, rojo_stick));
		stickers = new ArrayList<Stick>();
		// AB
		stickers.add(blanco_stick);
		stickers.add(azul_stick);
		posicion = new Vectr(0, 1, 1);

		cubeList.add(new Arista(posicion, blanco_stick, azul_stick));
		stickers = new ArrayList<Stick>();
		// NB
		stickers.add(blanco_stick);
		stickers.add(naranja_stick);
		posicion = new Vectr(-1, 0, 1);

		cubeList.add(new Arista(posicion, blanco_stick, naranja_stick));
		stickers = new ArrayList<Stick>();
		// VB
		stickers.add(blanco_stick);
		stickers.add(verde_stick);
		posicion = new Vectr(0, -1, 1);

		cubeList.add(new Arista(posicion, blanco_stick, verde_stick));
		stickers = new ArrayList<Stick>();
		// AzR
		stickers.add(rojo_stick);
		stickers.add(azul_stick);
		posicion = new Vectr(1, 1, 0);

		cubeList.add(new Arista(posicion, rojo_stick, azul_stick));
		stickers = new ArrayList<Stick>();
		// AzN
		stickers.add(naranja_stick);
		stickers.add(azul_stick);
		posicion = new Vectr(-1, 1, 0);

		cubeList.add(new Arista(posicion, naranja_stick, azul_stick));
		stickers = new ArrayList<Stick>();
		// VN
		stickers.add(naranja_stick);
		stickers.add(verde_stick);
		posicion = new Vectr(-1, -1, 0);

		cubeList.add(new Arista(posicion, naranja_stick, verde_stick));
		stickers = new ArrayList<Stick>();
		// VR
		stickers.add(rojo_stick);
		stickers.add(verde_stick);
		posicion = new Vectr(1, -1, 0);
		cubeList.add(new Arista(posicion, rojo_stick, verde_stick));
		stickers = new ArrayList<Stick>();
		// RA
		stickers.add(rojo_stick);
		stickers.add(amarillo_stick);
		posicion = new Vectr(1, 0, -1);
		cubeList.add(new Arista(posicion, rojo_stick, amarillo_stick));
		stickers = new ArrayList<Stick>();
		// AzA
		stickers.add(azul_stick);
		stickers.add(amarillo_stick);
		posicion = new Vectr(0, 1, -1);
		cubeList.add(new Arista(posicion, azul_stick, amarillo_stick));
		stickers = new ArrayList<Stick>();
		// NA
		stickers.add(naranja_stick);
		stickers.add(amarillo_stick);
		posicion = new Vectr(-1, 0, -1);
		cubeList.add(new Arista(posicion, naranja_stick, amarillo_stick));
		stickers = new ArrayList<Stick>();
		// VA
		stickers.add(verde_stick);
		stickers.add(amarillo_stick);
		posicion = new Vectr(0, -1, -1);
		cubeList.add(new Arista(posicion, verde_stick, amarillo_stick));

	}

	private void createCentros() {

		// Vectr orientacion;
		Vectr posicion;
		List<Stick> stickers = new ArrayList<Stick>();

		// blanco
		stickers.add(blanco_stick);
		posicion = new Vectr(0, 0, 1);
		// orientacion = new Vectr(0, 0, 1);
		cubeCentersList.add(new Centro(posicion, blanco_stick));
		stickers = new ArrayList<Stick>();
		// amarillo
		stickers.add(amarillo_stick);
		posicion = new Vectr(0, 0, -1);
		// orientacion = new Vectr(0, 0, -1);
		cubeCentersList.add(new Centro(posicion, amarillo_stick));
		stickers = new ArrayList<Stick>();
		// verde
		stickers.add(verde_stick);
		posicion = new Vectr(0, -1, 0);
		// orientacion = new Vectr(0, -1, 0);
		cubeCentersList.add(new Centro(posicion, verde_stick));
		stickers = new ArrayList<Stick>();
		// rojo
		stickers.add(rojo_stick);
		posicion = new Vectr(1, 0, 0);
		// orientacion = new Vectr(1, 0, 0);
		cubeCentersList.add(new Centro(posicion, rojo_stick));
		stickers = new ArrayList<Stick>();
		// azul
		stickers.add(azul_stick);
		posicion = new Vectr(0, 1, 0);
		// orientacion = new Vectr(0, 1, 0);
		cubeCentersList.add(new Centro(posicion, azul_stick));
		stickers = new ArrayList<Stick>();
		// naranja
		stickers.add(naranja_stick);
		posicion = new Vectr(-1, 0, 0);
		// orientacion = new Vectr(-1, 0, 0);
		cubeCentersList.add(new Centro(posicion, naranja_stick));
		cubeList.addAll(cubeCentersList);
	}
}