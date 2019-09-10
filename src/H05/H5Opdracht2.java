package H05;

import java.applet.Applet;
import java.awt.*;

public class H5Opdracht2 extends Applet {
//int dingen
    int gewichtValerie;
    int hoogsteXas;
    int gewichtjeroen;
    int gewichtHans;

    public void init() {
        //initialen
        setSize(400,400);
        gewichtValerie = 40;
        gewichtjeroen = 100;
        gewichtHans = 80;
        hoogsteXas = 350;
    }
    
    public void paint(Graphics g) {
        //Horizontale lijn
        g.drawLine(50, 100, 50, 350);
        //Verticale lijn
        g.drawLine(50,350,350,350);
        //StaafValerie
        g.drawString("40",30,315);
        g.setColor(Color.RED);
        g.drawString ("Valerie", 70,375);
        g.setColor(Color.RED);
        g.fillRect(50,hoogsteXas - gewichtValerie,70,gewichtValerie);
        //StaafJeroen
        g.setColor(Color.BLACK);
        g.drawString("100",24,250);
        g.setColor(Color.blue);
        g.drawString(" Jeroen ", 130, 375);
        g.setColor(Color.BLUE);
        g.fillRect(120,hoogsteXas - gewichtjeroen,70,gewichtjeroen);
        //StaafHans
        g.setColor(Color.BLACK);
        g.drawString("80", 30,280);
        g.setColor(Color.yellow);
        g.drawString("Hans", 210,375);
        g.setColor(Color.yellow);
        g.fillRect(190,hoogsteXas - gewichtHans,70, gewichtHans);
    }
}

