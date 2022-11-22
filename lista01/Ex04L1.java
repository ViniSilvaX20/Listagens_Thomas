import java.util.Scanner;

public class Ex04L1 {
    public static void main(String[] args) {
        Scanner inpunt = new Scanner(System.in);

        float numero1;
        float numero2;
        String nome;

        System.out.println(" Qual seu nome ");
        nome = inpunt.nextLine();

        System.out.println(" Digite o primeiro numero ! ");
        numero1 = inpunt.nextFloat();
        System.out.print(" Digite o segundo numero ! ");
        numero2 = inpunt.nextFloat();

        float soma;

        if ( numero1 == numero2) {
            System.out.println(" Olá " + nome + " Os valores são iguais , digite numeros diferentes!!");
        }
        if ( numero1 > numero2 ) {
            soma = numero1 + numero2;
            System.out.println(" Olá " + nome + " Numero 1 foi maior que numero 2 : logo sera A + B " + soma);
        } else if ( numero1 < numero2) {
            soma = numero1 * numero2;
            System.out.println(" Olá " + nome + " Numero 1 menor que 2 : Logo Multiplicara B * A " + soma);
        }

        inpunt.close();
        
    }
}
