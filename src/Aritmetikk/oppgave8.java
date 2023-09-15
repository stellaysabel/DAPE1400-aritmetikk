package Aritmetikk; // en .java fil må starte med et package-navn

public class oppgave8 { // en.java fil må ha samme navn som klassenavnet. En public klasse pr. .java fil

    // for å kunne kjøre en .java fil må den inneholde en main-metode.
    public static void main(String[] args) {
        double tall1=1;
        double tall2=2;
        double resultat;
        resultat = tall1 * 4 + (tall2 * 2 + tall1 ) / (tall2-tall1*3);
        System.out.println(resultat);
    }
}
