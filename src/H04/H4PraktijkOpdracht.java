package H04;

import java.awt.*;
import java.applet.*;

public class H4PraktijkOpdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //De Lijn!
        g.drawString("Lijn", 125,60);
        g.drawLine(200,40,65,40);
        //Rechthoek
        g.drawRect(50, 80, 175, 100);
        g.drawString("Rechthoek",110,200);
        //Afgeronde rechthoek
        g.drawRoundRect(50,215,175,100, 50,50);
        g.drawString("Afgeronde Rechthoek",80, 335);
        // Gevulde Rechthoek met Ovaal
        g.setColor(Color.MAGENTA);
        g.fillRect(250,80,200,100);
        g.setColor(Color.BLACK);
        g.drawArc(250, 80, 200, 100, 90, 360);
        g.setColor(Color.BLACK);
        g.drawString("Gevulde Rechthoek met Ovaal",270,200);
        // Gevulde Ovaal
        g.setColor(Color.MAGENTA);
        g.fillArc(250,215,200,100,90,360);
        g.setColor(Color.BLACK);
        g.drawString("Gevulde ovaal",310,335);
        //Taartpunt met Ovaal
        g.drawArc(475, 80, 200, 100, 90, 360);
        g.setColor(Color.MAGENTA);
        g.fillArc(475, 80, 200, 100,0 , 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met Ovaal",520,200);
        //Cirkel
        g.drawOval(500, 215, 100, 100);
        g.drawString("Cirkel",535,335);

    }
}