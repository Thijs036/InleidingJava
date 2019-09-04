
import java.applet.*;
        import java.awt.*;

public class JavaThijs extends Applet {

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