package lunes.dos;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Utils
        // Variables
        // Arrays
        ArrayList<String> listCiudades = new ArrayList<>();

        listCiudades.add("Gijon");
        listCiudades.add("Barcelona");
        listCiudades.add("Madrid");
        listCiudades.add("Oviedo");
        listCiudades.add("Sevilla");

        // Ficheros?
        FileWriter f1;
        // Programa
        try {


            f1 = new FileWriter("c:/test/ciudades.txt");
            for (int i = 0; i < listCiudades.size(); i++) {
                if (i % 2 != 0) {
                    f1.write("Ciudad: " + listCiudades.get(i) + "\t\n");
                }
            }
            f1.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    } // main end
} // class end
