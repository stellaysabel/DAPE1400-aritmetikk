package Aritmetikk;

import static javax.swing.JOptionPane.*;
import java.time.Year;

public class aldersPansjon {
    public static void main(String[] args) {
        String navn = showInputDialog("Hva heter du?");

        String innAlder = showInputDialog("Hvor gammel er du?");
        String innAar = showInputDialog("Hvilket år skal vi beregne din alder?");
        String innPansjonAlder = showInputDialog("Når tenker du å bli pansjonist?");
        int alder = Integer.parseInt(innAlder);
        int aar = Integer.parseInt(innAar);
        int pansjonAlder = Integer.parseInt(innPansjonAlder);

        Year year = Year.now();
        int currentYear = year.getValue();

        int fodselsaar = currentYear - alder;
        int alderIGittAar = aar - fodselsaar;


        if (alderIGittAar >= pansjonAlder) {
            System.out.println("I år er " + currentYear + ". " + navn + " er i dag " + alder + " år gammel. Hun/han er født i " + fodselsaar + ". I " + aar + " er hun/han " + alderIGittAar + " år gammel og vil da være pansjonist.");
        }
        else if (alderIGittAar < pansjonAlder) {
            System.out.println("I år er " + currentYear + ". " + navn + " er i dag " + alder + " år gammel. Hun/han er født i " + fodselsaar + ". I " + aar + " er hun/han" +
                    " " + alderIGittAar + " år gammel og vil ennå ikke være pansjonist.");
        }






    }
}
