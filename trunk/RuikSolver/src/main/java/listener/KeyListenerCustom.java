package listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerCustom implements KeyListener {

	

	

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("entro");
		if (e.getKeyCode() == 27) {// 27 es el código de la tecla esc
			System.out.println("Adios!");
			
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Después de soltar la tecla!");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Tecla apretada");
	}

}
