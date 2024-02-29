package jueves.uno;

import java.util.ArrayList;

public class Provinciales extends Llamadas {
    // Atributos
    private byte franja;
    // listFranjas
    private ArrayList<Short> listFranjas = new ArrayList<>();

    // Constructores
    public Provinciales(Telefono pNumOrigen, Telefono pNumDestino, int pSecDuracion, byte pFranja) {
        super(pNumOrigen, pNumDestino, pSecDuracion);
        this.franja = pFranja;
        this.listFranjas.add((short) 20);
        this.listFranjas.add((short) 25);
        this.listFranjas.add((short) 30);
        calculaImporte();
    }

    // Getters & Setters
    public byte getFranja() {
        return franja;
    }

    public void setFranja(byte franja) {
        this.franja = franja;
    }

    public ArrayList<Short> getListFranjas() {
        return listFranjas;
    }

    public void setListFranjas(int pIndex, short pTarifa) {
        this.listFranjas.remove(pIndex);
        this.listFranjas.add(pIndex, pTarifa);
    }

    // toString
    public String toString() {
        return super.toString() + "\nFranja: " + this.franja + "\nTarifa: " + this.listFranjas.get(this.franja - 1);
    }

    // Metodos
    @Override
    public void calculaImporte() {
        super.importe = this.secDuracion * this.listFranjas.get(this.franja - 1);
    }
} // class end
