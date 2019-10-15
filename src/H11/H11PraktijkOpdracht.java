package H11;

import H10.H10PraktijkOpdracht;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class H11PraktijkOpdracht extends Applet {
    TextField tekstvak1;
    Label label1;
    Button OK;
    String string1;
    int getal1;


    public void init() {
        label1 = new Label("Typ een tafel in!");
        add(label1);
        tekstvak1 = new TextField("", 20);
        add(tekstvak1);

        OK = new Button("OK");


        tekstvak1.addActionListener(new Cijfer1Listener());
        OK.addActionListener(new Cijfer1Listener());

        add(OK);

        string1 = "";
        getal1 = 0;
    }

    public void paint(Graphics g) {
        int teller;
        int x = 70;
        int y = 80;


        for (teller = 1; teller <= 10; teller++) {

            g.drawString(teller + "x" + getal1 + "=" + teller * getal1, x, y);
            y += 20;
        }
    }
    class Cijfer1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            string1 = tekstvak1.getText();
            getal1 = Integer.parseInt(string1);
            tekstvak1.setText("");
            repaint();
        }
    }
}