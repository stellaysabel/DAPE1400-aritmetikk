package Aritmetikk;

import static javax.swing.JOptionPane.*;
public class antallPizzaStykker {
    public static void main(String[] args) {
        String innPizza = showInputDialog("Hvor mange pizzaer skal deles på?");
        int pizza = Integer.parseInt(innPizza);

        String innPersoner = showInputDialog("Hvor mange personer skal dele pizzaene?");
        int personer = Integer.parseInt(innPersoner);

        String innSlices = showInputDialog("Hvor mange stykker per pizza?");
        int stykker = Integer.parseInt(innSlices);

        int pizzaHver = (stykker * pizza) / personer;
        int pizzaTilOvers = (stykker * pizza) % personer;
        System.out.println("Det blir " + pizzaHver + " pizzastykker hver og " + pizzaTilOvers + " pizza til overs.");

    }
}
