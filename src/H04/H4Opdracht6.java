package H04;

import java.awt.*;
import java.applet.*;

public class H4Opdracht6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.BLACK);
        g.fillRect(350,450,20,300);
        g.drawRect(350, 450, 20, 300);
        g.setColor(Color.BLACK);
        g.fillRect(300,250,125,200);
        g.drawRect(300,250,125,200);
        g.setColor(Color.RED);
        g.fillOval(335,265,50,40);
        g.drawOval(335,265,50,40);
        g.setColor(Color.ORANGE);
        g.fillOval(335,331,50,40);
        g.drawOval(335,331,50,40);
        g.setColor(Color.GREEN);
        g.fillOval(335,395,50,40);
        g.drawOval(335,395,50,40);

    }
}