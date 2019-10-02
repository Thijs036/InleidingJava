package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class H10Opdracht3En4 extends Applet {
    TextField tekstvakMaand;
    TextField tekstvakJaar;
    Label label;
    Label label2;
    String s, tekst;
    String tekstdagen;
    int maand;
    int jaartal;


    public void init() {
        tekstvakMaand = new TextField("", 10);
        label = new Label("Typ het dagnummer in en druk op enter");
        tekstvakMaand.addActionListener( new DeMaandListener() );
        tekstvakJaar = new TextField("",10);
        label2 = new Label("Typ een maand in en druk op enter");
        tekstdagen = "";
        tekst = "";
        add(label);
        add(tekstvakMaand);
        add(label2);
        add(tekstvakJaar);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 105 );
        g.drawString(tekstdagen,50,120);
    }

    class DeMaandListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvakMaand.getText();
            maand = Integer.parseInt(s);
            int jaartal = Integer.parseInt(tekstvakJaar.getText());
            int februari = 28;
            switch(maand) {
                case 1:
                    tekst = "Januari";
                    tekstdagen = "31";
                    break;
                case 2:
                    tekst = "Februari";
                    if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0 ) {
                        februari = 29;
                    }
                    tekstdagen = februari + " dagen ";
                    break;
                case 3:
                    tekst = "Maart";
                    tekstdagen = "31";
                    break;
                case 4:
                    tekst = "April";
                    tekstdagen = "30";
                    break;
                case 5:
                    tekst = "Mei";
                    tekstdagen = "31";
                    break;
                case 6:
                    tekst = "Juni";
                    tekstdagen = "30";
                    break;
                case 7:
                    tekst = "Juli";
                    tekstdagen = "31";
                    break;
                case 8:
                    tekst = "Augustus";
                    tekstdagen = "31";
                    break;
                case 9:
                    tekst = "September";
                    tekstdagen = "30";
                    break;
                case 10:
                    tekst = "Oktober";
                    tekstdagen = "31";
                    break;
                case 11:
                    tekst = "November";
                    tekstdagen = "30";
                    break;
                case 12:
                    tekst = "December";
                    tekstdagen = "31";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}
