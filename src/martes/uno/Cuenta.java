package martes.uno;

public class Cuenta {
    // Atributos
    protected Titular titular;
    protected String nCuenta;
    protected Double saldo;

    // Constructor
    public Cuenta(String pNombre, String pApellidos, short pEdad, String pNuCuenta, double pSaldo) {
        this.titular = new Titular(pNombre, pApellidos, pEdad);
        this.nCuenta = pNuCuenta;
        this.saldo = pSaldo;
    }

    public Cuenta(String pNombre, String pApellidos, short pEdad, String pNuCuenta) {
        this(pNombre, pApellidos, pEdad, pNuCuenta, 0);
    }

    // Getters & Setters
    public String getnCuenta() {
        return nCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    // toString
    public String toString() {
        return titular.toString() + "\nNumero de Cuenta: " + this.nCuenta + "\nSaldo: " + this.saldo;
    }

    // Metodos
    public void ingresar(double pCantidad) {
        saldo += pCantidad;
    }

    public void retirar(double pCantidad) {
        saldo -= pCantidad;
    }

} // class end
