import java.util.Scanner;

public class Ex05L1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float valor01;
        double resposta;

        System.out.println(" Qual o numero ? ");

        valor01 = input.nextFloat();

        if ( valor01 > 0) {
            resposta = valor01 * valor01;
            System.out.println(" O Número infotmado é " + valor01 + " O dobro desse valor é " + resposta);

        } else {
            resposta = valor01 * 3;
            System.out.println(" O Número informdo é " + valor01 + " O Triplo desse valor e " + resposta);

        }
    
        input.close();
    }

    
}
