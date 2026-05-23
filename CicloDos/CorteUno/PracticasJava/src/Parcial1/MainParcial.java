package Parcial1; 
public class MainParcial {
    public static void main(String[] args) {
        // Creamos la cuenta con saldo 100.000
        CuentaBancaria miCuenta = new CuentaBancaria("181818", "Felipito Ayala", 100000);
        
        System.out.println("--- Estado Inicial ---");
        miCuenta.mostrarInformacion();

        // Depositamos 500
        System.out.println("\n--- Realizando Depósito ---");
        miCuenta.depositar(5000);
        miCuenta.mostrarInformacion();

        // Retiramos 200
        System.out.println("\n--- Realizando Retiro ---");
        miCuenta.retirar(20000);
        miCuenta.mostrarInformacion();
    }
}