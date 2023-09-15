package Aritmetikk;

import static javax.swing.JOptionPane.*;
public class omkretsAvSirkel {
    public static void main(String[] args) {
        String innRadius = showInputDialog("Hvor lang er radiusen til sirkelen du prøver å regne ut omkretsen til?");
        double radius = Double.parseDouble(innRadius);

        double omkretsen = 2 * 3.14 * radius;
        String omkretsenMedToDesimaler = String.format("%.2f" ,omkretsen);

        System.out.println("Omkretsen av en sirkel med " + radius + " cm som radius blir " + omkretsenMedToDesimaler + "cm");

    }
}
