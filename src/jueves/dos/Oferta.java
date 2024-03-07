package jueves.dos;

public class Oferta extends Electrodomestico {
    // Atributos
    float descuento;

    // Constructores
    public Oferta(char pEfiEnergetica, float pConsumo, float pPrecio, float pPeso, String pMarca, float pDescuento) {
        super(pEfiEnergetica, pConsumo, pPrecio, pPeso, pMarca);
        this.descuento = pDescuento;
    }

    // Getters & Setters
    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        if (descuento >= 5 && descuento <= 20) {
            this.descuento = descuento;
        } else {
            this.descuento = 5;
        }
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "\nDescuento: " + this.descuento;
    }

    // Metodos
    @Override
    public float precioTotal() {
        return super.precio * 1.21f - super.precio * 1.21f * (this.descuento / 100) + super.precioEnvio();
    }
}
