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
	final private Stick naranja_stick = new Stick(Color.ORANGE, new Vectr(-1,
			0, 0));
	final private Stick azul_stick = new Stick(Color.BLUE, new Vectr(0, 1, 0));
	final private Stick verde_stick = new Stick(Color.GREEN,
			new Vectr(0, -1, 0));
	final private Stick amarillo_stick = new Stick(Color.YELLOW, new Vectr(0,
			0, -1));
	final private Stick blanco_stick = new Stick(Color.WHITE,
			new Vectr(0, 0, 1));

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

		List<Stick> stickers = new ArrayList<Stick>();

		cubeList.add(new Vertice(blanco_stick, azul_stick, rojo_stick));
		stickers = new ArrayList<Stick>();
		// AzNB
		stickers.add(blanco_stick);
		stickers.add(azul_stick);
		stickers.add(naranja_stick);

		cubeList.add(new Vertice(blanco_stick, azul_stick, naranja_stick));
		stickers = new ArrayList<Stick>();
		// VNB
		stickers.add(blanco_stick);
		stickers.add(verde_stick);
		stickers.add(naranja_stick);

		cubeList.add(new Vertice(blanco_stick, verde_stick, naranja_stick));
		stickers = new ArrayList<Stick>();
		// VRB
		stickers.add(blanco_stick);
		stickers.add(verde_stick);
		stickers.add(rojo_stick);

		cubeList.add(new Vertice(blanco_stick, verde_stick, rojo_stick));
		stickers = new ArrayList<Stick>();
		// AzNA
		stickers.add(azul_stick);
		stickers.add(naranja_stick);
		stickers.add(amarillo_stick);

		cubeList.add(new Vertice(azul_stick, naranja_stick, amarillo_stick));
		stickers = new ArrayList<Stick>();
		// AzRA
		stickers.add(azul_stick);
		stickers.add(rojo_stick);
		stickers.add(amarillo_stick);

		cubeList.add(new Vertice(azul_stick, rojo_stick, amarillo_stick));
		stickers = new ArrayList<Stick>();
		// VRA
		stickers.add(verde_stick);
		stickers.add(rojo_stick);
		stickers.add(amarillo_stick);

		cubeList.add(new Vertice(verde_stick, rojo_stick, amarillo_stick));
		stickers = new ArrayList<Stick>();
		// VNA
		stickers.add(verde_stick);
		stickers.add(naranja_stick);
		stickers.add(amarillo_stick);
		cubeList.add(new Vertice(verde_stick, naranja_stick, amarillo_stick));

	}

	private void createAristas() {

		List<Stick> stickers = new ArrayList<Stick>();
		// RB
		stickers.add(blanco_stick);
		stickers.add(rojo_stick);

		cubeList.add(new Arista(blanco_stick, rojo_stick));
		stickers = new ArrayList<Stick>();
		// AB
		stickers.add(blanco_stick);
		stickers.add(azul_stick);

		cubeList.add(new Arista(blanco_stick, azul_stick));
		stickers = new ArrayList<Stick>();
		// NB
		stickers.add(blanco_stick);
		stickers.add(naranja_stick);

		cubeList.add(new Arista(blanco_stick, naranja_stick));
		stickers = new ArrayList<Stick>();
		// VB
		stickers.add(blanco_stick);
		stickers.add(verde_stick);

		cubeList.add(new Arista(blanco_stick, verde_stick));
		stickers = new ArrayList<Stick>();
		// AzR
		stickers.add(rojo_stick);
		stickers.add(azul_stick);

		cubeList.add(new Arista(rojo_stick, azul_stick));
		stickers = new ArrayList<Stick>();
		// AzN
		stickers.add(naranja_stick);
		stickers.add(azul_stick);

		cubeList.add(new Arista(naranja_stick, azul_stick));
		stickers = new ArrayList<Stick>();
		// VN
		stickers.add(naranja_stick);
		stickers.add(verde_stick);

		cubeList.add(new Arista(naranja_stick, verde_stick));
		stickers = new ArrayList<Stick>();
		// VR
		stickers.add(rojo_stick);
		stickers.add(verde_stick);
		cubeList.add(new Arista(rojo_stick, verde_stick));
		stickers = new ArrayList<Stick>();
		// RA
		stickers.add(rojo_stick);
		stickers.add(amarillo_stick);
		cubeList.add(new Arista(rojo_stick, amarillo_stick));
		stickers = new ArrayList<Stick>();
		// AzA
		stickers.add(azul_stick);
		stickers.add(amarillo_stick);
		cubeList.add(new Arista(azul_stick, amarillo_stick));
		stickers = new ArrayList<Stick>();
		// NA
		stickers.add(naranja_stick);
		stickers.add(amarillo_stick);
		cubeList.add(new Arista(naranja_stick, amarillo_stick));
		stickers = new ArrayList<Stick>();
		// VA
		stickers.add(verde_stick);
		stickers.add(amarillo_stick);
		cubeList.add(new Arista(verde_stick, amarillo_stick));

	}

	private void createCentros() {

		// Vectr orientacion;

		List<Stick> stickers = new ArrayList<Stick>();

		// blanco
		stickers.add(blanco_stick);

		// orientacion = new Vectr(0, 0, 1);
		cubeCentersList.add(new Centro(blanco_stick));
		stickers = new ArrayList<Stick>();
		// amarillo
		stickers.add(amarillo_stick);

		// orientacion = new Vectr(0, 0, -1);
		cubeCentersList.add(new Centro(amarillo_stick));
		stickers = new ArrayList<Stick>();
		// verde
		stickers.add(verde_stick);

		// orientacion = new Vectr(0, -1, 0);
		cubeCentersList.add(new Centro(verde_stick));
		stickers = new ArrayList<Stick>();
		// rojo
		stickers.add(rojo_stick);

		// orientacion = new Vectr(1, 0, 0);
		cubeCentersList.add(new Centro(rojo_stick));
		stickers = new ArrayList<Stick>();
		// azul
		stickers.add(azul_stick);

		// orientacion = new Vectr(0, 1, 0);
		cubeCentersList.add(new Centro(azul_stick));
		stickers = new ArrayList<Stick>();
		// naranja
		stickers.add(naranja_stick);

		// orientacion = new Vectr(-1, 0, 0);
		cubeCentersList.add(new Centro(naranja_stick));
		cubeList.addAll(cubeCentersList);
	}
}