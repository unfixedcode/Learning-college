package EjerciciosClase.Prueba1;

public class printNumeros {
    public static void main(String[] args) {
        System.out.println("");


        System.out.println("----Separador 'FOR'----");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Valor: " + i);
        }

        System.out.println("");


        System.out.println("----Separador 'WHILE'----");


        int j = 0;
        while (j<=4){ {
            System.out.println("Valor: " + (j+1));
            j++;
        }
    }

        System.out.println("");

        System.out.println("----Separador 'DO-WHILE'----");


        int k = 0;
        do {            System.out.println("Valor: " + (k+1));
            k++;
        } while (k<=4);

    }}