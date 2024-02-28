package martes.uno;

public class Titular {
    // Atributos
    private String nombre;
    private String apellidos;
    private short edad;

    // Constructor
    public Titular(String pNombre, String pApellidos, short pEdad) {
        this.nombre = pNombre;
        this.apellidos = pApellidos;
        this.edad = pEdad;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public short getEdad() {
        return edad;
    }

    // toString
    public String toString() {
        return "Nombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nEdad: " + this.edad;
    }
    // Metodos

}
