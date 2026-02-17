import java.util.Scanner;

public class ds033 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int a = input.nextInt();
        System.out.print("Segundo valor: ");
        int b = input.nextInt();
        System.out.print("Terceiro valor: ");
        int c = input.nextInt();

        int menor = a;
        if(b < a && b < c) {
            menor = b;
        }
        if(c < a && c < b) {
            menor = c;
        }

        int maior = a;
        if(b > a && b > c) {
            maior = b;
        } 
        if(c > a && c > b){
        maior = c;
        }

        System.out.printf("O menor valor digitado é %d", menor);
        System.out.printf("\nO maior valor digitado é %d", maior);
        input.close();

    }
}
