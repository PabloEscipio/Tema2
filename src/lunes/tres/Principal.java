package lunes.tres;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static String mostrarAllEmpleados(ArrayList<Empleado> pListEmpleados) {
        String rString = "";
        for (Empleado valor : pListEmpleados) {
            rString += valor.toString() + "\n-----\n";
        }
        return rString;
    } // mostrarAllEmpleados end

    public static void crearFicheroPrincipal(ArrayList<Empleado> pListEmpleados) {
        FileWriter principal;
        try {
            principal = new FileWriter("c:/test/TrabajadoresLunes/Principal.txt");
            principal.write(mostrarAllEmpleados(pListEmpleados));
            principal.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    } // crearFicheroPrincipal end

    public static double maxSalario(ArrayList<Empleado> pListEmpleados) {
        double rMaxSalario = 0;
        for (Empleado valor : pListEmpleados) {
            rMaxSalario = (rMaxSalario < valor.getSalario()) ? valor.getSalario() : rMaxSalario;
        }
        return rMaxSalario;
    } // maxSalario end

    public static void crearFicheroMaximoSalario(ArrayList<Empleado> pListEmpleados) {
        FileWriter fileMaxSalario;
        try {
            fileMaxSalario = new FileWriter("c:/test/TrabajadoresLunes/maxSalario.txt");
            fileMaxSalario.write("El salario maximo es: " + maxSalario(pListEmpleados));
            fileMaxSalario.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    } // crearFicheroMaximoSalario

    public static String mostrarProgramadores(ArrayList<Empleado> pListEmpleados) {
        String rString = "";
        for (Empleado valor : pListEmpleados) {
            if (valor.getClass().getSimpleName().equalsIgnoreCase("Programador")) {
                rString += valor.toString() + "\n-----\n";
            }
        }
        return rString;
    } // mostrarProgramadores end

    public static void crearFicheroProgramadores(ArrayList<Empleado> pListEmpleados) {
        FileWriter empleadosProgramadores;
        try {
            empleadosProgramadores = new FileWriter("c:/test/TrabajadoresLunes/empleadosProgramadores.txt", true);
            empleadosProgramadores.write(mostrarProgramadores(pListEmpleados));
            empleadosProgramadores.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    } // crearFicheroProgramadores end

    public static void estadoCivilToFichero(ArrayList<Empleado> pListEmpleados) {
        for (Empleado valor : pListEmpleados) {
            FileWriter estadoCivilCasado;
            FileWriter estadoCivilNoCasado;

            try {
                estadoCivilCasado = new FileWriter("c:/test/TrabajadoresLunes/Casados.txt", true);
                estadoCivilNoCasado = new FileWriter("c:/test/TrabajadoresLunes/noCasados.txt", true);

                if (valor.casado) {
                    estadoCivilCasado.write(valor.getNombre());
                } else {
                    estadoCivilNoCasado.write(valor.getNombre());
                } // if end

                estadoCivilCasado.close();
                estadoCivilNoCasado.close();

            } catch (Exception e) {
                System.out.println("ERORR: " + e.getMessage());
            } // try end
        } // for end
    } // estadoCivilToFichero end

    public static void aumentarSalario200conFichero(ArrayList<Empleado> pListEmpleados) {
        FileWriter log;
        String fString = "";

        for (Empleado valor : pListEmpleados) {
            fString += valor.getNombre() + " Salario: ";
            fString += (valor.setSalario(valor.getSalario() + 200)) ? "Aumentado" : "No aumentado";
            fString += "\n-----\n";
        }

        try {
            log = new FileWriter("c:/test/TrabajadoresLunes/log.txt");
            log.write(fString);
            log.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    // MAIN
    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);
        // Variables
        char uIndice;

        // Arrays
        ArrayList<Empleado> listEmpleados = new ArrayList<>();

        listEmpleados.add(new Empleado("Paco", "01", (short) 21, false, 690));
        listEmpleados.add(new Empleado());
        listEmpleados.add(new Programador("Sonia", "03", (short) 33, true, 2500, 190, "Rust"));
        listEmpleados.add(new Programador());

        // Ficheros
        // Programa
        do {
            System.out.println("******" + "\nIntroduce un indice" + "\n*****");
            uIndice = sc.nextLine().charAt(0);

            switch (uIndice) {
                case '$':
                    System.out.println("Cerrando el programa...");
                    break;
                case '1':
                    System.out.println(mostrarAllEmpleados(listEmpleados));
                    break;
                case '2':
                    crearFicheroPrincipal(listEmpleados);
                    break;
                case '3':
                    crearFicheroMaximoSalario(listEmpleados);
                    break;
                case '4':
                    crearFicheroProgramadores(listEmpleados);
                    break;
                case '5':
                    aumentarSalario200conFichero(listEmpleados);
                    break;
                case '6':
                    estadoCivilToFichero(listEmpleados);
                    break;
                case '7':
                    break;
                case '8':
                    break;
                case '9':
                    break;
                default:
                    System.out.println("INDICE INTRODUCIDO NO VALIDO");
            } // switch end
        } while (uIndice != '$');

        sc.close();
    } // main end
} // class end
