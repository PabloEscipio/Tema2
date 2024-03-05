package martes.tres;

public class Libro {
    // Atributos
    protected String titulo;
    protected String autor;
    protected short publicAge;
    protected float precio;

    // Constructores
    public Libro(String pTitulo, String pAutor, short pPublicAge, float pPrecio) {
        this.titulo = pTitulo;
        this.autor = pAutor;
        this.publicAge = pPublicAge;
        this.precio = pPrecio;
    }

    // Getters & Setters
    // toString
    public String toString() {
        return "Datos Libro" + "\nAutor: " + this.autor + "\nTitulo: " + this.titulo + "\nAño de Publicación: " + this.publicAge + "\nPrecio: " + this.precio;
    }
    // Metodos
} // class end
