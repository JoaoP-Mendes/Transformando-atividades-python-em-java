import java.util.Scanner;

public class ds025 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Qual seu nome completo? ");
        String nome = input.nextLine();
        nome = nome.trim().toLowerCase();

        if (nome.contains("silva")) {
            System.out.print("Seu nome tem silva, você é Brasileiro");
        } else {
            System.out.print("Gringo");
        }
        input.close();

    }
}