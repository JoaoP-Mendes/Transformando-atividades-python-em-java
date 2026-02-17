import java.util.Scanner;

public class ds015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos dias alugados? ");
        int dias = input.nextInt();
        System.out.print("Quantos KMs rodados? ");
        double km = input.nextDouble();
        double valor = (dias * 60) + (km * 0.15);
        System.out.printf("O total a pagar é R$%.2f", valor);
    }
}
