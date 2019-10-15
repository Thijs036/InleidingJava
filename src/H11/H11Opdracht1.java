package H11;

import java.applet.Applet;
import java.awt.*;

public class H11Opdracht1 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int y = 0;

        for (int teller = 0; teller < 10; teller++) {
            y += 20;
            g.drawLine(50, y, 300, y);
        }
    }
}

