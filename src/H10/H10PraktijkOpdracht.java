package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10PraktijkOpdracht extends Applet {
    TextField tekstvak1;
    Label label1;
    Button OK1;
    String string1;
    String wrong;
    int getal1;


    public void init() {
        label1 = new Label("Typ je cijfer in");
        add(label1);
        tekstvak1 = new TextField("", 20);
        add(tekstvak1);
        tekstvak1.addActionListener(new Cijfer1Listener());

        string1 = "";
        getal1 = 0;
    }

    public void paint(Graphics g) {
        g.drawString("Jou cijfer is een: " + string1, 50, 100);

    }
    class Cijfer1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            string1 = tekstvak1.getText();
            getal1 = Integer.parseInt(string1);

            if (getal1 <= 3) {
                string1 = "Slecht";
            } else if (getal1 == 4) {
                string1 = "Onvoldoende";
            } else if (getal1 == 5) {
                string1 = "Matig";
            } else if (getal1 == 6) {
                string1 = "Voldoende";
            } else if (getal1 == 7) {
                string1 = "Voldoende";
            } else if (getal1 <= 10) {
                string1 = "Goed";
            } else if (getal1 > 10) {
                string1 = "Er is een verkeerd cijfer ingetypt!";
            }
            repaint();
            }
        }
    }
