package jueves.dos;

public class Sostenible extends Electrodomestico {
    // Atributos
    String material;
    float degradado;

    // Constructores
    public Sostenible(char pEfiEnergetica, float pConsumo, float pPrecio, float pPeso, String pMarca, String pMaterial, float pDegradado) {
        super(pEfiEnergetica, pConsumo, pPrecio, pPeso, pMarca);
        this.material = pMaterial;
        this.degradado = pDegradado;
    }

    // Getters & Setters
    public String getMaterial() {
        return material;
    }

    public float getDegradado() {
        return degradado;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "\nMaterial: " + this.material + "\nDegradado: " + this.degradado;
    }

    // Metodos
    @Override
    public float precioTotal() {
        return super.precio + super.precio * (this.degradado / 100) * 1.21f + precioEnvio();
    }
}
