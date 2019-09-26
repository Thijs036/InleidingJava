package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class H8O2 extends Applet {
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    Button knopreset;
    Label label1;
    int mannen;
    int vrouwen;
    int jongen;
    int meisje;
    String S1 = "";
    String S2 = "";
    String S3 = "";
    String S4 = "";
    String Samen;

    public void init() {
        knop1 = new  Button("Man");
        knop2 = new Button("Vrouw");
        knop3 = new Button("Jongen");
        knop4 = new Button("Meisje");
        label1 = new Label("Het totaal is");
        knop1.addActionListener(new ManListener());
        knop2.addActionListener(new VrouwListener());
        knop3.addActionListener(new JongenListener());
        knop4.addActionListener(new MeisjeListener());
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
        mannen = 0;
        vrouwen = 0;
        meisje = 0;
        jongen = 0;
    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannen:     " + mannen, 80, 100);
        g.drawString("Aantal vrouwen:    " + vrouwen, 80, 120);
        g.drawString("Aantal jongens:    " + jongen, 80, 140);
        g.drawString("Aantal meisjes:    " + meisje, 80, 160);
    }

    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannen++;
            repaint();
        }
    }

    class VrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwen++;
            repaint();
        }
    }

    class MeisjeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            meisje++;
            repaint();
        }
    }

    class JongenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            jongen++;
            repaint();
        }
    }
}
