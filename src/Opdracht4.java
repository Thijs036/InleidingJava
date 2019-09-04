import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(40, 200, 300, 200);
        g.drawLine(180, 54, 300, 200);
        g.drawLine(40, 201, 181, 50);
        setBackground(Color.BLUE);
        /*
        Wat is een platform? - een basis waarop software ontwikkeld wordt.

        Waarom hoeft een programmeur in Java maar één keer een programma te schrijven voor verschillende platforms?
        - Geen antwoord kunnen vinden!

        Wat is bytecode?
        Bytecode is een machinetaal die het resultaat is van de compilatie van een computerprogramma.

        Wat doet JVM?
        Die zet een programmacode om naar een speciale binaire bytecode.

        Met welke methode kun je een vierkant tekenen?
        De lijnen om een vierkant te kunnen maken doe je met g.drawline. een vierkant zelf maak je met g.drawRect.

        Noem drie methodes waarmee je een cirkel kunt tekenen?
        drawOval() en fillOval() en g.drawOval

        Waarom worden opdrachten voor het scherm in paint() gezet en niet in een andere methode?
        Omdat je door paint het werk kan zien in de Applet.

         */
}
    }