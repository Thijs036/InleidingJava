import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(5,50,50,50);
        g.drawOval(5, 50, 50, 50);
        g.setColor(Color.BLACK);
        g.drawLine(30,400,30, 100);
        g.drawRect(30,150,150,46);
        g.drawRect(30,150,150,100);
        g.drawRect(30,150,150,150);
        g.setColor(Color.RED);
        g.fillRect(30,150,150,50);
        g.setColor(Color.blue);
        g.fillRect(30,250,150,50);

    }
}
