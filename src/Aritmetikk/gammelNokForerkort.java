package Aritmetikk;

import static javax.swing.JOptionPane.*;
public class gammelNokForerkort {
    public static void main(String[] args) {
        String innAlder = showInputDialog("Hvor gammel er du?");
        int alder = Integer.parseInt(innAlder);

        if (18 <= alder) {
            System.out.println("Du kan ta førerkort da du er gammel nok.");
        }
        else if (alder < 18) {
            System.out.println("Du er for ung til å ta førerkort for bil.");
        }
    }
}
