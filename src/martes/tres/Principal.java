package martes.tres;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static String mostrarAll(ArrayList<Libro> pListLibros) {
        StringBuilder rString = new StringBuilder();
        for (Libro valor : pListLibros) {
            rString.append(valor.toString()).append("\n-----\n");
        }
        return rString.toString();
    } // mostrarAll end


    public static void crearFicheroAll(ArrayList<Libro> pListLibros) {
        FileWriter wFichero;

        try {
            wFichero = new FileWriter("c:/test/LibrosMartes/listLibros.txt");
            wFichero.write(mostrarAll(pListLibros));
            wFichero.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        } // try end
    } // crearFicheroAll end

    public static String leerFicheroAll() {
        StringBuilder rString = new StringBuilder();
        Scanner sFichero;
        File readFichero;

        try {
            readFichero = new File("c:/test/LibrosMartes/listLibros.txt");
            sFichero = new Scanner(readFichero);
            while (sFichero.hasNextLine()) {
                rString.append(sFichero.nextLine()).append("\n");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return rString.toString();
    } // leerFicheroAll end

    public static void crearFicheroDeAutor(String pAutor) {
        FileWriter wFichero;
        File readFichero;
        Scanner sFichero;

        try {
            wFichero = new FileWriter("c:/test/LibrosMartes/" + pAutor + " Libros.txt");
            readFichero = new File("c:/test/LibrosMartes/listLibros.txt");
            sFichero = new Scanner(readFichero);

            wFichero.write(pAutor);

            while (sFichero.hasNextLine()) {
                if (sFichero.nextLine().equalsIgnoreCase("Autor: " + pAutor)) {
                    wFichero.write("\n-----\n" + sFichero.nextLine() + "\n" + sFichero.nextLine() + "\n" + sFichero.nextLine());
                }
            }

            wFichero.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        } // try end
    } // crearFicheroDeAutor

    public static void cambiarPrecioPorTitulo(String pTitulo, float pPrecio) {
        FileWriter wFichero;
        File readFichero;
        Scanner sFichero;

        try {
            wFichero = new FileWriter("c:/test/LibrosMartes/listLibros.txt");
            readFichero = new File("c:/test/LibrosMartes/listLibros.txt");
            sFichero = new Scanner(readFichero);

            while (sFichero.hasNextLine()) {
                if (sFichero.nextLine().equalsIgnoreCase("Titulo: " + pTitulo)) {
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }


    // Main
    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);

        // Variables
        byte uIndice;
        String uAutor;

        // Arrays
        ArrayList<Libro> listLibros = new ArrayList<>();

        listLibros.add(new Digital("Dune", "Frank Herbert", (short) 1965, 16.95f, "www.DunePart1&2.org"));
        listLibros.add(new Digital("Mesias de Dune", "Frank Herbert", (short) 1968, 16.95f, "www.DunePart3.org"));
        listLibros.add(new Digital("Mil lenguas de viaje submarino", "Julio Verne", (short) 1911, 15, "www.JulioVerne23.free"));
        listLibros.add(new Fisico("Ardruino Practico", "Daniel Lozano Equisoain", (short) 2022, 27.95f, "1", "A"));
        listLibros.add(new Fisico("Programación", "Alfonso Jiménez Marín", (short) 2021, 35, "2", "B"));

        // Ficheros

        // Programa
        do {
            System.out.println("*****");
            System.out.println("Introduce un indice:" +
                    "\n-----" +
                    "\n1: Muestra todos los libros del Array" +
                    "\n2: Escribe todos los libros del Array" +
                    "\n3: Muestra todos los libros del fichero" +
                    "\n4: Seleciona el primer autor del fichero y crea uno nuevo con todos sus libros" +
                    "\n5: " +
                    "\n6: " +
                    "\n7: " +
                    "\n8: ");
            System.out.println("*****");
            uIndice = sc.nextByte();

            switch (uIndice) {
                case 0:
                    System.out.println("Cerrando programa...");
                    break;
                case 1:
                    System.out.println(mostrarAll(listLibros));
                    break;
                case 2:
                    crearFicheroAll(listLibros);
                    break;
                case 3:
                    System.out.println(leerFicheroAll());
                    break;
                case 4:
                    System.out.println("Introduce el autor:");
                    sc.nextLine();
                    uAutor = sc.nextLine();
                    crearFicheroDeAutor(uAutor);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Indice introducido no valido");
            } // switch end
        } while (uIndice != 0);
        sc.close();
    } // main end
} // class end
