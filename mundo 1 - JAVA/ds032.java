import java.util.Scanner;
//import java.time.Year; => não quis usar

public class ds032 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Que ano quer analisar? ");
       int ano = input.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
        System.out.printf("\nO ano %d é bissexto", ano);
        } else {
        System.out.printf("\nO ano %d não é bissexto", ano);
        }
        input.close();
}
}
