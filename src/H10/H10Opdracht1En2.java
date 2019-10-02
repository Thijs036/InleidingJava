package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10Opdracht1En2 extends Applet {
    TextField tekstvak;
    String s;
    double maximum;
    double minimum;
    double userinput;
    Label label1;
    boolean firstinput;


    public void init() {
        label1 = new Label("Typ hier een getal in!");
        add(label1);
        tekstvak = new TextField(20);
        add(tekstvak);
        tekstvak.addActionListener(new GetalListener());
        s = "";
        maximum = 0;
        minimum = 0;
        firstinput = true;
    }

    public void paint(Graphics g) {
        g.drawString("Het maximum getal is:" + maximum,50,100);
        g.drawString("Het minimum getal is:" + minimum,50,120);
    }

    class GetalListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            userinput = Double.parseDouble(s);
            if (firstinput) {
                firstinput = false;
                maximum = userinput;
                minimum = userinput;
            } else if (userinput > maximum) {
                maximum = userinput;
            } else if (userinput < minimum) {
                minimum = userinput;
            }
            repaint();
        }
    }
}

