package pruebas1;

public class principal {
    public static void main(String[] args) {
        String vString1 = "Esto es una prueba";
        String vString2;
        System.out.println(vString1.substring(8));

        vString2 = vString1;

        vString1 = vString1 + " lol";

        System.out.println(vString2);
        System.out.println(vString1);
    }
}
