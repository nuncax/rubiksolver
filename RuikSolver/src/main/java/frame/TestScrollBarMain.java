package frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class TestScrollBarMain extends JFrame {

public TestScrollBarMain() {
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    JPanel p = new JPanel();
    p.setPreferredSize(new Dimension(500, 500));
    JScrollPane s = new JScrollPane(p);
    MyScrollBar b = new MyScrollBar();
    s.setVerticalScrollBar(b);
    getContentPane().add(s);
    setSize(100, 100);
    setVisible(true);
}

public static void main(String[] args) {
    new TestScrollBarMain();
}

public class MyScrollBarUI extends BasicScrollBarUI {

    @Override
    protected void paintThumb(final Graphics g, final JComponent c, final Rectangle thumbBounds) {
        if (thumbBounds.isEmpty() || !this.scrollbar.isEnabled()) {
            return;
        }
        g.translate(thumbBounds.x, thumbBounds.y);
        g.setColor(this.thumbDarkShadowColor);
        g.drawOval(2, 0, 14, 14);
        g.setColor(this.thumbColor);
        g.fillOval(2, 0, 14, 14);
        g.setColor(this.thumbHighlightColor);
        g.setColor(this.thumbLightShadowColor);
        g.translate(-thumbBounds.x, -thumbBounds.y);
    }

    @Override
    protected void paintTrack(final Graphics g, final JComponent c, final Rectangle trackBounds) {
        g.setColor(Color.black);
        g.fillRect(trackBounds.width / 2, trackBounds.y, 3, trackBounds.height);
        if (this.trackHighlight == BasicScrollBarUI.DECREASE_HIGHLIGHT) {
            this.paintDecreaseHighlight(g);
        } else if (this.trackHighlight == BasicScrollBarUI.INCREASE_HIGHLIGHT) {
            this.paintIncreaseHighlight(g);
        }
    }
}

public class MyScrollBar extends JScrollBar {

    MyScrollBar() {
        super();
        setUI(new MyScrollBarUI());
    }
}

}