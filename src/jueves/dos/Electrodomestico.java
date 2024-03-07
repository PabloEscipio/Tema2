package jueves.dos;

public class Electrodomestico {
    // Atributos
    protected char efiEnergetica;
    protected float consumo;
    protected float precio;
    protected float peso;
    protected String marca;

    // Constructores
    public Electrodomestico(char pEfiEnergetica, float pConsumo, float pPrecio, float pPeso, String pMarca) {
        setEfiEnergetica(pEfiEnergetica);
        this.consumo = pConsumo;
        this.precio = pPrecio;
        setPeso(pPeso);
        this.marca = pMarca;
    }

    // Getters & Setters
    public char getEfiEnergetica() {
        return efiEnergetica;
    }

    public void setEfiEnergetica(char efiEnergetica) {
        switch (efiEnergetica) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                this.efiEnergetica = efiEnergetica;
                break;
            default:
                this.efiEnergetica = 'N';
        }
    }

    public float getConsumo() {
        return consumo;
    }

    public float getPrecio() {
        return precio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if (this.peso >= 0) {
            this.peso = peso;
        } else {
            this.peso = 0;
        }
    }

    public String getMarca() {
        return marca;
    }

    // toString
    public String toString() {
        return "---Electrodoméstico---" + "\nEficiencia Energetica: " + this.efiEnergetica + "\nConsumo: " + this.consumo + "\nPrecio: " + this.precio + "\nPeso: " + this.peso + "\nMarca: " + this.marca;
    }

    // Metodos
    public float precioEnvio() {
        float rFloat;
        if (this.peso <= 20) {
            rFloat = 20;
        } else if (this.peso <= 50) {
            rFloat = 50;
        } else if (this.peso <= 100) {
            rFloat = 70;
        } else {
            rFloat = 100;
        }
        return rFloat;
    } // precioEnvio end

    public float precioTotal() {
        return this.precio * 1.21f + precioEnvio();
    } // precioTotal end

} // class end
