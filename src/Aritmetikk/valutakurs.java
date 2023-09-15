package Aritmetikk;

import static javax.swing.JOptionPane.*;
public class valutakurs {
    public static void main(String[] args) {
        String innUSD = showInputDialog("Hvor mye amerikanske dollar vil du konvertere til norske kroner?");
        double usd = Double.parseDouble(innUSD);

        double nok = usd * 10.74;
        System.out.println(usd + " USD blir " + nok + " NOK.");
        }
    }

