package miercoles.uno;

public class Empleado extends Trabajador {
    // Atributos
    private float impuesto;

    // Constructores
    public Empleado(String pNombre, String pNSS, float pSueldo) {
        super(pNombre, pNSS);
        super.sueldo = pSueldo;
        this.impuesto = (float) 0.19;
    }

    // Getters & Setters
    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    // toString
    public String toString() {
        return super.toString() + "\nImpuesto: " + this.impuesto;
    }

    // Metodos
    public float calcularSueldo() {
        return super.sueldo - super.sueldo * impuesto;
    }
} // class end