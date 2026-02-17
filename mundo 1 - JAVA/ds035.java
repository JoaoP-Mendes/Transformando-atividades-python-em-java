import java.util.Scanner;

public class ds035 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Analisador de triãngulos");
        System.out.print("Primeira reta: ");
        double reta1 = input.nextDouble();
        System.out.print("Segunda reta: ");
        double reta2 = input.nextDouble();
        System.out.print("Terceira reta: ");
        double reta3 = input.nextDouble();

        if (reta1 < reta2 + reta3 && reta2 < reta1 + reta3 && reta3 < reta1 + reta2) {
            System.out.print("As retas podem formar um triângulo");
        } else {
            System.out.print("As retas não podem formar um triângulo");
        }
        input.close();
    }
}
