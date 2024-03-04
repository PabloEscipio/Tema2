package lunes.tres;

public class Empleado {
    // Atributos
    protected String nombre;
    protected String cedula;
    protected short edad;
    protected boolean casado;
    protected double salario;

    // Constructor
    public Empleado(String pNombre, String pCedula, short pEdad, boolean pCasado, double pSalario) {
        this.nombre = pNombre;
        this.cedula = pCedula;
        this.edad = pEdad;
        this.casado = pCasado;
        this.salario = pSalario;
    }

    public Empleado() {
        this.nombre = "";
        this.cedula = "pCedula";
        this.edad = -1;
        this.casado = false;
        this.salario = -1;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public boolean setSalario(double salario) {
        if (salario > 200) {
            this.salario = salario;
            return true;
        } else {
            return false;
        }
    }

    // toString
    public String toString() {
        String sCasado = (this.casado) ? "Casado" : "Soltero";
        return "DATOS EMPLEADO:" + "\nNombre: " + this.nombre + "\nCedula: " + this.cedula + "\nEdad: " + this.edad + "\nEstado civil: " + sCasado + "\nSalario" + this.salario;
    }

    // Metodos
    public String clasificacion() {
        String rString;
        if (edad <= 21) {
            rString = "Principiante";
        } else if (edad <= 35) {
            rString = "Intermedio";
        } else {
            rString = "Senior";
        }
        return rString;
    } // clasificacion end

    public void subidaSalario(double pPorcentaje) {
        this.salario *= 1 + pPorcentaje / 100;
    } // subidaSalario end

} // class end
