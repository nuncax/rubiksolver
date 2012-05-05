package frame;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Insets;
import java.text.AttributedCharacterIterator.Attribute;

import javax.print.attribute.AttributeSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultEditorKit.InsertContentAction;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

public class MyJtexPane extends JTextPane {

	private static StyledDocument doc;

	private static String[] initStyles = { "regular", "italic", "bold",
			"small", "large", "regular", "button", "regular", "icon", "regular" };

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

	public static void insert(String str, String style) {
		// StyleConstants.setForeground(StyledDocument. , Color.red);
		if (!style.equals(NUMBER_STYLE)) {
		str=	str.concat("\n");
		}
		try {
			doc.insertString(doc.getLength(), str, doc.getStyle(style));
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
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
		
		StyleConstants.setForeground(s, Color.orange);

		s = doc.addStyle("green", regular);
		StyleConstants.setFontSize(s, 13);
		StyleConstants.setBold(s, true);
		StyleConstants.setForeground(s, Color.green);

		s = doc.addStyle("red", regular);
		StyleConstants.setFontSize(s, 13);
		StyleConstants.setBold(s, true);
		StyleConstants.setForeground(s, Color.red);

		s = doc.addStyle("blue", regular);
		StyleConstants.setFontSize(s, 13);
		StyleConstants.setBold(s, true);
		StyleConstants.setForeground(s, Color.blue);

		s = doc.addStyle("white", regular);
		StyleConstants.setFontSize(s, 13);
		StyleConstants.setBold(s, true);
		StyleConstants.setForeground(s, Color.white);

		s = doc.addStyle("yellow", regular);
		StyleConstants.setFontSize(s, 13);
		StyleConstants.setBold(s, true);
		StyleConstants.setForeground(s, Color.yellow);

		// number
		s = doc.addStyle("nunber", regular);
		StyleConstants.setFontSize(s, 13);
		StyleConstants.setBold(s, true);

		// s = doc.addStyle("large", regular);
		// StyleConstants.setFontSize(s, 16);

	}

}
