package H04;

import java.applet.Applet;
import java.awt.*;

public class H4Opdracht4 extends Applet {


    public void paint(Graphics g) {
        //onderstelijn
        g.drawLine(200, 800, 650, 800);
        //linkerlijn
        g.drawLine(200,300,200,800);
        //Staaf Valerie
        g.setColor(Color.BLUE);
        g.fillRect(200,680,90,120);
        g.drawRect(200,680,90,120);
        g.setColor(Color.BLACK);
        g.drawString ("Valerie", 225,825);
        //Staaf Jeroen
        g.setColor(Color.RED);
        g.fillRect(290,475,90,325);
        g.drawRect(290,475,90,325);
        g.setColor(Color.BLACK);
        g.drawString(" Jeroen ", 315, 825);
        //Staaf Hans
        g.setColor(Color.BLACK);
        g.drawString("Hans", 415,825);
        g.setColor(Color.YELLOW);
        g.fillRect(380,550,90,250);
        g.drawRect(380,550,90,250);
        //Nummers 20 t/m 160
        g.setColor(Color.BLACK);
        g.drawString("20",175,755);
        g.drawString("40", 175, 690);
        g.drawString("60",175,620);
        g.drawString("80",175,550);
        g.drawString("100",175,485);
        g.drawString("120",175,420);
        g.drawString("140", 175, 360);
        g.drawString("160", 175, 310);
    }
}


