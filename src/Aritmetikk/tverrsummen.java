package Aritmetikk;

import static javax.swing.JOptionPane.*;
public class tverrsummen {
    public static void main(String[] args) {
        String innNummer = showInputDialog("Skriv et tall.");
        int nummer = Integer.parseInt(innNummer);
        int modulus = 0;
        int sum = 0;

        do {
            modulus = nummer % 10;
            nummer = nummer / 10;
            sum += modulus;
        } while (nummer > 0);

        System.out.println(sum);
    }
}
