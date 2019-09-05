package H02;

import java.applet.*;
import java.awt.*;

public class VragenEnH2Opdracht1 extends Applet {

    public void init() {
        setBackground(Color.BLUE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.drawString("Thijs", 50, 60);
        /*
        Wat is machine taal?
        Machinetaal is een taal waarin instructies geschreven zijn die de processor van een computer direct kan uitvoeren

        Welke drie hulpmiddelen heb je nodig om te programmeren?
        een programmeertaal, een applet en een code editor

        Hoe herken je opdrachten in de broncode?
        Alle opdrachten zitten tussen de accolades.

        Waartoe dienen de import-opdrachten?
        Die halen de voorgedifinieerde codes op uit de klassenbibliotheek

        Wat is een methode?
        een methode is een aantal opdrachten met een naam erboven.
         */
    }

    public static class H2Opdracht2 extends Applet {

        public void init() {
            setBackground(Color.WHITE);
        }

        public void paint(Graphics g) {
            g.setColor(Color.BLUE);
            g.drawString("Thijs", 50, 60);
            g.setColor(Color.RED);
            g.drawString("Oldenburger", 50, 70);
        }
    }
}

