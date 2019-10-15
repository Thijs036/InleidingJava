package H11;

import java.awt.*;
import java.applet.*;


public class H11Opdracht9 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        // Waarde dingetjes..
        int x = 600;
        int y = 50;
        int breedte = 50;
        int hoogte = 50;

        // Eerste rij
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, breedte, hoogte);

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        //tweede rij
        x = 600;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        //derde rij
        x = 600;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        // vierde rij
        x = 600;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        //vijfde rij
        x = 600;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        //zesde rij
        x = 600;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        //zevende rij
        x = 600;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        //achtste rij
        x = 600;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
    }
}