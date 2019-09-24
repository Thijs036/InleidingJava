package H06;

import java.applet.Applet;
import java.awt.*;

public class H6Opdracht1 extends Applet {
    double a;
    double b;
    double uitkomst;

    @Override
    public void init() {

        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.setColor(Color.MAGENTA);
        g.drawString("Jan krijgt 28.25", 20,40);
        g.drawString("Ali krijgt 28.25",20,60);
        g.drawString(" Thijs krijgt 28.25",20,80);
        g.drawString("Jeanette krijgt 28.25",20,100);
    }
}