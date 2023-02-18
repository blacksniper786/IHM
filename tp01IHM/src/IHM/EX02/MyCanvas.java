package IHM.EX02;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
class MyCanvas extends JComponent {
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawArc(10, 20, 200, 200, 0, 68);
        g.drawArc(20, 30, 200, 200, 0, 68);
        g.fillArc(10, 20, 200, 200, 0, 270);//(1)
    }
}

