package Aritmetikk;

import javax.swing.*;

import static javax.swing.JOptionPane.*;
public class arealAvRektangel {
    public static void main(String[] args) {
        String innLengde = showInputDialog("Hva er lengden (cm) til rektangelet du vil regne ut arealet til?");
        int lengde = Integer.parseInt(innLengde);

        String innBredde = showInputDialog("Hva er bredden (cm) til rektangelet?");
        int bredde = Integer.parseInt(innBredde);

        int areal = lengde * bredde;
        showMessageDialog(null, areal + "cm^2", "Alert areal", INFORMATION_MESSAGE);
        System.out.println("Et rektangel med bredde " + bredde + "cm og lengde " + lengde + "cm har et areal på " + areal + "^2." );
    }
}
