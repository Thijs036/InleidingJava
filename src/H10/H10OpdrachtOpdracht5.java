package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10OpdrachtOpdracht5 extends Applet {
    TextField tekstvak1;
    Label label1;
    Button OK;
    double getal1;
    double gemiddelde;
    double totaal;
    int aantal;
    String s;

    public void init() {
        label1 = new Label("Typ hier uw getal in!");
        add(label1);
        tekstvak1 = new TextField("", 20);
        tekstvak1.addActionListener(new CijferListener());
        add(tekstvak1);
        OK = new Button("OK");
        OK.addActionListener(new CijferListener());
        add(OK);

        s = "";
        getal1 = 0.0;

    }
    public void paint(Graphics g) {
        g.drawString("Jou cijfer is een: " + s,50,150);
        g.drawString("Het gemiddelde is: " + gemiddelde,50,120);
    }

    class CijferListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            getal1 = Double.parseDouble(s);
            aantal++;
            totaal+= getal1;
            gemiddelde = totaal / aantal;

                if (gemiddelde < 5.5) {
                    s = "Onvoldoende";
                } else if (gemiddelde >= 5.5) {
                    s = "Voldoende";
                }
                repaint();
            }
        }
    }
