package lunes.tres;

public class Programador extends Empleado {
    // Atributos
    private int lineasCodigoHora;
    private String lenguajeDominante;

    // Constructores
    public Programador(String pNombre, String pCedula, short pEdad, boolean pCasado, double pSalario, int pLineasCodigoHora, String pLenguajeDominante) {
        super(pNombre, pCedula, pEdad, pCasado, pSalario);
        this.lineasCodigoHora = pLineasCodigoHora;
        this.lenguajeDominante = pLenguajeDominante;
    }

    public Programador() {
        super();
        this.lineasCodigoHora = -1;
        this.lenguajeDominante = "Whitespace";
    }

    // Getters & Setters
    public int getLineasCodigoHora() {
        return lineasCodigoHora;
    }

    public void setLineasCodigoHora(int lineasCodigoHora) {
        this.lineasCodigoHora = lineasCodigoHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    // toString
    
    @Override
    public String toString() {
        return super.toString() + "\nLineas de codigo por hora: " + this.lineasCodigoHora + "\nLenguaje dominanate: " + this.lenguajeDominante;
    }

    // Metodos
}
