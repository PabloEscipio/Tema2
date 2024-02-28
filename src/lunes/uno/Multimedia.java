package lunes.uno;

public class Multimedia {
    // Atributos
    protected String titulo;
    protected String autor;
    protected String formato;
    protected short duracion;

    // Constructor
    public Multimedia(String pTitulo, String pAutor, String pFormato, short pDuracion) {
        this.titulo = pTitulo;
        this.autor = pAutor;
        this.formato = pFormato;
        this.duracion = pDuracion;
    }

    // Getters & Setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public short getDuracion() {
        return duracion;
    }

    // toString
    public String toSting() {
        return "Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nFormato: " + "\nDuración: " + this.duracion;
    }
    // Metodos
} // class end