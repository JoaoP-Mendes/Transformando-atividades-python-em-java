import java.util.Scanner;

public class ds006 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();
        double raiz = Math.sqrt(num);

        System.out.printf("O dobro de %.0f é %.0f",num, num*2);
        System.out.printf("\nO triplo de %.0f é %.0f", num, num * 3);
        System.out.printf("\nA raiz quadrada de %.0f é %.0f", num, raiz);
        scanner.close();
    }
}
