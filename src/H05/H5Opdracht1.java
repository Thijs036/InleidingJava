package H05;

import java.applet.Applet;
import java.awt.*;

public class H5Opdracht1 extends Applet {
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        //tekenen lijn
        g.drawString("Lijn", 125,60);
        g.drawLine(200,40,65,40);
        //teken rechthoek
        g.drawRect(100, 100, breedte, hoogte);
        //teken afgeronde rechthoek
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        //teken gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        //teken ovaal
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);
        //teken gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);
        //teken Taartpunt met Ovaal
        g.setColor(lijnkleur);
        g.drawArc(550, 100, breedte, hoogte, 90, 360);
        g.setColor(opvulkleur);
        g.fillArc(550, 100, breedte, hoogte,0 , 45);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met Ovaal",600,220);
        // tekenen cirkel
        g.drawOval(590, 230, 100, 100);
        g.drawString("Cirkel",625,350);
    }
}
