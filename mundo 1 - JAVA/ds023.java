import java.util.Scanner;

public class ds023 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = input.nextInt();
        int unidade = numero / 1 % 10;
        int dezena = numero / 10 % 10;
        int centena = numero / 100 % 10;
        int milhar = numero / 1000 % 10;

        System.out.printf("\nAnalisando o numero %d", numero);
        System.out.printf("\nUnidade: %d", unidade);
        System.out.printf("\nDezena: %d", dezena);
        System.out.printf("\nCentena: %d", centena);
        System.out.printf("\nMilhar: %d", milhar);
        input.close();
    }
}
