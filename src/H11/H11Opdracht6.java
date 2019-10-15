package H11;

import java.awt.*;
import java.applet.*;


public class H11Opdracht6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int y = 100;
        int x = 100;
        int grootte = 2;
        for ( int teller = 0; teller <5; teller++){
            y += -5;
            x += -5;
            grootte += 10;
            g.drawOval(x, y, grootte, grootte);
        }
    }
}
