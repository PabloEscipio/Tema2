package jueves.uno;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);

        // Variables
        char uIndice;

        // Arrays
        ArrayList<Telefono> listTelefonos = new ArrayList<>();

        listTelefonos.add(new Telefono("01", "Paco"));
        listTelefonos.add(new Telefono("02", "Maria"));
        listTelefonos.add(new Telefono("03", "Juan"));
        listTelefonos.add(new Telefono("04", "Sonia"));

        ArrayList<Llamadas> listLlamadas = new ArrayList<>();

        listLlamadas.add(new Locales(listTelefonos.get(1), listTelefonos.get(2), 556));
        listLlamadas.add(new Locales(listTelefonos.get(2), listTelefonos.get(1), 1700));

        listLlamadas.add(new Provinciales(listTelefonos.get(3), listTelefonos.get(4), 253, (byte) 1));
        listLlamadas.add(new Provinciales(listTelefonos.get(4), listTelefonos.get(3), 6911, (byte) 3));

        // Programa
        do {
            System.out.println("*****");
            System.out.println("Indice");
            System.out.println("*****");
            uIndice = sc.nextLine().toLowerCase().charAt(0);

            switch (uIndice) {
                case 'a':
                    break;
                case 'b':
                    break;
                case 'c':
                    break;
                case 'd':
                    break;
                case 'f':
                    break;
                case 'e':
                    break;
                case 'g':
                    break;
                default:
                    System.out.println("ERROR al introducir el indice");
            }
        } while (uIndice != '$');

    } // main end
} // class end
