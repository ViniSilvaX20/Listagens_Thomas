import java.util.Scanner;

public class Ex01L02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int peso;
        String nome;
        int veiculo;
        int pessoas;

        System.out.println("Olá Motorista, informe seu nome !");
        nome = input.nextLine();
        System.out.println("Qual veiculo deseja utilizar ? Informe a quantidade de rodas aqui !");
        veiculo = input.nextInt();
        System.out.println("Qual quantidade de pessoas ?");
        pessoas = input.nextInt();
        System.out.println("Qual o peso do veiculo suportado");
        peso = input.nextInt();

        String categoria = "";

        if (veiculo <= 3) {
            categoria = " A - MOTO ou TRICICLO ";
        } else if (veiculo <= 4)
            if (pessoas >= 4)
               if (peso <= 3500) {
                    categoria = "B- CARRO ";
               }else if (veiculo >= 4)
                    if (peso <= 6000) {
                        categoria = ("C - CARGA ");
                    } else if (veiculo >= 4)
                         if (pessoas >= 8) {
                            categoria = " D - MICRO-ONIBUS";
                         } else if (veiculo >= 4)
                             if (peso >= 6000) {
                                categoria = " E - Geral e mais um pouco";
                             }
       System.out.println(" Olá " + nome + " Sua categoria atual : " + categoria + "quantidade de passageiros de " + pessoas + " Obrigado, por participar da pesquisa " );
       
       input.close();
    }
}
