package miercoles.uno;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    // sueldoTotal
    public static float sueldoTotal(ArrayList<Trabajador> pListTrabajador) {
        float rNum1 = 0;
        for (int i = 0; i < pListTrabajador.size(); i++) {
            rNum1 += pListTrabajador.get(i).sueldo;
        }
        return rNum1;
    } // sueldoTotal end

    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);
        // Variables
        char uIndice;

        Autonomo vAutonomo;

        // Arrays
        ArrayList<Trabajador> listTrabajador = new ArrayList<>();

        listTrabajador.add(new Empleado("Paco", "01", 3500));
        listTrabajador.add(new Empleado("Maria", "02", 1050));
        listTrabajador.add(new Autonomo("Luis", "03", 120, 30));
        listTrabajador.add(new Autonomo("Sonia", "04", 69, 11));
        // Programa
        do {
            System.out.println("******");
            System.out.println("Introduce un indice");
            System.out.println("******");
            uIndice = sc.nextLine().toLowerCase().charAt(0);

            switch (uIndice) {
                case 'a':
                    for (int i = 0; i < listTrabajador.size(); i++) {
                        System.out.println(listTrabajador.get(i).toString());
                        System.out.println("------");
                    }
                    break;
                case 'b':
                    System.out.println(listTrabajador.size());
                    break;
                case 'c':
                    System.out.println("Total de sueldos: " + sueldoTotal(listTrabajador));
                    break;
                case 'd':
                    for (int i = listTrabajador.size() - 1; i >= 0; i--) {
                        switch (listTrabajador.get(i).getClass().getSimpleName()) {
                            case "Empleado":
                                if (listTrabajador.get(i).sueldo > 3000) {
                                    listTrabajador.remove(i);
                                }
                                break;
                            case "Autonomo":
                                vAutonomo = (Autonomo) listTrabajador.get(i);
                                if (vAutonomo.getnHoras() < 100) {
                                    listTrabajador.remove(i);
                                }
                                break;
                        }
                    }
                    break;
                case 'e':
                    for (int i = listTrabajador.size() - 1; i >= 0; i--) {
                        switch (listTrabajador.get(i).getClass().getSimpleName()) {
                            case "Empleado":
                                listTrabajador.get(i).setSueldo(listTrabajador.get(i).sueldo + 200);
                                break;
                            case "Autonomo":
                                vAutonomo = (Autonomo) listTrabajador.get(i);
                                vAutonomo.setTarifa(vAutonomo.getTarifa() + 5);
                                break;
                        }
                    }
                    break;
                case 'f':
                    break;
                default:
                    System.out.println("Error");
            } // switch end
        } while (uIndice != '$');
    } // main end
} // class end
