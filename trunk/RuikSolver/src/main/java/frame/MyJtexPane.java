package frame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

import utiles.Utiles;

public class MyJtexPane extends JTextPane {

	private static final long serialVersionUID = 7680980271859590658L;

	private static StyledDocument doc;

	// private static String[] initStyles = { "regular", "italic", "bold",
	// "small", "large", "regular", "button", "regular", "icon", "regular" };

	public static final String DEFAULT_STYLE = "regular";
	public static final String NUMBER_STYLE = "nunber";
	public static final String SUB_STYLE = "sub";
	public static final String RANDOM_STYLE = "ramdom";

	public static final String ORANGE_STYLE = "orange";
	public static final String GREEN_STYLE = "green";
	public static final String RED_STYLE = "red";
	public static final String BLUE_STYLE = "blue";
	public static final String WHITE_STYLE = "white";
	public static final String YELLOW_STYLE = "yellow";

	public static final String LARGE_STYLE = "large";

	public MyJtexPane() {
		super();
		doc = getStyledDocument();
		addStylesToDocument(doc);
	}

	public MyJtexPane(StyledDocument doc) {
		super(doc);
	}

	private void addStylesToDocument(StyledDocument doc) {
		Style def = StyleContext.getDefaultStyleContext().getStyle(
				StyleContext.DEFAULT_STYLE);

		// Titulos
		Style regular = doc.addStyle("regular", def);
		StyleConstants.setFontFamily(def, "SansSerif");

		// subtitulos
		Style s = doc.addStyle("sub", regular);
		StyleConstants.setItalic(s, true);

		s = doc.addStyle("ramdom", regular);
		StyleConstants.setBold(s, true);

		// colores
		s = doc.addStyle("orange", regular);
		StyleConstants.setFontSize(s, 13);
		StyleConstants.setBold(s, true);

		StyleConstants.setForeground(s, Utiles.orange);

		s = doc.addStyle("green", regular);
		StyleConstants.setFontSize(s, 13);
		StyleConstants.setBold(s, true);
		StyleConstants.setForeground(s, Utiles.green);

		s = doc.addStyle("red", regular);
		StyleConstants.setFontSize(s, 13);
		StyleConstants.setBold(s, true);
		StyleConstants.setForeground(s, Utiles.red);

		s = doc.addStyle("blue", regular);
		StyleConstants.setFontSize(s, 13);
		StyleConstants.setBold(s, true);
		StyleConstants.setForeground(s, Utiles.blue);

		s = doc.addStyle("white", regular);
		StyleConstants.setFontSize(s, 13);
		StyleConstants.setBold(s, true);
		StyleConstants.setForeground(s, Utiles.white);

		s = doc.addStyle("yellow", regular);
		StyleConstants.setFontSize(s, 13);
		StyleConstants.setBold(s, true);
		StyleConstants.setForeground(s, Utiles.yellow);

		// number
		s = doc.addStyle("nunber", regular);
		StyleConstants.setFontSize(s, 13);
		StyleConstants.setBold(s, true);

		// s = doc.addStyle("large", regular);
		// StyleConstants.setFontSize(s, 16);

	}

	public static void insert(String str, String style) {
		// StyleConstants.setForeground(StyledDocument. , Utiles.red);
		if (!style.equals(NUMBER_STYLE)) {
			str = str.concat("\n");
		}
		try {
			doc.insertString(doc.getLength(), str, doc.getStyle(style));
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

//	@Override
//	protected void paintComponent(Graphics g) {
//		// set background green - but can draw image here too
//		g.setColor(Utiles.colorAzulito);
//		g.fillRect(0, 0, getWidth(), getHeight());
//
//		// uncomment the following to draw an image
//		Image img = null;
//		try {
//			img = ImageIO.read(this.getClass().getClassLoader()
//					.getResource("images/panelLateralDerecho.fw.png"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		g.drawImage(img, 0, 0, this);
//
//		super.paintComponent(g);
//	}
	
	
	
	
	Image  bgImage ;
	
	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(Utiles.colorAzulito);
		g.fillRect(0, 0, getWidth(), getHeight());
		   try {
			bgImage=ImageIO.read(this.getClass().getClassLoader()
						.getResource("images/panelLateralDerecho.fw.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        // if a background image exists, paint it
	        if (bgImage != null) {
	            int width = this.getWidth();
	            int height = this.getHeight();
	            int imageW = bgImage.getWidth(null);
	            int imageH = bgImage.getHeight(null);

	            // we'll tile the image to fill our area
	            for (int x = 0; x < width; x += imageW) {
	                for (int y = 0; y < height; y += imageH) {
	                    g.drawImage(bgImage, x, y, this);
	                }
	            }
	            super.paintComponent(g);
	        }
	    }


}
