package lunes.uno;

public class CD extends Multimedia {
    // Atributos
    private String genero;

    // Constructor
    public CD(String pTitulo, String pAutor, String pFormato, short pDuracion, String pGenero) {
        super(pTitulo, pAutor, pFormato, pDuracion);
        this.genero = pGenero;
    }

    // Getters & Setters
    public String getGenero() {
        return genero;
    }

    // toString
    public String toString() {
        return super.toString() + "\nGenero: " + this.genero;
    }

    // Metodos

    public void prueba(){
    }
}
