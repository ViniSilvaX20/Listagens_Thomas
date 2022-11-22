import java.util.Scanner;

public class Ex03L1 {
    public static void main(String[] args) {
      Scanner input = new Scanner( System.in);

        int numero;
        String nome;

        System.out.println(" Qual seu nome? ");
        nome = input.nextLine();

        System.out.println(" Olá " + nome + " Digite aqui um numero ! ");
        numero = input.nextInt();
        // Solução para par ou impar.
        if (numero % 2 == 0) {
            System.out.println(" O Numero é " + numero +" é par" );
        } else {
            System.out.println(" O Numero é " + numero + " é impar ");
        }

        input.close();

    }


}