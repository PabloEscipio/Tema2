package martes.dos;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Utils
        Scanner sFichero;

        // Variables
        short vNota;
        String vNombre;

        short maxNota = 0;
        String maxNombre = "";

        // Ficheros
        File ficheroNotas;

        FileWriter nFichero;

        // Programa
        try {
            ficheroNotas = new File("c:/test/NotasMartes/notas.txt");
            nFichero = new FileWriter("c:/test/NotasMartes/aprovados.txt");
            sFichero = new Scanner(ficheroNotas);
            while (sFichero.hasNext()) {
                vNombre = sFichero.next();
                vNota = sFichero.nextShort();

                if (vNota >= 5) {
                    nFichero.write(vNombre + " " + vNota + "\n");
                }

                if (maxNota < vNota) {
                    maxNota = vNota;
                    maxNombre = vNombre;
                }
            }
            nFichero.close();
            nFichero = new FileWriter("c:/test/NotasMartes/maxNota.txt");
            nFichero.write(maxNombre + " " + maxNota);
            nFichero.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        } // try end

    } // main end
} // class end
