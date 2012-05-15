package utiles;

import java.awt.Color;

public class Utiles {

	static public Color orange = new Color(255, 128, 0);
	static public Color red = Color.red;
	static public Color green = Color.green;
	static public Color blue = Color.blue;
	static public Color white = Color.white;
	static public Color yellow = Color.yellow;

	static public Color colorAzulito = new Color(175, 200, 255);

	static public void slep(long time) {
		if (time > 0) {
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
