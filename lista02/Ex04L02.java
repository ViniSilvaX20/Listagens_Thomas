import java.util.Scanner;

public class Ex04L02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println(" Digite o numero ");
        numero = input.nextInt();

        if (numero == 0 ) {
            System.out.println(" Numero invalido, informe um numero diferente de 0 ");
        } else {
            // 2 x 1 = 2 exemplo
             for ( int i = 1; i < 11; i++ ) {
                System.out.println( numero + " x " + i + " = " + numero * i );
                input.close();
             }
        }
    }
}
