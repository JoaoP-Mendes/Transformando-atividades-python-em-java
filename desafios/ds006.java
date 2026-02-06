import java.util.Scanner;

public class ds006 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = scanner.nextDouble();
        double raiz = Math.sqrt(num);

        System.out.println("O dobro de " + num + " é " + num*2);
        System.out.printf("O triplo de %d é %d", num, num * 3);
        System.out.printf("A raiz quadrada de ");
    }
}
