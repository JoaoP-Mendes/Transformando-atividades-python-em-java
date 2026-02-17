import java.util.Scanner;

public class ds009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Insira um número e veja a tabuada: ");
        int numero = input.nextInt();

        System.out.printf("\n%d x 0 = %d", numero, numero * 0);
        System.out.printf("\n%d x 01 = %d", numero, numero * 1);
        System.out.printf("\n%d x 02 = %d", numero, numero * 2);
        System.out.printf("\n%d x 03 = %d", numero, numero * 3);
        System.out.printf("\n%d x 04 = %d", numero, numero * 4);
        System.out.printf("\n%d x 05 = %d", numero, numero * 5);
        System.out.printf("\n%d x 06 = %d", numero, numero * 6);
        System.out.printf("\n%d x 07 = %d", numero, numero * 7);
        System.out.printf("\n%d x 08 = %d", numero, numero * 8);
        System.out.printf("\n%d x 09 = %d", numero, numero * 9);
        System.out.printf("\n%d x 10 = %d", numero, numero * 10);
        input.close();
    }
}
