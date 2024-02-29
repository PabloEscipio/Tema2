package jueves.uno;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);

        // Variables
        char uIndice;

        Locales vLocal;

        ArrayList<Short> test1 = new ArrayList<>();

        // Arrays
        ArrayList<Telefono> listTelefonos = new ArrayList<>();

        listTelefonos.add(new Telefono("01", "Paco"));
        listTelefonos.add(new Telefono("02", "Maria"));
        listTelefonos.add(new Telefono("03", "Juan"));
        listTelefonos.add(new Telefono("04", "Sonia"));

        ArrayList<Llamadas> listLlamadas = new ArrayList<>();

        listLlamadas.add(new Locales(listTelefonos.get(0), listTelefonos.get(1), 556));
        listLlamadas.add(new Locales(listTelefonos.get(1), listTelefonos.get(0), 1700));

        listLlamadas.add(new Provinciales(listTelefonos.get(2), listTelefonos.get(3), 253, (byte) 1));
        listLlamadas.add(new Provinciales(listTelefonos.get(3), listTelefonos.get(2), 6911, (byte) 3));

        Provinciales vProvincial = new Provinciales(listTelefonos.get(1), listTelefonos.get(2), -1, (byte) 1);


        // Programa
        do {
            System.out.println("*****");
            System.out.println("Indice");
            System.out.println("*****");
            uIndice = sc.nextLine().toLowerCase().charAt(0);

            switch (uIndice) {
                case 'a':
                    for (int i = 0; i < listLlamadas.size(); i++) {
                        System.out.println(listLlamadas.get(i).toString() + "\n-----");
                    }
                    break;
                case 'b':
                    for (int i = 0; i < listLlamadas.size(); i++) {
                        if (listLlamadas.get(i).getClass().getSimpleName().equalsIgnoreCase("provinciales")) {
                            System.out.println(listLlamadas.get(i).toString() + "\n-----");
                        }
                    }
                    break;
                case 'c':
                    for (int i = 0; i < listLlamadas.size(); i++) {
                        if (listLlamadas.get(i).getClass().getSimpleName().equalsIgnoreCase("locales")) {
                            System.out.println(listLlamadas.get(i).toString() + "\n-----");
                        }
                    }
                    break;
                case 'd':
                    for (int i = 0; i < listLlamadas.size(); i++) {
                        if (listLlamadas.get(i).getClass().getSimpleName().equalsIgnoreCase("locales")) {
                            vLocal = (Locales) listLlamadas.get(i);
                            vLocal.setTarifa((short) 12);
                            listLlamadas.get(i).calculaImporte();
                        }
                    }
                    break;
                case 'f':
                    for (int i = listLlamadas.size() - 1; i >= 0; i--) {
                        if (listLlamadas.get(i).numOrigen.getNombre().equalsIgnoreCase("juan") || listLlamadas.get(i).numDestino.getNombre().equalsIgnoreCase("juan")) {
                            listLlamadas.remove(i);
                        }
                    }
                    break;
                case 'e':
                    for (int i = 0; i < listLlamadas.size(); i++) {
                        if (listLlamadas.get(i).getClass().getSimpleName().equalsIgnoreCase("provinciales")) {
                            vProvincial = (Provinciales) listLlamadas.get(i);
                            test1 = vProvincial.getListFranjas();
                            test1.add(3, (short) 50);

                        }
                    }
                    break;
                case 'g':
                    for (short valor : test1) {
                        System.out.println(valor);
                    }
                    break;
                default:
                    System.out.println("ERROR al introducir el indice");
            }
        } while (uIndice != '$');

    } // main end
} // class end
