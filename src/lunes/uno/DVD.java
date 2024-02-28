package lunes.uno;

public class DVD extends Multimedia {
    // Atributos
    public String actor;
    private String actriz;

    // Constructor
    public DVD(String pTitulo, String pAutor, String pFormato, short pDuracion, String pActor, String pActriz) {
        super(pTitulo, pAutor, pFormato, pDuracion);
        this.actor = pActor;
        this.actriz = pActriz;
    }

    // Getters & Setters

    public String getActor() {
        return actor;
    }

    public String getActriz() {
        return actriz;
    }

    // toString
    public String toString() {
        return super.toString() + "\nActor: " + this.actor + "\nActriz: " + this.actriz;
    }
    // Metodos
}
