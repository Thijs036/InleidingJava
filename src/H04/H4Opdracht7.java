package H04;

import java.awt.*;
import java.applet.*;

public class H4Opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRoundRect(50, 50, 100, 100, 10, 10);
        //linksbovenoog
        g.setColor(Color.black);
        g.fillOval(55,55,35,30);
        g.drawOval(55,55,35,30);
        //linksonderoog
        g.setColor(Color.BLACK);
        g.fillOval(55,110,35,30);
        g.drawOval(55,110,35,30);
        //rechtsbovenoog
        g.setColor(Color.BLACK);
        g.fillOval(110,55,35,30);
        g.drawOval(110,55,35,30);
        //rechtsonderoog
        g.setColor(Color.BLACK);
        g.fillOval(110,110,35,30);
        g.drawOval(110,110,35,30);
    }
}