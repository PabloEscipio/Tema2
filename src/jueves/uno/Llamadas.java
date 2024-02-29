package jueves.uno;

public abstract class Llamadas {
    // Atributos
    protected Telefono numOrigen;
    protected Telefono numDestino;
    protected int secDuracion;
    protected float importe;

    // Constructores
    public Llamadas(Telefono pNumOrigen, Telefono pNumDestino, int pSecDuracion) {
        this.numOrigen = pNumOrigen;
        this.numDestino = pNumDestino;
        this.secDuracion = pSecDuracion;
        this.importe = -1;
    }

    // Getters & Setters
    public Telefono getNumOrigen() {
        return numOrigen;
    }

    public void setNumOrigen(Telefono numOrigen) {
        this.numOrigen = numOrigen;
    }

    public Telefono getNumDestino() {
        return numDestino;
    }

    public void setNumDestino(Telefono numDestino) {
        this.numDestino = numDestino;
    }

    public int getSecDuracion() {
        return secDuracion;
    }

    public void setSecDuracion(int secDuracion) {
        this.secDuracion = secDuracion;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    // toString
    public String toString() {
        return "Origen: " + this.numOrigen.getNumTelef() + "\nDestino: " + this.numDestino.getNumTelef() + "\nDuración: " + this.secDuracion / 60 + "\nImporte: " + this.importe / 100;
    }

    // Metodos
    public abstract void calculaImporte();
} // class end
