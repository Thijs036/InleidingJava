import java.applet.Applet;
import java.awt.*;

public class Opdracht2Van4 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(50, 100, 150, 160);
        g.drawRect(95, 185, 60, 75);
        g.drawRect(95,115,60,50);
        g.drawLine(50, 100, 125, 40);
        g.drawLine(200, 100, 125, 39);


    }
}