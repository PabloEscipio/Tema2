package miercoles.uno;

public class Autonomo extends Trabajador {
    // Atributos
    private int nHoras;
    private float tarifa;

    // Constructores
    public Autonomo(String pNombre, String pNSS, int pNHoras, float pTarifa) {
        super(pNombre, pNSS);
        this.nHoras = pNHoras;
        this.tarifa = pTarifa;
        super.sueldo = calcularSueldo();
    }

    // Getters & Setters
    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    // toString
    public String toString() {
        return super.toString() + "\nHoras Trabajadas: " + this.nHoras + "\nTarifa: " + this.tarifa;
    }

    // Metodos
    public float calcularSueldo() {
        return this.nHoras * this.tarifa;
    }
} // class ends
