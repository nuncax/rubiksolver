package actionListener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorActionListener implements ActionListener {
	private Color color;

	@Override
	public void actionPerformed(ActionEvent e) {
		if(color.equals(Color.yellow)){
			color = Color.yellow;
		}else if(color.equals(Color.red)){
			color = Color.red;			
		}else if(color.equals(Color.blue)){
			color = Color.blue;			
		}else if(color.equals(Color.white)){
			color = Color.white;			
		}else if(color.equals(Color.orange)){
			color = Color.orange;			
		}else if(color.equals(Color.green)){
			color = Color.green;			
		}

	}

	public ColorActionListener(Color color) {
		this.color = color;
	}
}
