package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H8O1 extends Applet {
    Button knopoke;
    Button knopreset;
    TextField tekstvak;
    String message;

    public void init() {

        setSize(400,400);

        tekstvak = new TextField(20);
        add(tekstvak);

        knopoke = new Button("OK");
        knopoke.addActionListener(new KnopOKListener());
        add(knopoke);

        knopreset = new Button("Reset");
        knopreset.addActionListener(new KnopResetListener());
        add(knopreset);

        message = ("Nog niks getypt Thijs!");
    }

    public void paint(Graphics g) {
        g.drawString(message,20, 150);

    }

    class KnopOKListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            message = tekstvak.getText();
            repaint();

        }
    }

    class KnopResetListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
        }

    }
}



