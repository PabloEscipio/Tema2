package jueves.uno;

public class Locales extends Llamadas {
    // Atributos
    private short tarifa;

    // Constructores
    public Locales(Telefono pNumOrigen, Telefono pNumDestino, int pSecDuracion) {
        super(pNumOrigen, pNumDestino, pSecDuracion);
        this.tarifa = 15;
        calculaImporte();
    }

    // Getters & Setters
    public short getTarifa() {
        return tarifa;
    }

    public void setTarifa(short tarifa) {
        this.tarifa = tarifa;
    }

    // toString
    public String toString() {
        return super.toString() + "\nTarifa: " + this.tarifa;
    }

    // Metodos
    public void calculaImporte() {
        super.importe = super.secDuracion * this.tarifa;
    }
} // class end