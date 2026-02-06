import java.util.Scanner;

public class ds003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iniciando Calculadora");
        System.out.println("Coloque um número para a soma: ");
        int n1 = scanner.nextInt();

        System.out.println("Adicione um número: ");
        int n2 = scanner.nextInt();

        int soma = n1 + n2;
        System.out.println("O valor da soma é " + soma);
    }
}