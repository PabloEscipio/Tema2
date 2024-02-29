package jueves.uno;

public class Telefono {
    // Atributos
    private String nombre;
    private String numTelef;

    // Constructores
    public Telefono(String pNumTelef) {
        this.numTelef = pNumTelef;
    }

    public Telefono(String pNumTelef, String pNombre) {
        this(pNumTelef);
        this.nombre = pNombre;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumTelef() {
        return numTelef;
    }

    public void setNumTelef(String numTelef) {
        this.numTelef = numTelef;
    }

    // toString
    public String toString() {
        return "Nombre: " + this.nombre + "\nNumero: " + this.numTelef;
    }
    // Metodos
}
