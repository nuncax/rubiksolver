package utiles;

import java.awt.Color;

public class Utiles {
	static public Color orange = new Color(255, 130, 0);

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
