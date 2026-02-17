import java.util.Scanner;


public class ds017 {

     public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Coloque o calor do cateto 1: ");
        double cateto1 = input.nextDouble();
        System.out.print("\nColoque o valor do cateto 2: ");
        double cateto2 = input.nextDouble();
        double hipotenusa = Math.hypot(cateto1, cateto2);

        System.out.printf("A hipotenusa é igual a %.1f", hipotenusa);
        input.close();
     }
}