package miercoles.uno;

public class Persona {
    // Atributos
    private String nombre;
    private String dni;
    private String direccion;
    private String nSS;

    // Constructores
    public Persona(String pNombre, String pNSS) {
        this.nombre = pNombre;
        this.nSS = pNSS;
        this.dni = "";
        this.direccion = "";
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getnSS() {
        return nSS;
    }

    public void setnSS(String nSS) {
        this.nSS = nSS;
    }

    // toString
    public String toString() {
        return "Nombre: " + this.nombre + "\nDNI: " + this.dni + "\nDirección: " + this.direccion + "\nNumero Seguridad Social: " + this.nSS;
    }
    // Metodos
} // class end
