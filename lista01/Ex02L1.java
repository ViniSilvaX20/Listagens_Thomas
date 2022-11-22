import java.util.Scanner;

public class Ex02L1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;
        String nome;
        int resposta;

        System.out.println(" Qual seu nome? ");
        nome = input.nextLine();

        System.out.println(" Olá " + nome + " igite aqui um numero ! ");
        numero1 = input.nextInt();

        System.out.println(" Olá " + nome + " Digite aqui seu numero ! ");
        numero2 = input.nextInt();

        resposta = numero1 + numero2;

        System.out.println(" Soma desses dois numeros são : " + resposta);

        input.close();
    }
}