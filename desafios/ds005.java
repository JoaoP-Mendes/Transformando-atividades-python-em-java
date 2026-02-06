import java.util.Scanner;

public class ds005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um número e veja seu antecessor e sucessor: ");
        int num = scanner.nextInt();

        int ant = num - 1;
        int suc = num + 1;

        System.out.println("antecessor: " + ant);
        System.out.println("sucessor: " + suc);
    }
}
