package H08;

import java.applet.Applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

    public class H8O3 extends Applet {
        TextField tekstvak;
        Label label;
        double getal;
        Button knopreset;
        //De BTW
        double getal2;

        public void init() {
            tekstvak = new TextField("", 20);
            add(tekstvak);
            label = new Label(" Typ een getal ");
            tekstvak.addActionListener(new TekstvakListener());
            add(label);
            add(tekstvak);
            getal2 = 1.21;
        }

        public void paint(Graphics g) {

            g.drawString("" + getal * getal2, 50, 50);
        }

        class TekstvakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String s = tekstvak.getText();
                getal = Double.parseDouble(s);
                tekstvak.setText("");
                repaint();
            }
        }
    }


