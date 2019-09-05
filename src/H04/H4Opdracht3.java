package H04;

import java.applet.Applet;
import java.awt.*;

public class H4Opdracht3 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(1,85,50,50);
        g.drawOval(1, 85, 50, 50);
        g.setColor(Color.BLACK);
        g.drawRect(10, 135, 20, 400);
        g.drawRect(30,150,150,46);
        g.drawRect(30,150,150,100);
        g.drawRect(30,150,150,150);
        g.setColor(Color.RED);
        g.fillRect(30,150,150,50);
        g.setColor(Color.blue);
        g.fillRect(30,250,150,50);

    }
}
