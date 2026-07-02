package ProyectoFinal;

public class ClienteBancario {
    private String nombre;
    private double saldo;

    // Saber si aplicó el bono o no
    private boolean aplicoBono = false;

    // Constructor básico
    public ClienteBancario(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    // Método para meter plata
    public boolean depositar(double monto) {
        if (monto <= 0) {
            return false; // Para evitar montos negativos o en ceros
        }
        
        // Reto del bono
        if (this.nombre.equals("BONO")) {
            this.saldo += (monto * 2);
            this.aplicoBono = true;
        } else {
            this.saldo += monto;
            this.aplicoBono = false;
        }
        return true;
    }

    // Método para sacar la plata
    public boolean retirar(double monto) {
        // validacion de negativos y fondos
        if (monto <= 0 || monto > this.saldo) {
            return false; 
        }
        this.saldo -= monto;
        this.aplicoBono = false; 
        return true;
    }

    // Texto final con los montos
    public String getResumen(String operacion, double montoAnterior, double montoOperacion) {
        String texto = nombre + " tenia $" + montoAnterior + ". Se realizó un " + operacion + " de $" + montoOperacion + ". Nuevo saldo: $" + saldo;

        // Si se activó el bono  lo mostramos acá
        if (aplicoBono) {
            texto += "\n¡Has activado el bono secreto |BONO|! Tu deposito se ha duplicado.";
        }

        // Reto del interés automatico si pasa de los 15 mil
        if (this.saldo > 15000) {
            double interes = this.saldo * 0.05;
            this.saldo += interes; // Suma delk 5% al saldo real
            texto += "\nInterés aplicado: +5% ($" + interes + "). Nuevo saldo: $" + this.saldo;
        }

        // Cliente premium
        if (this.saldo > 10000) {
            texto += "\n¡Cliente Premium!";
        }

        return texto;
    }
}