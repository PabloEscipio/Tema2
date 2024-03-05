package martes.tres;

public class Digital extends Libro {
    // Atributos
    private String url;

    // Constructores
    public Digital(String pTitulo, String pAutor, short pPublicAge, float pPrecio, String pURL) {
        super(pTitulo, pAutor, pPublicAge, pPrecio);
        this.url = pURL;
    }

    // Getters & Setters

    // toString
    @Override
    public String toString() {
        return super.toString() + "\nURL Descarga: " + this.url;
    }
    // Metodos
} // class end
