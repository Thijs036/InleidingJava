package H11;

import java.applet.Applet;
import java.awt.*;

public class H11Opdracht3 extends Applet {

    public void init() {

        }

    public void paint(Graphics g) {
        int y = 0;
        int a = 1;
        int b = 0;
        int c;

        for (int teller = 0; teller <= 20; teller++) {
            y += 20;
            c = a+b;
            g.drawString(""+ c,50,y);
            a = b;
            b = c;




    }
}
}
