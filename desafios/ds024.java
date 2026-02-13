import java.util.Scanner;

public class ds024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Em qual cidade você nasceu? ");
        String cidade = input.next();
        
        cidade = cidade.trim().toUpperCase();

        if (cidade.startsWith("SANTO")){
            System.out.print("\nA cidade começa com SANTO");
        } else {
            System.out.print("\nA cidade NÃO começa com SANTO");
        }
    }
}
