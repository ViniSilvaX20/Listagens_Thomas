import java.util.Scanner;

public class Ex02L02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 100; i < 201; i++ ) {
            if ((i % 2 ) != 0 ) {
                System.out.println(" Os números impares são " + i );

                input.close();
            }
        }
    }
    
}
