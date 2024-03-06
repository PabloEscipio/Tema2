package miercoles.dos;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static String mostrarAll(Festival pFestival) {
        return "----- Festival -----\n" + pFestival.toString();
    } // mostrar all end

    public static void medioPopulares(Festival pFestival) {
        FileWriter fwMedioPopu;

        try {
            fwMedioPopu = new FileWriter("c:/test/DiscograficaMiercoles/popularidadMedia.txt");

            for (Grupo valor : pFestival.getListGrupos()) {
                if (valor.getPopularidad() >= 5 && valor.getPopularidad() <= 7) {
                    fwMedioPopu.write(valor.toString() + "\n");
                }
            }

            fwMedioPopu.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    } // medioPopulares end

    public static void ficheroPrecios(Festival pFestival) {
        FileWriter fwPrecio;

        try {
            fwPrecio = new FileWriter("c:/test/DiscograficaMiercoles/precios.txt");

            for (Grupo valor : pFestival.getListGrupos()) {
                fwPrecio.write(valor.getCoste() + "\n");
            }

            fwPrecio.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        } // try end
    } // ficheroPrecios end

    public static void ejercicio2(Festival pFestival) {
        File frPrecio;
        FileWriter fwGrupos;
        Scanner fsPrecios;

        try {
            float lastPrecio = 0;
            frPrecio = new File("c:/test/DiscograficaMiercoles/precios.txt");
            fsPrecios = new Scanner(frPrecio).useLocale(Locale.US);
            fwGrupos = new FileWriter("c:/test/DiscograficaMiercoles/gruposPorDebajo.txt");

            while (fsPrecios.hasNextLine()) {
                if (!fsPrecios.hasNextLine()) {
                    lastPrecio = fsPrecios.nextFloat();
                }
                fsPrecios.nextLine();
            }

            for (Grupo valor : pFestival.getListGrupos()) {
                if (lastPrecio < valor.getCoste()) {
                    fwGrupos.write(valor.toString() + "\n");
                }
            }

            fwGrupos.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        } // try end
    } // ejercicio2 end

    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);

        // Variables
        char uIndice;

        // Festivales
        Festival EuroVision = new Festival();
        EuroVision.añadirGrupo("Sabaton", (short) 35, (byte) 7, 35000);
        EuroVision.añadirGrupo("Cuarteto de Nos", (short) 28, (byte) 3, 23500.95f);
        EuroVision.añadirGrupo("Imagine Drangons", (short) 26, (byte) 10, 43000);
        EuroVision.añadirGrupo("Hans Zimmer", (short) 48, (byte) 5, 35000);

        // Programa
        do {
            System.out.println("***** Introduce un indice *****");
            uIndice = sc.nextLine().toLowerCase().charAt(0);

            switch (uIndice) {
                case '$':
                    System.out.println("Cerando el programa...");
                    break;
                case '1':
                    System.out.println(mostrarAll(EuroVision));
                    break;
                case '2':
                    medioPopulares(EuroVision);
                    break;
                case '3':
                    ejercicio2(EuroVision);
                    break;
                case '4':
                    break;
                case '5':
                    break;
                case '6':
                    break;
                case '7':
                    break;
                case '8':
                    break;

                default:
                    System.out.println("INDICE INTRODUCIDO NO VALIDO");
            } // switch end
        } while (uIndice != '$');

    } // main end
} // class end
