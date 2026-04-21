public class CuentaBancaria implements Imprimible {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    // Modificamos el metodo de interfaz
    @Override
    public void imprimir() {
        System.out.println("Titular: " + titular + ", saldo: " + saldo);
    }
}
