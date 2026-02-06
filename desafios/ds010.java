import java.util.Scanner;
public class ds010 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos reais gostaria de converter para dolar?\nR$");
        double real = input.nextDouble ();
        double conversao = real / 5.54;

        System.out.printf("Com R$%.2f você pode comprar U$%.2f", real, conversao);
        input.close();
    }

}
