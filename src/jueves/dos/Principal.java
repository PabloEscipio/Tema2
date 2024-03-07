package jueves.dos;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static String mostrarAll(ArrayList<Electrodomestico> pListElectrodomesticos) {
        String rString = "";

        for (Electrodomestico valor : pListElectrodomesticos) {
            rString += valor.toString() + "\n";
        }

        return rString;
    } // metodo end

    public static void nuevoElectrodomestico(ArrayList<Electrodomestico> pListElectrodomesticos) {
        Scanner sc = new Scanner(System.in);
        char pEfiEnergetica;
        float pConsumo, pPrecio, pPeso;
        String pMarca;

        try {
            System.out.println("Introduce Eficiencia Energetica:");
            pEfiEnergetica = sc.nextLine().toUpperCase().charAt(0);
            System.out.println("Introduce Consumo:");
            pConsumo = sc.nextFloat();
            System.out.println("Introduce Precio:");
            pPrecio = sc.nextFloat();
            System.out.println("Introduce Peso:");
            pPeso = sc.nextFloat();
            System.out.println("Introduce Marca:");
            sc.nextLine();
            pMarca = sc.nextLine();

            pListElectrodomesticos.add(new Electrodomestico(pEfiEnergetica, pConsumo, pPrecio, pPeso, pMarca));
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        sc.close();
    }

    public static void nuevoOferta(ArrayList<Electrodomestico> pListElectrodomesticos) {
        Scanner sc = new Scanner(System.in);
        char pEfiEnergetica;
        float pConsumo, pPrecio, pPeso, pDescuento;
        String pMarca;

        try {
            System.out.println("Introduce Eficiencia Energetica:");
            pEfiEnergetica = sc.nextLine().toUpperCase().charAt(0);
            System.out.println("Introduce Consumo:");
            pConsumo = sc.nextFloat();
            System.out.println("Introduce Precio:");
            pPrecio = sc.nextFloat();
            System.out.println("Introduce Peso:");
            pPeso = sc.nextFloat();
            System.out.println("Introduce Marca:");
            sc.nextLine();
            pMarca = sc.nextLine();
            System.out.println("Introduce Descuento:");
            pDescuento = sc.nextFloat();

            pListElectrodomesticos.add(new Oferta(pEfiEnergetica, pConsumo, pPrecio, pPeso, pMarca, pDescuento));
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        sc.close();
    }

    public static void nuevoSostenible(ArrayList<Electrodomestico> pListElectrodomesticos) {
        Scanner sc = new Scanner(System.in);
        char pEfiEnergetica;
        float pConsumo, pPrecio, pPeso, pDegradado;
        String pMarca, pMaterial;

        try {
            System.out.println("Introduce Eficiencia Energetica:");
            pEfiEnergetica = sc.nextLine().toUpperCase().charAt(0);
            System.out.println("Introduce Consumo:");
            pConsumo = sc.nextFloat();
            System.out.println("Introduce Precio:");
            pPrecio = sc.nextFloat();
            System.out.println("Introduce Peso:");
            pPeso = sc.nextFloat();
            System.out.println("Introduce Marca:");
            sc.nextLine();
            pMarca = sc.nextLine();
            System.out.println("Introduce Material:");
            pMaterial = sc.nextLine();
            System.out.println("Introduce Degradado:");
            pDegradado = sc.nextFloat();

            pListElectrodomesticos.add(new Sostenible(pEfiEnergetica, pConsumo, pPrecio, pPeso, pMarca, pMaterial, pDegradado));
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        sc.close();
    }

    public static void crearElectrodomestico(ArrayList<Electrodomestico> pListElectrodomesticos) {
        Scanner sc = new Scanner(System.in);

        char subIndice;
        System.out.println("----Creando----");
        System.out.println("1- Electrodomestico");
        System.out.println("2- Oferta");
        System.out.println("3- Sostenible");
        subIndice = sc.nextLine().charAt(0);

        switch (subIndice) {
            case '1':
                nuevoElectrodomestico(pListElectrodomesticos);
                break;
            case '2':
                nuevoOferta(pListElectrodomesticos);
                break;
            case '3':
                nuevoSostenible(pListElectrodomesticos);
                break;
            default:
                System.out.println("Sub indice introducido no valido");
        }
        sc.close();
    }

    public static float precioSumaTotal(ArrayList<Electrodomestico> pListElectrodomesticos) {
        float rFloat = 0;

        for (Electrodomestico valor : pListElectrodomesticos) {
            rFloat += valor.precioTotal();
        }

        return rFloat;
    } // metodo end

    public static void ficheroToString(ArrayList<Electrodomestico> pListElectrodomesticos) {
        FileWriter fwToString;
        try {
            fwToString = new FileWriter("c:/test/elecJueves/toString.txt");
            fwToString.write(mostrarAll(pListElectrodomesticos));
            fwToString.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    } // metodo end

    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);

        // Variables
        String uIndice;

        // Arrays
        ArrayList<Electrodomestico> listElectrodomesticos = new ArrayList<>();

        listElectrodomesticos.add(new Electrodomestico('B', 25.5f, 237, 25, "SIEMENS"));
        listElectrodomesticos.add(new Oferta('D', 75, 321, 65, "BALAI", 15));
        listElectrodomesticos.add(new Sostenible('A', 22, 764.96f, 46, "YAMAHA", "Alumnio", 27));

        // Ficheros
        // Programa
        do {
            System.out.println("***** Introduce un indice *****");
            uIndice = sc.nextLine();

            switch (uIndice) {
                case "$":
                    System.out.println("Cerrando el programa: ");
                    break;
                case "1":
                    System.out.println(mostrarAll(listElectrodomesticos));
                    break;
                case "2":
                    crearElectrodomestico(listElectrodomesticos);
                    break;
                case "3":
                    System.out.println(precioSumaTotal(listElectrodomesticos));
                    break;
                case "4":
                    ficheroToString(listElectrodomesticos);
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
                    break;
                default:
                    System.out.println("--INDICE NO VALIDO--");
            } // switch end

        } while (!uIndice.equalsIgnoreCase("$"));

        sc.close();
    } // main end
} // class end
