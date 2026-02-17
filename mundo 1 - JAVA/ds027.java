import java.util.Scanner;

public class ds027 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = input.nextLine();

        String[] partido = nome.split(" ");
        String primeiroNome = partido[0];
        String ultimoNome = partido[partido.length - 1];
        

        System.out.printf("Muito prazer em te conhecer, %s!",nome);
        System.out.printf("\nSeu primeiro nome é %s",primeiroNome);
        System.out.printf("\nSeu último nome é %s",ultimoNome);
        input.close();
    }   
}
