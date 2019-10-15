package H11;

import java.awt.*;
import java.applet.*;


public class H11Opdracht5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int y = 0;
        int x = 0;
        for ( int teller = 0; teller < 10; teller++){
            y += 20;
            x += 20;
            g.drawRect(x, y, 20, 20);
        }
    }
}
