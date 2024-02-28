package miercoles.uno;

public class Trabajador {
    // Atributos
    protected Persona persona;
    protected float sueldo;

    // Constructores
    public Trabajador(String pNombre, String pNSS) {
        persona = new Persona(pNombre, pNSS);
    }

    // Getters & Setters
    public Persona getPersona() {
        return persona;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    // toString
    public String toString() {
        return persona.toString() + "\nSueldo: " + this.sueldo;
    }

    // Metodos
} // class end