package H11;

import java.awt.*;
import java.applet.*;


public class H11Opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int y = 500;
        int x = 700;
        int grootte = 2;
        for ( int teller = 0; teller <50; teller++){
            y += -5;
            x += -5;
            grootte += 10;
            g.drawOval(x, y, grootte, grootte);
        }
    }
}
