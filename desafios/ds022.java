import java.util.Scanner;

public class ds022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = input.next();
        System.out.printf("\nSeu nome em maiusculo é %s",name.toUpperCase());
        System.out.printf("\nSeu nome em minusculo é %s",name.toLowerCase());
        int qntLetras = name.replace(" ", "").length();
        System.out.printf("\nSeu nome tem %d letras", qntLetras);
        input.close();
    }
}
