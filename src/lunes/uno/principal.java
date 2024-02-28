package lunes.uno;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);

        // Variables
        char uIndice;

        // Arraylist
        ArrayList<Multimedia> listMultimedia = new ArrayList<>();

        listMultimedia.add(new CD("Great War", "Sabaton", "CD", (short) 68, "Metal"));
        listMultimedia.add(new CD("Asturias", "Victor Manuel", "CD", (short) 4, "Clasica"));
        listMultimedia.add(new DVD("Dune", "Franklin", "DVD", (short) 126, "Paul Atreides", "Chani"));

        // Programa
        do {
            System.out.println("*****");
            System.out.println("Introduzca el indice:");
            System.out.println("*****");
            uIndice = sc.nextLine().toLowerCase().charAt(0);

            switch (uIndice) {
                case '1':
                    for (Multimedia valor : listMultimedia) {
                        System.out.println(valor.toSting());
                        System.out.println("-----");
                    }
                    break;
                case '2':
                    break;
                case '3':
                    for (Multimedia valor : listMultimedia) {
                        System.out.println(valor.getClass());
                    }
                    break;
                default:
                    System.out.println("Indice erroneo");
            } // switch end
        } while (uIndice != '$');
    }
}
