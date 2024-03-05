package martes.tres;

public class Fisico extends Libro {
    // Atributos
    private String estanteria;
    private String cajon;

    // Constructores
    public Fisico(String pTitulo, String pAutor, short pPublicAge, float pPrecio, String pEstanteria, String pCajon) {
        super(pTitulo, pAutor, pPublicAge, pPrecio);
        this.estanteria = pEstanteria;
        this.cajon = pCajon;
    }

    // Getters & Setters
    // toString
    @Override
    public String toString() {
        return super.toString() + "\nEstantería: " + this.estanteria + "\nCajón: " + this.cajon;
    }
    // Metodos
} // class end
