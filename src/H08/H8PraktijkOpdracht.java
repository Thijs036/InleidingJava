package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class H8PraktijkOpdracht extends Applet {
        Button plusknop;
        Button minknop;
        Button gedeeltdoorknop;
        Button keerknop;
        TextField tekstvak;
        TextField tekstvak2;
        double getal1;
        double getal2;
        double uitkomst;
        String s1;
        String s2;

        public void init() {
            tekstvak = new TextField(15);
            add(tekstvak);
            tekstvak2 = new TextField(15);
            add(tekstvak2);

            plusknop = new Button("+");
            plusknop.addActionListener(new PlusknopListener());
            add(plusknop);

            minknop = new Button("-");
            minknop.addActionListener(new MinknopListener());
            add(minknop);

            gedeeltdoorknop = new Button("/");
            gedeeltdoorknop.addActionListener(new GedeeltdoorknopListener());
            add(gedeeltdoorknop);

            keerknop = new Button("*");
            keerknop.addActionListener(new KeerknopListener());
            add(keerknop);

            uitkomst = getal1 + getal2;


            getal1 = 0;
            getal2 = 0;

            s1 = "";
            s2 = "";
        }
        class PlusknopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s1 = tekstvak.getText();
                getal1 = Double.parseDouble(s1);
                s2 = tekstvak2.getText();
                getal2 = Double.parseDouble(s2);
                uitkomst = getal1 + getal2;
                tekstvak.setText("" + uitkomst);
                tekstvak2.setText("");
                repaint();
            }
        }
            class MinknopListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    s1 = tekstvak.getText();
                    getal1 = Double.parseDouble(s1);
                    s2 = tekstvak2.getText();
                    getal2 = Double.parseDouble(s2);
                    uitkomst = getal1 - getal2;
                    tekstvak.setText("" + uitkomst);
                    tekstvak2.setText("");
                    repaint();
                }
            }

                class GedeeltdoorknopListener implements ActionListener {
                    public void actionPerformed(ActionEvent e) {
                        s1 = tekstvak.getText();
                        getal1 = Double.parseDouble(s1);
                        s2 = tekstvak2.getText();
                        getal2 = Double.parseDouble(s2);
                        uitkomst = getal1 / getal2;
                        tekstvak.setText("" + uitkomst);
                        tekstvak2.setText("");
                        repaint();
                    }
                }

                    class KeerknopListener implements ActionListener {
                        public void actionPerformed(ActionEvent e) {
                            s1 = tekstvak.getText();
                            getal1 = Double.parseDouble(s1);
                            s2 = tekstvak2.getText();
                            getal2 = Double.parseDouble(s2);
                            uitkomst = getal1 * getal2;
                            tekstvak.setText("" + uitkomst);
                            tekstvak2.setText("");
                            repaint();
                        }
                    }
                }