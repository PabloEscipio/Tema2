package martes.uno;

public class CuentaAhorro extends Cuenta {
    // Atributos
    private double interes;

    // Constructor
    public CuentaAhorro(String pNombre, String pApellidos, short pEdad, String pNuCuenta, double pSaldo, double pIntereses) {
        super(pNombre, pApellidos, pEdad, pNuCuenta, pSaldo);
        this.interes = pIntereses;
    }

    public CuentaAhorro(String pNombre, String pApellidos, short pEdad, String pNuCuenta) {
        super(pNombre, pApellidos, pEdad, pNuCuenta);
        this.interes = 0.025;
    }

    // Getters & Setters
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    // toString
    public String toString() {
        return super.toString() + "\nInteres: " + this.interes;
    }

    // Metodos
    public void calcularInteres() {
        super.saldo += super.saldo * this.interes;
    }
}
