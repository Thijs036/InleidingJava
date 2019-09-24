package H06;

import java.awt.*;
import java.applet.*;


public class H6Opdracht3 extends Applet {
    int getal2;
    int getal1;
    int uitkomst;

    public void init() {
        getal2 = 2147483647;
        getal1 = 586424;
        uitkomst = getal1 + getal2;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 50, 70);

    }
}

