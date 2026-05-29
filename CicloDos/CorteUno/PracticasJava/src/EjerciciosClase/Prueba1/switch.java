package EjerciciosClase.Prueba1;

import java.util.Scanner;

public class switch {
    public static void main(String[] args) {
        System.out.println("Ingrese un número del 1 al 3:");
        Scanner op = new Scanner(System.in);
        int numero = op.nextInt();

        switch (numero) {
            case 1:
                System.out.println("El número es uno");
                break;
            case 2:
                System.out.println("El número es dos");
                break;
            case 3:
                System.out.println("El número es tres");
                break;
            default:
                System.out.println("El número no es válido");
        }
    }
}
