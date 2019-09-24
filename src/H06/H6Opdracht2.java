package H06;

import java.applet.Applet;
import java.awt.*;

public class H6Opdracht2 extends Applet {
    int secondenminuut;
    int minutenuur;
    int uren;
    int dagen;
    int weken;
    int maanden;
    int jaren;
    int uitkomst1;
    int uitkomst2;
    int uitkomst3;

    @Override
    public void init() {
        super.init();
        secondenminuut = 60;
        minutenuur = 60;
        uren = 3600;
        dagen = 86400;
        weken = 604800;
        jaren = 365;
        uitkomst1 = secondenminuut * minutenuur;
        uitkomst2 = uren * dagen;
        uitkomst3 = dagen * jaren;
    }
        public void paint (Graphics g) {
        g.drawString("Seconden in een uur: "  + uitkomst1,20,20);
        g.drawString("Seconden in een dag: " + uitkomst2, 20, 40);
        g.drawString("Seconden in een jaar: " + uitkomst3,20,60);

    }
}
