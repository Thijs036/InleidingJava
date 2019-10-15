package H11;

import java.awt.*;
import java.applet.*;


public class H11Opdracht8 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int y = 500;
        int x = 700;
        int grootte = 2;
        for ( int teller = 0; teller <100; teller++){
            y += -5;
            x += -5;
            grootte += 10;
            g.drawOval(x, y, grootte, grootte);
        }
    }
}
