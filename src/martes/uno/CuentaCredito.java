package martes.uno;

public class CuentaCredito extends Cuenta {
    // Atributos
    private double comision;

    // Constructores
    public CuentaCredito(String pNombre, String pApellidos, short pEdad, String pNuCuenta) {
        super(pNombre, pApellidos, pEdad, pNuCuenta, 3000);
        this.comision = 0.10;
    }

    // Getters & Setters
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    // toString
    // Metodos

    @Override
    public void ingresar(double pCantidad) {
        super.ingresar(pCantidad - 10);
    }

    @Override
    public void retirar(double pCantidad) {
        super.retirar(pCantidad + 10);
    }

    public double calcularComision() {
        return saldo * comision;
    }
} // class end
