package H11;

import java.awt.*;
import java.applet.*;


public class H11Opdracht4 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        int a = 0;
        int b = 3;
        int c;

        for (teller = 0; teller <10; teller++) {
            y += 20;
            c = a+b;
            g.drawString("" + c, 150, y );
            a+= b;
        }
    }
}
