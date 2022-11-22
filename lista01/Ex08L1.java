import java.util.Scanner;

public class Ex08L1 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double Celsius;
    double Fahrenheit;

    System.out.println(" Conversor Graus Celsius para Fahrenheit ");

    System.out.println(" Qual temperaturs em Celsius : ");
    Celsius = input.nextDouble();

    Fahrenheit = ( 9 * Celsius + 160 ) / 5;

    System.out.println(" Conversão : " + Fahrenheit + " °F ");


    input.close();
   
   } 

}
