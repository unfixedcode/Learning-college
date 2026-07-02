package ProyectoFinal;

import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // PIN seguridad
        int intentos = 0;
        boolean bloqueado = false;
        
        while (intentos < 3) {
            System.out.print("Ingresa tu PIN de 4 digitos para iniciar: ");
            String pin = leer.nextLine();
            
            // PIN quemado en el código
            if (pin.equals("1234")) {
                System.out.println("Acceso concedido");
                break;
            } else {
                intentos++;
                System.out.println("PIN incorrecto, te quedan " + (3 - intentos) + " intentos");
            }
            
            if (intentos == 3) {
                bloqueado = true;
            }
        }
        
        // Si hay un error 3 veces
        if (bloqueado) {
            System.out.println("Sistema bloqueado por seguridad");
            leer.close();
            return;
        }

        // "Boton reiniciar"
        while (true) {
            System.out.println("\n--- SISTEMA BANCARIO ---");
            System.out.print("Nombre del cliente: ");
            String nombre = leer.nextLine();
            
            System.out.print("Saldo inicial: ");
            double saldoInicial = Double.parseDouble(leer.nextLine());
            
            ClienteBancario cliente = new ClienteBancario(nombre, saldoInicial);
            
            System.out.print("Que operación harás? (1 = Depositar, 2 = Retirar): ");
            String opc = leer.nextLine();
            
            System.out.print("Monto de la operación: ");
            double monto = Double.parseDouble(leer.nextLine());
            
            boolean exito = false;
            String nombreOp = "";
            
            // Ejecuta según lo que eligió el cliente
            if (opc.equals("1")) {
                exito = cliente.depositar(monto);
                nombreOp = "Deposito";
            } else if (opc.equals("2")) {
                exito = cliente.retirar(monto);
                nombreOp = "Retiro";
            } else {
                System.out.println("Esa opción no existe");
                continue;
            }
            
            // Mostramos resultado
            if (exito) {
                System.out.println("\n--- RESÚMEN ---");
                System.out.println(cliente.getResumen(nombreOp, saldoInicial, monto));
            } else {
                System.out.println("\nError: Verifica que el monto sea positivo y que tengas fondos suficientes");
            }
            
            // Reiniciar todo
            System.out.print("\n¿Deseas reiniciar y hacer otra operación? (s/n): ");
            String reiniciar = leer.nextLine();
            if (reiniciar.equalsIgnoreCase("n")) {
                System.out.println("Cerrando sistema, gracias");
                break;
            }
        }
        
        leer.close();
    }
} 