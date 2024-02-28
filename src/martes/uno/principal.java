package martes.uno;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);

        // Variables
        char uIndice;

        // Arrays
        ArrayList<Cuenta> listCuentas = new ArrayList<>();

        listCuentas.add(new Cuenta("Paco", "Normal", (short) 11, "1", 69));
        listCuentas.add(new CuentaAhorro("Lucas", "Ahorro", (short) 19, "2"));
        listCuentas.add((new CuentaCredito("Maria", "Credito", (short) 25, "30")));

        // Programa
        do {
            System.out.println("*****");
            System.out.println("Indice");
            System.out.println("*****");
            uIndice = sc.nextLine().toLowerCase().charAt(0);

            switch (uIndice) {
                case '1':
                    for (int i = 0; i < listCuentas.size(); i++) {
                        System.out.println(listCuentas.get(i).toString());
                        System.out.println("-----");
                    }
                    break;
                case '2':
                    for (Cuenta valor : listCuentas) {
                        valor.ingresar(5);
                    }
                    break;
                case '3':
                    break;
                case '4':
                    break;
                default:
                    System.out.println("Indice erroneo");
            }
        } while (uIndice != '$');
    }
}
