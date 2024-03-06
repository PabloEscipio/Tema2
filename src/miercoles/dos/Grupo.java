package miercoles.dos;

public class Grupo {
    // Atributos
    private String nombre;
    private short duracion;
    private byte popularidad;
    private float coste;

    // Constructores
    public Grupo(String pNombre, short pDuracion, byte pPopularidad, float pCoste) {
        this.nombre = pNombre;
        this.duracion = pDuracion;
        setPopularidad(pPopularidad);
        this.coste = pCoste;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getDuracion() {
        return duracion;
    }

    public void setDuracion(short duracion) {
        this.duracion = duracion;
    }

    public byte getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(byte popularidad) {
        if (popularidad >= 1 && popularidad <= 10) {
            this.popularidad = popularidad;
        } else {
            System.out.println("Error: Valor de \"Popularidad\" no valido deber ser un numero entero entre 1 y 10");
            this.popularidad = 0;
        }
    }

    public float getCoste() {
        return coste;
    }

    public void setCoste(float coste) {
        this.coste = coste;
    }

    // toString
    public String toString() {
        return "--Grupo--" + "\nNombre: " + this.nombre + "\nDuración: " + this.duracion + "\nPopularidad: " + this.popularidad + "\nCoste: " + this.coste + "\nCoste total: " + costeTotal();
    }

    // Metodos
    public float costeTotal() {
        return this.coste + (this.coste * this.popularidad) / 100;
    }

} // class end