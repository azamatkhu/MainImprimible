//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainImprimible {
    public static void main(String[] args) {
        Imprimible Libro = new Libro("1345", "titulo chulo");
        Imprimible Cuenta = new CuentaBancaria("titulo no chulo");

        Libro.imprimir();
        Cuenta.imprimir();
    }
}