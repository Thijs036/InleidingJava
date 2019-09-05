package H04;
import java.awt.*;
import java.applet.*;

public class H4Opdracht5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.BLUE);
        g.setColor(Color.yellow);
        g.fillArc(200, 100, 300, 200, 360, 400);

    }
}
