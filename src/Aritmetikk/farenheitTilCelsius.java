package Aritmetikk;

import static javax.swing.JOptionPane.*;
public class farenheitTilCelsius {
    public static void main(String[] args) {
        String innFarenheit = showInputDialog("Skriv inn farenheit som du vil konvertere til celsius.");
        double farenheit = Double.parseDouble(innFarenheit);

        double celsius = (farenheit - 32)/1.8;

        System.out.println(farenheit + "farenheit i celsius er " + celsius + " celsius.");
    }
}
