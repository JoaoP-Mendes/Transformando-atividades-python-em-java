import java.util.Scanner;

public class ds030 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Coloque um numero: ");
        int numero = input.nextInt();
        int resultado = numero % 2;
        if(resultado == 0) {
            System.out.printf("O numero %d é par", numero);
        } else {System.out.printf("O numero %d é impar", numero);}
        input.close();
    }
}
