package H06;

import java.applet.Applet;
import java.awt.*;

public class H6PraktijkOpdracht extends Applet {

    double cijfer1;
    double cijfer2;
    double cijfer3;

    double uitkomst;

    @Override
    public void init() {

        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;

        uitkomst = (cijfer1 + cijfer2 + cijfer3) / 3;
        uitkomst = uitkomst *10;
        uitkomst = (int) uitkomst;
        uitkomst = uitkomst / 10;

    }

        public void paint (Graphics g) {
        g.drawString("Gemiddelde uitkomst is: " + uitkomst, 50,50);

        }
    }

